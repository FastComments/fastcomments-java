#!/bin/bash

# This script publishes all FastComments Java libraries to Repsy.io
# It requires Repsy credentials

# Exit on error
set -e

# Extract version from command line or use a default
VERSION=${1:-1.0.0}

echo "Publishing version $VERSION to Repsy.io"

# Publish client
echo "Publishing client module..."
chmod +x ./client/gradlew
cd ./client && ./gradlew --init-script ./../init-client.gradle publish -PreleaseVersion=$VERSION && cd -

# Publish core
echo "Publishing core module..."
chmod +x ./core/gradlew
cd ./core && ./gradlew --init-script ./../init-core.gradle publish -PreleaseVersion=$VERSION && cd -

# Publish pubsub
echo "Publishing pubsub module..."
chmod +x ./pubsub/gradlew
cd ./pubsub && ./gradlew --init-script ./../init-pubsub.gradle publish -PreleaseVersion=$VERSION && cd -

echo "All modules published successfully to Repsy.io"