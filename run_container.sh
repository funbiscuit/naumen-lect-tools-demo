#!/bin/sh

docker run --name docker-demo \
  -p 8181:8080 \
  -v docker-demo-volume:/app/data \
  -e SPRING_DATASOURCE_URL="jdbc:h2:file:/app/data/todos" \
  docker-demo
