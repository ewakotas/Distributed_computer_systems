import io.grpc.ManagedChannel;

import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import java.util.Iterator;

public class GrpcClient {
    public static void main(String[] args) {
        String address = "localhost";
        int port = 50001;
        System.out.println("Running grpc client...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress(address, port) .usePlaintext()
                .build();
        GrpcServiceGrpc.GrpcServiceBlockingStub stub = GrpcServiceGrpc.newBlockingStub(channel);
        GrpcRequest request = GrpcRequest.newBuilder() .setName("Ewa")
                .setAge(21)
                .build();
        System.out.println("...calling grpcProcedure");
        GrpcResponse response = stub.grpcProcedure(request);
        System.out.println("...after calling grpcProcedure");
        System.out.println("--> Response: " + response);

        //GrpcServiceGrpc.GrpcServiceStub nonbStub = GrpcServiceGrpc.newStub(channel);
        System.out.println("...async calling grpcProcedure");
        //nonbStub.grpcProcedure(request, new UnaryObs());
        System.out.println("...after async calling grpcProcedure");
        ByteRequest byteRequest = ByteRequest.newBuilder().setId("1").build();

        GrpcServiceGrpc.GrpcServiceStub nonbStub = GrpcServiceGrpc.newStub(channel);
        nonbStub.streamToClient(byteRequest, new StreamtoClientObs());





        Iterator<GrpcResponse> respIterator = stub.streamProcedure(request);
        GrpcResponse strResponse;
        while(respIterator.hasNext()) {
            strResponse = respIterator.next();
            System.out.println("-->" + strResponse.getMessage());
        }

        System.out.println("...async calling streamProcedure");
        nonbStub.streamProcedure(request, new UnaryObs());
        System.out.println("...after async calling streamProcedure");



        fibRequest fibReq = fibRequest.newBuilder() .setPow(3)
                .setNum(10)
                .build();

        System.out.println("...async calling streamProcedure");
        nonbStub.streamProcedure(request, new UnaryObs());
        System.out.println("...after async calling streamProcedure");

        System.out.println("...async calling streamProcedure");
        nonbStub.streamFib(fibReq, new FibObs());
        System.out.println("...after async calling streamProcedure");

        System.out.println("==> Press <ENTER> to finish <==");
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        System.out.println(readString);

        channel.shutdown();
    }
    private static class UnaryObs implements StreamObserver<GrpcResponse> {
        public void onNext(GrpcResponse grpcResponse) {
            System.out.println("-->async unary onNext: " +
                    grpcResponse.getMessage());
        }
        public void onError(Throwable throwable) {
            System.out.println("-->async unary onError");
        }
        public void onCompleted() {
            System.out.println("-->async unary onCompleted");
        }
    }
    private static class FibObs implements StreamObserver<fibResponse> {
        public void onNext(fibResponse fibResponse) {
            System.out.println("-->async fib onNext: " +
                    fibResponse.getFib() + " " + fibResponse.getFib2());
        }
        public void onError(Throwable throwable) {
            System.out.println("-->async fib onError");
        }
        public void onCompleted() {
            System.out.println("-->async fib onCompleted");
        }
    }

    private static class StreamtoClientObs implements StreamObserver<ByteResponse> {
        FileOutputStream fileOutputStream;

        {
            try {
                fileOutputStream = new FileOutputStream("output.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public void onNext(ByteResponse byteResponse) {
            System.out.println("-->async unary onNext:");
            try {
                fileOutputStream.write(byteResponse.getChunk().toByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public void onError(Throwable throwable) {
            System.out.println("-->async unary onError");
        }
        public void onCompleted() {
            System.out.println("-->File transfer from Server to client completed");
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
}