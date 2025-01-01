FROM openjdk:17

COPY build/libs/kto-Test-all.jar /app/kto-Test-all.jar

EXPOSE 8080

WORKDIR /app

CMD ["java", "-jar", "kto-Test-all.jar"]

