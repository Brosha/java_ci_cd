FROM openjdk:17-jdk-slim
COPY target/*.jar java_ci_cd.jar
ENTRYPOINT ["java","-jar","/java_ci_cd.jar"]