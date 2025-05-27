FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
RUN ./gradlew build -x test
CMD ["java", "-jar", "build/libs/ball-0.0.1-SNAPSHOT.jar"]
