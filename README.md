# Some Technologies

This project was created to explore various technologies and familiarize myself with them.


## Liquibase

[Official pages](https://www.liquibase.org/get-started/how-liquibase-works)

Liquibase Community is an open source project that helps millions of developers rapidly manage database schema changes.

- **Flexible schema change**  
Supports SQL, XML, YAML and JSON formats
  
- **Auto-generate scripts**  
Automatically generate SQL scripts for reviews
 
- **Repeatable migrations**  
Perform re-runnable vs. non-re-runnable changes
  
- **Integrations and extensions**  
Works with the tools and database platforms you use
  
- **Rollbacks**  
Undo database changes, either automatically or via custom rollback SQL
  
- **Context-dependent logic**  
Use contexts and preconditions to fine-tune script execution

- **Real-time monitoring & visibility**  
Free access to Liquibase Hub for data to improve your database change process


## Protocol Buffer

[Official pages](https://developers.google.com/protocol-buffers)

Protocol buffers are Google's language-neutral, platform-neutral, extensible mechanism for serializing structured data
– think XML, but smaller, faster, and simpler. You define how you want your data to be structured once,
then you can use special generated source code to easily write and read your structured data to and from a variety
of data streams and using a variety of languages.

**WARNING**: The protoc command added to this project works only for windows.
For protoc to work on your operating system download the right version [here](https://github.com/protocolbuffers/protobuf/releases).
We can also use our build tool ([Maven](https://dzone.com/articles/compile-protocol-buffers-using-maven) / 
[Gradle](https://medium.com/@DivyaJaisawal/generate-java-code-from-proto-file-using-gradle-1fb9fe64e046)) to automate the code generation.


## gRPC

[Official pages](https://grpc.io/)

gRPC is a modern open source high performance Remote Procedure Call (RPC) framework that can run in any environment.
It can efficiently connect services in and across data centers with pluggable support for load balancing, tracing,
health checking and authentication. It is also applicable in last mile of distributed computing to connect devices,
mobile applications and browsers to backend services.

An RPC is a valid design choice when purely automated operation is more important than evolution and scalability
(in Internet time and on an Internet scale).

We can use [BloomRPC](https://github.com/uw-labs/bloomrpc) to test our gRPC services.


## Feign

[GitHub Repo](https://github.com/OpenFeign/feign)

Feign is a Java to HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket.
Feign's first goal was reducing the complexity of binding Denominator uniformly to HTTP APIs regardless of ReSTfulness.

Feign works by processing annotations into a templated request. Arguments are applied to these templates in
a straightforward fashion before output. Although Feign is limited to supporting text-based APIs, it dramatically
simplifies system aspects such as replaying requests.
Furthermore, Feign makes it easy to unit test your conversions knowing this.

It is much cleaner than using a RestTemplate, because it separates business logic from the client code,
making it more readable and reusable.


## Spring Events

Spring application events allow us to throw and listen to specific application events that we can process as we wish.
Events are meant for exchanging information between loosely coupled components. As there is no direct coupling between
publishers and subscribers, it enables us to modify subscribers without affecting the publishers and vice-versa.


## Web Sockets

WebSocket is a computer communications protocol, providing full-duplex communication channels over a single TCP connection.
The WebSocket protocol was standardized by the IETF as RFC 6455 in 2011, and the WebSocket API in Web IDL is being standardized by the W3C.

WebSocket is distinct from HTTP. Both protocols are located at layer 7 in the OSI model and depend on TCP at layer 4.
Although they are different, RFC 6455 states that WebSocket "is designed to work over HTTP ports 443 and 80 as well
as to support HTTP proxies and intermediaries," thus making it compatible with HTTP. To achieve compatibility,
the WebSocket handshake uses the HTTP Upgrade header to change from the HTTP protocol to the WebSocket protocol.

The WebSocket protocol enables interaction between a web browser (or other client application) and a web server with
lower overhead than half-duplex alternatives such as HTTP polling, facilitating real-time data transfer from and
to the server. This is made possible by providing a standardized way for the server to send content to the client
without being first requested by the client, and allowing messages to be passed back and forth while keeping the connection open.
In this way, a two-way ongoing conversation can take place between the client and the server.
The communications are usually done over TCP port number 443 (or 80 in the case of unsecured connections),
which is beneficial for environments that block non-web Internet connections using a firewall.


## Jackson

Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa.
It provides various intuitive annotations.  Its developers extol the combination of fast, correct, lightweight,
and ergonomic attributes of the library.


---
*Work in progress...*