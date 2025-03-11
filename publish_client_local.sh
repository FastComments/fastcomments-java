#!/bin/bash

chmod +x ./client/gradlew
cd ./client && ./gradlew publishToMavenLocal && cd -
