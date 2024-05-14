#!/bin/bash

kubectl apply -f ./infra/backend.yml
kubectl apply -f ./infra/elasticSearch.yml
kubectl apply -f ./infra/kibana.yml
kubectl apply -f ./infra/fluentd.yml
