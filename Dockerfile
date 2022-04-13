FROM openjdk:8
COPY ./target/DevOps-Calc-1.0-SNAPSHOT.jar  ./
WORKDIR ./
CMD ["java", "-jar", "DevOps-Calculator-1.0-SNAPSHOT.jar "]
