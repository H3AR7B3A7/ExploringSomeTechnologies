package be.steven.d.dog.sometechnologies.grpc.server;

import be.steven.d.dog.sometechnologies.grpc.service.VisitorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GRPCServer {
    private static final Logger LOGGER = LoggerFactory.getLogger(GRPCServer.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(1234).addService(new VisitorService()).build();

        server.start();

        LOGGER.info("### gRPC Server is running on {} ###", server.getPort());

        server.awaitTermination();
    }
}
