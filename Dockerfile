FROM maven:3.9.9-eclipse-temurin-21-alpine AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM gcr.io/distroless/java21-debian12
WORKDIR /app
COPY --from=builder /app/target/payments-api-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["app.jar"]
