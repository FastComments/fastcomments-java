#!/bin/bash

# This script publishes all FastComments Java libraries to local Maven repository

# Exit on error
set -e

# Extract version from command line or use a default
VERSION=${1:-1.0.0}

# Check if the version in client/build.gradle matches the requested version
CLIENT_VERSION=$(grep -o "version = '[^']*'" ./client/build.gradle | cut -d"'" -f2)
if [ "$CLIENT_VERSION" != "$VERSION" ]; then
  echo "ERROR: client/build.gradle version ($CLIENT_VERSION) does not match requested version ($VERSION)"
  echo "Please update config.json and regenerate client/build.gradle, or use version $CLIENT_VERSION"
  exit 1
fi

echo "Publishing version $VERSION to local Maven repository"

# Publish client
echo "Publishing client module..."
chmod +x ./client/gradlew
cd ./client && ./gradlew --init-script ./../init-client.gradle publishMavenJavaPublicationToMavenLocal -PreleaseVersion=$VERSION && cd -

# Publish core
echo "Publishing core module..."
chmod +x ./core/gradlew
cd ./core && ./gradlew --init-script ./../init-core.gradle publishMavenJavaPublicationToMavenLocal -PreleaseVersion=$VERSION && cd -

# Publish pubsub
echo "Publishing pubsub module..."
chmod +x ./pubsub/gradlew
cd ./pubsub && ./gradlew --init-script ./../init-pubsub.gradle publishMavenJavaPublicationToMavenLocal -PreleaseVersion=$VERSION && cd -

echo "All modules published successfully to local Maven repository"