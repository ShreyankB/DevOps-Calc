FROM openjdk:8
COPY ./target/DevOps-Calc-1.0-SNAPSHOT-jar-with-dependencies.jar  ./
WORKDIR ./
CMD ["java", "-jar", "DevOps-Calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]
