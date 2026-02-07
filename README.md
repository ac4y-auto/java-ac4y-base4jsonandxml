# java-ac4y-base4jsonandxml

Base classes with JSON (Gson) and XML (JAXB) serialization capabilities.

## Maven Dependency

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-base4jsonandxml</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Overview

Provides two key base classes:
- **Ac4y** - Extends Ac4yObject, adds `getAsJson()`, `getFromJson()`, `getAsXml()`, `getFromXml()`. JPA `@MappedSuperclass` + JAXB `@XmlRootElement`.
- **Ac4yNoId** - Lightweight serialization base without identification (no GUID/ID).

Both include their own GsonCap and JaxbCap utility instances.

## Dependencies

- `ac4y:ac4y-class:1.0.0`
- Gson 2.10.1, JAXB 2.3.1, JPA 2.1.0

## Build

```bash
mvn clean install
mvn test
```

## Origin

Extracted from `IJAc4yObjectModule/IJAc4yBase4JsonAndXml` module.

---
**Version:** 1.0.0
