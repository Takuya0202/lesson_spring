FROM eclipse-temurin:21-jdk

WORKDIR /workspace

RUN apt-get update && apt-get install -y \
    git \
    curl \
    maven \
    postgresql-client

EXPOSE 8080
