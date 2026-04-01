#!/bin/bash

rm -rvf ./client/src ./client/docs \
    && wget http://localhost:3001/js/swagger.json -O ./openapi.json \
    && java -jar /home/winrid/dev/fastcomments/openapi-generator/modules/openapi-generator-cli/target/openapi-generator-cli.jar generate \
        -i ./openapi.json \
        -g java \
        -o ./client \
        --additional-properties=useSingleRequestParameter=true,disallowAdditionalPropertiesIfNotPresent=false \
        -c config.json

# Patch generated build files for Gradle 9 / Java 25 compatibility
sed -i 's|distributionUrl=.*|distributionUrl=https\\://services.gradle.org/distributions/gradle-9.4.1-bin.zip|' ./client/gradle/wrapper/gradle-wrapper.properties
sed -i 's|spotless-plugin-gradle:6.11.0|spotless-plugin-gradle:8.4.0|' ./client/build.gradle
sed -i '/sourceCompatibility = JavaVersion.VERSION_1_8/{N;s|sourceCompatibility = JavaVersion.VERSION_1_8\n    targetCompatibility = JavaVersion.VERSION_1_8|java {\n        sourceCompatibility = JavaVersion.VERSION_1_8\n        targetCompatibility = JavaVersion.VERSION_1_8\n    }|}' ./client/build.gradle
sed -i 's|main = System.getProperty|mainClass = System.getProperty|' ./client/build.gradle
