FROM eclipse-temurin:21-jre

#RUN mkdir -p /opt/application
WORKDIR /opt/application
COPY ./target/*-runner.jar backend.jar
CMD [ "java", "-jar", "backend.jar" ]
