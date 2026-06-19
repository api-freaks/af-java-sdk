# Apifreaks Java SDK

[![fern shield](https://img.shields.io/badge/%F0%9F%8C%BF-Built%20with%20Fern-brightgreen)](https://buildwithfern.com?utm_source=github&utm_medium=github&utm_campaign=readme&utm_source=Apifreaks%2FJava)
[![Maven Central](https://img.shields.io/maven-central/v/com.apifreaks/sdk.svg)](https://central.sonatype.com/artifact/com.apifreaks/sdk)

The Apifreaks Java library provides convenient access to the Apifreaks APIs from Java.

## Table of Contents

- [Installation](#installation)
- [Reference](#reference)
- [Usage](#usage)
- [Environments](#environments)
- [Errors](#errors)
- [Request Types](#request-types)
- [Async Client](#async-client)
- [Advanced](#advanced)
  - [Retries](#retries)
  - [Timeouts](#timeouts)
  - [Additional Headers](#additional-headers)
  - [Additional Query String Parameters](#additional-query-string-parameters)
- [Contributing](#contributing)

## Installation

### Maven

Add this dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.apifreaks</groupId>
    <artifactId>sdk</artifactId>
    <version>1.0.1</version>
</dependency>
```

### Gradle

```gradle
implementation "com.apifreaks:sdk:1.0.1"
```

For Kotlin DSL:

```kotlin
implementation("com.apifreaks:sdk:1.0.1")
```

## Reference

A full reference for this library is available [here](./reference.md).

## Usage

Instantiate and use the client with the following:

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GeolocationLookupRequest;
import com.apifreaks.sdk.types.GeolocationLookupResponse;

public class Main {
    public static void main(String[] args) {
        ApifreaksApiClient client = ApifreaksApiClient.builder().build();

        GeolocationLookupRequest request = GeolocationLookupRequest.builder()
                .apiKey("your_api_key")
                .ip("8.8.8.8")
                .build();

        GeolocationLookupResponse response = client.geolocationLookup(request);

        System.out.println(response);
    }
}
```

## Environments

This SDK allows you to configure the API base URL.

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.core.Environment;

ApifreaksApiClient client = ApifreaksApiClient.builder()
        .environment(Environment.DEFAULT)
        .build();
```

You can also provide a custom base URL:

```java
ApifreaksApiClient client = ApifreaksApiClient.builder()
        .url("https://api.apifreaks.com")
        .build();
```

## Errors

When the API returns a non-success status code, the SDK throws `ApifreaksApiApiException`.

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.core.ApifreaksApiApiException;
import com.apifreaks.sdk.requests.GeolocationLookupRequest;
import com.apifreaks.sdk.types.GeolocationLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();

try {
    GeolocationLookupResponse response = client.geolocationLookup(
            GeolocationLookupRequest.builder()
                    .apiKey("your_api_key")
                    .ip("8.8.8.8")
                    .build()
    );
    System.out.println(response);
} catch (ApifreaksApiApiException e) {
    System.out.println("API Error " + e.statusCode() + ": " + e.body());
} catch (RuntimeException e) {
    System.out.println("Unexpected error: " + e.getMessage());
}
```

## Request Types

The SDK exports request models as Java builder classes under the `requests` package.

```java
import com.apifreaks.sdk.requests.GeolocationLookupRequest;

GeolocationLookupRequest request = GeolocationLookupRequest.builder()
        .apiKey("your_api_key")
        .ip("8.8.8.8")
        .build();
```

Response models are available under the `types` package.

```java
import com.apifreaks.sdk.types.GeolocationLookupResponse;
```

## Async Client

The SDK also includes an async client.

```java
import com.apifreaks.sdk.AsyncApifreaksApiClient;
import java.util.concurrent.CompletableFuture;
import com.apifreaks.sdk.requests.GeolocationLookupRequest;
import com.apifreaks.sdk.types.GeolocationLookupResponse;

AsyncApifreaksApiClient client = AsyncApifreaksApiClient.builder().build();

CompletableFuture<GeolocationLookupResponse> response = client.geolocationLookup(
        GeolocationLookupRequest.builder()
                .apiKey("your_api_key")
                .ip("8.8.8.8")
                .build()
);
```

## Advanced

### Retries

The SDK is instrumented with automatic retries. The default retry count is `2`.

```java
ApifreaksApiClient client = ApifreaksApiClient.builder()
        .maxRetries(3)
        .build();
```

### Timeouts

The SDK defaults to a `60` second timeout. Configure the client timeout with the builder:

```java
ApifreaksApiClient client = ApifreaksApiClient.builder()
        .timeout(30)
        .build();
```

You can also set a per-request timeout with `RequestOptions`:

```java
import com.apifreaks.sdk.core.RequestOptions;

GeolocationLookupResponse response = client.geolocationLookup(
        request,
        RequestOptions.builder()
                .timeout(30)
                .build()
);
```

### Additional Headers

You can add custom headers to every request using the client builder:

```java
ApifreaksApiClient client = ApifreaksApiClient.builder()
        .addHeader("X-Custom-Header", "custom-value")
        .build();
```

You can also add headers to a single request using `RequestOptions`:

```java
import com.apifreaks.sdk.core.RequestOptions;

GeolocationLookupResponse response = client.geolocationLookup(
        request,
        RequestOptions.builder()
                .addHeader("X-Custom-Header", "custom-value")
                .build()
);
```

### Additional Query String Parameters

You can add custom query parameters to requests using `RequestOptions`.

```java
import com.apifreaks.sdk.core.RequestOptions;

GeolocationLookupResponse response = client.geolocationLookup(
        request,
        RequestOptions.builder()
                .addQueryParameter("filter", "active")
                .addQueryParameter("sort", "desc")
                .build()
);
```

## Contributing

While we value open-source contributions to this SDK, this library is generated programmatically.
Additions made directly to this library would have to be moved over to our generation code,
otherwise they would be overwritten upon the next generated release. Feel free to open a PR as
a proof of concept, but know that we will not be able to merge it as-is. We suggest opening
an issue first to discuss with us!

On the other hand, contributions to the README are always very welcome!
