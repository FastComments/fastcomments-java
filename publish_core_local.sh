#!/bin/bash

chmod +x ./core/gradlew
cd ./core && ./gradlew publishToMavenLocal && cd -
