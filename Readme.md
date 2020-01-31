# Micronaut Validation Example

This project demonstrates (a bug in?) the micronaut validation framework.

In method validation a Java Optional.empty() is validated as null.

## Prerequisites

- JDK 11
- Gradle 5 or 6

## Check code

The validation is declared in the interface `de.flexguse.micronaut.demo.service.ExampleService`.

## Reproduce Bug

Just run the Spock test `de.flexguse.micronaut.demo.service.ExampleServiceImplTest` or run all tests
with the command 

```bash
./gradlew test
```