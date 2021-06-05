@ECHO OFF
ECHO Creating classes...
.\bin\protoc -I=. --java_out=../src/main/java ./visitor.proto
.\bin\protoc -I=. --java_out=../src/main/java ./zoo.proto
ECHO Classes created!
PAUSE