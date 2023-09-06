# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at the specified directory
COPY target/housemanagement-0.0.1-SNAPSHOT.jar /app/housemanagement.jar

# Expose the port your Spring Boot app listens on (if not 8080, change accordingly)
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "housemanagement.jar"]
COPY ./script_file.sh  /
RUN /script_file.sh