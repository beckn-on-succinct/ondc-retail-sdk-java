# ondc-retail-sdk-java
Java SDK for ONDC Retail Domain

This repo defines [ONDC](https://ondc.org/) (Open Network for Digital Commerce) Retail [Specification](https://app.swaggerhub.com/apis/ONDC/ONDC-Protocol-Retail/) and also implements several utility functions.
Java based SellerApp or BuyerApp can consume this. This SDK is agnostic of any Java based application frameworks.

## Version

The ONDC Retail specification version that this SDK confirms to : 1.0. (Minor version - [1.0.28](https://app.swaggerhub.com/apis/ONDC/ONDC-Protocol-Retail/1.0.28))

The Beckn/FIDE version that this SDK version consumes : 0.9.3 ([repo](https://github.com/venkatramanm/beckn-sdk-java))

## Getting Started

The SDK will be published as Maven artifact soon. Consuming this SDK in your project is very straight forward, follow the steps below-
- Clone this repo.
- Run 
```
  cd <repo-dir>
  mvn clean install
```
- Add following as maven dependency to the project where this SDK is to be consumed,
```
  <dependency>
        <groupId>in.succinct.beckn.ondc</groupId>
        <artifactId>ondc-retail-sdk-java</artifactId>
        <version>[1.0-SNAPSHOT,)</version>
  </dependency>
```

If you are building an ONDC app (BAP or BPP), It is hightly encouraged that you also consider [bpp.shell](https://github.com/venkatramanm/bpp.shell) project, it brings up an ONDC app with several features already built in, per below, and you can start testing your app on staging in a matter of few hours.
  - Registry subscription
  - Crypto keys management
  - Async callback framework
  - Adaptors for various popular ecommerce platforms/tools and a framework if you want to build your own adaptor.
  

## Contribution

ONDC is an open network, and the primary purpose of this SDK is to save effort to maintain and manage specification version revisions from a single place. 

Hence, contributions to this SDK are most welcome. 

Please feel free to raise Issues, Pull Requests, Contributor requests, Discussion topics.
