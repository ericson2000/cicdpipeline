FROM maven:3.9.3 as build
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:resolve
COPY src/test/java/io/getarrayus/cicdpipeline/cicdpipeline /app
RUN mvn clean
RUN mvn package -DskipTests -X

FROM openjdk:17
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]