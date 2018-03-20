# Estafet Microservices Scrum Discovery

## What is this?
This microservice is serving as a client-side discovery in Estafet Scrum Demo Application.
We use Eureka as a client-side discovery. 
Each microservice is registered in our Disovery microservice.
In case of OpenShift we could have more than one pod per application and because OpenShift is supporting Eureka, we are able to register all pods per microservice.

Each microservice has it's own git repository, but there is a master git repository that contains links to all of the repositories [here](https://github.com/Estafet-LTD/estafet-microservices-scrum).

## Getting Started
You can find a detailed explanation of how to install this (and other microservices) [here](https://github.com/Estafet-LTD/estafet-microservices-scrum#getting-started).

## API Interface
You can find supported Eureka REST operations from here. [here](https://github.com/Netflix/eureka/wiki/Eureka-REST-operations).
