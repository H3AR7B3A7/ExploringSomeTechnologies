package be.steven.d.dog.sometechnologies.grpc.client;

import be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor;
import be.steven.d.dog.sometechnologies.prototarget.visitor.visitorGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GRPCClient {
    private final static Logger LOGGER = LoggerFactory.getLogger(GRPCClient.class);

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 1234).usePlaintext().build(); // .useTransportSecurity for real projects

         visitorGrpc.visitorBlockingStub stub = visitorGrpc.newBlockingStub(channel);

        Visitor.LoginRequest request = Visitor.LoginRequest.newBuilder().setUsername("admin").setPassword("admin").build();

        Visitor.APIResponse response = stub.login(request);

        LOGGER.info("### SERVER RESPONDED WITH: {}! ###", response.getResponseMessage());
    }
}
