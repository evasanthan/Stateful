#!/bin/bash

set -e +x

pushd Stateful
  echo "Packaging Zip"
  echo which zip
   which zip
  	zip -r source.zip .
popd

echo "Done zipping"

# jar_count=`find attendee-service-source/target -type f -name *.jar | wc -l`
#
# if [ $jar_count -gt 1 ]; then
#   echo "More than one jar found, don't know which one to deploy. Exiting"
#   exit 1
# fi
#
# find attendee-service-source/target -type f -name *.jar -exec cp "{}" package-output/attendee-service.jar \;


exit 0
