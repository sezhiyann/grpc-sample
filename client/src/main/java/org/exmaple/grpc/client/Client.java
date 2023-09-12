package org.exmaple.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.grpc.common.ProductRequest;
import org.example.grpc.common.ProductResponse;
import org.example.grpc.common.ProductServiceGrpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.time.Instant;

@SpringBootApplication
@EnableScheduling
public class Client {
    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
//                .usePlaintext()
//                .build();
//
//        ProductServiceGrpc.ProductServiceBlockingStub stub
//                = ProductServiceGrpc.newBlockingStub(channel);
//        ProductRequest request = ProductRequest.newBuilder()
//                .setName("new product @ " + Instant.now().toString())
//                .build();
//        System.out.println("Sending create request for Product with name = " + request.getName());
//        ProductResponse response = stub.create(request);
//        System.out.println(" Product created with Id = " + response.getId() + " and name = " + response.getName());
//        channel.shutdown();
    }
}