package org.exmaple.grpc.client;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.example.grpc.common.ProductRequest;
import org.example.grpc.common.ProductResponse;
import org.example.grpc.common.ProductServiceGrpc;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ProductClientImpl {

    @GrpcClient("productClient")
    ProductServiceGrpc.ProductServiceBlockingStub stub;

    @Scheduled(fixedDelay=10000)
    public void call() {
        ProductRequest request = ProductRequest.newBuilder()
                .setName("new product @ " + Instant.now().toString())
                .build();
        System.out.println("\n\n************************************");
        System.out.println("Sending create request for Product with name = " + request.getName());
        ProductResponse response = stub.create(request);
        System.out.println("Product created with Id = " + response.getId() + " and name = " + response.getName());
    }
}