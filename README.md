# Quarkus Camel example

This shows how to make Camel run with Quarkus.

```
mvn compile quarkus:dev
```

Prerequisite to compile to native executable:

* Download GraalVM
* Extract somewhere and set the ENV variable GRAALVM_HOME

```
mvn package -Pnative
./target/quarkus-camel-first-impressions-1.0-SNAPSHOT-runner
```

Observe fast boot times :

```
2019-03-19 16:28:38,457 INFO  [io.qua.cam.cor.run.FastCamelContext] (main) Route: route1 started and consuming from: timer://testTimer
2019-03-19 16:28:38,459 INFO  [io.quarkus] (main) Quarkus 0.11.0 started in 0.007s. Listening on: http://127.0.0.1:8080
2019-03-19 16:28:38,459 INFO  [io.quarkus] (main) Installed features: [camel-core, cdi, resteasy]
2019-03-19 16:28:39,457 INFO  [route1] (Camel (camel-1) thread #0 - timer://testTimer) test
```
