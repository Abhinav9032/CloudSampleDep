FROM openjdk:8
ADD target/CICD_TEST-1.jar CICD_TEST-1.jar
EXPOSE 8080
ENTRYPOINT ["java" , "-jar" , "CICD_TEST-1.jar"]
