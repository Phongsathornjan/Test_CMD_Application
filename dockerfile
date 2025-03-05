FROM ubuntu:24.04

RUN apt update && apt install -y openjdk-17-jdk

WORKDIR /app
COPY Test.class /app

CMD ["java","Test"]
