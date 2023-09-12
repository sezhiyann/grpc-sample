package org.example.grpc.server;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.example.grpc.common.Product;
import org.example.grpc.common.ProductRequest;
import org.example.grpc.common.ProductResponse;
import org.example.grpc.common.ProductServiceGrpc;

import java.util.List;
import java.util.Random;

@GrpcService
public class ProductServiceImpl extends ProductServiceGrpc.ProductServiceImplBase {
    private static Random random = new Random();
    @Override
    public void create(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        ProductResponse response = ProductResponse.newBuilder().setId(getRandomInt()).setName(request.getName()).build();
        System.out.println(" Product created with Id = " + response.getId() + " and name = " + response.getName());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private static int getRandomInt() {
        // generate random number from 0 to 3
        return random.nextInt(64000);
    }
}