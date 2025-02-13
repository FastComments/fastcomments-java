#!/bin/bash

rm -rvf ./client/src \
    && wget http://localhost:3001/js/swagger.json -O /tmp/fastcomments-openapi.json \
    && openapi-generator-cli generate \
        -i /tmp/fastcomments-openapi.json \
        -g java \
        -o ./client \
        -c config.json

# Change to the desired Gradle version
sed -i 's|distributionUrl=.*|distributionUrl=https\\://services.gradle.org/distributions/gradle-8.5-bin.zip|' ./client/gradle/wrapper/gradle-wrapper.properties
