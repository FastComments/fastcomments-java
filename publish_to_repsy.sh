#!/bin/bash

# This script publishes all FastComments Java libraries to Repsy.io
# It requires Repsy credentials

# Exit on error
set -e

# Extract version from command line or use a default
VERSION=${1:-1.0.0}

# Gradle 9 needs JDK 17 (matches CI); use sdkman's newest 17 when installed, else the caller's JAVA_HOME
SDKMAN_JDK17=$(ls -d "$HOME"/.sdkman/candidates/java/17.* 2>/dev/null | sort -V | tail -n 1)
if [ -n "$SDKMAN_JDK17" ]; then
  export JAVA_HOME="$SDKMAN_JDK17"
  export PATH="$JAVA_HOME/bin:$PATH"
fi
echo "Using $(java -version 2>&1 | head -n 1)"

echo "Publishing version $VERSION to Repsy.io"

# Subshells so a failed gradle build stops the script (set -e ignores failures inside && chains)
# Publish client
echo "Publishing client module..."
chmod +x ./client/gradlew
(cd ./client && ./gradlew --init-script ./../init-client.gradle publishMavenJavaPublicationToRepsyRepository -PreleaseVersion=$VERSION)

# Publish core
echo "Publishing core module..."
chmod +x ./core/gradlew
(cd ./core && ./gradlew --init-script ./../init-core.gradle publishMavenJavaPublicationToRepsyRepository -PreleaseVersion=$VERSION)

# Publish pubsub
echo "Publishing pubsub module..."
chmod +x ./pubsub/gradlew
(cd ./pubsub && ./gradlew --init-script ./../init-pubsub.gradle publishMavenJavaPublicationToRepsyRepository -PreleaseVersion=$VERSION)

echo "All modules published successfully to Repsy.io"