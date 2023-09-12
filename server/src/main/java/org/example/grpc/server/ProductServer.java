package org.example.grpc.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ProductServer {
    public static void main(String[] args) {
        SpringApplication.run(ProductServer.class, args);
//        Server server = ServerBuilder
//                .forPort(8080)
//                .addService(new ProductServiceImpl()).build();
//        server.start();
//        server.awaitTermination();
    }
}