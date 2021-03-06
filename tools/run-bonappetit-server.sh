#! /usr/bin/env bash
# Runs the bonappetit server.

# Comma separated list of spring boot profiles to activate.
PROFILES=PROD
VERSION=0.2.0-ALPHA
BASE_NAME=bonappetit-server
JAR_LOCATION=.
BONAPPETIT_BASE_DIR="M:\BONAPPETIT_BASE"
BONAPPETIT_PROPERTIES_LOCATION="${BONAPPETIT_BASE_DIR}\config\bonappetit.properties"

java -jar \
    -DBONAPPETIT_BASE=${BONAPPETIT_BASE_DIR} \
    -Dspring.profiles.active=${PROFILES} \
    -Dspring.config.location=${BONAPPETIT_PROPERTIES_LOCATION} \
    ${JAR_LOCATION}/${BASE_NAME}-${VERSION}.jar

exit 0