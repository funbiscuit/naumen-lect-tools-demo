#!/bin/sh

k3d cluster create \
  --registry-create demo-registry:0.0.0.0:5777 \
  k8s-demo
