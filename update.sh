#!/bin/bash
set -e

# FastComments openapi-generator build. Produces Gradle 9 / modern build.gradle
# (java{} block, mainClass, spotless 8.4, junit-platform-launcher) natively, so
# no post-generation patching is needed. Just a jar; downloaded on demand.
JAR_URL="https://github.com/winrid/openapi-generator/releases/download/fastcomments-build-20260630/openapi-generator-cli.jar"
JAR_FILE="./openapi-generator-cli.jar"

[ -f "$JAR_FILE" ] || wget -q "$JAR_URL" -O "$JAR_FILE"

rm -rvf ./client/src ./client/docs
wget -q http://localhost:3001/js/swagger.json -O ./openapi.json

java -jar "$JAR_FILE" generate \
    -i ./openapi.json \
    -g java \
    -o ./client \
    --additional-properties=useSingleRequestParameter=true,disallowAdditionalPropertiesIfNotPresent=false \
    -c config.json
