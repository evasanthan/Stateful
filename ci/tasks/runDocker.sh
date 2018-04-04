#!/usr/bin/env bash

set -ex
   pushd resource-git-feature-main-java
        echo "Clean & Compiling................"
        ./gradlew --no-daemon clean

        echo "Running Tests................"
        ./gradlew --no-daemon test

   popd

echo "Testing Done !!!"
