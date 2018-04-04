#!/bin/bash

set -e +x

pushd source-input
  echo "Running Docker - VSM Analyser"
  	docker run vsm source.zip
popd

echo "Done VSM Analyser"

# jar_count=`find attendee-service-source/target -type f -name *.jar | wc -l`
#
# if [ $jar_count -gt 1 ]; then
#   echo "More than one jar found, don't know which one to deploy. Exiting"
#   exit 1
# fi
#
# find source-input -type f -name source.zip -exec cp "{}" source-input/source.zip \;

#echo "Moved to Package-output zipping"

exit 0
