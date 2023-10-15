FROM openjdk:17
ENV APP_FILE department-0.0.1-SNAPSHOT.jar
ENV APP_HOME /workflow
EXPOSE 8083
COPY build/libs/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prd","department-0.0.1-SNAPSHOT.jar"]
