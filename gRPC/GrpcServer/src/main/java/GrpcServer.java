import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) {
        int port = 50001; System.out.println("Starting gRPC server...");
        Server server = ServerBuilder
                .forPort(port)
                .addService(new GrpcServiceImpl()).build();
        try {
            server.start();
            System.out.println("...Server started");
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } }

    static class GrpcServiceImpl extends GrpcServiceGrpc.GrpcServiceImplBase {
        public void grpcProcedure(GrpcRequest req, StreamObserver<GrpcResponse> responseObserver) {
            String msg;
            System.out.println("...called unaryProcedure - start"); if (req.getAge() > 18)
                msg = "Mr/Ms "+ req.getName();
            else
                msg = "Boy/Girl";
            GrpcResponse response = GrpcResponse.newBuilder()
                    .setMessage("Hello " + msg).build();

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println("...called unaryProcedure - end");
        }
        public void streamProcedure(GrpcRequest req,
                                    StreamObserver<GrpcResponse> responseObserver) {
            for (int i = 0; i < 9; i++) {
                GrpcResponse response = GrpcResponse.newBuilder()
                        .setMessage("Stream chunk " + (i + 1)).build();
                // [enter here Thread.sleep to easier trace the operation]
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        public void streamFib(fibRequest req,
                              StreamObserver<fibResponse> responseObserver){

            int pow = req.getPow();
            int num = req.getNum();
            System.out.println("...called fib - start");
            int num1 = 0, num2 = 1;

            int counter = 0;

            while (counter < num) {


                int fib_2 = (int) Math.pow(num1, pow);


                fibResponse response = fibResponse.newBuilder()
                        .setFib(num1).setFib2(fib_2).build();
                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();

        }
    } }