# Reference
<details><summary><code>client.geolocationLookup(request) -> GeolocationLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get detailed geolocation data for an IP address including country, city, timezone, currency, and optional security and user-agent information

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GeolocationLookupRequest;
import com.apifreaks.sdk.types.GeolocationLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GeolocationLookupRequest request = GeolocationLookupRequest.builder()
        .apiKey("apiKey")
        .build();
GeolocationLookupResponse response = client.geolocationLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GeolocationLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IPv4, IPv6, or hostname for geolocation lookup _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;GeolocationLookupRequestLang&gt;` — Response language for location fields _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — Comma separated list of fields to include in response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — Comma separated list of fields to exclude from response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional&lt;String&gt;` — Additional data to include (location, network, security, currency, time_zone, user_agent, country_metadata , hostname, liveHostname, hostnameFallbackLivet) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.geolocationLookupV2(request) -> GeolocationLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/geolocation/lookup`. Uses the same request and response types as the v1 `geolocationLookup` method.

Get detailed geolocation data for an IP address including country, city, timezone, currency, and optional security and user-agent information

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GeolocationLookupRequest;
import com.apifreaks.sdk.types.GeolocationLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GeolocationLookupRequest request = GeolocationLookupRequest.builder()
        .apiKey("apiKey")
        .build();
GeolocationLookupResponse response = client.geolocationLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GeolocationLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IPv4, IPv6, or hostname for geolocation lookup _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;GeolocationLookupRequestLang&gt;` — Response language for location fields _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — Comma separated list of fields to include in response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — Comma separated list of fields to exclude from response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional&lt;String&gt;` — Additional data to include (location, network, security, currency, time_zone, user_agent, country_metadata , hostname, liveHostname, hostnameFallbackLivet) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkGeolocationLookup(request) -> List<BulkGeolocationLookupResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve detailed geolocation data for multiple IP addresses in a single request. Supports up to <code>50,000</code> IP-addresses/host-names per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkGeolocationLookupRequest;
import java.util.List;
import com.apifreaks.sdk.types.BulkGeolocationLookupResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkGeolocationLookupRequest request = BulkGeolocationLookupRequest.builder()
        .apiKey("apiKey")
        .ips(java.util.List.of("8.8.8.8"))
        .build();
List<BulkGeolocationLookupResponseItem> response = client.bulkGeolocationLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkGeolocationLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String&gt;` — List of IP addresses or hostnames to lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkGeolocationLookupV2(request) -> List<BulkGeolocationLookupResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/geolocation/lookup`. Uses the same request and response types as the v1 `bulkGeolocationLookup` method.

Retrieve detailed geolocation data for multiple IP addresses in a single request. Supports up to <code>50,000</code> IP-addresses/host-names per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkGeolocationLookupRequest;
import java.util.List;
import com.apifreaks.sdk.types.BulkGeolocationLookupResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkGeolocationLookupRequest request = BulkGeolocationLookupRequest.builder()
        .apiKey("apiKey")
        .ips(java.util.List.of("8.8.8.8"))
        .build();
List<BulkGeolocationLookupResponseItem> response = client.bulkGeolocationLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkGeolocationLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String&gt;` — List of IP addresses or hostnames to lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.ipSecurityLookup(request) -> IpSecurityLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get comprehensive security information for a given IP address. Detects VPNs, proxies, Tor nodes, and other security threats.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.IpSecurityLookupRequest;
import com.apifreaks.sdk.types.IpSecurityLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
IpSecurityLookupRequest request = IpSecurityLookupRequest.builder()
        .apiKey("apiKey")
        .build();
IpSecurityLookupResponse response = client.ipSecurityLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;IpSecurityLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — A valid IPv4 or IPv6 address to look up. If omitted, the API uses the public IP of the requesting client. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — Comma-separated list of fields to return. Supports dot notation (e.g. security.threat_score). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — Comma-separated list of fields to remove from the response. Supports dot notation (e.g. security.is_tor). _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkIpSecurityLookup(request) -> List<BulkIpSecurityLookupResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

The Bulk IP Security Lookup API allows you to retrieve security details for up to <code>50,000</code> IP-addresses in a single request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkIpSecurityLookupRequest;
import java.util.List;
import com.apifreaks.sdk.types.BulkIpSecurityLookupResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkIpSecurityLookupRequest request = BulkIpSecurityLookupRequest.builder()
        .apiKey("apiKey")
        .ips(java.util.List.of("8.8.8.8"))
        .build();
List<BulkIpSecurityLookupResponseItem> response = client.bulkIpSecurityLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkIpSecurityLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String&gt;` — List of IP addresses to lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.geocoderSearch(request) -> List<GeocoderSearchResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Convert a given address or place name into geographic coordinates (latitude and longitude).

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GeocoderSearchRequest;
import java.util.List;
import com.apifreaks.sdk.types.GeocoderSearchResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GeocoderSearchRequest request = GeocoderSearchRequest.builder()
        .apiKey("apiKey")
        .query("Wembley Stadium, London")
        .build();
List<GeocoderSearchResponseItem> response = client.geocoderSearch(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**acceptLanguage:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GeocoderSearchRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**query:** `String` — Free-form search query, e.g. Wembley Stadium, London _(required)_
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional&lt;Integer&gt;` — Max number of results to return (1–40). May return fewer if matches are weak. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**minLat:** `Optional&lt;Float&gt;` — Minimum latitude for the viewbox. Must be ≤ max_lat and between -90 and 90. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**maxLat:** `Optional&lt;Float&gt;` — Maximum latitude for the viewbox. Must be ≥ min_lat and between -90 and 90. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**minLon:** `Optional&lt;Float&gt;` — Minimum longitude for the viewbox. Must be ≤ max_lon and between -180 and 180. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**maxLon:** `Optional&lt;Float&gt;` — Maximum longitude for the viewbox. Must be ≥ min_lon and between -180 and 180. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.geocoderReverse(request) -> GeocoderReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Convert geographic coordinates (latitude and longitude) into a human-readable address or place name.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GeocoderReverseRequest;
import com.apifreaks.sdk.types.GeocoderReverseResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GeocoderReverseRequest request = GeocoderReverseRequest.builder()
        .apiKey("apiKey")
        .lat(51.5074)
        .lon(-0.1278)
        .build();
