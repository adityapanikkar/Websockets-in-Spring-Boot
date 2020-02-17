## Spring Boot WebSocket Chat Appplication

This was developed referring to code and instructions given by https://www.callicoder.com/spring-boot-websocket-chat-example/

The additions i made are sending some alerts from the database

additional things needed for this are :
1.A database connection(defined in application.properties)
2.A database Pojo (Part of the pojo package)
3.SQL queries to fetch data (All these are a part oof the dao package)

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/adityapanikkar/Websockets-in-Spring-Boot.git
```

**2. Build and run the app using maven**

```bash
cd Websockets-in-Spring-Boot
mvn package
java -jar target/websocket-demo-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the app directly without packaging it like so -

```bash
mvn spring-boot:run
```


