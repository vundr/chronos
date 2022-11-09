FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Copy application files
COPY modules/bootstrapper/target/chronos.jar chronos.jar

# Expose PORT
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "chronos.jar"]