GeocoderReverseResponse response = client.geocoderReverse(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**acceptLanguage:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GeocoderReverseRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `double` — WGS84 latitude value ranging from -90 to 90. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**lon:** `double` — WGS84 longitude value ranging from -180 to 180. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisLookup(request) -> DomainWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve current WHOIS information for a domain name. This endpoint provides detailed registration information including registrar details, dates, nameservers, and registrant information.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainWhoisLookupRequest;
import com.apifreaks.sdk.types.DomainWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainWhoisLookupRequest request = DomainWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .domainName("example.com")
        .build();
DomainWhoisLookupResponse response = client.domainWhoisLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainWhoisLookupRequestFormat&gt;` — Response format (defaults to json) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name for WHOIS lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisLookupV2(request) -> DomainWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/domain/whois/live`. Uses the same request and response types as the v1 `domainWhoisLookup` method.

Retrieve current WHOIS information for a domain name. This endpoint provides detailed registration information including registrar details, dates, nameservers, and registrant information.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainWhoisLookupRequest;
import com.apifreaks.sdk.types.DomainWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainWhoisLookupRequest request = DomainWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .domainName("example.com")
        .build();
DomainWhoisLookupResponse response = client.domainWhoisLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainWhoisLookupRequestFormat&gt;` — Response format (defaults to json) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name for WHOIS lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkDomainWhoisLookup(request) -> BulkDomainWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve WHOIS information for <code>100 Domains per Request</code>.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkDomainWhoisLookupRequest;
import com.apifreaks.sdk.types.BulkDomainWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkDomainWhoisLookupRequest request = BulkDomainWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .domainNames(java.util.List.of("example.com"))
        .build();
BulkDomainWhoisLookupResponse response = client.bulkDomainWhoisLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkDomainWhoisLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String&gt;` — A list of domain names for which WHOIS data is requested. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkDomainWhoisLookupV2(request) -> BulkDomainWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/domain/whois/live`. Uses the same request and response types as the v1 `bulkDomainWhoisLookup` method.

Retrieve WHOIS information for <code>100 Domains per Request</code>.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkDomainWhoisLookupRequest;
import com.apifreaks.sdk.types.BulkDomainWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkDomainWhoisLookupRequest request = BulkDomainWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .domainNames(java.util.List.of("example.com"))
        .build();
BulkDomainWhoisLookupResponse response = client.bulkDomainWhoisLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkDomainWhoisLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String&gt;` — A list of domain names for which WHOIS data is requested. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.ipWhoisLookup(request) -> IpWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Returns WHOIS registration details for a specified IP address (IPv4 or IPv6).

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.IpWhoisLookupRequest;
import com.apifreaks.sdk.types.IpWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
IpWhoisLookupRequest request = IpWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .ip("8.8.8.8")
        .build();
IpWhoisLookupResponse response = client.ipWhoisLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;IpWhoisLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `String` — The IP address (IPv4 or IPv6) for which WHOIS data is requested. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.asnWhoisLookup(request) -> AsnWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Returns WHOIS registration details for a specified ASN, with or without the 'as' prefix.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.AsnWhoisLookupRequest;
import com.apifreaks.sdk.types.AsnWhoisLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
AsnWhoisLookupRequest request = AsnWhoisLookupRequest.builder()
        .apiKey("apiKey")
        .asn("AS15169")
        .build();
AsnWhoisLookupResponse response = client.asnWhoisLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;AsnWhoisLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**asn:** `String` — The Autonomous System Number (ASN) to retrieve WHOIS data for. Can be prefixed with 'as' or not. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisHistory(request) -> DomainWhoisHistoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve historical WHOIS records for a domain name. This endpoint provides a timeline of all recorded changes in domain registration information.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainWhoisHistoryRequest;
import com.apifreaks.sdk.types.DomainWhoisHistoryResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainWhoisHistoryRequest request = DomainWhoisHistoryRequest.builder()
        .apiKey("apiKey")
        .domainName("example.com")
        .build();
DomainWhoisHistoryResponse response = client.domainWhoisHistory(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainWhoisHistoryRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name for historical WHOIS lookup _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisReverse(request) -> DomainWhoisReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Performs a reverse WHOIS search using one or more search parameters like keyword, email, owner, or company.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainWhoisReverseRequest;
import com.apifreaks.sdk.types.DomainWhoisReverseResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainWhoisReverseRequest request = DomainWhoisReverseRequest.builder()
        .apiKey("apiKey")
        .build();
DomainWhoisReverseResponse response = client.domainWhoisReverse(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainWhoisReverseRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**keyword:** `Optional&lt;String&gt;` — Keyword search term for reverse WHOIS by keyword (case-insensitive pattern matching). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional&lt;String&gt;` — Email search term for reverse WHOIS by email address (case-insensitive exact or regex match; * wildcard supported). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**owner:** `Optional&lt;String&gt;` — Registrant or owner name for reverse WHOIS (a full-text search phrase matching technique to retrieve results). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**company:** `Optional&lt;String&gt;` — Organization or company name for reverse WHOIS (full-text search phrase matching technique to retrieve results). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**exact:** `Optional&lt;Boolean&gt;` — Accepts 'true' or 'false'. &quot;true&quot; returns only records that exactly match the input (keyword, owner/registrant, or company). &quot;false&quot; returns all matches and is the default when omitted. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional&lt;DomainWhoisReverseRequestMode&gt;` — Accepts 'true' or 'false'. &quot;true&quot; returns only records that exactly match the input (keyword, owner/registrant, or company). &quot;false&quot; returns all matches and is the default when omitted. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional&lt;Integer&gt;` — Page number for paginated results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainDnsLookup(request) -> DomainDnsLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve real-time DNS records for any hostname. Supports multiple record types including A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainDnsLookupRequest;
import com.apifreaks.sdk.types.DomainDnsLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainDnsLookupRequest request = DomainDnsLookupRequest.builder()
        .apiKey("apiKey")
        .type(java.util.List.of("all"))
        .build();
DomainDnsLookupResponse response = client.domainDnsLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `List&lt;String&gt;` — A comma-separated list of DNS record types for lookup. Possible values: A, AAAA, MX, NS, SOA, SPF, TXT, CNAME, or all. When ipAddress is provided, type must be &quot;all&quot;. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainDnsLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**hostName:** `Optional&lt;String&gt;` — Hostname or URL whose DNS records are required. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ipAddress:** `Optional&lt;String&gt;` — The IP address for requested DNS's PTR record. 'type' parameter must be set to 'all'. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkDomainDnsLookup(request) -> BulkDomainDnsLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Perform DNS lookups for multiple hostnames in a single request. Supports up to <code>100 host-names per request</code> and returns DNS records including A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkDomainDnsLookupRequest;
import com.apifreaks.sdk.types.BulkDomainDnsLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkDomainDnsLookupRequest request = BulkDomainDnsLookupRequest.builder()
        .apiKey("apiKey")
        .type(java.util.List.of("all"))
        .domainNames(java.util.List.of("example.com"))
        .build();
BulkDomainDnsLookupResponse response = client.bulkDomainDnsLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `List&lt;String&gt;` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkDomainDnsLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String&gt;` — List of hostnames to lookup DNS records for _(required)_
    
</dd>
</dl>

<dl>
<dd>

**ipAddresses:** `Optional&lt;List<String&gt;&gt;` — A comma-separated list of IP addresses for reverse DNS lookup _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainDnsHistory(request) -> DomainDnsHistoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve historical DNS records for any hostname. Access unique historical data for A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records, including subdomains. Results are paginated with up to 100 unique records per page.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainDnsHistoryRequest;
import com.apifreaks.sdk.types.DomainDnsHistoryResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainDnsHistoryRequest request = DomainDnsHistoryRequest.builder()
        .apiKey("apiKey")
        .hostName("example.com")
        .type(java.util.List.of("all"))
        .build();
DomainDnsHistoryResponse response = client.domainDnsHistory(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `List&lt;String&gt;` — A comma-separated list of DNS record types for lookup. Possible values: A, AAAA, MX, NS, SOA, SPF, TXT, CNAME, or all _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainDnsHistoryRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**hostName:** `String` — Hostname or URL whose historical DNS records are required _(required)_
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional&lt;Integer&gt;` — Page number for paginated results _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainDnsReverse(request) -> DomainDnsReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve all the hostnames associated with any particular A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME DNS records. For instance, you can access all the hostnames hosted on any IP/CIDR notation, all the domain names using Cloudflare name servers, and all the domain names using Google Mailbox

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainDnsReverseRequest;
import com.apifreaks.sdk.types.DomainDnsReverseResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainDnsReverseRequest request = DomainDnsReverseRequest.builder()
        .apiKey("apiKey")
        .type("A")
        .value("value")
        .build();
DomainDnsReverseResponse response = client.domainDnsReverse(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainDnsReverseRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**type:** `DomainDnsReverseRequestType` — The type of reverse DNS lookup to perform. Determines how the value parameter is interpreted: A: IPv4 CIDR block AAAA: IPv6 CIDR block MX: Mail provider domain NS: Name server provider hostname SOA: SOA record admin domain SPF/TXT: Target verification strings CNAME: Target hostname _(required)_
    
</dd>
</dl>

<dl>
<dd>

**value:** `String` — Provide an IP or CIDR for A/AAAA lookups, or a hostname/selector for MX, NS, SOA, SPF, TXT, and CNAME queries. Wildcard regex patterns are also supported (e.g., mail.google.com, m*.google.com, _spf.g*.com, s*.g*.com). _(required)_
    
</dd>
</dl>

<dl>
<dd>

**exact:** `Optional&lt;Boolean&gt;` — Accepts 'true' or 'false'. &quot;true&quot; returns only records that exactly match the input (NS, MX, CNAME, SOA, SPF, TXT). &quot;false&quot; returns all matches (default when omitted). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional&lt;Integer&gt;` — Page number to paginate through results (defaults to 1). _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.webScrape(request) -> WebScrapeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Execute a series of web scraping instructions on a target URL. Supports various operations like form filling, clicking, data extraction, and CAPTCHA solving.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.WebScrapeRequest;
import com.apifreaks.sdk.types.WebScrapeResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
WebScrapeRequest request = WebScrapeRequest.builder()
        .apiKey("apiKey")
        .url("https://example.com")
        .body(null)
        .build();
WebScrapeResponse response = client.webScrape(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;WebScrapeRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — Target URL to scrape _(required)_
    
</dd>
</dl>

<dl>
<dd>

**text:** `Optional&lt;Boolean&gt;` — Set to true to return the data in text format else false for data in html format with tags. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**jsEnabled:** `Optional&lt;Boolean&gt;` — Set true to handle websites with JavaScript. Set false to handle static html websites. Default value is true. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**proxy:** `Optional&lt;WebScrapeRequestProxy&gt;` — Use proxy for requests _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**sslIgnore:** `Optional&lt;Boolean&gt;` — Ignore SSL certificate errors. Only works if jsEnabled is true. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**windowSize:** `Optional&lt;String&gt;` — Specify the browser window size in the format 'width,height' (e.g., &quot;1920w,1080h&quot;). Default value is the default resolutions provided by web/browser. Only works if jsEnabled is true. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**adBlock:** `Optional&lt;Boolean&gt;` — Set to true to apply ad-blocker to the specified URL else false or ignore to not apply. Only works if jsEnabled is true. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**captcha:** `Optional&lt;Boolean&gt;` — if true user can provide captcha instructions in the instructions to solve image captchas. Only works if jsEnabled is true. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**body:** `WebScrapeRequestBody` — if true user can provide captcha instructions in the instructions to solve image captchas. Only works if jsEnabled is true. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.emailValidate(request) -> EmailValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates a single email address and returns result.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.EmailValidateRequest;
import com.apifreaks.sdk.types.EmailValidateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
EmailValidateRequest request = EmailValidateRequest.builder()
        .apiKey("apiKey")
        .email("user@example.com")
        .build();
EmailValidateResponse response = client.emailValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;EmailValidateRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` — Email address to validate _(required)_
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional&lt;String&gt;` — Name of the email address _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP address of the email address _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkEmailValidate(request) -> BulkEmailValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates a bulk of email addresses and returns result for each. Maximum <code>10</code> email addresses per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkEmailValidateRequest;
import com.apifreaks.sdk.types.BulkEmailValidateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkEmailValidateRequest request = BulkEmailValidateRequest.builder()
        .apiKey("apiKey")
        .emailData(java.util.List.of())
        .build();
BulkEmailValidateResponse response = client.bulkEmailValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkEmailValidateRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**emailData:** `List<BulkEmailValidateRequestEmailDataItem&gt;` — Array of email objects for bulk validation _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.phoneValidate(request) -> PhoneValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates a single phone number and returns detailed metadata including carrier, line type, geolocation, time zones, and standardized formats.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PhoneValidateRequest;
import com.apifreaks.sdk.types.PhoneValidateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PhoneValidateRequest request = PhoneValidateRequest.builder()
        .apiKey("apiKey")
        .number("+14155552671")
        .build();
PhoneValidateResponse response = client.phoneValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PhoneValidateRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**number:** `String` — Phone number to validate. Accepts international format (+14155552671), local format (4155552671) with region, or IDD format (0014155552671) with dialer_region. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional&lt;String&gt;` — Two-letter ISO country code (e.g., US, GB). Required when number is in local format without + prefix. Cannot be used together with dialer_region. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**dialerRegion:** `Optional&lt;String&gt;` — Two-letter ISO country code indicating the country the number is being dialed from. Required when number uses IDD exit code. Cannot be used together with region. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkPhoneValidate(request) -> List<BulkPhoneValidateResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates up to 100 phone numbers in a single request. Each number is processed independently — invalid entries return per-number errors without affecting the rest of the batch.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkPhoneValidateRequest;
import java.util.List;
import com.apifreaks.sdk.types.BulkPhoneValidateResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkPhoneValidateRequest request = BulkPhoneValidateRequest.builder()
        .apiKey("apiKey")
        .numbers(java.util.List.of())
        .build();
List<BulkPhoneValidateResponseItem> response = client.bulkPhoneValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkPhoneValidateRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**numbers:** `List<BulkPhoneValidateRequestNumbersItem&gt;` — Array of phone number objects. Maximum 100 per request. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainSslLookup(request) -> DomainSslLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve comprehensive SSL certificate information without the certificate chain. This endpoint provides detailed information about the SSL certificate including expiry dates, issuer details, and encryption methods.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainSslLookupRequest;
import com.apifreaks.sdk.types.DomainSslLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainSslLookupRequest request = DomainSslLookupRequest.builder()
        .apiKey("apiKey")
        .domainName("example.com")
        .build();
DomainSslLookupResponse response = client.domainSslLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainSslLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name or URL whose SSL certificate lookup is required _(required)_
    
</dd>
</dl>

<dl>
<dd>

**sslRaw:** `Optional&lt;Boolean&gt;` — Set to true to get the raw openSSL response of the domain _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainSslChainLookup(request) -> DomainSslChainLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve the complete SSL certificate chain from root Certificate Authority (CA) to end-user certificate. This endpoint provides comprehensive information about each certificate in the chain.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainSslChainLookupRequest;
import com.apifreaks.sdk.types.DomainSslChainLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainSslChainLookupRequest request = DomainSslChainLookupRequest.builder()
        .apiKey("apiKey")
        .domainName("example.com")
        .build();
DomainSslChainLookupResponse response = client.domainSslChainLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainSslChainLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name or URL whose SSL certificate chain lookup is required _(required)_
    
</dd>
</dl>

<dl>
<dd>

**sslRaw:** `Optional&lt;Boolean&gt;` — Set to true to get the raw openSSL response for each certificate in the chain _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainAvailabilityCheck(request) -> DomainAvailabilityCheckResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

The Domain Search API is designed to simplify the process of finding available domain names across all top-level domains (TLDs) and second-level domains (SLDs).

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainAvailabilityCheckRequest;
import com.apifreaks.sdk.types.DomainAvailabilityCheckResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainAvailabilityCheckRequest request = DomainAvailabilityCheckRequest.builder()
        .apiKey("apiKey")
        .domain("example.com")
        .build();
DomainAvailabilityCheckResponse response = client.domainAvailabilityCheck(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainAvailabilityCheckRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name whose availability is to be checked. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional&lt;DomainAvailabilityCheckRequestSource&gt;` — Specify the data source for domain availability checks. Use &quot;dns&quot; for DNS-based lookups or &quot;whois&quot; for WHOIS-based lookups. By default, &quot;dns&quot; is used. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkDomainAvailabilityCheck(request) -> BulkDomainAvailabilityCheckResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Perform Bulk Domain Availability checks using a list of domains. Supports upto <code>100 Domains Per Request</code>.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkDomainAvailabilityCheckRequest;
import com.apifreaks.sdk.types.BulkDomainAvailabilityCheckResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkDomainAvailabilityCheckRequest request = BulkDomainAvailabilityCheckRequest.builder()
        .apiKey("apiKey")
        .domainNames(java.util.List.of("example.com"))
        .build();
BulkDomainAvailabilityCheckResponse response = client.bulkDomainAvailabilityCheck(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkDomainAvailabilityCheckRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional&lt;BulkDomainAvailabilityCheckRequestSource&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String&gt;` — List of domain names to check. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.domainAvailabilitySuggestions(request) -> DomainAvailabilitySuggestionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

The Domain Search API is designed to simplify the process of finding available domain names across all top-level domains (TLDs) and second-level domains (SLDs).

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.DomainAvailabilitySuggestionsRequest;
import com.apifreaks.sdk.types.DomainAvailabilitySuggestionsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
DomainAvailabilitySuggestionsRequest request = DomainAvailabilitySuggestionsRequest.builder()
        .apiKey("apiKey")
        .domain("example.com")
        .build();
DomainAvailabilitySuggestionsResponse response = client.domainAvailabilitySuggestions(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;DomainAvailabilitySuggestionsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name for availability and suggestions. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional&lt;DomainAvailabilitySuggestionsRequestSource&gt;` — Specify the data source for domain availability checks. Use &quot;dns&quot; for DNS-based lookups or &quot;whois&quot; for WHOIS-based lookups. By default, &quot;dns&quot; is used. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**count:** `Optional&lt;Integer&gt;` — Number of suggestions to retrieve. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**sug:** `Optional&lt;Boolean&gt;` — Whether to return domain suggestions _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.subdomainsLookup(request) -> SubdomainsLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

The Subdomain Lookup API is designed to retrieve subdomains related to the given domain name. It helps you explore subdomains that are available for registration or usage.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.SubdomainsLookupRequest;
import com.apifreaks.sdk.types.SubdomainsLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
SubdomainsLookupRequest request = SubdomainsLookupRequest.builder()
        .apiKey("apiKey")
        .domain("example.com")
        .build();
SubdomainsLookupResponse response = client.subdomainsLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;SubdomainsLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name for availability and suggestions. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**after:** `Optional&lt;String&gt;` — Filter subdomains seen after this date (format YYYY-MM-DD). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**before:** `Optional&lt;String&gt;` — Filter subdomains seen before this date( format YYYY-MM-DD). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional&lt;SubdomainsLookupRequestStatus&gt;` — Filter subdomains by status (active or inactive). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional&lt;String&gt;` — Page number for paginated results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfMerge(file, request) -> PdfMergeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API merges multiple PDF files into a single PDF, in the order they are provided

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfMergeRequest;
import com.apifreaks.sdk.types.PdfMergeResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfMergeRequest request = PdfMergeRequest.builder()
        .apiKey("apiKey")
        .build();
PdfMergeResponse response = client.pdfMerge(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;List<String&gt;&gt;` — An array of unique file IDs referencing PDF files previously uploaded to the API Freaks server. Use this parameter to merge existing files without re-uploading them. Provide multiple IDs to merge files in the specified order. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfMergeRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — Specifies the desired name for the resulting merged PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfRemovePages(file, request) -> PdfRemovePagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API removes a selection or range of pages from a PDF file.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfRemovePagesRequest;
import com.apifreaks.sdk.types.PdfRemovePagesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfRemovePagesRequest request = PdfRemovePagesRequest.builder()
        .apiKey("apiKey")
        .pages("1-3")
        .build();
PdfRemovePagesResponse response = client.pdfRemovePages(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfRemovePagesRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique identifier of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output PDF file after pages have been removed. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `String` — Specifies which pages to remove from the PDF. Accepts individual page numbers (e.g., '1,7') and/or ascending page ranges (e.g., '3-5'). Use commas to separate entries and hyphens for ranges. Reverse ranges (e.g., '5-3') are not allowed. Alternatively, you may provide only one of the following keywords: 'even' (removes all even-numbered pages), 'odd' (removes all odd-numbered pages), or 'last' (removes only the last page). The keyword 'all' is not supported for this operation. Examples: '1,3-5', 'even'. Mixing special keywords with specific pages/ranges is not allowed. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfSplit(file, request) -> PdfSplitResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API splits a PDF into multiple parts based on specified page numbers or ranges.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfSplitRequest;
import com.apifreaks.sdk.types.PdfSplitResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfSplitRequest request = PdfSplitRequest.builder()
        .apiKey("apiKey")
        .build();
PdfSplitResponse response = client.pdfSplit(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;List<String&gt;&gt;` — Defines the page numbers or ranges where the PDF should be split. Provide individual pages and/or ranges in any order (for example: &quot;1-4,9-5,16-last&quot;). Separate entries with commas and use hyphens for ranges. Special keywords (use alone): • even — split at every even-numbered page • odd — split at every odd-numbered page • all — split the PDF into single-page files The keyword last can be used anywhere in the string, in combination with page numbers or ranges (for example: &quot;5-last&quot;, &quot;last-2&quot;, &quot;1,last,9&quot;). Examples: &quot;1,4-2,last&quot; &quot;odd&quot; &quot;all&quot; &quot;last,2-5&quot; Invalid example: &quot;1,odd&quot; (mixing a keyword other than &quot;last&quot; with specific pages/ranges is not allowed). You can pass multiple pages entries to produce multiple output files. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfSplitRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired base name for the output PDF files after splitting. If not provided, a default naming convention will be used. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfRotate(file, request) -> PdfRotateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API rotates pages of a PDF by a specified angle (in multiples of 90 degrees).

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfRotateRequest;
import com.apifreaks.sdk.types.PdfRotateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfRotateRequest request = PdfRotateRequest.builder()
        .apiKey("apiKey")
        .rotate(90)
        .build();
PdfRotateResponse response = client.pdfRotate(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfRotateRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output PDF file after rotation. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies which pages to rotate. Accepts individual page numbers (e.g., '1,7') and/or ascending page ranges (e.g., '3-5'). Use commas to separate entries and hyphens for ranges. Reverse ranges (e.g., '5-3') are not allowed. Alternatively, provide only one of the following keywords: 'even' (rotate all even-numbered pages), 'odd' (rotate all odd-numbered pages), 'last' (rotate only the last page), or 'all' (rotate all pages). Examples: '1,3-5', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**rotate:** `int` — The angle in degrees to rotate the selected pages. Must be one of the following values: 0, 90, 180, 270, -90, -180, or -270. All rotations are applied clockwise. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfCompress(file, request) -> PdfCompressResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API compresses a given PDF file to reduce its file size.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfCompressRequest;
import com.apifreaks.sdk.types.PdfCompressResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfCompressRequest request = PdfCompressRequest.builder()
        .apiKey("apiKey")
        .compressionLevel(null)
        .build();
PdfCompressResponse response = client.pdfCompress(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfCompressRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — Name of the output PDF. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**compressionLevel:** `PdfCompressRequestCompressionLevel` — Controls how aggressively the PDF is compressed. Lower levels preserve more quality, while higher levels reduce file size more. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be deleted from the server immediately after the output is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfExtractPages(file, request) -> PdfExtractPagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API extracts specific pages or page ranges from a PDF file and returns them as a new PDF.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfExtractPagesRequest;
import com.apifreaks.sdk.types.PdfExtractPagesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfExtractPagesRequest request = PdfExtractPagesRequest.builder()
        .apiKey("apiKey")
        .pages("1-3")
        .build();
PdfExtractPagesResponse response = client.pdfExtractPages(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfExtractPagesRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output PDF file after pages have been extracted. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `String` — Specifies which pages to extract from the PDF. You can provide individual page numbers (e.g., '2') and/or page ranges in any order, including descending (e.g., '9-5', '16-last'). Use commas to separate entries and hyphens for ranges. You may alternatively pass only one of the special keywords: 'even' (extracts all even-numbered pages), 'odd' (extracts all odd-numbered pages), 'last' (extracts only the last page), or 'all' (extracts all pages into individual files). Examples: '2,6-3', 'even', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**separated:** `Optional&lt;Boolean&gt;` — If set to true, each of the specified pages will be extracted and returned as a separate PDF file. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfLinearize(file, request) -> PdfLinearizeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

API endpoint that linearizes any given PDF, restructuring it for faster loading and page-by-page viewing in web browsers.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfLinearizeRequest;
import com.apifreaks.sdk.types.PdfLinearizeResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfLinearizeRequest request = PdfLinearizeRequest.builder()
        .apiKey("apiKey")
        .build();
PdfLinearizeResponse response = client.pdfLinearize(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfLinearizeRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output PDF file after pages have been extracted. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfEncrypt(file, request) -> PdfEncryptResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API encrypts a PDF file by setting a password required to open it.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfEncryptRequest;
import com.apifreaks.sdk.types.PdfEncryptResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfEncryptRequest request = PdfEncryptRequest.builder()
        .apiKey("apiKey")
        .userPassword("password")
        .build();
PdfEncryptResponse response = client.pdfEncrypt(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfEncryptRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output encrypted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `Optional&lt;String&gt;` — The password to unlock the input file if it is already protected. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `String` — Sets the user password required to open and view the encrypted PDF file. Password Length should be between 6 and 128 characters. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional&lt;String&gt;` — Sets the owner password for the PDF file. This password provides full access, including the ability to remove restrictions. If not provided, the user_password will also be used as the owner password. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfDecrypt(file, request) -> PdfDecryptResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API decrypts PDF files, removing all encryption, including open passwords and permission restrictions.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfDecryptRequest;
import com.apifreaks.sdk.types.PdfDecryptResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfDecryptRequest request = PdfDecryptRequest.builder()
        .apiKey("apiKey")
        .filePassword("filePassword")
        .build();
PdfDecryptResponse response = client.pdfDecrypt(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfDecryptRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output decrypted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `String` — The password to unlock the input file if it is protected. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfRestrict(file, request) -> PdfRestrictResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API applies permission restrictions on a PDF file, such as disabling printing, copying, or editing. This can include password protection to enforce restrictions.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfRestrictRequest;
import com.apifreaks.sdk.types.PdfRestrictResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfRestrictRequest request = PdfRestrictRequest.builder()
        .apiKey("apiKey")
        .userPassword("password")
        .build();
PdfRestrictResponse response = client.pdfRestrict(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**restrictions:** `Optional&lt;List<PdfRestrictRequestRestrictionsItem&gt;&gt;` — A comma-separated list of restrictions to apply to the PDF. These define what the end-user is not allowed to do with the PDF. Available options are: print_high – Disables high-quality printing. print_low – Disables low-resolution printing. edit_document_assembly – Prevents reordering or inserting pages. fill_form_fields – Disallows filling in PDF form fields. edit_annotations – Disables adding or modifying annotations or comments. modify_content – Prevents modifying existing content in the PDF. copy_and_extract_content – Disables copying text or images from the PDF. use_accessibility – Prevents screen readers or accessibility tools from accessing content. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfRestrictRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output restricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `Optional&lt;String&gt;` — The password to unlock the input file if it is already secured. Provide the owner password if available; otherwise, the user password. The owner password takes precedence. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `String` — Sets the password users will use to open the PDF. If this is not set, only the owner password will be configured, and anyone can open the PDF file with the provided restrictions enabled. Password Length should be between 6 and 128 characters. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional&lt;String&gt;` — Sets the password that allows full access to the PDF (e.g., removing restrictions). If not provided, the user_password (if set) will also be used as the owner password. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfUnrestrict(file, request) -> PdfUnrestrictResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API removes permission restrictions from a PDF while keeping it encrypted. If you want to remove all security (including encryption), use the <code>/pdf/decrypt</code> endpoint instead.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfUnrestrictRequest;
import com.apifreaks.sdk.types.PdfUnrestrictResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfUnrestrictRequest request = PdfUnrestrictRequest.builder()
        .apiKey("apiKey")
        .filePassword("filePassword")
        .build();
PdfUnrestrictResponse response = client.pdfUnrestrict(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfUnrestrictRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `String` — The password to unlock the input file. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `Optional&lt;String&gt;` — Sets the user password for the PDF file. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional&lt;String&gt;` — Sets the owner password for the PDF file. If the owner password is not provided, the user_password will also be used as the owner password. Password Length should be between 6 and 128 characters. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToPng(file, request) -> PdfConvertToPngResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API converts a given PDF file into a sequence of PNG images.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfConvertToPngRequest;
import com.apifreaks.sdk.types.PdfConvertToPngResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfConvertToPngRequest request = PdfConvertToPngRequest.builder()
        .apiKey("apiKey")
        .build();
PdfConvertToPngResponse response = client.pdfConvertToPng(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfConvertToPngRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional&lt;Integer&gt;` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional&lt;String&gt;` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional&lt;PdfConvertToPngRequestProfile&gt;` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black &amp; white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToJpg(file, request) -> PdfConvertToJpgResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API converts a given PDF file into a sequence of JPG images.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfConvertToJpgRequest;
import com.apifreaks.sdk.types.PdfConvertToJpgResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfConvertToJpgRequest request = PdfConvertToJpgRequest.builder()
        .apiKey("apiKey")
        .build();
PdfConvertToJpgResponse response = client.pdfConvertToJpg(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfConvertToJpgRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**quality:** `Optional&lt;Integer&gt;` — Controls JPG compression quality. Higher values yield sharper images with larger file sizes. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional&lt;Integer&gt;` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional&lt;String&gt;` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional&lt;PdfConvertToJpgRequestProfile&gt;` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black &amp; white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToTiff(file, request) -> PdfConvertToTiffResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API converts a given PDF file into a sequence of TIFF images. The output images can be saved as a single TIFF file, or as a sequence of TIFF files.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfConvertToTiffRequest;
import com.apifreaks.sdk.types.PdfConvertToTiffResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfConvertToTiffRequest request = PdfConvertToTiffRequest.builder()
        .apiKey("apiKey")
        .build();
PdfConvertToTiffResponse response = client.pdfConvertToTiff(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfConvertToTiffRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional&lt;Integer&gt;` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional&lt;String&gt;` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional&lt;PdfConvertToTiffRequestProfile&gt;` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black &amp; white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToBmp(file, request) -> PdfConvertToBmpResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Converts a PDF file to a BMP image.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfConvertToBmpRequest;
import com.apifreaks.sdk.types.PdfConvertToBmpResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfConvertToBmpRequest request = PdfConvertToBmpRequest.builder()
        .apiKey("apiKey")
        .build();
PdfConvertToBmpResponse response = client.pdfConvertToBmp(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfConvertToBmpRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional&lt;Integer&gt;` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional&lt;String&gt;` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional&lt;PdfConvertToBmpRequestProfile&gt;` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black &amp; white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToGif(file, request) -> PdfConvertToGifResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API converts a given PDF file into a sequence of GIF images.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;
import java.util.Optional;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfConvertToGifRequest;
import com.apifreaks.sdk.types.PdfConvertToGifResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfConvertToGifRequest request = PdfConvertToGifRequest.builder()
        .apiKey("apiKey")
        .build();
PdfConvertToGifResponse response = client.pdfConvertToGif(Optional.of(new File("input.pdf")), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `Optional<File>` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfConvertToGifRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional&lt;String&gt;` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional&lt;Boolean&gt;` — If set to true, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;String&gt;` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional&lt;String&gt;` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional&lt;Integer&gt;` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional&lt;String&gt;` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional&lt;PdfConvertToGifRequestProfile&gt;` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black &amp; white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional&lt;String&gt;` — The URL to which the webhook notification will be sent after the task is completed. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional&lt;Boolean&gt;` — If true, a notification will also be sent by email in case the webhook request fails all the retries. The email notification will be sent to the requesting user or their organization’s admin if part of one. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfUploadResources(file, request) -> PdfUploadResourcesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API uploads multiple PDF files to the API Freaks server and generates their unique file IDs.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import java.io.File;

import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfUploadResourcesRequest;
import com.apifreaks.sdk.types.PdfUploadResourcesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfUploadResourcesRequest request = PdfUploadResourcesRequest.builder()
        .apiKey("apiKey")
        .build();
PdfUploadResourcesResponse response = client.pdfUploadResources(new File("input.pdf"), request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**file:** `File` — PDF or resource file to upload with the request. Use `Optional.empty()` when using an existing `fileId`. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfUploadResourcesRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfUploadBinary(request) -> PdfUploadBinaryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API uploads PDF files to the API Freaks server in binary format.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfUploadBinaryRequest;
import com.apifreaks.sdk.types.PdfUploadBinaryResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfUploadBinaryRequest request = PdfUploadBinaryRequest.builder()
        .apiKey("apiKey")
        .fileName("fileName")
        .body(null)
        .build();
PdfUploadBinaryResponse response = client.pdfUploadBinary(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfUploadBinaryRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileName:** `String` — The desired name for the uploaded PDF file. This name will be used for storage on the server. NOTE: Please ensure file_name has extension .pdf. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**body:** `byte[]` — The desired name for the uploaded PDF file. This name will be used for storage on the server. NOTE: Please ensure file_name has extension .pdf. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfDownloadResource(request) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API downloads PDF files or ZIP archives from the server using their unique resource ID.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfDownloadResourceRequest;
import java.io.InputStream;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfDownloadResourceRequest request = PdfDownloadResourceRequest.builder()
        .apiKey("apiKey")
        .resourceId("resourceId")
        .build();
InputStream response = client.pdfDownloadResource(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfDownloadResourceRequestFormat&gt;` — Your API key _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resourceId:** `String` — The unique identifier of the file or ZIP archive to download. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfGetTaskStatus(request) -> PdfGetTaskStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API checks the status of a previously initiated PDF processing task using its unique task ID.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfGetTaskStatusRequest;
import com.apifreaks.sdk.types.PdfGetTaskStatusResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfGetTaskStatusRequest request = PdfGetTaskStatusRequest.builder()
        .apiKey("apiKey")
        .taskId("task_id")
        .build();
PdfGetTaskStatusResponse response = client.pdfGetTaskStatus(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfGetTaskStatusRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**taskId:** `String` — The unique ID of the PDF processing task for which the status is requested. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfGetFileStatus(request) -> PdfGetFileStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API checks the status of a PDF file using its unique file ID, providing information about its creation and potential deletion time.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfGetFileStatusRequest;
import com.apifreaks.sdk.types.PdfGetFileStatusResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfGetFileStatusRequest request = PdfGetFileStatusRequest.builder()
        .apiKey("apiKey")
        .fileId("file_id")
        .build();
PdfGetFileStatusResponse response = client.pdfGetFileStatus(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfGetFileStatusRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `String` — The unique ID of the file whose status is requested. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfListFiles(request) -> PdfListFilesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API retrieves a list of all PDF files uploaded and generated by a specific user. Please note that if the user is part of an organization, only the Organization Administrator can access this endpoint. Organization Members cannot access this endpoint.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfListFilesRequest;
import com.apifreaks.sdk.types.PdfListFilesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfListFilesRequest request = PdfListFilesRequest.builder()
        .apiKey("apiKey")
        .build();
PdfListFilesResponse response = client.pdfListFiles(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfListFilesRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.pdfDeleteFile(request) -> PdfDeleteFileResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

This API deletes a PDF file using its unique file ID.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.PdfDeleteFileRequest;
import com.apifreaks.sdk.types.PdfDeleteFileResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
PdfDeleteFileRequest request = PdfDeleteFileRequest.builder()
        .apiKey("apiKey")
        .fileId("file_id")
        .build();
PdfDeleteFileResponse response = client.pdfDeleteFile(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;PdfDeleteFileRequestFormat&gt;` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `String` — The unique ID of the file to be deleted. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.screenshotCapture(request) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Capture full-page screenshots and videos of websites with advanced options like device simulation, custom code injection, cookie banner blocking, and scrollable content recording. Supports multiple output formats including JSON, image, GIF, MP4, and WebM.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.ScreenshotCaptureRequest;
import java.io.InputStream;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
ScreenshotCaptureRequest request = ScreenshotCaptureRequest.builder()
        .apiKey("apiKey")
        .url("https://example.com")
        .build();
InputStream response = client.screenshotCapture(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sizes:** `Optional&lt;List<String&gt;&gt;` — Comma-separated list of viewport sizes in the format index:XXw:YYh. Example: sizes=0:120w:300h,1:240w:500h _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional&lt;ScreenshotCaptureRequestOutput&gt;` — Output format for screenshot results _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fileType:** `Optional&lt;ScreenshotCaptureRequestFileType&gt;` — File type for screenshot output _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — URLs to capture screenshots of _(required)_
    
</dd>
</dl>

<dl>
<dd>

**width:** `Optional&lt;Integer&gt;` — Browser viewport width in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**height:** `Optional&lt;Integer&gt;` — Browser viewport height in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fullPage:** `Optional&lt;Boolean&gt;` — Capture a full-page screenshot _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**fresh:** `Optional&lt;Boolean&gt;` — Bypass cache and take a fresh screenshot _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**noCookieBanners:** `Optional&lt;Boolean&gt;` — Remove cookie banners from the screenshot _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**enableCaching:** `Optional&lt;Boolean&gt;` — Enable caching for repeated requests _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockAds:** `Optional&lt;Boolean&gt;` — Block advertisements on the page _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockChatWidgets:** `Optional&lt;Boolean&gt;` — Block chat widget scripts from loading _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**extractText:** `Optional&lt;Boolean&gt;` — Extract visible text from the page _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**extractHtml:** `Optional&lt;Boolean&gt;` — Extract HTML content of the page _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**destroyScreenshot:** `Optional&lt;Boolean&gt;` — Auto-destroy screenshot after fetch _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lazyLoad:** `Optional&lt;Boolean&gt;` — Enable lazy-loading content before screenshot _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**retina:** `Optional&lt;Boolean&gt;` — Capture screenshot in high-DPI (Retina) mode _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**darkMode:** `Optional&lt;Boolean&gt;` — Render page in dark mode _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockTracking:** `Optional&lt;Boolean&gt;` — Block common user-tracking scripts _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**enableIncognito:** `Optional&lt;Boolean&gt;` — Enable private/incognito mode for browser session _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**omitBackground:** `Optional&lt;Boolean&gt;` — Omit background color (transparent background) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**thumbnailWidth:** `Optional&lt;Integer&gt;` — Thumbnail width in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**adjustTop:** `Optional&lt;Integer&gt;` — Adjust top in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**waitForEvent:** `Optional&lt;ScreenshotCaptureRequestWaitForEvent&gt;` — Wait for a specific load event before capturing the screenshot. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**grayscale:** `Optional&lt;Integer&gt;` — Range:0 to 100 for grayscale filter _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**delay:** `Optional&lt;Integer&gt;` — How many milliseconds to wait before taking the screenshot _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timeout:** `Optional&lt;Integer&gt;` — Maximum timeout in milliseconds. Defalut is 10,000 _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ttl:** `Optional&lt;Integer&gt;` — Number of seconds the screenshot should be cached _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**clipX:** `Optional&lt;Integer&gt;` — X position of the clipping rectangle in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**clipY:** `Optional&lt;Integer&gt;` — Y position of the clipping rectangle in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**clipWidth:** `Optional&lt;Integer&gt;` — Width of the clipping rectangle in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**clipHeight:** `Optional&lt;Integer&gt;` — Height of the clipping rectangle in pixels _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**cssUrl:** `Optional&lt;String&gt;` — URL to CSS file _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**css:** `Optional&lt;String&gt;` — Your custom CSS code _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**jsUrl:** `Optional&lt;String&gt;` — URL to JS file _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**js:** `Optional&lt;String&gt;` — Your JS code _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockJs:** `Optional&lt;Boolean&gt;` — Block Scripts _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockStylesheets:** `Optional&lt;Boolean&gt;` — Block Stylesheets _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockImages:** `Optional&lt;Boolean&gt;` — Block Images _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockMedia:** `Optional&lt;Boolean&gt;` — Block Media _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockFont:** `Optional&lt;Boolean&gt;` — Block Fonts _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockTextTrack:** `Optional&lt;Boolean&gt;` — Block Text Tracks _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockXhr:** `Optional&lt;Boolean&gt;` — Block XHR Requests _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockFetch:** `Optional&lt;Boolean&gt;` — Block Fetch Requests _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockEventSource:** `Optional&lt;Boolean&gt;` — Block Event Source _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockWebSocket:** `Optional&lt;Boolean&gt;` — Block Web Sockets _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockManifest:** `Optional&lt;Boolean&gt;` — Block Manifest _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blockSpecificRequests:** `Optional&lt;String&gt;` — Comma- or newline-separated list of specific requests to block. Each line and comma are treated as separate requests for processing. Example: https://example.com, https://example.js _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**blurSelector:** `Optional&lt;String&gt;` — Comma-separated list of indexed CSS selectors to blur. Format: index:&lt;selector&gt;, e.g., 0:.banner,1:#ads. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**removeSelector:** `Optional&lt;String&gt;` — Comma-separated list of indexed CSS selectors to blur. Format: index:&lt;selector&gt;, e.g., 0:.banner,1:#ads. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**resultFileName:** `Optional&lt;String&gt;` — Specify a meaningful &amp; unique file name to easily identify the screenshot result. Avoid using spaces or special characters; use hyphens or underscores to separate words. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**scrollingScreenshot:** `Optional&lt;Boolean&gt;` — Scrolling Screenshot: Capture a long scrolling screenshot. When true, disable fullPage and freshScreenshot. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**scrollSpeed:** `Optional&lt;ScreenshotCaptureRequestScrollSpeed&gt;` — Speed of scrolling during the screenshot. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**scrollBack:** `Optional&lt;Boolean&gt;` — If true, the scroll will reverse back to the top after reaching the bottom. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startImmediately:** `Optional&lt;Boolean&gt;` — If true, the scrolling capture will start immediately upon page load. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**multipleScrolling:** `Optional&lt;Boolean&gt;` — If true, multiple scrolling screenshots will be taken at different viewport sizes. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**duration:** `Optional&lt;Double&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**failOnError:** `Optional&lt;Boolean&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**longitude:** `Optional&lt;Double&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**latitude:** `Optional&lt;Double&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**proxy:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**headers:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**cookies:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**scrollToElement:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**selector:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**userAgent:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**acceptLanguages:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**customHtml:** `Optional&lt;String&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**imageQuality:** `Optional&lt;Double&gt;` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkScreenshotCapture(request) -> BulkScreenshotCaptureResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Our Bulk Screenshot API allows you to capture screenshots of multiple webpages simultaneously, saving you time and effort. Instead of manually capturing each page one by one, you can batch process URLs and receive high-quality screenshots in the format you choose. Maximum <code>50 URLs</code> per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkScreenshotCaptureRequest;
import com.apifreaks.sdk.types.BulkScreenshotCaptureResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkScreenshotCaptureRequest request = BulkScreenshotCaptureRequest.builder()
        .apiKey("apiKey")
        .urls(java.util.List.of())
        .build();
BulkScreenshotCaptureResponse response = client.bulkScreenshotCapture(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkScreenshotCaptureRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**urls:** `List<BulkScreenshotCaptureRequestUrlsItem&gt;` — List of website URLs to capture screenshots of _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyLatestRates(request) -> CurrencyLatestRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get live forex rates for all world currencies with customizable update frequency

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyLatestRatesRequest;
import com.apifreaks.sdk.types.CurrencyLatestRatesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyLatestRatesRequest request = CurrencyLatestRatesRequest.builder()
        .apiKey("apiKey")
        .build();
CurrencyLatestRatesResponse response = client.currencyLatestRates(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `Optional&lt;List<String&gt;&gt;` — Comma separated list of desired currency codes _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyLatestRatesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional&lt;String&gt;` — Base currency for rate calculations _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional&lt;CurrencyLatestRatesRequestUpdates&gt;` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyHistoricalRates(request) -> CurrencyHistoricalRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get historical exchange rates for any specific date

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyHistoricalRatesRequest;
import com.apifreaks.sdk.types.CurrencyHistoricalRatesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyHistoricalRatesRequest request = CurrencyHistoricalRatesRequest.builder()
        .apiKey("apiKey")
        .date("2024-01-01")
        .build();
CurrencyHistoricalRatesResponse response = client.currencyHistoricalRates(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `Optional&lt;List<String&gt;&gt;` — Comma separated list of desired currency codes _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyHistoricalRatesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional&lt;String&gt;` — Base currency for rate calculations _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Specific date in YYYY-MM-DD format _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertLatest(request) -> CurrencyConvertLatestResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Convert amount between currencies using the latest exchange rates

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyConvertLatestRequest;
import com.apifreaks.sdk.types.CurrencyConvertLatestResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyConvertLatestRequest request = CurrencyConvertLatestRequest.builder()
        .apiKey("apiKey")
        .from("USD")
        .to("EUR")
        .build();
CurrencyConvertLatestResponse response = client.currencyConvertLatest(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyConvertLatestRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — Source currency code _(required)_
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — Target currency code _(required)_
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional&lt;String&gt;` — Amount to convert _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional&lt;CurrencyConvertLatestRequestUpdates&gt;` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertHistorical(request) -> CurrencyConvertHistoricalResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Convert amount between currencies using historical rates

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyConvertHistoricalRequest;
import com.apifreaks.sdk.types.CurrencyConvertHistoricalResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyConvertHistoricalRequest request = CurrencyConvertHistoricalRequest.builder()
        .apiKey("apiKey")
        .from("USD")
        .to("EUR")
        .date("2024-01-01")
        .build();
CurrencyConvertHistoricalResponse response = client.currencyConvertHistorical(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyConvertHistoricalRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — From currency symbol _(required)_
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — To currency symbol _(required)_
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional&lt;String&gt;` — The Amount to be converted _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — specific date (format YYYY-MM-DD) of which exchange rates is used. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyTimeSeries(request) -> CurrencyTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get exchange rates for a time range

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyTimeSeriesRequest;
import com.apifreaks.sdk.types.CurrencyTimeSeriesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyTimeSeriesRequest request = CurrencyTimeSeriesRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .build();
CurrencyTimeSeriesResponse response = client.currencyTimeSeries(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `Optional&lt;List<String&gt;&gt;` — comma separated list of desired currencies/ commodities symbols _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyTimeSeriesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (format YYYY-MM-DD) of the preferred time frame _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional&lt;String&gt;` — End date (format YYYY-MM-DD) of the preferred time frame _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional&lt;String&gt;` — Base currency _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyFluctuation(request) -> CurrencyFluctuationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get currency fluctuation data for a time period

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyFluctuationRequest;
import com.apifreaks.sdk.types.CurrencyFluctuationResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyFluctuationRequest request = CurrencyFluctuationRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .build();
CurrencyFluctuationResponse response = client.currencyFluctuation(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `Optional&lt;List<String&gt;&gt;` — comma separated list of desired currencies/ commodities symbols _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyFluctuationRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (format YYYY-MM-DD) of the preferred time frame _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional&lt;String&gt;` — End date (format YYYY-MM-DD) of the preferred time frame _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional&lt;String&gt;` — Base currency _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertByIp(request) -> CurrencyConvertByIpResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Convert amount using user's location

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyConvertByIpRequest;
import com.apifreaks.sdk.types.CurrencyConvertByIpResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyConvertByIpRequest request = CurrencyConvertByIpRequest.builder()
        .apiKey("apiKey")
        .from("USD")
        .build();
CurrencyConvertByIpResponse response = client.currencyConvertByIp(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyConvertByIpRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional&lt;CurrencyConvertByIpRequestUpdates&gt;` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — From currency symbol _(required)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IPv4 or IPv6 geolocated currency _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional&lt;String&gt;` — Amount to convert _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencySupported(request) -> CurrencySupportedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get list of all supported currencies with their metadata

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencySupportedRequest;
import com.apifreaks.sdk.types.CurrencySupportedResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencySupportedRequest request = CurrencySupportedRequest.builder()
        .apiKey("apiKey")
        .build();
CurrencySupportedResponse response = client.currencySupported(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencySupportedRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencySymbols(request) -> CurrencySymbolsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get currency symbols and codes

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencySymbolsRequest;
import com.apifreaks.sdk.types.CurrencySymbolsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencySymbolsRequest request = CurrencySymbolsRequest.builder()
        .apiKey("apiKey")
        .build();
CurrencySymbolsResponse response = client.currencySymbols(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencySymbolsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currencyHistoricalLimits(request) -> CurrencyHistoricalLimitsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get information about historical data availability and limits

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrencyHistoricalLimitsRequest;
import com.apifreaks.sdk.types.CurrencyHistoricalLimitsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrencyHistoricalLimitsRequest request = CurrencyHistoricalLimitsRequest.builder()
        .apiKey("apiKey")
        .build();
CurrencyHistoricalLimitsResponse response = client.currencyHistoricalLimits(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrencyHistoricalLimitsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.commodityLatestRates(request) -> CommodityLatestRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get live commodity rates with customizable update frequency

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CommodityLatestRatesRequest;
import com.apifreaks.sdk.types.CommodityLatestRatesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CommodityLatestRatesRequest request = CommodityLatestRatesRequest.builder()
        .apiKey("apiKey")
        .updates(null)
        .symbols(java.util.List.of("XAU"))
        .build();
CommodityLatestRatesResponse response = client.commodityLatestRates(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `List&lt;String&gt;` — Comma separated list of desired commodities symbols (e.g. XAU,XAG,WTI,BRENT) _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CommodityLatestRatesRequestFormat&gt;` — Format of the Response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**updates:** `CommodityLatestRatesRequestUpdates` — Exchange rates update period. Possible values are: (1) 10m - 10 minute update (2) 1m - 1 minute update Required _(required)_
    
</dd>
</dl>

<dl>
<dd>

**quote:** `Optional&lt;String&gt;` — Specifies the target currency for the exchange rate; default quote currency is the market currency of commodity (e.g. USD, EUR, INR) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.commodityHistoricalRates(request) -> CommodityHistoricalRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get historical commodity rates for a specific date

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CommodityHistoricalRatesRequest;
import com.apifreaks.sdk.types.CommodityHistoricalRatesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CommodityHistoricalRatesRequest request = CommodityHistoricalRatesRequest.builder()
        .apiKey("apiKey")
        .date("2024-01-01")
        .symbols(java.util.List.of("XAU"))
        .build();
CommodityHistoricalRatesResponse response = client.commodityHistoricalRates(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `List&lt;String&gt;` — Comma-separated list of commodity symbols _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CommodityHistoricalRatesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Historical date (YYYY-MM-DD) _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.commodityFluctuation(request) -> CommodityFluctuationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get commodity price fluctuation data for a time period

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CommodityFluctuationRequest;
import com.apifreaks.sdk.types.CommodityFluctuationResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CommodityFluctuationRequest request = CommodityFluctuationRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .endDate("endDate")
        .symbols(java.util.List.of("XAU"))
        .build();
CommodityFluctuationResponse response = client.commodityFluctuation(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `List&lt;String&gt;` — Comma-separated list of commodity symbols _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CommodityFluctuationRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD) _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD) _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.commodityTimeSeries(request) -> CommodityTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get commodity rates for a time range

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CommodityTimeSeriesRequest;
import com.apifreaks.sdk.types.CommodityTimeSeriesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CommodityTimeSeriesRequest request = CommodityTimeSeriesRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .endDate("endDate")
        .symbols(java.util.List.of("XAU"))
        .build();
CommodityTimeSeriesResponse response = client.commodityTimeSeries(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**symbols:** `List&lt;String&gt;` — Comma-separated list of commodity symbols _(required)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CommodityTimeSeriesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD) _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD) _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.commoditySymbols(request) -> CommoditySymbolsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get list of supported commodities

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CommoditySymbolsRequest;
import com.apifreaks.sdk.types.CommoditySymbolsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CommoditySymbolsRequest request = CommoditySymbolsRequest.builder()
        .apiKey("apiKey")
        .build();
CommoditySymbolsResponse response = client.commoditySymbols(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CommoditySymbolsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.vatSupportedCountries(request) -> VatSupportedCountriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieves a list of supported countries.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.VatSupportedCountriesRequest;
import com.apifreaks.sdk.types.VatSupportedCountriesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
VatSupportedCountriesRequest request = VatSupportedCountriesRequest.builder()
        .apiKey("apiKey")
        .build();
VatSupportedCountriesResponse response = client.vatSupportedCountries(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;VatSupportedCountriesRequestFormat&gt;` — Format of the response. Default is JSON. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional&lt;VatSupportedCountriesRequestType&gt;` — Type of supported country. Supported values: IBAN, SWIFT, VAT. By default, it returns all supported countries for all types. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.vatRateByIp(request) -> List<VatRateByIpResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Fetches VAT rate based on the specified or originating IP address.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.VatRateByIpRequest;
import java.util.List;
import com.apifreaks.sdk.types.VatRateByIpResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
VatRateByIpRequest request = VatRateByIpRequest.builder()
        .apiKey("apiKey")
        .build();
List<VatRateByIpResponseItem> response = client.vatRateByIp(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;VatRateByIpRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ipAddress:** `Optional&lt;String&gt;` — IPv4 or IPv6 address to look up VAT rate for. If omitted, the originating IP address will be used. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.vatRateByCountry(request) -> List<VatRateByCountryResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Fetches VAT rates for a single country or state provided via query parameters.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.VatRateByCountryRequest;
import java.util.List;
import com.apifreaks.sdk.types.VatRateByCountryResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
VatRateByCountryRequest request = VatRateByCountryRequest.builder()
        .apiKey("apiKey")
        .country("country")
        .build();
List<VatRateByCountryResponseItem> response = client.vatRateByCountry(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;VatRateByCountryRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country identifier in Alpha-2 (PK), Alpha-3 (PAK), or full name (Pakistan). Combine with the optional &quot;state&quot; query for sub-national VAT; values are case-insensitive and may use underscores instead of spaces. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**state:** `Optional&lt;String&gt;` — Optional state or region in Alpha-2 (NY) or full name (New_York). Use with &quot;country&quot; for state-level VAT; values are case-insensitive and may use underscores. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkVatRateByCountry(request) -> BulkVatRateByCountryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieves VAT details for multiple countries or country-state combinations in a single request. Maximum of <code>100</code> entries per request are allowed.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkVatRateByCountryRequest;
import com.apifreaks.sdk.types.BulkVatRateByCountryResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkVatRateByCountryRequest request = BulkVatRateByCountryRequest.builder()
        .apiKey("apiKey")
        .countries(java.util.List.of())
        .build();
BulkVatRateByCountryResponse response = client.bulkVatRateByCountry(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkVatRateByCountryRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**countries:** `List<BulkVatRateByCountryRequestCountriesItem&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.vatValidate(request) -> VatValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates an EU or UK VAT number and returns registration status details.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.VatValidateRequest;
import com.apifreaks.sdk.types.VatValidateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
VatValidateRequest request = VatValidateRequest.builder()
        .apiKey("apiKey")
        .vatNumber("vatNumber")
        .build();
VatValidateResponse response = client.vatValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;VatValidateRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**vatNumber:** `String` — EU or UK VAT number to validate. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**requesterVatNumber:** `Optional&lt;String&gt;` — Requester EU or UK VAT number. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.ibanValidate(request) -> IbanValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Checks an IBAN for structural validity, checksum accuracy, and bank metadata.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.IbanValidateRequest;
import com.apifreaks.sdk.types.IbanValidateResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
IbanValidateRequest request = IbanValidateRequest.builder()
        .apiKey("apiKey")
        .iban("iban")
        .build();
IbanValidateResponse response = client.ibanValidate(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;IbanValidateRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**iban:** `String` — IBAN to validate. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.swiftCodeFind(request) -> List<String></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Fetches SWIFT codes for a given country, bank, and city.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.SwiftCodeFindRequest;
import java.util.List;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
SwiftCodeFindRequest request = SwiftCodeFindRequest.builder()
        .apiKey("apiKey")
        .build();
List<String> response = client.swiftCodeFind(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;SwiftCodeFindRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional&lt;String&gt;` — Country name (accepts full name, e.g., Pakistan, United States). If only the country parameter is supplied, lists all banks in the country. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**bank:** `Optional&lt;String&gt;` — Bank name (upper case) used to filter SWIFT codes. Should be used together with the country parameter. If only country and bank are provided (without city), returns the list of cities for that bank. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**city:** `Optional&lt;String&gt;` — Gives SWIFT codes for a bank. Optionally specify the city (upper case) to narrow results to a specific city for that bank. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.swiftCodeLookup(request) -> SwiftCodeLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Fetches detailed information about a SWIFT code.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.SwiftCodeLookupRequest;
import com.apifreaks.sdk.types.SwiftCodeLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
SwiftCodeLookupRequest request = SwiftCodeLookupRequest.builder()
        .apiKey("apiKey")
        .swiftCode("swiftCode")
        .build();
SwiftCodeLookupResponse response = client.swiftCodeLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;SwiftCodeLookupRequestFormat&gt;` — Specify the desired response format. Options: 'json' (default) or 'xml'. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**swiftCode:** `String` — SWIFT/BIC code to lookup (must be 8 or 11 characters). _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkZipcodeLookup(request) -> BulkZipcodeLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Validates a bulk of ZIP/postal codes and returns result for each. Maximum <code>100</code> ZIP/postal codes per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkZipcodeLookupRequest;
import com.apifreaks.sdk.types.BulkZipcodeLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkZipcodeLookupRequest request = BulkZipcodeLookupRequest.builder()
        .apiKey("apiKey")
        .codes(java.util.List.of("value"))
        .build();
BulkZipcodeLookupResponse response = client.bulkZipcodeLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkZipcodeLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**codes:** `List<String&gt;` — Comma separated list of postal / zip codes. Max. 100 values. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional&lt;String&gt;` — Country code in ISO 3166-1 alpha-2 format. If not provided, search results will be returned from all countries. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.zipcodeDistance(request) -> ZipcodeDistanceResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get distance between postal codes. Maximum <code>100</code> postal codes per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.ZipcodeDistanceRequest;
import com.apifreaks.sdk.types.ZipcodeDistanceResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
ZipcodeDistanceRequest request = ZipcodeDistanceRequest.builder()
        .apiKey("apiKey")
        .compare(java.util.List.of("value"))
        .country("country")
        .build();
ZipcodeDistanceResponse response = client.zipcodeDistance(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;ZipcodeDistanceRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**compare:** `List<String&gt;` — Comma separated list of postal / zip codes with which base point is compared w.r.t. Max 100 zip codes can be provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**code:** `Optional&lt;String&gt;` — Postal/Zip code to be used as the base point. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude coordinate for the base location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional&lt;ZipcodeDistanceRequestUnit&gt;` — Supported distance units are m, km, mi, ft, yd, in. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.zipcodeDistanceMatch(request) -> ZipcodeDistanceMatchResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get matching ZIP/postal code pairs within a specified distance. Maximum <code>100</code> postal codes per request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.ZipcodeDistanceMatchRequest;
import com.apifreaks.sdk.types.ZipcodeDistanceMatchResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
ZipcodeDistanceMatchRequest request = ZipcodeDistanceMatchRequest.builder()
        .apiKey("apiKey")
        .codes(java.util.List.of("value"))
        .country("country")
        .build();
ZipcodeDistanceMatchResponse response = client.zipcodeDistanceMatch(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;ZipcodeDistanceMatchRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**codes:** `List<String&gt;` — Comma-separated list of postal/zip codes. Maximum 100 values allowed. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**distance:** `Optional&lt;Float&gt;` — Maximum allowed distance between postal code pairs. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional&lt;ZipcodeDistanceMatchRequestUnit&gt;` — Supported distance units are m, km, mi, ft, yd, in. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.currentWeather(request) -> CurrentWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get current weather data including temperature, humidity, precipitation, wind conditions, atmospheric pressure, and air quality for any location. Accepts city names, coordinates, or IP addresses. Also includes astronomy data and timezone-aware timestamps.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.CurrentWeatherRequest;
import com.apifreaks.sdk.types.CurrentWeatherResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
CurrentWeatherRequest request = CurrentWeatherRequest.builder()
        .apiKey("apiKey")
        .build();
CurrentWeatherResponse response = client.currentWeather(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;CurrentWeatherRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkCurrentWeather(request) -> BulkCurrentWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve current weather conditions for up to <code>50 locations</code> in a single request. A maximum of 50 locations (city names, IP addresses, or geographic coordinates) can be included in the request body.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkCurrentWeatherRequest;
import com.apifreaks.sdk.types.BulkCurrentWeatherResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkCurrentWeatherRequest request = BulkCurrentWeatherRequest.builder()
        .apiKey("apiKey")
        .locations(java.util.List.of("London"))
        .build();
BulkCurrentWeatherResponse response = client.bulkCurrentWeather(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkCurrentWeatherRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**locations:** `List<BulkCurrentWeatherRequestLocationsItem&gt;` — Array of locations to fetch weather data for _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.weatherForecast(request) -> WeatherForecastResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Access comprehensive weather forecasts with customizable precision - choose from daily overviews, hourly breakdowns, or even minute-by-minute data. Configure your date ranges or use the default 7-day forecast for standard weather planning.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.WeatherForecastRequest;
import com.apifreaks.sdk.types.WeatherForecastResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
WeatherForecastRequest request = WeatherForecastRequest.builder()
        .apiKey("apiKey")
        .build();
WeatherForecastResponse response = client.weatherForecast(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;WeatherForecastRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional&lt;String&gt;` — Start date for the forecast in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between startDate and endDate must not exceed 16 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional&lt;String&gt;` — End date for the forecast in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between startDate and endDate must not exceed 16 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**forecastDays:** `Optional&lt;Integer&gt;` — Number of days for the forecast, from 1 to 16. Default is 7. Maximum value is 16. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;WeatherForecastRequestPrecision&gt;` — Precision of the forecast data. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.historicalWeather(request) -> HistoricalWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Access past weather conditions for specific dates with records going back to 1940. Retrieve comprehensive historical data with both daily and hourly precision options.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.HistoricalWeatherRequest;
import com.apifreaks.sdk.types.HistoricalWeatherResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
HistoricalWeatherRequest request = HistoricalWeatherRequest.builder()
        .apiKey("apiKey")
        .date("2024-01-01")
        .build();
HistoricalWeatherResponse response = client.historicalWeather(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;HistoricalWeatherRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Specific date for which to fetch weather data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;HistoricalWeatherRequestPrecision&gt;` — Precision of the historical data. Note: 'daily' returns daily aggregates, 'hourly' returns hourly data. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.weatherTimeSeries(request) -> WeatherTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Pull historical weather information for date ranges up to 90 days (daily data) or 7 days (hourly data). Get consistent formatting across your specified date range with reliable historical weather patterns.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.WeatherTimeSeriesRequest;
import com.apifreaks.sdk.types.WeatherTimeSeriesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
WeatherTimeSeriesRequest request = WeatherTimeSeriesRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .endDate("endDate")
        .build();
WeatherTimeSeriesResponse response = client.weatherTimeSeries(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;WeatherTimeSeriesRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Starting date for the data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards. For precision=daily, the difference between endDate and startDate must not exceed 90 days. For precision=hourly, the difference must not exceed 7 days. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date for the data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards. For precision=daily, the difference between endDate and startDate must not exceed 90 days. For precision=hourly, the difference must not exceed 7 days. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;WeatherTimeSeriesRequestPrecision&gt;` — Precision of the data. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.marineWeather(request) -> MarineWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Provides hourly forecasts of marine conditions including wave heights, wave directions, wave periods, swell info, sea surface temperatures, and ocean currents. Supports multiple geographical points and returns daily max wave statistics for up to 7 days. Ideal for maritime planning, navigation, and coastal activities.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.MarineWeatherRequest;
import com.apifreaks.sdk.types.MarineWeatherResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
MarineWeatherRequest request = MarineWeatherRequest.builder()
        .apiKey("apiKey")
        .build();
MarineWeatherResponse response = client.marineWeather(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;MarineWeatherRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional&lt;String&gt;` — Starting date for marine forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional&lt;String&gt;` — End date for marine forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;MarineWeatherRequestPrecision&gt;` — Precision of the marine data. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.airQuality(request) -> AirQualityResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Monitor and predict air quality conditions using European and US AQI standards. Track pollutant concentrations including PM10, PM2.5, carbon monoxide, nitrogen dioxide, sulfur dioxide, ozone, and dust particles. Get current readings plus hourly forecasts up to 5 days ahead, complete with UV index and aerosol measurements for comprehensive air quality assessment.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.AirQualityRequest;
import com.apifreaks.sdk.types.AirQualityResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
AirQualityRequest request = AirQualityRequest.builder()
        .apiKey("apiKey")
        .build();
AirQualityResponse response = client.airQuality(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;AirQualityRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional&lt;String&gt;` — Starting date for AQI forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 5 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional&lt;String&gt;` — End date for AQI forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 5 days. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;AirQualityRequestPrecision&gt;` — Only hourly precision is supported; returns hourly AQI data for the selected date range. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.floodForecast(request) -> FloodForecastResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Provides flood forecast data for a given location, including river discharge metrics such as mean, median, maximum, minimum, and percentile values (p25, p75). Requires a startDate and endDate, with the date range limited to 16 days. Location can be specified using city name, latitude/longitude, or IP address.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.FloodForecastRequest;
import com.apifreaks.sdk.types.FloodForecastResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
FloodForecastRequest request = FloodForecastRequest.builder()
        .apiKey("apiKey")
        .startDate("startDate")
        .endDate("endDate")
        .build();
FloodForecastResponse response = client.floodForecast(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;FloodForecastRequestFormat&gt;` — Response format returned by the API. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Starting date for flood forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date for flood forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — City name, place name, or full address. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Double&gt;` — Latitude of the location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Double&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP(v4 or v6) address for location inference. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional&lt;FloodForecastRequestPrecision&gt;` — Only daily precision is supported; returns flood forecast data for the selected date range. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional&lt;String&gt;` — Timezone for the results. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getCountries(request) -> GetCountriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve countries, optionally filtered by region or subregion.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetCountriesRequest;
import com.apifreaks.sdk.types.GetCountriesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetCountriesRequest request = GetCountriesRequest.builder()
        .apiKey("apiKey")
        .build();
GetCountriesResponse response = client.getCountries(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetCountriesRequestFormat&gt;` — Format of the response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional&lt;String&gt;` — Optional filter to return countries within a specific region from the region endpoint. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**subregion:** `Optional&lt;String&gt;` — Optional filter to return countries within a specific subregion from the subregion endpoint. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getAdminLevels(request) -> GetAdminLevelsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve administrative units based on ISO 3166-1 alpha-2 country code.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetAdminLevelsRequest;
import com.apifreaks.sdk.types.GetAdminLevelsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetAdminLevelsRequest request = GetAdminLevelsRequest.builder()
        .apiKey("apiKey")
        .country("country")
        .build();
GetAdminLevelsResponse response = client.getAdminLevels(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetAdminLevelsRequestFormat&gt;` — Format of the response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getAdminUnits(request) -> GetAdminUnitsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve administrative divisions for a given country using ISO 3166-1 alpha-2 country codes. You can optionally filter by administrative levels.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetAdminUnitsRequest;
import com.apifreaks.sdk.types.GetAdminUnitsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetAdminUnitsRequest request = GetAdminUnitsRequest.builder()
        .apiKey("apiKey")
        .country("country")
        .build();
GetAdminUnitsResponse response = client.getAdminUnits(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**adminLevels:** `Optional&lt;List<String&gt;&gt;` — Comma-separated list to filter results by one or more administrative levels. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetAdminUnitsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getAdminUnitDetails(request) -> GetAdminUnitDetailsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve detailed administrative unit information by country and optionally filtered by admin code.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetAdminUnitDetailsRequest;
import com.apifreaks.sdk.types.GetAdminUnitDetailsResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetAdminUnitDetailsRequest request = GetAdminUnitDetailsRequest.builder()
        .apiKey("apiKey")
        .country("country")
        .adminUnit("adminUnit")
        .build();
GetAdminUnitDetailsResponse response = client.getAdminUnitDetails(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetAdminUnitDetailsRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**adminUnit:** `String` — Optional admin code to fetch details for a specific administrative unit. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getCities(request) -> GetCitiesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve a list of cities within a country, optionally filtered by an administrative unit code.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetCitiesRequest;
import com.apifreaks.sdk.types.GetCitiesResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetCitiesRequest request = GetCitiesRequest.builder()
        .apiKey("apiKey")
        .country("country")
        .build();
GetCitiesResponse response = client.getCities(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetCitiesRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**adminUnit:** `Optional&lt;String&gt;` — Administrative unit code used to filter cities within a specific region. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getSupportedFlags(request) -> List<GetSupportedFlagsResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Get list of all supported flags with their metadata

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetSupportedFlagsRequest;
import java.util.List;
import com.apifreaks.sdk.types.GetSupportedFlagsResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetSupportedFlagsRequest request = GetSupportedFlagsRequest.builder()
        .apiKey("apiKey")
        .build();
List<GetSupportedFlagsResponseItem> response = client.getSupportedFlags(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.getFlags(request) -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve the flag for a specific country

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GetFlagsRequest;
import java.io.InputStream;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GetFlagsRequest request = GetFlagsRequest.builder()
        .apiKey("apiKey")
        .name("name")
        .shape(null)
        .type("A")
        .build();
InputStream response = client.getFlags(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — Country code in ISO 3166-1 alpha-2 format. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**shape:** `GetFlagsRequestShape` — Flag shape. One of: 'flat' or 'round'. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;GetFlagsRequestFormat&gt;` — Flag format. Applicable only for PNG or WEBP formats. Default is png. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional&lt;GetFlagsRequestSize&gt;` — Flag size in pixels. Valid options: 16px, 24px, 32px, 48px, 64px. Applicable only for PNG or WEBP formats. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**type:** `GetFlagsRequestType` — Type of flag. One of: country or organization. _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.timezoneLookup(request) -> TimezoneLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve current time, date, and timezone-related information by specifying a timezone name, location address, location coordinates, IP address, or use the client IP address if no parameter is passed.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.TimezoneLookupRequest;
import com.apifreaks.sdk.types.TimezoneLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
TimezoneLookupRequest request = TimezoneLookupRequest.builder()
        .apiKey("apiKey")
        .build();
TimezoneLookupResponse response = client.timezoneLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;TimezoneLookupRequestFormat&gt;` — Format of the response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IPv4 or IPv6 address to extract timezone information. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**tz:** `Optional&lt;String&gt;` — Timezone name (e.g., &quot;Asia/Kolkata&quot;) to retrieve information directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — Location string (preferably city and country) to extract timezone. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Float&gt;` — Latitude for geolocation lookup. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Float&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;TimezoneLookupRequestLang&gt;` — Language code for response localization (default is &quot;en&quot;). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**iataCode:** `Optional&lt;String&gt;` — 3-letter IATA airport code (e.g., JFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**icaoCode:** `Optional&lt;String&gt;` — 4-letter ICAO airport code (e.g., KJFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**loCode:** `Optional&lt;String&gt;` — 5-letter UN/LO city code. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.timezoneLookupV2(request) -> TimezoneLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/geolocation/timezone`. Uses the same request and response types as the v1 `timezoneLookup` method.

Retrieve current time, date, and timezone-related information by specifying a timezone name, location address, location coordinates, IP address, or use the client IP address if no parameter is passed.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.TimezoneLookupRequest;
import com.apifreaks.sdk.types.TimezoneLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
TimezoneLookupRequest request = TimezoneLookupRequest.builder()
        .apiKey("apiKey")
        .build();
TimezoneLookupResponse response = client.timezoneLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;TimezoneLookupRequestFormat&gt;` — Format of the response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IPv4 or IPv6 address to extract timezone information. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**tz:** `Optional&lt;String&gt;` — Timezone name (e.g., &quot;Asia/Kolkata&quot;) to retrieve information directly. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — Location string (preferably city and country) to extract timezone. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Float&gt;` — Latitude for geolocation lookup. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Float&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;TimezoneLookupRequestLang&gt;` — Language code for response localization (default is &quot;en&quot;). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**iataCode:** `Optional&lt;String&gt;` — 3-letter IATA airport code (e.g., JFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**icaoCode:** `Optional&lt;String&gt;` — 4-letter ICAO airport code (e.g., KJFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**loCode:** `Optional&lt;String&gt;` — 5-letter UN/LO city code. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.timezoneConvert(request) -> TimezoneConvertResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Converts a given time from one timezone to another using various input types like timezone name, coordinates, location, or codes.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.TimezoneConvertRequest;
import com.apifreaks.sdk.types.TimezoneConvertResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
TimezoneConvertRequest request = TimezoneConvertRequest.builder()
        .apiKey("apiKey")
        .build();
TimezoneConvertResponse response = client.timezoneConvert(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;TimezoneConvertRequestFormat&gt;` — Format of the response . _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**time:** `Optional&lt;String&gt;` — Time to convert in yyyy-MM-dd HH:mm or yyyy-MM-dd HH:mm:ss format. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**tzFrom:** `Optional&lt;String&gt;` — Source timezone name (e.g., Asia/Kolkata). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**tzTo:** `Optional&lt;String&gt;` — Target timezone name (e.g., America/New_York). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**latFrom:** `Optional&lt;Double&gt;` — Latitude of source location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**longFrom:** `Optional&lt;Double&gt;` — Longitude of source location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**latTo:** `Optional&lt;Double&gt;` — Latitude of target location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**longTo:** `Optional&lt;Double&gt;` — Longitude of target location. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**locationFrom:** `Optional&lt;String&gt;` — From location (city/country). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**locationTo:** `Optional&lt;String&gt;` — To location (city/country). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**iataFrom:** `Optional&lt;String&gt;` — From IATA airport code (e.g., JFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**iataTo:** `Optional&lt;String&gt;` — To IATA airport code. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**icaoFrom:** `Optional&lt;String&gt;` — From ICAO airport code (e.g., KJFK). _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**icaoTo:** `Optional&lt;String&gt;` — To ICAO airport code. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**locodeFrom:** `Optional&lt;String&gt;` — From UN/LO CODE. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**locodeTo:** `Optional&lt;String&gt;` — To UN/LO CODE. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.userAgentLookup(request) -> UserAgentLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Parse User Agent string to get detailed browser, device, and operating system information

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.UserAgentLookupRequest;
import com.apifreaks.sdk.types.UserAgentLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
UserAgentLookupRequest request = UserAgentLookupRequest.builder()
        .apiKey("apiKey")
        .userAgent("Mozilla/5.0")
        .build();
UserAgentLookupResponse response = client.userAgentLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;UserAgentLookupRequestFormat&gt;` — Format of the response _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**user_agent:** `String` — The User-Agent string to parse, sent as the User-Agent header _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.bulkUserAgentLookup(request) -> List<BulkUserAgentLookupResponseItem></code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Parse up to <code>50,000 User-Agent strings</code> at once in a single request.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.BulkUserAgentLookupRequest;
import java.util.List;
import com.apifreaks.sdk.types.BulkUserAgentLookupResponseItem;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
BulkUserAgentLookupRequest request = BulkUserAgentLookupRequest.builder()
        .apiKey("apiKey")
        .uaStrings(java.util.List.of("value"))
        .build();
List<BulkUserAgentLookupResponseItem> response = client.bulkUserAgentLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;BulkUserAgentLookupRequestFormat&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**uaStrings:** `List<String&gt;` — List of user agent strings to parse _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.ocrPredict(request) -> OcrPredictResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Perform Optical Character Recognition (OCR) on images, PDFs, or ZIP archives. Supports two models: <code>mini-ocr-v1</code> for CAPTCHA-optimized OCR and <code>ocr-v1</code> for general-purpose document text extraction. Supports zonal OCR to extract text from specific regions of an image. <p><strong>Notes:</strong></p> <ul> <li>The <code>zone</code> query parameter cannot be given with .pdf and .zip types as it can only be applied to single image query.</li> <li>The <code>page_range</code> query parameter cannot be given in any other type except .pdf types.</li> <li>PDFs containing images in them are allowed only for processing.</li> <li>The <code>mini-ocr-v1</code> model doesn’t support the following query parameters: <ul> <li><code>page_range</code> (.pdf types)</li> <li><code>zone</code></li> </ul> </li> </ul>

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.OcrPredictRequest;
import com.apifreaks.sdk.types.OcrPredictResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
OcrPredictRequest request = OcrPredictRequest.builder()
        .apiKey("apiKey")
        .model(null)
        .ocrPredictRequestModel(null)
        .build();
OcrPredictResponse response = client.ocrPredict(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**url:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**model:** `OcrPredictRequestModel` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**pageRange:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**zone:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**newLine:** `Optional&lt;Integer&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ocrPredictRequestUrl:** `Optional&lt;String&gt;` — URL of the image or PDF (required if file not provided) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ocrPredictRequestModel:** `OcrPredictRequestModel` — OCR model to use. mini-ocr-v1 for CAPTCHA OCR, ocr-v1 for general OCR _(required)_
    
</dd>
</dl>

<dl>
<dd>

**ocrPredictRequestPageRange:** `Optional&lt;String&gt;` — Specify page range for multi-page PDFs (e.g., '1,3,5-10' or 'allpages'). Note: This parameter can only be used with .pdf file types. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ocrPredictRequestZone:** `Optional&lt;String&gt;` — Define OCR zones using coordinates (top:left:height:width). Multiple zones can be defined using commas. Only available for model 'ocr-v1'. Note: This parameter cannot be used with .pdf and .zip file types as it can only be applied to single image queries. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ocrPredictRequestNewLine:** `Optional&lt;Integer&gt;` — Set to 1 to split output text into individual lines (default: 0) _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.grammarDetect(request) -> GrammarDetectResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Analyze text for grammar errors and return the exact words flagged as grammatically incorrect with zero-based word positions.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GrammarDetectRequest;
import com.apifreaks.sdk.types.GrammarDetectResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GrammarDetectRequest request = GrammarDetectRequest.builder()
        .apiKey("apiKey")
        .text("This is sample text.")
        .build();
GrammarDetectResponse response = client.grammarDetect(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for grammar errors _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.grammarCorrect(request) -> GrammarCorrectResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Submit text with grammatical issues and receive a clean grammar-corrected result for proofreading and content workflows.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.GrammarCorrectRequest;
import com.apifreaks.sdk.types.GrammarCorrectResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
GrammarCorrectRequest request = GrammarCorrectRequest.builder()
        .apiKey("apiKey")
        .text("This is sample text.")
        .build();
GrammarCorrectResponse response = client.grammarCorrect(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to correct _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.weakWordsDetect(request) -> WeakWordsDetectResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Analyze text and return weak, vague, or filler words with zero-based word positions to help writers produce clearer and more concise content.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.WeakWordsDetectRequest;
import com.apifreaks.sdk.types.WeakWordsDetectResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
WeakWordsDetectRequest request = WeakWordsDetectRequest.builder()
        .apiKey("apiKey")
        .text("This is sample text.")
        .build();
WeakWordsDetectResponse response = client.weakWordsDetect(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for weak words _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.readabilityScore(request) -> ReadabilityScoreResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Analyze text readability using industry-standard formulas including Flesch Reading Ease, Flesch-Kincaid Grade Level, Gunning Fog Index, SMOG Index, Coleman-Liau Index, and Automated Readability Index.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.ReadabilityScoreRequest;
import com.apifreaks.sdk.types.ReadabilityScoreResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
ReadabilityScoreRequest request = ReadabilityScoreRequest.builder()
        .apiKey("apiKey")
        .text("This is sample text.")
        .build();
ReadabilityScoreResponse response = client.readabilityScore(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — No description provided. _(required)_
    
</dd>
</dl>

<dl>
<dd>

**target:** `Optional&lt;ReadabilityScoreRequestTarget&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**exclude:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for readability _(required)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.astronomyLookup(request) -> AstronomyLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

Retrieve sunrise and sunset times, current position of the moon, and other related information by specifying a location address, location coordinates, IP address, or using the client IP address if no parameter is passed.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.AstronomyLookupRequest;
import com.apifreaks.sdk.types.AstronomyLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
AstronomyLookupRequest request = AstronomyLookupRequest.builder()
        .apiKey("apiKey")
        .build();
AstronomyLookupResponse response = client.astronomyLookup(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;AstronomyLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — Location name or address _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Float&gt;` — Latitude for location coordinates _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Float&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP address for location detection _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;String&gt;` — IP address for location detection _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `Optional&lt;String&gt;` — Date for astronomy data (YYYY-MM-DD) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**elevation:** `Optional&lt;Double&gt;` — Timezone of the location for which astronomy data is required _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timeZone:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

<details><summary><code>client.astronomyLookupV2(request) -> AstronomyLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

> **v2.0 endpoint** — maps to `/v2.0/geolocation/astronomy`. Uses the same request and response types as the v1 `astronomyLookup` method.

Retrieve sunrise and sunset times, current position of the moon, and other related information by specifying a location address, location coordinates, IP address, or using the client IP address if no parameter is passed.

</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

```java
import com.apifreaks.sdk.ApifreaksApiClient;
import com.apifreaks.sdk.requests.AstronomyLookupRequest;
import com.apifreaks.sdk.types.AstronomyLookupResponse;

ApifreaksApiClient client = ApifreaksApiClient.builder().build();
AstronomyLookupRequest request = AstronomyLookupRequest.builder()
        .apiKey("apiKey")
        .build();
AstronomyLookupResponse response = client.astronomyLookupV2(request);
```

</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key _(required)_
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional&lt;AstronomyLookupRequestFormat&gt;` — Format of the response. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional&lt;String&gt;` — Location name or address _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional&lt;Float&gt;` — Latitude for location coordinates _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional&lt;Float&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional&lt;String&gt;` — IP address for location detection _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional&lt;String&gt;` — IP address for location detection _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**date:** `Optional&lt;String&gt;` — Date for astronomy data (YYYY-MM-DD) _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**elevation:** `Optional&lt;Double&gt;` — Timezone of the location for which astronomy data is required _(optional)_
    
</dd>
</dl>

<dl>
<dd>

**timeZone:** `Optional&lt;String&gt;` — No description provided. _(optional)_
    
</dd>
</dl>

</dd>
</dl>

</dd>
</dl>
</details>

