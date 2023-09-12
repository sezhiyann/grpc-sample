package org.example.grpc.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ProductServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new ProductServiceImpl()).build();
        server.start();
        server.awaitTermination();
    }
}