FROM openjdk:11
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY /build/libs/*.jar app.jar
EXPOSE 8761
CMD ["java", "-jar", "app.jar"]
