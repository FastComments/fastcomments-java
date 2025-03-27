#!/bin/bash

chmod +x ./core/gradlew
cd ./core && ./gradlew --init-script ./../init-core.gradle publishMavenJavaPublicationToMavenLocal && cd -