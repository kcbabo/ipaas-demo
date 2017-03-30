This repository contains three projects used in the iPaaS demo:
* day-trade-api : REST API for Day Trader Java EE app
* trade-insight-api : REST API for new microservices stock trade recommendation engine
* api-to-api : iPaaS integration which ties both APIs together

All projects are ready to deploy to OpenShift using the fabric8 maven plugin.  Deploy each project in the order listed above with the following command in each project directory:
```
mvn fabric8:deploy
```

Once all three apps are deployed, the integration will begin pulling trade suggestions from trade-insight-api and pushing them into day-trade-api.

