#!/bin/bash

set -e +x

pushd Stateful
  echo "Packaging Zip"
  	jar -cvf source.zip .
popd

echo "Done zipping"

# jar_count=`find attendee-service-source/target -type f -name *.jar | wc -l`
#
# if [ $jar_count -gt 1 ]; then
#   echo "More than one jar found, don't know which one to deploy. Exiting"
#   exit 1
# fi
#
find Stateful -type f -name source.zip -exec cp "{}" source-output/source.zip \;
#
echo "Moved to source-output Archiving"

exit 0
