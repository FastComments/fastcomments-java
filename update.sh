#!/bin/bash

rm -rvf ./client/src ./client/docs \
    && wget http://localhost:3001/js/swagger.json -O ./openapi.json \
    && java -jar /home/winrid/dev/fastcomments/openapi-generator/modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
        -i ./openapi.json \
        -g java \
        -o ./client \
        --additional-properties=useSingleRequestParameter=true,disallowAdditionalPropertiesIfNotPresent=false \
        -c config.json

# Change to the desired Gradle version
sed -i 's|distributionUrl=.*|distributionUrl=https\\://services.gradle.org/distributions/gradle-9.4.1-bin.zip|' ./client/gradle/wrapper/gradle-wrapper.properties
