FROM openjdk:11
ARG JAR_FILE=hellotextkubernetes/target/*.jar
RUN ls -l
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
