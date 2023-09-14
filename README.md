# thymeleaf-dynamic-htmx-mvc
Using htmx hx-boost="true" with Thymeleaf to avoid page hard refresh

```bash
./mvnw clean compile spring-boot:start
open http://127.0.0.1:8080/
./mvnw spring-boot:stop
```

## RTFM
* https://github.com/wiverson/htmx-demo
* https://github.com/derkoe/quarkus-htmx-todos/blob/main/pom.xml
* https://www.youtube.com/watch?v=38WAVRfxPxI&ab_channel=ChangeNode
* https://github.com/wimdeblauwe/blog-example-code
* https://www.wimdeblauwe.com/blog/2022/06/15/thymeleaf-and-htmx-with-out-of-band-swaps/
* https://www.youtube.com/watch?v=GVq0uzpHYoQ&ab_channel=Devoxx
* https://www.youtube.com/watch?v=cpzowDDJj24

<!--

# Read Me First

The following was discovered as part of building this project:

* The following dependencies are not known to work with Spring Native: 'Spring Configuration Processor, Liquibase Migration'. As a result,
  your application may not work as expected.

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/5.3.22/spring-framework-reference/languages.html#coroutines)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web.reactive)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.r2dbc)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.data-initialization.migration-tool.liquibase)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)

### Guides

The following guides illustrate how to use some features concretely:

* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)

### Additional Links

These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#spring-aot-maven)
* [R2DBC Homepage](https://r2dbc.io)

## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-buildpacks)
.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm thymeleaf-dynamic-htmx:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine,
see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.12.1/reference/htmlsingle/#getting-started-native-build-tools)
.

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:

```
$ target/thymeleaf-dynamic-htmx
```

-->
