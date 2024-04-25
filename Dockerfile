# Use an existing Java base image
FROM openjdk:17-jdk-alpine


# Set the working directory in the container
WORKDIR /

# Copy the Maven project JAR file into the container
COPY target/speedsync-restful-1.0.jar /speedsync-restful.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "speedsync-restful.jar"]
