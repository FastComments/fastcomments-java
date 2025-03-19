#!/bin/bash

chmod +x ./pubsub/gradlew
cd ./pubsub && ./gradlew publishToMavenLocal && cd -
