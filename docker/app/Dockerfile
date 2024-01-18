# Stage 1: Build the application
FROM maven AS build
WORKDIR /app

# Copy only the POM file to fetch dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the source code
COPY ./src ./src

# Build the application
RUN mvn clean install -Dmaven.test.skip=true

# Stage 2: Create the final image with the JAR file
FROM amazoncorretto:17-alpine-jdk
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/cse-1.jar ./cse.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "cse.jar"]
