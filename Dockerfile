FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Copy application files
COPY modules/bootstrapper/target/*.jar app.jar

# Expose PORT
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
