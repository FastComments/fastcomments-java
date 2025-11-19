#!/bin/bash

set -e

if [ -z "$1" ]; then
  echo "Usage: ./bump.sh <new_version>"
  echo "Example: ./bump.sh 0.0.28"
  exit 1
fi

NEW_VERSION=$1

echo "Bumping version to $NEW_VERSION..."

# Update config.json
jq ".artifactVersion = \"$NEW_VERSION\"" config.json > config.json.tmp && mv config.json.tmp config.json
echo "✓ Updated config.json artifactVersion to $NEW_VERSION"

# Update README.md - replace all version references in Maven and Gradle examples
sed -i "s/<version>[0-9]\+\.[0-9]\+\.[0-9]\+<\/version>/<version>$NEW_VERSION<\/version>/g" README.md
sed -i "s/\(com\.fastcomments:[^:]\+:\)[0-9]\+\.[0-9]\+\.[0-9]\+/\1$NEW_VERSION/g" README.md
echo "✓ Updated README.md version references to $NEW_VERSION"

echo "Done! Version bumped to $NEW_VERSION"
