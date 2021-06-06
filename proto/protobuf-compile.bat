@ECHO OFF
ECHO Creating classes...
:: Generates Zoo, Habitat and Keeper classes
.\bin\protoc -I=. --java_out=../src/main/java ./zoo.proto
:: Generates Visitor classes and service for gRPC
.\bin\protoc -I=. --java_out=../src/main/java ./visitor.proto
.\bin\protoc --plugin=protoc-gen-grpc-java=protoc-gen-grpc-java.exe --grpc-java_out=../src/main/java ./visitor.proto
ECHO Classes created!
PAUSE