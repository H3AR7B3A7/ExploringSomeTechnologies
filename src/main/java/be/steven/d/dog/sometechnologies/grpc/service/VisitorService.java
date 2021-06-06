package be.steven.d.dog.sometechnologies.grpc.service;

import be.steven.d.dog.sometechnologies.prototarget.visitor.Visitor;
import be.steven.d.dog.sometechnologies.prototarget.visitor.visitorGrpc;
import io.grpc.stub.StreamObserver;

public class VisitorService extends visitorGrpc.visitorImplBase {
    @Override
    public void login(Visitor.LoginRequest request, StreamObserver<Visitor.APIResponse> responseObserver) {
        String username = request.getUsername();
        String password = request.getPassword();

        Visitor.APIResponse.Builder response = Visitor.APIResponse.newBuilder();

        if(username.equals(password)){ // In a real application encrypt and check DB if the result is present
            response.setResponseCode(1).setResponseMessage("Welcome " + username);
        } else {
            response.setResponseCode(0).setResponseMessage("Invalid credentials.");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Visitor.Empty request, StreamObserver<Visitor.APIResponse> responseObserver) {

    }
}
