FROM anapsix/alpine-java:8_jdk
MAINTAINER Dev Name Goes Here

# Add lambdatest build
COPY build/libs/lambdatest-1.0.jar /app/

RUN apk add --update curl &&     rm -rf /var/cache/apk/*
EXPOSE 8080
ENTRYPOINT ["java","-jar", "app/lambdatest-1.0.jar"]
