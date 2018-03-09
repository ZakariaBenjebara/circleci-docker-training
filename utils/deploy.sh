#!/bin/bash

set -ex

docker build -t ${REGISTRY}/${IMAGE_NAME}:$TAG .
docker login -u $DOCKER_USER -p $DOCKER_PASS         
docker tag ${REGISTRY}/${IMAGE_NAME}:$TAG ${REGISTRY}/${IMAGE_NAME}:latest
docker push ${REGISTRY}/${IMAGE_NAME}
docker tag ${REGISTRY}/${IMAGE_NAME}:latest ${REGISTRY}/${IMAGE_NAME}:$TAG
docker push ${REGISTRY}/${IMAGE_NAME}