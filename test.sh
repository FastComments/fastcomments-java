#!/bin/bash

set -e

echo "Running FastComments Java SDK tests..."

# Run tests for client module
echo "Running client tests..."
cd client
chmod +x gradlew
./gradlew test

echo ""
echo "✓ All tests passed!"
