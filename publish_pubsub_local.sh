#!/bin/bash

chmod +x ./pubsub/gradlew
cd ./pubsub && ./gradlew --init-script ./../init-pubsub.gradle publishMavenJavaPublicationToMavenLocal && cd -