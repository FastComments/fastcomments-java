#!/bin/bash

# Core does not need an init-*.gradle file since we can just put those details in the build.gradle file in the project,
# since the project is created manually and not generated.

chmod +x ./core/gradlew
cd ./core && ./gradlew publish && cd -
