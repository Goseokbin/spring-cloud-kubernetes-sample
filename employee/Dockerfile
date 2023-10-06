FROM openjdk:17
ENV APP_FILE employee-0.0.1-SNAPSHOT.jar
ENV APP_HOME /workflow
EXPOSE 8083
COPY build/libs/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["java","-jar","-Dspring.profile.active=k8s","employee-0.0.1-SNAPSHOT.jar"]
