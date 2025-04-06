# gRPC Lab – Java Client-Server with Protocol Buffers

## 🧪 Overview

This project was built to explore gRPC and Protocol Buffers for efficient communication between a Java client and server. The idea was to define structured data using `.proto` files, serialize it with Protocol Buffers, and make remote procedure calls using gRPC.

## 📦 What I Did

- Defined `MyUser` message in `.proto`
- Used `protoc` to generate Java classes
- Built a basic socket-based client-server setup using raw protobuf serialization
- Upgraded to a gRPC-based version with a `HelloService` and `SayHello` RPC
- Used Maven to manage dependencies and build the project

## ⚠️ What Didn't Work

Even though the structure and logic were mostly in place, I ran into build and compilation issues—mostly related to classpath config and Maven setup. The generated protobuf and gRPC code wouldn't compile correctly, so the final gRPC app didn’t run.

## 📁 Project Layout

```
grpc-lab/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── proto/
│   │       ├── Ex0.proto
│   │       └── Lab1GRPC.proto
```

## ✅ Takeaways

- Protocol Buffers are extremely efficient for data serialization
- gRPC simplifies remote calls but needs careful setup
- Maven helps a lot once everything is properly configured
- Errors taught me more than the working parts 😅

---

> 💡 This project didn't run perfectly, but it helped me understand protobuf and gRPC at a much deeper level.# gRPC Lab – Java Client-Server with Protocol Buffers

