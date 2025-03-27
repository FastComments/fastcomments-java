#!/bin/bash

chmod +x ./client/gradlew
cd ./client && ./gradlew --init-script ./../init-client.gradle publishMavenJavaPublicationToMavenLocal && cd -
