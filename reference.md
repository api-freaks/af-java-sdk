# Reference
<details><summary><code>client.geolocationLookup() -> GeolocationLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get detailed geolocation data for an IP address including country, city, timezone, currency, and optional security and user-agent information
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.geolocationLookup(
    GeolocationLookupRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GeolocationLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4, IPv6, or hostname for geolocation lookup
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<GeolocationLookupRequestLang>` — Response language for location fields
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma separated list of fields to include in response
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma separated list of fields to exclude from response
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional<String>` — Additional data to include (location, network, security, currency, time_zone, user_agent, country_metadata , hostname, liveHostname, hostnameFallbackLivet)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkGeolocationLookup(request) -> List&amp;lt;BulkGeolocationLookupResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve detailed geolocation data for multiple IP addresses in a single request.
Supports up to `50,000` IP-addresses/host-names per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkGeolocationLookup(
    BulkGeolocationLookupRequest
        .builder()
        .apiKey("apiKey")
        .ips(
            Arrays.asList("ips")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkGeolocationLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<String>` — Language of the response.
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma-separated list of fields to include in the response. Can include "geo".
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma-separated list of fields to exclude from the response (except "ip").
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional<String>` — Comma-separated list of additional information to include in the response.
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String>` — List of IP addresses or hostnames to lookup
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ipSecurityLookup() -> IpSecurityLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get comprehensive security information for a given IP address. Detects VPNs, proxies, Tor nodes, and other security threats.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ipSecurityLookup(
    IpSecurityLookupRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<IpSecurityLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — A valid IPv4 or IPv6 address to look up. If omitted, the API uses the public IP of the requesting client.
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma-separated list of fields to return. Supports dot notation (e.g. security.threat_score).
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma-separated list of fields to remove from the response. Supports dot notation (e.g. security.is_tor).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkIpSecurityLookup(request) -> List&amp;lt;BulkIpSecurityLookupResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Bulk IP Security Lookup API allows you to retrieve security details for up to `50,000` IP-addresses in a single request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkIpSecurityLookup(
    BulkIpSecurityLookupRequest
        .builder()
        .apiKey("apiKey")
        .ips(
            Arrays.asList("ips")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkIpSecurityLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma-separated list of fields to return. Supports dot notation (e.g. security.threat_score).
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma-separated list of fields to remove from the response. Supports dot notation (e.g. security.is_tor).
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String>` — List of IP addresses to lookup
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.geocoderSearch() -> List&amp;lt;GeocoderSearchResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert a given address or place name into geographic coordinates (latitude and longitude).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.geocoderSearch(
    GeocoderSearchRequest
        .builder()
        .apiKey("apiKey")
        .query("query")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GeocoderSearchRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**query:** `String` — Free-form search query, e.g. Wembley Stadium, London
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` — Max number of results to return (1–40). May return fewer if matches are weak.
    
</dd>
</dl>

<dl>
<dd>

**minLat:** `Optional<Float>` — Minimum latitude for the viewbox. Must be ≤ max_lat and between -90 and 90.
    
</dd>
</dl>

<dl>
<dd>

**maxLat:** `Optional<Float>` — Maximum latitude for the viewbox. Must be ≥ min_lat and between -90 and 90.
    
</dd>
</dl>

<dl>
<dd>

**minLon:** `Optional<Float>` — Minimum longitude for the viewbox. Must be ≤ max_lon and between -180 and 180.
    
</dd>
</dl>

<dl>
<dd>

**maxLon:** `Optional<Float>` — Maximum longitude for the viewbox. Must be ≥ min_lon and between -180 and 180.
    
</dd>
</dl>

<dl>
<dd>

**acceptLanguage:** `Optional<String>` — Preferred language order for showing search results. This may either be a simple comma-separated list of language codes or a single entry. The results will be in the 1st language which is matched from the header. As a fallback if the results are not supported in the given language, 'en' will be used.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.geocoderReverse() -> GeocoderReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert geographic coordinates (latitude and longitude) into a human-readable address or place name.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.geocoderReverse(
    GeocoderReverseRequest
        .builder()
        .apiKey("apiKey")
        .lat(1.1)
        .lon(1.1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GeocoderReverseRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Double` — WGS84 latitude value ranging from -90 to 90.
    
</dd>
</dl>

<dl>
<dd>

**lon:** `Double` — WGS84 longitude value ranging from -180 to 180.
    
</dd>
</dl>

<dl>
<dd>

**acceptLanguage:** `Optional<String>` — Preferred language order for showing search results. This may either be a simple comma-separated list of language codes or a single entry. The results will be in the 1st language which is matched from the header. As a fallback if the results are not supported in the given language, en will be used.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisLookup() -> DomainWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve current WHOIS information for a domain name.
This endpoint provides detailed registration information including registrar details,
dates, nameservers, and registrant information.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainWhoisLookup(
    DomainWhoisLookupRequest
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainWhoisLookupRequestFormat>` — Response format (defaults to json)
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name for WHOIS lookup
    
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

<dl>
<dd>

Retrieve WHOIS information for `100 Domains per Request`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkDomainWhoisLookup(
    BulkDomainWhoisLookupRequest
        .builder()
        .apiKey("apiKey")
        .domainNames(
            Arrays.asList("domainNames")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDomainWhoisLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String>` — A list of domain names for which WHOIS data is requested.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ipWhoisLookup() -> IpWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns WHOIS registration details for a specified IP address (IPv4 or IPv6).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ipWhoisLookup(
    IpWhoisLookupRequest
        .builder()
        .apiKey("apiKey")
        .ip("ip")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<IpWhoisLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `String` — The IP address (IPv4 or IPv6) for which WHOIS data is requested.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.asnWhoisLookup() -> AsnWhoisLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns WHOIS registration details for a specified ASN, with or without the 'as' prefix.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.asnWhoisLookup(
    AsnWhoisLookupRequest
        .builder()
        .apiKey("apiKey")
        .asn("asn")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<AsnWhoisLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**asn:** `String` — The Autonomous System Number (ASN) to retrieve WHOIS data for. Can be prefixed with 'as' or not.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisHistory() -> DomainWhoisHistoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve historical WHOIS records for a domain name.
This endpoint provides a timeline of all recorded changes in domain registration information.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainWhoisHistory(
    DomainWhoisHistoryRequest
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainWhoisHistoryRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name for historical WHOIS lookup
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisReverse() -> DomainWhoisReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Performs a reverse WHOIS search using one or more search parameters like keyword, email, owner, or company.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainWhoisReverse(
    DomainWhoisReverseRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainWhoisReverseRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**keyword:** `Optional<String>` — Keyword search term for reverse WHOIS by keyword (case-insensitive pattern matching).
    
</dd>
</dl>

<dl>
<dd>

**email:** `Optional<String>` — Email search term for reverse WHOIS by email address (case-insensitive exact or regex match; * wildcard supported).
    
</dd>
</dl>

<dl>
<dd>

**owner:** `Optional<String>` — Registrant or owner name for reverse WHOIS (a full-text search phrase matching technique to retrieve results).
    
</dd>
</dl>

<dl>
<dd>

**company:** `Optional<String>` — Organization or company name for reverse WHOIS (full-text search phrase matching technique to retrieve results).
    
</dd>
</dl>

<dl>
<dd>

**exact:** `Optional<Boolean>` — Accepts 'true' or 'false'. "true" returns only records that exactly match the input (keyword, owner/registrant, or company). "false" returns all matches and is the default when omitted.
    
</dd>
</dl>

<dl>
<dd>

**mode:** `Optional<DomainWhoisReverseRequestMode>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page number for paginated results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainDnsLookup() -> DomainDnsLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve real-time DNS records for any hostname. Supports multiple record types including A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainDnsLookup(
    DomainDnsLookupRequest
        .builder()
        .apiKey("apiKey")
        .type(
            Arrays.asList("type")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainDnsLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**hostName:** `Optional<String>` — Hostname or URL whose DNS records are required. Give either `host-name` or `ipAddress`.
    
</dd>
</dl>

<dl>
<dd>

**ipAddress:** `Optional<String>` — The IP address whose PTR (reverse DNS) record is required. Give either `host-name` or `ipAddress`; with `ipAddress`, set `type` to `all` or `PTR`.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — DNS record types to look up, sent as a comma-separated list (e.g. `A,MX`). Possible values: A, AAAA, MX, NS, SOA, SPF, TXT, CNAME, PTR, or all. When ipAddress is provided, use "all" or "PTR".
    
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

<dl>
<dd>

Perform DNS lookups for multiple hostnames in a single request. Supports up to `100 host-names per request`
and returns DNS records including A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkDomainDnsLookup(
    BulkDomainDnsLookupRequest
        .builder()
        .apiKey("apiKey")
        .type(
            Arrays.asList("type")
        )
        .domainNames(
            Arrays.asList("domainNames")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDomainDnsLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — DNS record types to look up, sent as a comma-separated list (e.g. `A,MX`). Possible values: A, AAAA, MX, NS, SOA, SPF, TXT, CNAME, or all.
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String>` — List of hostnames to lookup DNS records for
    
</dd>
</dl>

<dl>
<dd>

**ipAddresses:** `Optional<List<String>>` — Array of IP addresses to include in the lookup for PTR record enrichment.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainDnsHistory() -> DomainDnsHistoryResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve historical DNS records for any hostname. Access unique historical data for A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME records,
including subdomains. Results are paginated with up to 100 unique records per page.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainDnsHistory(
    DomainDnsHistoryRequest
        .builder()
        .apiKey("apiKey")
        .hostName("host-name")
        .type(
            Arrays.asList("type")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainDnsHistoryRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**hostName:** `String` — Hostname or URL whose historical DNS records are required
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` — DNS record types to look up, sent as a comma-separated list (e.g. `A,MX`). Possible values: A, AAAA, MX, NS, SOA, SPF, TXT, CNAME, or all.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page number for paginated results
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainDnsReverse() -> DomainDnsReverseResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve all the hostnames associated with any particular A, AAAA, MX, NS, SOA, SPF, TXT, and CNAME DNS records. For instance, you can access all the hostnames hosted on any IP/CIDR notation, all the domain names using Cloudflare name servers, and all the domain names using Google Mailbox
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainDnsReverse(
    DomainDnsReverseRequest
        .builder()
        .apiKey("apiKey")
        .type(DomainDnsReverseRequestType.A)
        .value("value")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainDnsReverseRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**type:** `DomainDnsReverseRequestType` 

The type of reverse DNS lookup to perform. Determines how the value parameter is interpreted:
- A: IPv4 CIDR block
- AAAA: IPv6 CIDR block
- MX: Mail provider domain
- NS: Name server provider hostname
- SOA: SOA record admin domain
- SPF/TXT: Target verification strings
- CNAME: Target hostname
    
</dd>
</dl>

<dl>
<dd>

**value:** `String` — Provide an IP or CIDR for A/AAAA lookups, or a hostname/selector for MX, NS, SOA, SPF, TXT, and CNAME queries. Wildcard regex patterns are also supported (e.g., mail.google.com, m*.google.com, _spf.g*.com, s*.g*.com).
    
</dd>
</dl>

<dl>
<dd>

**exact:** `Optional<Boolean>` — Accepts 'true' or 'false'. "true" returns only records that exactly match the input (NS, MX, CNAME, SOA, SPF, TXT). "false" returns all matches (default when omitted).
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page number to paginate through results (defaults to 1).
    
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

<dl>
<dd>

Execute a series of web scraping instructions on a target URL. 
Supports various operations like form filling, clicking, data extraction, and CAPTCHA solving.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webScrape(
    WebScrapeRequest
        .builder()
        .apiKey("apiKey")
        .url("https://example.com")
        .body(
            WebScrapeRequestBody.of(
                WebScrapeRequestBodyBlockUrl
                    .builder()
                    .instructions(
                        Arrays.asList(
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .extract(
                                    new HashMap<String, String>() {{
                                        put("profile", "#profile");
                                        put("welcomeMessage", "#welcome-message");
                                        put("userInfo", "#user-info");
                                    }}
                                )
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build(),
                            WebScrapeRequestBodyBlockUrlInstructionsItem
                                .builder()
                                .build()
                        )
                    )
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<WebScrapeRequestFormat>` — Response format returned by the API.
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — Target URL to scrape
    
</dd>
</dl>

<dl>
<dd>

**text:** `Optional<Boolean>` — Set to `true` to return the data in text format else `false` for data in html format with tags.
    
</dd>
</dl>

<dl>
<dd>

**jsEnabled:** `Optional<Boolean>` 

Set  `true` to handle websites with JavaScript. Set `false` to handle static html websites.


 Default value is `true`.
    
</dd>
</dl>

<dl>
<dd>

**proxy:** `Optional<WebScrapeRequestProxy>` — Use a proxy for the request. Pass true/false to toggle the default proxy pool, or a proxy URL string to use a specific proxy.
    
</dd>
</dl>

<dl>
<dd>

**sslIgnore:** `Optional<Boolean>` 

Ignore SSL certificate errors.


 Only works if **jsEnabled** is **true**.
    
</dd>
</dl>

<dl>
<dd>

**windowSize:** `Optional<String>` 

Specify the browser window size in the format 'width,height' (e.g., "1920w,1080h"). Default value is the default resolutions provided by web/browser.


 Only works if **jsEnabled** is **true**.
    
</dd>
</dl>

<dl>
<dd>

**adBlock:** `Optional<Boolean>` 

Set to `true` to apply ad-blocker to the specified URL else false or ignore to not apply.


 Only works if **jsEnabled** is **true**.
    
</dd>
</dl>

<dl>
<dd>

**captcha:** `Optional<Boolean>` 

if true user can provide captcha instructions in the instructions to solve image captchas.


  Only works if **jsEnabled** is **true**.
    
</dd>
</dl>

<dl>
<dd>

**request:** `WebScrapeRequestBody` 
    
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

<dl>
<dd>

Validates a single email address and returns result.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.emailValidate(
    EmailValidateRequest
        .builder()
        .apiKey("apiKey")
        .email("email")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<EmailValidateRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` — Email address to validate
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` — Name of the email address
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP address of the email address
    
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

<dl>
<dd>

Validates a bulk of email addresses and returns result for each. Maximum `10` email addresses per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkEmailValidate(
    BulkEmailValidateRequest
        .builder()
        .apiKey("apiKey")
        .emailData(
            Arrays.asList(
                BulkEmailValidateRequestEmailDataItem
                    .builder()
                    .email("email")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkEmailValidateRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**emailData:** `List<BulkEmailValidateRequestEmailDataItem>` — Array of email objects for bulk validation
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.disposableEmailCheckV2(request) -> DisposableEmailCheckV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates email syntax and checks the domain for disposable, free, spam, and role-account signals, plus MX/A DNS records. Send the email (and optionally an ip) as a JSON request body. When an ip is included, the response also carries geolocation and security data for it.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.disposableEmailCheckV2(
    DisposableEmailCheckV2Request
        .builder()
        .apiKey("apiKey")
        .email("test@sogetthis.com")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DisposableEmailCheckV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**email:** `String` — The email address to check.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — Optional IP address to look up for location and security data, such as the IP the signup came from.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkDisposableEmailCheckV2(request) -> BulkDisposableEmailCheckV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Checks a bulk of email addresses (each with an optional ip) and returns a disposable email check result for each, in the same order as the request. Maximum `100` entries per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkDisposableEmailCheckV2(
    BulkDisposableEmailCheckV2Request
        .builder()
        .apiKey("apiKey")
        .emailData(
            Arrays.asList(
                BulkDisposableEmailCheckV2RequestEmailDataItem
                    .builder()
                    .email("abc")
                    .build(),
                BulkDisposableEmailCheckV2RequestEmailDataItem
                    .builder()
                    .email("john@microsoft.com")
                    .ip("8.8.8.8")
                    .build(),
                BulkDisposableEmailCheckV2RequestEmailDataItem
                    .builder()
                    .email("test@mailinator.com")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDisposableEmailCheckV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**emailData:** `List<BulkDisposableEmailCheckV2RequestEmailDataItem>` — Entries to check. Maximum 100 per request. Must not be empty, and must not contain null entries or entries without a valid email.
    
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

<dl>
<dd>

Validates a single phone number and returns detailed metadata including carrier, line type, geolocation, time zones, and standardized formats.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.phoneValidate(
    PhoneValidateRequest
        .builder()
        .apiKey("apiKey")
        .number("+14155552671")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PhoneValidateRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object. If not provided, the API defaults to JSON format.
    
</dd>
</dl>

<dl>
<dd>

**number:** `String` — Phone number to validate. Accepts international format (+14155552671), local format (4155552671) with region, or IDD format (0014155552671) with dialer_region.
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Two-letter ISO country code (e.g., US, GB). Required when number is in local format without + prefix. Cannot be used together with dialer_region.
    
</dd>
</dl>

<dl>
<dd>

**dialerRegion:** `Optional<String>` — Two-letter ISO country code indicating the country the number is being dialed from. Required when number uses IDD exit code. Cannot be used together with region.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkPhoneValidate(request) -> List&amp;lt;BulkPhoneValidateResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates up to 100 phone numbers in a single request. Each number is processed independently — invalid entries return per-number errors without affecting the rest of the batch.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkPhoneValidate(
    BulkPhoneValidateRequest
        .builder()
        .apiKey("apiKey")
        .numbers(
            Arrays.asList(
                BulkPhoneValidateRequestNumbersItem
                    .builder()
                    .number("+14155552671")
                    .build(),
                BulkPhoneValidateRequestNumbersItem
                    .builder()
                    .number("+447911123456")
                    .build(),
                BulkPhoneValidateRequestNumbersItem
                    .builder()
                    .number("+919876543210")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkPhoneValidateRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object. If not provided, the API defaults to JSON format.
    
</dd>
</dl>

<dl>
<dd>

**numbers:** `List<BulkPhoneValidateRequestNumbersItem>` — Array of phone number objects. Maximum 100 per request.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainSslLookup() -> DomainSslLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve comprehensive SSL certificate information without the certificate chain.
This endpoint provides detailed information about the SSL certificate including expiry dates, issuer details, and encryption methods.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainSslLookup(
    DomainSslLookupRequest
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainSslLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name or URL whose SSL certificate lookup is required
    
</dd>
</dl>

<dl>
<dd>

**sslRaw:** `Optional<Boolean>` — Set to true to get the raw openSSL response of the domain
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainSslChainLookup() -> DomainSslChainLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve the complete SSL certificate chain from root Certificate Authority (CA) to end-user certificate.
This endpoint provides comprehensive information about each certificate in the chain.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainSslChainLookup(
    DomainSslChainLookupRequest
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainSslChainLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name or URL whose SSL certificate chain lookup is required
    
</dd>
</dl>

<dl>
<dd>

**sslRaw:** `Optional<Boolean>` — Set to true to get the raw openSSL response for each certificate in the chain
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainAvailabilityCheck() -> DomainAvailabilityCheckResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Domain Search API is designed to simplify the process of finding available domain names across all top-level domains (TLDs) and second-level domains (SLDs).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainAvailabilityCheck(
    DomainAvailabilityCheckRequest
        .builder()
        .apiKey("apiKey")
        .domain("domain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainAvailabilityCheckRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name whose availability is to be checked.
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<DomainAvailabilityCheckRequestSource>` — Specify the data source for domain availability checks. Use "dns" for DNS-based lookups or "whois" for WHOIS-based lookups. By default, "dns" is used.
    
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

<dl>
<dd>

Perform Bulk Domain Availability checks using a list of domains. Supports upto `100 Domains Per Request`.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkDomainAvailabilityCheck(
    BulkDomainAvailabilityCheckRequest
        .builder()
        .apiKey("apiKey")
        .domainNames(
            Arrays.asList("domainNames")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDomainAvailabilityCheckRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<BulkDomainAvailabilityCheckRequestSource>` — Specify the data source for domain availability checks. Use "dns" for DNS-based lookups or "whois" for WHOIS-based lookups. By default, "dns" is used.
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String>` — List of domain names to check.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainAvailabilitySuggestions() -> DomainAvailabilitySuggestionsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Domain Search API is designed to simplify the process of finding available domain names across all top-level domains (TLDs) and second-level domains (SLDs).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainAvailabilitySuggestions(
    DomainAvailabilitySuggestionsRequest
        .builder()
        .apiKey("apiKey")
        .domain("domain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainAvailabilitySuggestionsRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name for availability and suggestions.
    
</dd>
</dl>

<dl>
<dd>

**source:** `Optional<DomainAvailabilitySuggestionsRequestSource>` — Specify the data source for domain availability checks. Use "dns" for DNS-based lookups or "whois" for WHOIS-based lookups. By default, "dns" is used.
    
</dd>
</dl>

<dl>
<dd>

**count:** `Optional<Integer>` — Number of suggestions to retrieve. The API returns a minimum of 5 suggestions regardless of a lower value.
    
</dd>
</dl>

<dl>
<dd>

**sug:** `Optional<Boolean>` — Controls the response shape. When `false`, returns a single availability object for the queried domain only. When omitted or `true`, returns an array of suggested domains instead.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.subdomainsLookup() -> SubdomainsLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Subdomain Lookup API is designed to retrieve subdomains related to the given domain name. It helps you explore subdomains that are available for registration or usage.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.subdomainsLookup(
    SubdomainsLookupRequest
        .builder()
        .apiKey("apiKey")
        .domain("domain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<SubdomainsLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domain:** `String` — Domain name for availability and suggestions.
    
</dd>
</dl>

<dl>
<dd>

**after:** `Optional<String>` — Filter subdomains seen after this date (format YYYY-MM-DD).
    
</dd>
</dl>

<dl>
<dd>

**before:** `Optional<String>` — Filter subdomains seen before this date( format YYYY-MM-DD).
    
</dd>
</dl>

<dl>
<dd>

**status:** `Optional<SubdomainsLookupRequestStatus>` — Filter subdomains by status (active or inactive).
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<String>` — Page number for paginated results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainTyposquatting() -> DomainTyposquattingResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Domain Typosquatting API searches for registered domains that are typo or look-alike variants of a brand keyword, or that match a wildcard pattern. Results include registration lifecycle data and drop status across 1529+ TLDs, paginated at 100 domains per page.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainTyposquatting(
    DomainTyposquattingRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainTyposquattingRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**keyword:** `Optional<String>` — Brand or label to find typo variants for. 3-63 characters, letters, digits, or hyphens, a single label with no dots. Case-insensitive. Use either keyword or pattern, never both.
    
</dd>
</dl>

<dl>
<dd>

**pattern:** `Optional<String>` — Wildcard search string that combines fuzzy matching with * wildcards. 3-63 characters total, * is the only supported wildcard and each one matches zero or more characters, maximum 3 asterisks per request. Use either keyword or pattern, never both.
    
</dd>
</dl>

<dl>
<dd>

**pageToken:** `Optional<String>` — Token from nextPageToken in the previous response. Required to retrieve page 2 and onward. The original keyword or pattern must be passed alongside the token on every page request. Results page at 100 domains per page.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainReputation() -> DomainReputationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

The Domain Reputation API evaluates a domain against threat intelligence sources, DGA (domain generation algorithm) scoring, trust signals, and email deliverability configuration, returning a consolidated risk assessment with a verdict, severity, and supporting evidence.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainReputation(
    DomainReputationRequest
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainReputationRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — The domain name to assess (e.g. example.com). Must contain at least one dot and be at most 253 characters. Automatically lowercased.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.astronomyLookupV2() -> AstronomyLookupV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve sunrise and sunset times, current position of the moon, and other related information by specifying a location address, location coordinates, IP address, or using the client IP address if no parameter is passed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.astronomyLookupV2(
    AstronomyLookupV2Request
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<AstronomyLookupV2RequestFormat>` — Format of the response. Can be "json" or "xml".
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — Extract astronomy information using location (preferably city)
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Float>` — Latitude to extract astronomy information using location coordinates
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Float>` — Longitude to extract astronomy information using location coordinates
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4 or IPv6 address to extract astronomy information using IP address
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<AstronomyLookupV2RequestLang>` — Response language of "location" field in case of lookup through IP address only.
    
</dd>
</dl>

<dl>
<dd>

**date:** `Optional<String>` — Specific date (format YYYY-MM-DD) for which astronomy data is required
    
</dd>
</dl>

<dl>
<dd>

**elevation:** `Optional<Float>` — Elevation above sea level at the location, in meters. The value should be between 0 meter and a maximum value of 10,000 meters. Negative value is set to 0.
    
</dd>
</dl>

<dl>
<dd>

**timeZone:** `Optional<String>` — Time zone to receive all time-based data in your preferred local time.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.timezoneLookupV2() -> TimezoneLookupV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get current time, date, and timezone details by specifying a timezone name, location address, GPS coordinates, IP address, IATA/ICAO airport code, UN/LOCODE, or use the client IP if no parameter is provided.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.timezoneLookupV2(
    TimezoneLookupV2Request
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<TimezoneLookupV2RequestFormat>` — Format of the response. Possible values: json, xml.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4 or IPv6 address to extract timezone information.
    
</dd>
</dl>

<dl>
<dd>

**tz:** `Optional<String>` — Timezone name in IANA format (e.g., Asia/Kolkata) to retrieve information directly.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — Location string (preferably city and country) to extract timezone.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Float>` — Latitude for geolocation-based timezone lookup. Only time_zone is returned for this mode; no location object is included.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Float>` — Longitude for geolocation-based timezone lookup. Only time_zone is returned for this mode; no location object is included.
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<TimezoneLookupV2RequestLang>` — Response language for location fields. Default: en.
    
</dd>
</dl>

<dl>
<dd>

**iataCode:** `Optional<String>` — 3-letter IATA airport code (e.g., LHR) to extract timezone.
    
</dd>
</dl>

<dl>
<dd>

**icaoCode:** `Optional<String>` — 4-letter ICAO airport code (e.g., KJFK) to extract timezone.
    
</dd>
</dl>

<dl>
<dd>

**loCode:** `Optional<String>` — 5-letter UN/LOCODE city code to extract timezone.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.geolocationLookupV2() -> GeolocationLookupV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get detailed IP geolocation data for an IP address including country, city, timezone, currency, and optional threat intelligence and user-agent information.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.geolocationLookupV2(
    GeolocationLookupV2Request
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GeolocationLookupV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4, IPv6, or hostname for geolocation lookup.
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<GeolocationLookupV2RequestLang>` — Response language for location fields. Default: en.
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma-separated list of fields to include in response. For example, `location` includes all location fields, `location.city` is a specific field.
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma-separated list of fields to exclude from response.
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional<String>` — Comma-separated list of additional data modules to include. Possible values: security (threat intelligence), hostname (IP-Hostname lookup), liveHostname (live hostname lookup), hostnameFallbackLive (hostname with live fallback), user_agent (parse User-Agent header), abuse (abuse contact info), dma_code (DMA code), geo_accuracy (accuracy_radius, confidence, locality), * (all modules).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkGeolocationLookupV2(request) -> List&amp;lt;BulkGeolocationLookupV2ResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get detailed IP geolocation data for multiple IP addresses including country, city, timezone, currency, and optional threat intelligence information. Supports up to 50,000 IP addresses per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkGeolocationLookupV2(
    BulkGeolocationLookupV2Request
        .builder()
        .apiKey("apiKey")
        .ips(
            Arrays.asList("ips")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkGeolocationLookupV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<BulkGeolocationLookupV2RequestLang>` — Response language for location fields. Default: en.
    
</dd>
</dl>

<dl>
<dd>

**fields:** `Optional<String>` — Comma-separated list of fields to include in the response. For example, `location` includes all location fields, `location.city` is a specific field.
    
</dd>
</dl>

<dl>
<dd>

**excludes:** `Optional<String>` — Comma-separated list of fields to exclude from response.
    
</dd>
</dl>

<dl>
<dd>

**include:** `Optional<String>` — Comma-separated list of additional data modules to include. Possible values: security (threat intelligence), hostname (IP-Hostname lookup), liveHostname (live hostname lookup), user_agent (parse User-Agent header), abuse (abuse contact info), * (all modules).
    
</dd>
</dl>

<dl>
<dd>

**ips:** `List<String>` — List of IP addresses or hostnames to lookup.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.domainWhoisLookupV2() -> DomainWhoisLookupV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the current WHOIS record for the specified domain, including registrar details, registrant/administrative/technical/billing/reseller contacts, name servers, status codes, and raw WHOIS text.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.domainWhoisLookupV2(
    DomainWhoisLookupV2Request
        .builder()
        .apiKey("apiKey")
        .domainName("domainName")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<DomainWhoisLookupV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainName:** `String` — Domain name to retrieve WHOIS data for (e.g. example.com).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkDomainWhoisLookupV2(request) -> BulkDomainWhoisLookupV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the current WHOIS record for each requested domain, in request order. Supports up to 100 domain names per request; a domain that fails to resolve yields an error item instead of failing the whole batch.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkDomainWhoisLookupV2(
    BulkDomainWhoisLookupV2Request
        .builder()
        .apiKey("apiKey")
        .domainNames(
            Arrays.asList("domainNames")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkDomainWhoisLookupV2RequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**domainNames:** `List<String>` — List of domain names to retrieve WHOIS data for.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityLatestRatesV2() -> CommodityLatestRatesV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the current live price for the requested commodity symbols. Unresolved symbols degrade to a 206 partial response instead of failing the whole request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityLatestRatesV2(
    CommodityLatestRatesV2Request
        .builder()
        .apiKey("apiKey")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityLatestRatesV2RequestFormat>` — Response format. Currently only `json` is supported.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols (e.g., XAU, WTIOIL-SPOT). Case-insensitive; duplicates are deduplicated server-side, with one response entry and one credit charge per unique symbol.
    
</dd>
</dl>

<dl>
<dd>

**quote:** `Optional<String>` — Target currency for the exchange rate. If omitted (or set to `default`), the default quote currency of each commodity is used. Requires a premium plan; ignored on lower-tier plans.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityHistoricalRatesV2() -> CommodityHistoricalRatesV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns OHLC price data for the requested commodity symbols on a specific date. Falls back to the nearest earlier rate if none exists for the exact date. Unresolved symbols degrade to a 206 partial response instead of failing the whole request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityHistoricalRatesV2(
    CommodityHistoricalRatesV2Request
        .builder()
        .apiKey("apiKey")
        .date("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityHistoricalRatesV2RequestFormat>` — Response format. Currently only `json` is supported.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols. Case-insensitive; duplicates are deduplicated server-side, with one response entry and one credit charge per unique symbol.
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Date in YYYY-MM-DD format. Data available from 1990 onwards.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityFluctuationV2() -> CommodityFluctuationV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns price fluctuation metrics (start, end, change, percent change) for the requested commodity symbols over a date range. For monthly-updated commodities the range snaps to month boundaries. Unresolved symbols degrade to a 206 partial response instead of failing the whole request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityFluctuationV2(
    CommodityFluctuationV2Request
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityFluctuationV2RequestFormat>` — Response format. Currently only `json` is supported.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols. Case-insensitive; duplicates are deduplicated server-side, with one response entry and one credit charge per unique symbol.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityTimeSeriesV2() -> CommodityTimeSeriesV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns day-by-day OHLC data for the requested commodity symbols within a date range, indexed by date. Non-trading days are excluded. Unresolved symbols degrade to a 206 partial response instead of failing the whole request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityTimeSeriesV2(
    CommodityTimeSeriesV2Request
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityTimeSeriesV2RequestFormat>` — Response format. Currently only `json` is supported.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols. Case-insensitive; duplicates are deduplicated server-side, with one response entry and one credit charge per unique symbol.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD). Maximum range is 365 days.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commoditySymbolsV2() -> CommoditySymbolsV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the list of supported commodity symbols with metadata. Deprecated symbols stay listed with status "inactive" and a deprecationDate.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commoditySymbolsV2(
    CommoditySymbolsV2Request
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommoditySymbolsV2RequestFormat>` — Response format. Currently only `json` is supported.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityIntradayRatesV2() -> CommodityIntradayRatesV2Response</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the prices of one commodity through a UTC day at the requested interval, keyed by UTC timestamp. Each request costs a flat 50 credits however many points it returns.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityIntradayRatesV2(
    CommodityIntradayRatesV2Request
        .builder()
        .apiKey("apiKey")
        .symbols("symbols")
        .interval(CommodityIntradayRatesV2RequestInterval.ONE_M)
        .date("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `String` — Exactly one commodity symbol. Case-insensitive. Sending two or more returns a 400. Only symbols updated every second, every minute, or every 10 minutes have intraday rates; symbols updated hourly or less often return a 400. Use the Commodity Symbols endpoint for all valid values.
    
</dd>
</dl>

<dl>
<dd>

**interval:** `CommodityIntradayRatesV2RequestInterval` — Spacing between points. Case-insensitive. Symbols updated every 10 minutes accept only `10m`, `30m`, `1h`, `2h`, `4h`, `8h`, `12h`, `1d`.
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — The UTC day to read, in `YYYY-MM-DD` format. Cannot be in the future. For today, points stop at the current UTC minute.
    
</dd>
</dl>

<dl>
<dd>

**startTime:** `Optional<String>` — First mark of the window, as a 24-hour UTC time in `HH:mm`. Must fall on a mark of the interval (for example, `14:30` works for `5m` or `30m`, but not for `1h`). For `1d` it can only be `00:00`.
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Boolean>` — Whether to include the `metadata` object. Pass `false` to receive only the prices.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfMerge(files, request) -> PdfMergeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API merges multiple PDF files into a single PDF, in the order they are provided
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfMerge(
    List.of(new File("first.pdf"), new File("second.pdf")),
    PdfMergeRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**files:** `List<File>` — The PDF files to merge, sent as repeated `file` parts in this order. A single-file `pdfMerge(Optional<File> file, request)` overload is kept for v1.x callers.
    
</dd>
</dl>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfMergeRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — An array of unique file IDs referencing PDF files previously uploaded to the API Freaks server. Use this parameter to merge existing files without re-uploading them. Provide multiple IDs to merge files in the specified order.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — Specifies the desired name for the resulting merged PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfRemovePages(request) -> PdfRemovePagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API removes a selection or range of pages from a PDF file.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfRemovePages(
    Optional.of(new File("document.pdf")),
    PdfRemovePagesRequest
        .builder()
        .apiKey("apiKey")
        .pages("pages")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfRemovePagesRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique identifier of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output PDF file after pages have been removed. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `String` — Specifies which pages to remove from the PDF. Accepts individual page numbers (e.g., '1,7') and/or ascending page ranges (e.g., '3-5'). Use commas to separate entries and hyphens for ranges. Reverse ranges (e.g., '5-3') are not allowed. Alternatively, you may provide only one of the following keywords: 'even' (removes all even-numbered pages), 'odd' (removes all odd-numbered pages), or 'last' (removes only the last page). The keyword 'all' is not supported for this operation. Examples: '1,3-5', 'even'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfSplit(request) -> PdfSplitResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API splits a PDF into multiple parts based on specified page numbers or ranges.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfSplit(
    Optional.of(new File("document.pdf")),
    PdfSplitRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfSplitRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired base name for the output PDF files after splitting. If not provided, a default naming convention will be used.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` 

Defines the page numbers or ranges where the PDF should be split. Provide individual pages and/or ranges in any order (for example: "1-4,9-5,16-last"). Separate entries with commas and use hyphens for ranges.

Special keywords (use alone):

• `even` — split at every even-numbered page

• `odd` — split at every odd-numbered page

• `all` — split the PDF into single-page files

The keyword `last` can be used anywhere in the string, in combination with page numbers or ranges (for example: "5-last", "last-2", "1,last,9").

Examples:
- "1,4-2,last"
- "odd"
- "all"
- "last,2-5"

Invalid example: "1,odd" (mixing a keyword other than "last" with specific pages/ranges is not allowed). You can pass multiple pages entries to produce multiple output files.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfRotate(request) -> PdfRotateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API rotates pages of a PDF by a specified angle (in multiples of 90 degrees).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfRotate(
    Optional.of(new File("document.pdf")),
    PdfRotateRequest
        .builder()
        .apiKey("apiKey")
        .rotate(1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfRotateRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output PDF file after rotation. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies which pages to rotate. Accepts individual page numbers (e.g., '1,7') and/or ascending page ranges (e.g., '3-5'). Use commas to separate entries and hyphens for ranges. Reverse ranges (e.g., '5-3') are not allowed. Alternatively, provide only one of the following keywords: 'even' (rotate all even-numbered pages), 'odd' (rotate all odd-numbered pages), 'last' (rotate only the last page), or 'all' (rotate all pages). Examples: '1,3-5', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**rotate:** `Integer` — The angle in degrees to rotate the selected pages. Must be one of the following values: 0, 90, 180, 270, -90, -180, or -270. All rotations are applied clockwise.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfCompress(request) -> PdfCompressResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API compresses a given PDF file to reduce its file size.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfCompress(
    Optional.of(new File("document.pdf")),
    PdfCompressRequest
        .builder()
        .apiKey("apiKey")
        .compressionLevel(PdfCompressRequestCompressionLevel.LOW)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfCompressRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — Name of the output PDF.
    
</dd>
</dl>

<dl>
<dd>

**compressionLevel:** `PdfCompressRequestCompressionLevel` — Controls how aggressively the PDF is compressed. Lower levels preserve more quality, while higher levels reduce file size more.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to true, the input file(s) will be deleted from the server immediately after the output is generated.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfExtractPages(request) -> PdfExtractPagesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API extracts specific pages or page ranges from a PDF file and returns them as a new PDF.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfExtractPages(
    Optional.of(new File("document.pdf")),
    PdfExtractPagesRequest
        .builder()
        .apiKey("apiKey")
        .pages("pages")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfExtractPagesRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output PDF file after pages have been extracted. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `String` — Specifies which pages to extract from the PDF. You can provide individual page numbers (e.g., '2') and/or page ranges in any order, including descending (e.g., '9-5', '16-last'). Use commas to separate entries and hyphens for ranges. You may alternatively pass only one of the special keywords: 'even' (extracts all even-numbered pages), 'odd' (extracts all odd-numbered pages), 'last' (extracts only the last page), or 'all' (extracts all pages into individual files). Examples: '2,6-3', 'even', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**separated:** `Optional<Boolean>` — If set to `true`, each of the specified pages will be extracted and returned as a separate PDF file.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfLinearize(request) -> PdfLinearizeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

API endpoint that linearizes any given PDF, restructuring it for faster loading and page-by-page viewing in web browsers.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfLinearize(
    Optional.of(new File("document.pdf")),
    PdfLinearizeRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfLinearizeRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output PDF file after pages have been extracted. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfEncrypt(request) -> PdfEncryptResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API encrypts a PDF file by setting a password required to open it.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfEncrypt(
    Optional.of(new File("document.pdf")),
    PdfEncryptRequest
        .builder()
        .apiKey("apiKey")
        .userPassword("user_password")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfEncryptRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output encrypted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `Optional<String>` — The password to unlock the input file if it is already protected. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `String` — Sets the user password required to open and view the encrypted PDF file. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional<String>` — Sets the owner password for the PDF file. This password provides full access, including the ability to remove restrictions. If not provided, the `user_password` will also be used as the owner password. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfDecrypt(request) -> PdfDecryptResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API decrypts PDF files, removing all encryption, including open passwords and permission restrictions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfDecrypt(
    Optional.of(new File("document.pdf")),
    PdfDecryptRequest
        .builder()
        .apiKey("apiKey")
        .filePassword("file_password")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfDecryptRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output decrypted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `String` — The password to unlock the input file if it is protected. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfRestrict(request) -> PdfRestrictResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API applies permission restrictions on a PDF file, such as disabling printing, copying, or editing. This can include password protection to enforce restrictions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfRestrict(
    Optional.of(new File("document.pdf")),
    PdfRestrictRequest
        .builder()
        .apiKey("apiKey")
        .userPassword("user_password")
        .restrictions(
            Arrays.asList(PdfRestrictRequestRestrictionsItem.PRINT_HIGH)
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfRestrictRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output restricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `Optional<String>` — The password to unlock the input file if it is already secured. Provide the owner password if available; otherwise, the user password. The owner password takes precedence. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `String` — Sets the password users will use to open the PDF. If this is not set, only the owner password will be configured, and anyone can open the PDF file with the provided restrictions enabled. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional<String>` — Sets the password that allows full access to the PDF (e.g., removing restrictions). If not provided, the `user_password` (if set) will also be used as the owner password. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**restrictions:** `Optional<PdfRestrictRequestRestrictionsItem>` 

A comma-separated list of restrictions to apply to the PDF. These define what the end-user is *not* allowed to do with the PDF. Available options are:


* **print_high** – Disables high-quality printing.
* **print_low** – Disables low-resolution printing.
* **edit_document_assembly** – Prevents reordering or inserting pages.
* **fill_form_fields** – Disallows filling in PDF form fields.
* **edit_annotations** – Disables adding or modifying annotations or comments.
* **modify_content** – Prevents modifying existing content in the PDF.
* **copy_and_extract_content** – Disables copying text or images from the PDF.
* **use_accessibility** – Prevents screen readers or accessibility tools from accessing content.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfUnrestrict(request) -> PdfUnrestrictResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API removes permission restrictions from a PDF while keeping it encrypted. If you want to remove all security (including encryption), use the `/pdf/decrypt` endpoint instead.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfUnrestrict(
    Optional.of(new File("document.pdf")),
    PdfUnrestrictRequest
        .builder()
        .apiKey("apiKey")
        .filePassword("file_password")
        .userPassword("user_password")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfUnrestrictRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**filePassword:** `String` — The password to unlock the input file. Either the owner password or user password can be provided. The owner password takes precedence. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**userPassword:** `String` — Sets the user password for the PDF file. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**ownerPassword:** `Optional<String>` — Sets the owner password for the PDF file. If the owner password is not provided, the `user_password` will also be used as the owner password. Password Length should be between 6 and 128 characters.
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToPng(request) -> PdfConvertToPngResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API converts a given PDF file into a sequence of PNG images.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfConvertToPng(
    Optional.of(new File("document.pdf")),
    PdfConvertToPngRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfConvertToPngRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional<Integer>` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200.
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional<String>` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<PdfConvertToPngRequestProfile>` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black & white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors).
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToJpg(request) -> PdfConvertToJpgResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API converts a given PDF file into a sequence of JPG images.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfConvertToJpg(
    Optional.of(new File("document.pdf")),
    PdfConvertToJpgRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfConvertToJpgRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**quality:** `Optional<Integer>` — Controls JPG compression quality. Higher values yield sharper images with larger file sizes.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional<Integer>` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200.
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional<String>` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<PdfConvertToJpgRequestProfile>` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black & white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors).
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToTiff(request) -> PdfConvertToTiffResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API converts a given PDF file into a sequence of TIFF images. The output images can be saved as a single TIFF file, or as a sequence of TIFF files.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfConvertToTiff(
    Optional.of(new File("document.pdf")),
    PdfConvertToTiffRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfConvertToTiffRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional<Integer>` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200.
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional<String>` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<PdfConvertToTiffRequestProfile>` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black & white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors).
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToBmp(request) -> PdfConvertToBmpResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Converts a PDF file to a BMP image.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfConvertToBmp(
    Optional.of(new File("document.pdf")),
    PdfConvertToBmpRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfConvertToBmpRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional<Integer>` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200.
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional<String>` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<PdfConvertToBmpRequestProfile>` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black & white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors).
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfConvertToGif(request) -> PdfConvertToGifResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API converts a given PDF file into a sequence of GIF images.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfConvertToGif(
    Optional.of(new File("document.pdf")),
    PdfConvertToGifRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfConvertToGifRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `Optional<String>` — The unique ID of a PDF file already uploaded to the API Freaks server. Use this as an alternative to uploading a new file directly.
    
</dd>
</dl>

<dl>
<dd>

**destroy:** `Optional<Boolean>` — If set to `true`, the input file(s) will be permanently deleted from the server immediately after the output PDF is generated.
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<String>` — The desired name for the output unrestricted PDF file. If not provided, a default name will be assigned.
    
</dd>
</dl>

<dl>
<dd>

**pages:** `Optional<String>` — Specifies the pages or ranges at which to split the PDF. Accepts individual page numbers (e.g., '1') and/or page ranges (e.g., '4-2', 'last'). Ranges can be ascending or descending. Use commas to separate entries and hyphens for ranges. Alternatively, provide only one of the following keywords: 'even' (split at every even-numbered page), 'odd' (split at every odd-numbered page), 'last' (split at the last page only), or 'all' (split into single pages). Examples: '1,4-2,last', 'odd', 'all'. Mixing special keywords with specific pages/ranges is not allowed.
    
</dd>
</dl>

<dl>
<dd>

**resolution:** `Optional<Integer>` — Specifies the resolution (in DPI) for the output images. Acceptable Range is from 20 to 1200.
    
</dd>
</dl>

<dl>
<dd>

**imageSmoothing:** `Optional<String>` — Determines the smoothing options to apply during image conversion. Valid values are 'none', 'all' or a combination of 'text', 'line', and 'image' (comma-separated).If not provided, no smoothing will be applied.
    
</dd>
</dl>

<dl>
<dd>

**profile:** `Optional<PdfConvertToGifRequestProfile>` — Specifies the color profile for the output PNG images. Acceptable values: bw (1-bit black & white, smallest size, no grayscale or color), gray (8-bit grayscale), rgb (24-bit RGB color, default), rgba (32-bit RGB color with alpha channel for transparency), 4-bit (4-bit indexed color, up to 16 colors, smaller size), or 8-bit (8-bit indexed color, up to 256 colors).
    
</dd>
</dl>

<dl>
<dd>

**webhookUrl:** `Optional<String>` — The URL to which the webhook notification will be sent after the task is completed.
    
</dd>
</dl>

<dl>
<dd>

**webhookFailureNotification:** `Optional<Boolean>` — If true, a notification will also be sent by email in case the webhook request fails all the retries.  The email notification will be sent to the requesting user or their organization’s admin if part of one.
    
</dd>
</dl>

<dl>
<dd>

**webhookAuthorization:** `Optional<String>` — Optional custom header for webhook requests. Format: `Key:Value` (e.g., `Authorization:Bearer token123`). This will be sent as an HTTP header in the webhook call.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfUploadResources(request) -> PdfUploadResourcesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API uploads multiple PDF files to the API Freaks server and generates their unique file IDs.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfUploadResources(
    Optional.of(new File("document.pdf")),
    PdfUploadResourcesRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfUploadResourcesRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
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

<dl>
<dd>

This API uploads PDF files to the API Freaks server in binary format.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfUploadBinary(
    PdfUploadBinaryRequest
        .builder()
        .apiKey("apiKey")
        .fileName("document.pdf")
        .body(Files.readAllBytes(Paths.get("document.pdf")))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**fileName:** `String` — Name to store the uploaded file under (sent as the `file_name` query parameter)
    
</dd>
</dl>

<dl>
<dd>

**body:** `byte[]` — The raw PDF bytes, sent as the `application/octet-stream` request body
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfUploadBinaryRequestFormat>` — Response format, `json` or `xml`
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfDownloadResource() -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API downloads PDF files or ZIP archives from the server using their unique resource ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfDownloadResource(
    PdfDownloadResourceRequest
        .builder()
        .apiKey("apiKey")
        .resourceId("resource_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfDownloadResourceRequestFormat>` 
    
</dd>
</dl>

<dl>
<dd>

**resourceId:** `String` — The unique identifier of the file or ZIP archive to download.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfGetTaskStatus() -> PdfGetTaskStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API checks the status of a previously initiated PDF processing task using its unique task ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfGetTaskStatus(
    PdfGetTaskStatusRequest
        .builder()
        .apiKey("apiKey")
        .taskId("task_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfGetTaskStatusRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**taskId:** `String` — The unique ID of the PDF processing task for which the status is requested.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfGetFileStatus() -> PdfGetFileStatusResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API checks the status of a PDF file using its unique file ID, providing information about its creation and potential deletion time.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfGetFileStatus(
    PdfGetFileStatusRequest
        .builder()
        .apiKey("apiKey")
        .fileId("file_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfGetFileStatusRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `String` — The unique ID of the file whose status is requested.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfListFiles() -> PdfListFilesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API retrieves a list of all PDF files uploaded and generated by a specific user. Please note that if the user is part of an organization, only the Organization Administrator can access this endpoint. Organization Members cannot access this endpoint.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfListFiles(
    PdfListFilesRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfListFilesRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfDeleteFile() -> PdfDeleteFileResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

This API deletes a PDF file using its unique file ID.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfDeleteFile(
    PdfDeleteFileRequest
        .builder()
        .apiKey("apiKey")
        .fileId("file_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<PdfDeleteFileRequestFormat>` — Specifies the desired format for the API response. Choose 'json' for a JSON object or 'xml' for an XML structure.
    
</dd>
</dl>

<dl>
<dd>

**fileId:** `String` — The unique ID of the file to be deleted.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.pdfGenerateFromTemplate(request) -> PdfGenerateFromTemplateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Renders the template identified by template_id with the JSON data supplied in the request body (or fetched from data_url). Returns a hosted URL for the generated PDF. Provide either a request body or a data_url; one of the two is required. The keys of the data object are the fields you bound when you designed the template in the APIFreaks PDF Template Builder, so the exact shape is up to you. Pin the version parameter to a specific template version (e.g. version=v2) so later design changes never touch what is already live; omit it to use the latest version.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.pdfGenerateFromTemplate(
    PdfGenerateFromTemplateRequest
        .builder()
        .apiKey("apiKey")
        .templateId("template_id")
        .body(
            new HashMap<String, Object>() {{
                put("candidate_name", "Ava Thompson");
                put("candidate_title", "Senior Operations Analyst");
                put("email", "ava.thompson@example.com");
                put("phone", "+1 (555) 381-2048");
                put("city", "Austin, TX");
                put("portfolio_url", "portfolio.example.com");
                put("profile_summary", "Analytical operations professional with 8+ years of experience improving reporting pipelines, streamlining process documentation, and coordinating cross-functional delivery for distributed teams across multiple time zones.");
                put("company_name", "Northwind Logistics");
                put("job_title", "Operations Analyst");
                put("employment_period", "2021 - Present");
                put("job_achievement_1", "Led weekly KPI reporting for finance, fulfillment, and customer success stakeholders across three business units.");
                put("job_achievement_2", "Reduced manual reconciliation work by 35% through workflow redesign and documentation automation.");
                put("job_achievement_3", "Spearheaded a cross-team initiative that improved on-time delivery metrics by 18% within six months.");
                put("skills", new ArrayList<Object>(Arrays.asList(new 
                HashMap<String, Object>() {{put("skill", "Process Improvement");
                    put("level", "Advanced");
                    put("years", "7");
                }}, new 
                HashMap<String, Object>() {{put("skill", "Stakeholder Reporting");
                    put("level", "Expert");
                    put("years", "8");
                }}, new 
                HashMap<String, Object>() {{put("skill", "Cross-functional Coordination");
                    put("level", "Advanced");
                    put("years", "5");
                }}, new 
                HashMap<String, Object>() {{put("skill", "Workflow Documentation");
                    put("level", "Advanced");
                    put("years", "6");
                }})));
                put("degree", "B.S. in Information Systems");
                put("institution", "University of Texas");
                put("graduation_year", "2018");
                put("certification_1", "Certified Business Analysis Professional (CBAP)");
                put("certification_2", "Six Sigma Green Belt");
                put("languages", "English (Native), Spanish (Professional)");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**templateId:** `String` — The template to render, from the APIFreaks PDF Template Builder. Copy it from your dashboard when you save the template.
    
</dd>
</dl>

<dl>
<dd>

**version:** `Optional<String>` — Template version to render, e.g. v2. Must start with v. Omit this parameter entirely to use the latest version; the literal value 'latest' is not accepted by the API.
    
</dd>
</dl>

<dl>
<dd>

**dataUrl:** `Optional<String>` — A URL the API fetches your JSON data from, instead of the request body. Provide this when you are not sending a request body.
    
</dd>
</dl>

<dl>
<dd>

**request:** `Map<String, Object>` — Free-form JSON object whose keys map to the fields bound in the template.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkPdfGenerateFromTemplate(request) -> List&amp;lt;BulkPdfGenerateFromTemplateResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Upload a CSV file where each row is one record. The API generates one PDF per row and returns an array of results, each with its own pdf_url. Rows are processed independently, so a failure in one row does not block the rest of the batch. The response gives a row-by-row breakdown of which PDFs succeeded and which failed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkPdfGenerateFromTemplate(
    new File("data.csv"),
    BulkPdfGenerateFromTemplateRequest
        .builder()
        .apiKey("apiKey")
        .templateId("template_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**templateId:** `String` — The template to render, from the APIFreaks PDF Template Builder. Copy it from your dashboard when you save the template.
    
</dd>
</dl>

<dl>
<dd>

**version:** `Optional<String>` — Template version to render, e.g. v2. Must start with v. Omit this parameter entirely to use the latest version; the literal value 'latest' is not accepted by the API.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.screenshotCapture() -> ScreenshotCaptureResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Capture full-page screenshots and videos of websites with advanced options like device simulation, custom code injection, cookie banner blocking, and scrollable content recording.
Supports multiple output formats including JSON, image, GIF, MP4, and WebM.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.screenshotCapture(
    ScreenshotCaptureRequest
        .builder()
        .apiKey("apiKey")
        .url("url")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**output:** `Optional<ScreenshotCaptureRequestOutput>` — Output format for screenshot results. The SDKs support only `json`, which returns metadata with the captured file's URL in `screenshot`; download the file from that URL. (The API's `output=image`, which returns the raw file, is not supported by the SDK methods.)
    
</dd>
</dl>

<dl>
<dd>

**fileType:** `Optional<ScreenshotCaptureRequestFileType>` — File type for screenshot output
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — URLs to capture screenshots of
    
</dd>
</dl>

<dl>
<dd>

**width:** `Optional<Integer>` — Browser viewport width in pixels
    
</dd>
</dl>

<dl>
<dd>

**height:** `Optional<Integer>` — Browser viewport height in pixels
    
</dd>
</dl>

<dl>
<dd>

**fullPage:** `Optional<Boolean>` — Capture a full-page screenshot
    
</dd>
</dl>

<dl>
<dd>

**fresh:** `Optional<Boolean>` — Bypass cache and take a fresh screenshot
    
</dd>
</dl>

<dl>
<dd>

**noCookieBanners:** `Optional<Boolean>` — Remove cookie banners from the screenshot
    
</dd>
</dl>

<dl>
<dd>

**enableCaching:** `Optional<Boolean>` — Enable caching for repeated requests
    
</dd>
</dl>

<dl>
<dd>

**blockAds:** `Optional<Boolean>` — Block advertisements on the page
    
</dd>
</dl>

<dl>
<dd>

**blockChatWidgets:** `Optional<Boolean>` — Block chat widget scripts from loading
    
</dd>
</dl>

<dl>
<dd>

**extractText:** `Optional<Boolean>` — Extract visible text from the page
    
</dd>
</dl>

<dl>
<dd>

**extractHtml:** `Optional<Boolean>` — Extract HTML content of the page
    
</dd>
</dl>

<dl>
<dd>

**destroyScreenshot:** `Optional<Boolean>` — Auto-destroy screenshot after fetch
    
</dd>
</dl>

<dl>
<dd>

**lazyLoad:** `Optional<Boolean>` — Enable lazy-loading content before screenshot
    
</dd>
</dl>

<dl>
<dd>

**retina:** `Optional<Boolean>` — Capture screenshot in high-DPI (Retina) mode
    
</dd>
</dl>

<dl>
<dd>

**darkMode:** `Optional<Boolean>` — Render page in dark mode
    
</dd>
</dl>

<dl>
<dd>

**blockTracking:** `Optional<Boolean>` — Block common user-tracking scripts
    
</dd>
</dl>

<dl>
<dd>

**enableIncognito:** `Optional<Boolean>` — Enable private/incognito mode for browser session
    
</dd>
</dl>

<dl>
<dd>

**omitBackground:** `Optional<Boolean>` — Omit background color (transparent background)
    
</dd>
</dl>

<dl>
<dd>

**thumbnailWidth:** `Optional<Integer>` — Thumbnail width in pixels
    
</dd>
</dl>

<dl>
<dd>

**adjustTop:** `Optional<Integer>` — Adjust top in pixels
    
</dd>
</dl>

<dl>
<dd>

**waitForEvent:** `Optional<ScreenshotCaptureRequestWaitForEvent>` — Wait for a specific load event before capturing the screenshot.
    
</dd>
</dl>

<dl>
<dd>

**grayscale:** `Optional<Integer>` — Range:0 to 100 for grayscale filter
    
</dd>
</dl>

<dl>
<dd>

**delay:** `Optional<Integer>` — How many milliseconds to wait before taking the screenshot
    
</dd>
</dl>

<dl>
<dd>

**timeout:** `Optional<Integer>` — Maximum timeout in milliseconds. Defalut is `10,000`
    
</dd>
</dl>

<dl>
<dd>

**ttl:** `Optional<Integer>` — Number of seconds the screenshot should be cached
    
</dd>
</dl>

<dl>
<dd>

**clipX:** `Optional<Integer>` — X position of the clipping rectangle in pixels
    
</dd>
</dl>

<dl>
<dd>

**clipY:** `Optional<Integer>` — Y position of the clipping rectangle in pixels
    
</dd>
</dl>

<dl>
<dd>

**clipWidth:** `Optional<Integer>` — Width of the clipping rectangle in pixels
    
</dd>
</dl>

<dl>
<dd>

**clipHeight:** `Optional<Integer>` — Height of the clipping rectangle in pixels
    
</dd>
</dl>

<dl>
<dd>

**cssUrl:** `Optional<String>` — URL to CSS file
    
</dd>
</dl>

<dl>
<dd>

**css:** `Optional<String>` — Your custom CSS code
    
</dd>
</dl>

<dl>
<dd>

**jsUrl:** `Optional<String>` — URL to JS file
    
</dd>
</dl>

<dl>
<dd>

**js:** `Optional<String>` — Your JS code
    
</dd>
</dl>

<dl>
<dd>

**blockJs:** `Optional<Boolean>` — Block Scripts
    
</dd>
</dl>

<dl>
<dd>

**blockStylesheets:** `Optional<Boolean>` — Block Stylesheets
    
</dd>
</dl>

<dl>
<dd>

**blockImages:** `Optional<Boolean>` — Block Images
    
</dd>
</dl>

<dl>
<dd>

**blockMedia:** `Optional<Boolean>` — Block Media
    
</dd>
</dl>

<dl>
<dd>

**blockFont:** `Optional<Boolean>` — Block Fonts
    
</dd>
</dl>

<dl>
<dd>

**blockTextTrack:** `Optional<Boolean>` — Block Text Tracks
    
</dd>
</dl>

<dl>
<dd>

**blockXhr:** `Optional<Boolean>` — Block XHR Requests
    
</dd>
</dl>

<dl>
<dd>

**blockFetch:** `Optional<Boolean>` — Block Fetch Requests
    
</dd>
</dl>

<dl>
<dd>

**blockEventSource:** `Optional<Boolean>` — Block Event Source
    
</dd>
</dl>

<dl>
<dd>

**blockWebSocket:** `Optional<Boolean>` — Block Web Sockets
    
</dd>
</dl>

<dl>
<dd>

**blockManifest:** `Optional<Boolean>` — Block Manifest
    
</dd>
</dl>

<dl>
<dd>

**blockSpecificRequests:** `Optional<String>` — Comma- or newline-separated list of specific requests to block. Each line and comma are treated as separate requests for processing. Example: https://example.com, https://example.js
    
</dd>
</dl>

<dl>
<dd>

**blurSelector:** `Optional<String>` 

Comma-separated list of indexed CSS selectors to blur.
Format: `index:<selector>`, e.g., `0:.banner,1:#ads`.
    
</dd>
</dl>

<dl>
<dd>

**removeSelector:** `Optional<String>` 

Comma-separated list of indexed CSS selectors to blur.
Format: `index:<selector>`, e.g., `0:.banner,1:#ads`.
    
</dd>
</dl>

<dl>
<dd>

**resultFileName:** `Optional<String>` 

Specify a meaningful & unique file name to easily identify the screenshot result.
Avoid using spaces or special characters; use hyphens or underscores to separate words.
    
</dd>
</dl>

<dl>
<dd>

**scrollingScreenshot:** `Optional<Boolean>` — **`Scrolling Screenshot`**: Capture a long scrolling screenshot. When true, disable `fullPage` and `freshScreenshot`.
    
</dd>
</dl>

<dl>
<dd>

**scrollSpeed:** `Optional<ScreenshotCaptureRequestScrollSpeed>` — Speed of scrolling during the screenshot.
    
</dd>
</dl>

<dl>
<dd>

**scrollBack:** `Optional<Boolean>` — If true, the scroll will reverse back to the top after reaching the bottom.
    
</dd>
</dl>

<dl>
<dd>

**startImmediately:** `Optional<Boolean>` — If true, the scrolling capture will start immediately upon page load.
    
</dd>
</dl>

<dl>
<dd>

**multipleScrolling:** `Optional<Boolean>` — If true, multiple scrolling screenshots will be taken at different viewport sizes.
    
</dd>
</dl>

<dl>
<dd>

**sizes:** `Optional<String>` — Comma-separated list of viewport sizes in the format index:XXw:YYh. Example: sizes=0:120w:300h,1:240w:500h
    
</dd>
</dl>

<dl>
<dd>

**duration:** `Optional<Double>` — Duration in seconds for the scrolling capture. Acceptable range: 0 to 100 seconds.
    
</dd>
</dl>

<dl>
<dd>

**failOnError:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**longitude:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**latitude:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**proxy:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**headers:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**cookies:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**scrollToElement:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**selector:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**userAgent:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**acceptLanguages:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**customHtml:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**imageQuality:** `Optional<Double>` 
    
</dd>
</dl>

<dl>
<dd>

**captchaError:** `Optional<String>` — CSS selector of the message shown for a wrong answer. While it is visible, the solver tries again.
    
</dd>
</dl>

<dl>
<dd>

**captchaImage:** `Optional<String>` — CSS selector of the captcha picture. Required when solve_captcha is true.
    
</dd>
</dl>

<dl>
<dd>

**captchaInput:** `Optional<String>` — CSS selector of the box the answer is typed into. Required when solve_captcha is true.
    
</dd>
</dl>

<dl>
<dd>

**captchaRefresh:** `Optional<String>` — CSS selector of the control that loads a new captcha picture before the next try.
    
</dd>
</dl>

<dl>
<dd>

**captchaRetries:** `Optional<Integer>` — Number of guesses the solver makes, from 1 to 5.
    
</dd>
</dl>

<dl>
<dd>

**captchaSubmit:** `Optional<String>` — CSS selector of the button to click after the answer is typed.
    
</dd>
</dl>

<dl>
<dd>

**classicProxy:** `Optional<Boolean>` — Loads the page through a datacenter proxy. Adds 20 credits per request. Ignored when premium_proxy is true or a custom proxy is set.
    
</dd>
</dl>

<dl>
<dd>

**clickRecursion:** `Optional<Integer>` — Number of times to click the selector (when set via `selector_to_click`).
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Two-letter country code, such as US or DE, for the exit address of classic_proxy or premium_proxy. Ignored when you send your own proxy. Any two-letter code is sent, including one that is not listed. Classic proxy countries: BG, GE, DE, HN, MD, UA, GB, US. Premium proxy countries: AF, AL, DZ, AO, AG, AR, AM, AW, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BT, BO, BQ, BA, BW, BR, BN, BG, BF, BI, CV, KH, CM, CA, KY, CF, TD, CL, CN, CO, KM, CG, CR, CI, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, EC, EG, SV, GQ, EE, SZ, ET, FO, FJ, FI, FR, GF, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IL, IT, JM, JP, JE, JO, KZ, KE, XK, KW, KG, LA, LV, LB, LS, LR, LY, LT, MO, MG, MW, MY, MV, ML, MT, MQ, MR, MU, YT, MX, MD, MN, ME, MA, MZ, MM, NA, NP, NL, NC, NZ, NI, NE, NG, MK, NO, OM, PK, PS, PA, PG, PY, PE, PH, PL, PT, PR, QA, RE, RO, RU, RW, KN, LC, VC, WS, SA, SN, RS, SC, SL, SG, SK, SI, SB, SO, ZA, KR, SS, ES, LK, SD, SR, SE, CH, SY, TW, TJ, TZ, TH, TL, TG, TO, TT, TN, TR, TM, UG, UA, AE, GB, US, UY, UZ, VE, VN, YE, ZM, ZW.
    
</dd>
</dl>

<dl>
<dd>

**extractMarkdown:** `Optional<Boolean>` — Extracts rendered page content as a structured .md (Markdown) file. Preserves headings, lists, links. Only with output=json.
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ScreenshotCaptureRequestFormat>` — Response format: json (default).
    
</dd>
</dl>

<dl>
<dd>

**getImageUrls:** `Optional<Boolean>` — Extracts all image URLs from the rendered DOM and returns them in structured format. Only with output=json.
    
</dd>
</dl>

<dl>
<dd>

**gpu:** `Optional<Boolean>` — Renders the page with a GPU, including WebGL and canvas content. Adds 20 credits per request.
    
</dd>
</dl>

<dl>
<dd>

**markdown:** `Optional<String>` — Markdown to render instead of loading a URL. Works like custom_html, so you can capture a README or notes without hosting a page.
    
</dd>
</dl>

<dl>
<dd>

**ocrModel:** `Optional<ScreenshotCaptureRequestOcrModel>` — Recognition model used by the captcha solver: mini-ocr-v1 (default) or ocr-v1.
    
</dd>
</dl>

<dl>
<dd>

**pdfOptionsFormat:** `Optional<ScreenshotCaptureRequestPdfOptionsFormat>` — Paper size of the PDF. Applies when file_type is PDF. Without it, width and height are used if set, otherwise the page renders as one long page: A0, A1, A2, A3, A4, A5, A6, Letter, Legal, Tabloid, or Ledger.
    
</dd>
</dl>

<dl>
<dd>

**pdfOptionsLandscape:** `Optional<Boolean>` — Renders the PDF in landscape orientation, swapping the width and height of the paper size. Applies when file_type is PDF.
    
</dd>
</dl>

<dl>
<dd>

**pdfOptionsMedia:** `Optional<ScreenshotCaptureRequestPdfOptionsMedia>` — CSS media type used to render the PDF: print or screen.
    
</dd>
</dl>

<dl>
<dd>

**pdfOptionsPageRange:** `Optional<String>` — Pages to keep in the PDF, as start-end, for example 1-3 or 5-5. Pages are rendered first and then trimmed. Has no effect on a single-page PDF. Applies when file_type is PDF.
    
</dd>
</dl>

<dl>
<dd>

**pdfOptionsPrintBackground:** `Optional<Boolean>` — Includes background colors and images in the PDF. Applies when file_type is PDF.
    
</dd>
</dl>

<dl>
<dd>

**premiumProxy:** `Optional<Boolean>` — Loads the page through a residential proxy. Adds 200 credits per request. Used instead of classic_proxy.
    
</dd>
</dl>

<dl>
<dd>

**scrollDelay:** `Optional<Integer>` — Delay in milliseconds between scroll steps when `lazy_load` is enabled. Use higher values for heavy pages.
    
</dd>
</dl>

<dl>
<dd>

**selectorToClick:** `Optional<String>` — CSS selector for an element to click before capturing the screenshot. Useful for opening dropdowns, modals, or triggering content.
    
</dd>
</dl>

<dl>
<dd>

**solveCaptcha:** `Optional<Boolean>` — Solves a captcha made of text drawn in a picture, then takes the screenshot. Requires captcha_image and captcha_input. Adds 20 credits per request.
    
</dd>
</dl>

<dl>
<dd>

**stealth:** `Optional<Boolean>` — Makes the browser look like a regular visitor for pages that block automated traffic. No extra credits.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — IANA timezone the browser uses while rendering, such as Asia/Karachi or Europe/London. Useful for clocks and localized dates.
    
</dd>
</dl>

<dl>
<dd>

**video:** `Optional<Boolean>` — Records visible viewport only for a specified duration. Use with `duration` parameter. Ideal for dashboards and animations.
    
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

<dl>
<dd>

Our Bulk Screenshot API allows you to capture screenshots of multiple webpages simultaneously, saving you time and effort. Instead of manually capturing each page one by one, you can batch process URLs and receive high-quality screenshots in the format you choose.
 Maximum `50 URLs` per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkScreenshotCapture(
    BulkScreenshotCaptureRequest
        .builder()
        .apiKey("apiKey")
        .urls(
            Arrays.asList(
                BulkScreenshotCaptureRequestUrlsItem
                    .builder()
                    .url("url")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkScreenshotCaptureRequestFormat>` 
    
</dd>
</dl>

<dl>
<dd>

**urls:** `List<BulkScreenshotCaptureRequestUrlsItem>` — List of website URLs to capture screenshots of
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyLatestRates() -> CurrencyLatestRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get live forex rates for all world currencies with customizable update frequency
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyLatestRates(
    CurrencyLatestRatesRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyLatestRatesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional<String>` — Base currency for rate calculations
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma separated list of desired currency codes
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional<CurrencyLatestRatesRequestUpdates>` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyHistoricalRates() -> CurrencyHistoricalRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get historical exchange rates for any specific date
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyHistoricalRates(
    CurrencyHistoricalRatesRequest
        .builder()
        .apiKey("apiKey")
        .date("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyHistoricalRatesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional<String>` — Base currency for rate calculations
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma separated list of desired currency codes
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Specific date in YYYY-MM-DD format
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertLatest() -> CurrencyConvertLatestResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert amount between currencies using the latest exchange rates
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyConvertLatest(
    CurrencyConvertLatestRequest
        .builder()
        .apiKey("apiKey")
        .from("from")
        .to("to")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyConvertLatestRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — Source currency code
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — Target currency code
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Double>` — Amount to convert
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional<CurrencyConvertLatestRequestUpdates>` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertHistorical() -> CurrencyConvertHistoricalResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert amount between currencies using historical rates
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyConvertHistorical(
    CurrencyConvertHistoricalRequest
        .builder()
        .apiKey("apiKey")
        .from("from")
        .to("to")
        .date("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyConvertHistoricalRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — From currency symbol
    
</dd>
</dl>

<dl>
<dd>

**to:** `String` — To currency symbol
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Double>` — The Amount to be converted
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — specific date (format YYYY-MM-DD) of which exchange rates is used.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyTimeSeries() -> CurrencyTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get exchange rates for a time range
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyTimeSeries(
    CurrencyTimeSeriesRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyTimeSeriesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (format YYYY-MM-DD) of the preferred time frame
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — End date (format YYYY-MM-DD) of the preferred time frame
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional<String>` — Base currency
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — comma separated list of desired currencies/ commodities symbols
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyFluctuation() -> CurrencyFluctuationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get currency fluctuation data for a time period
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyFluctuation(
    CurrencyFluctuationRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .base("USD")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyFluctuationRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (format YYYY-MM-DD) of the preferred time frame
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — End date (format YYYY-MM-DD) of the preferred time frame
    
</dd>
</dl>

<dl>
<dd>

**base:** `Optional<String>` — Base currency
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — comma separated list of desired currencies/ commodities symbols
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyConvertByIp() -> CurrencyConvertByIpResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Convert amount using user's location
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyConvertByIp(
    CurrencyConvertByIpRequest
        .builder()
        .apiKey("apiKey")
        .from("from")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyConvertByIpRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**updates:** `Optional<CurrencyConvertByIpRequestUpdates>` — Exchange rates update period (1d=daily, 1h=hourly, 10m=10 minutes, 1m=1 minute)
    
</dd>
</dl>

<dl>
<dd>

**from:** `String` — From currency symbol
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4 or IPv6 geolocated currency
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Double>` — Amount to convert
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencySupported() -> CurrencySupportedResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of all supported currencies with their metadata
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencySupported(
    CurrencySupportedRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencySupportedRequestFormat>` — Format of the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencySymbols() -> CurrencySymbolsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get currency symbols and codes
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencySymbols(
    CurrencySymbolsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencySymbolsRequestFormat>` — Format of the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currencyHistoricalLimits() -> CurrencyHistoricalLimitsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get information about historical data availability and limits
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currencyHistoricalLimits(
    CurrencyHistoricalLimitsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrencyHistoricalLimitsRequestFormat>` — Format of the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityLatestRates() -> CommodityLatestRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get live commodity rates with customizable update frequency
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityLatestRates(
    CommodityLatestRatesRequest
        .builder()
        .apiKey("apiKey")
        .updates(CommodityLatestRatesRequestUpdates.TEN_M)
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityLatestRatesRequestFormat>` — Format of the Response
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma separated list of desired commodities symbols *(e.g. XAU,XAG,WTI,BRENT)* **Required**
    
</dd>
</dl>

<dl>
<dd>

**updates:** `CommodityLatestRatesRequestUpdates` — Exchange rates update period. Possible values are: (1) `10m` - 10 minute update (2) `1m` - 1 minute update **Required**
    
</dd>
</dl>

<dl>
<dd>

**quote:** `Optional<String>` — Specifies the target currency for the exchange rate; default quote currency is the market currency of commodity *(e.g. USD, EUR, INR)*
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityHistoricalRates() -> CommodityHistoricalRatesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get historical commodity rates for a specific date
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityHistoricalRates(
    CommodityHistoricalRatesRequest
        .builder()
        .apiKey("apiKey")
        .date("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityHistoricalRatesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Historical date (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityFluctuation() -> CommodityFluctuationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get commodity price fluctuation data for a time period
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityFluctuation(
    CommodityFluctuationRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityFluctuationRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commodityTimeSeries() -> CommodityTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get commodity rates for a time range
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commodityTimeSeries(
    CommodityTimeSeriesRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .symbols(
            Arrays.asList("symbols")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommodityTimeSeriesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**symbols:** `Optional<String>` — Comma-separated list of commodity symbols
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Start date (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date (YYYY-MM-DD)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.commoditySymbols() -> CommoditySymbolsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of supported commodities
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.commoditySymbols(
    CommoditySymbolsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CommoditySymbolsRequestFormat>` — Format of the response.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vatSupportedCountries() -> VatSupportedCountriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves a list of supported countries.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vatSupportedCountries(
    VatSupportedCountriesRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<VatSupportedCountriesRequestFormat>` — Format of the response. Default is JSON.
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<VatSupportedCountriesRequestType>` — Which list to return: VAT (`VAT_Supported_Countries_And_States`), IBAN (`IBAN_Supported_Countries`) or SWIFT (`SWIFT_Supported_Countries`). Each value returns only its own list. If omitted (or unknown), all three lists are returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vatRateByIp() -> List&amp;lt;VatRateByIpResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches VAT rate based on the specified or originating IP address.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vatRateByIp(
    VatRateByIpRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<VatRateByIpRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**ipAddress:** `Optional<String>` — IPv4 or IPv6 address to look up VAT rate for. If omitted, the originating IP address will be used.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vatRateByCountry() -> List&amp;lt;VatRateByCountryResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches VAT rates for a single country or state provided via query parameters.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vatRateByCountry(
    VatRateByCountryRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<VatRateByCountryRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country identifier in Alpha-2 (PK), Alpha-3 (PAK), or full name (Pakistan). Combine with the optional "state" query for sub-national VAT; values are case-insensitive and may use underscores instead of spaces.
    
</dd>
</dl>

<dl>
<dd>

**state:** `Optional<String>` — Optional state or region in Alpha-2 (NY) or full name (New_York). Use with "country" for state-level VAT; values are case-insensitive and may use underscores.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkVatRateByCountry(request) -> List&amp;lt;BulkVatRateByCountryResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieves VAT details for multiple countries or country-state combinations in a single request. Maximum of `100` entries per request are allowed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkVatRateByCountry(
    BulkVatRateByCountryRequest
        .builder()
        .apiKey("apiKey")
        .countries(
            Arrays.asList(
                BulkVatRateByCountryRequestCountriesItem
                    .builder()
                    .country("PAK")
                    .build(),
                BulkVatRateByCountryRequestCountriesItem
                    .builder()
                    .country("United_States")
                    .state("New_York")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkVatRateByCountryRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**countries:** `List<BulkVatRateByCountryRequestCountriesItem>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.vatValidate() -> VatValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Validates an EU or UK VAT number and returns registration status details.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.vatValidate(
    VatValidateRequest
        .builder()
        .apiKey("apiKey")
        .vatNumber("vatNumber")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<VatValidateRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**vatNumber:** `String` — EU or UK VAT number to validate.
    
</dd>
</dl>

<dl>
<dd>

**requesterVatNumber:** `Optional<String>` — Requester EU or UK VAT number.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.ibanValidate() -> IbanValidateResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Checks an IBAN for structural validity, checksum accuracy, and bank metadata.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ibanValidate(
    IbanValidateRequest
        .builder()
        .apiKey("apiKey")
        .iban("iban")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<IbanValidateRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**iban:** `String` — IBAN to validate.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.swiftCodeFind() -> List&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches SWIFT codes for a given country, bank, and city.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.swiftCodeFind(
    SwiftCodeFindRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<SwiftCodeFindRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country name (accepts full name, e.g., Pakistan, United States). If only the country parameter is supplied, lists all banks in the country.
    
</dd>
</dl>

<dl>
<dd>

**bank:** `Optional<String>` — Bank name (upper case) used to filter SWIFT codes. Should be used together with the country parameter. If only country and bank are provided (without city), returns the list of cities for that bank.
    
</dd>
</dl>

<dl>
<dd>

**city:** `Optional<String>` — Gives SWIFT codes for a bank. Optionally specify the city (upper case) to narrow results to a specific city for that bank.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.swiftCodeLookup() -> SwiftCodeLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Fetches detailed information about a SWIFT code.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.swiftCodeLookup(
    SwiftCodeLookupRequest
        .builder()
        .apiKey("apiKey")
        .swiftCode("swiftCode")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<SwiftCodeLookupRequestFormat>` — Specify the desired response format. Options: 'json' (default) or 'xml'.
    
</dd>
</dl>

<dl>
<dd>

**swiftCode:** `String` — SWIFT/BIC code to lookup (must be 8 or 11 characters).
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.zipcodeLookup() -> ZipcodeLookupResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeLookup(
    ZipcodeLookupRequest
        .builder()
        .apiKey("apiKey")
        .code("code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**code:** `String` — Comma separated list of postal / zip codes. Max. 100 values.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country code in ISO 3166-1 alpha-2 format. If not provided, search results will be returned from all countries.
    
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

<dl>
<dd>

Validates a bulk of ZIP/postal codes and returns result for each. Maximum `100` ZIP/postal codes per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkZipcodeLookup(
    BulkZipcodeLookupRequest
        .builder()
        .apiKey("apiKey")
        .codes(
            Arrays.asList("codes")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkZipcodeLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**codes:** `List<String>` — Comma separated list of postal / zip codes. Max. 100 values.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country code in ISO 3166-1 alpha-2 format. If not provided, search results will be returned from all countries.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.zipcodeSearchByCity() -> ZipcodeSearchByCityResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeSearchByCity(
    ZipcodeSearchByCityRequest
        .builder()
        .apiKey("apiKey")
        .city("city")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeSearchByCityRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**city:** `String` — Name of the city in which we want to find zipcodes in.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**stateName:** `Optional<String>` — Name of the state or province associated with the country.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page number to retrieve paginated results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.zipcodeSearchByRegion() -> ZipcodeSearchByRegionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeSearchByRegion(
    ZipcodeSearchByRegionRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeSearchByRegionRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Name of the region, state or province associated with the country. Either region or region_code is required; region_code takes priority if both are given.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page no. to retrieve paginated results.
    
</dd>
</dl>

<dl>
<dd>

**regionCode:** `Optional<String>` — ISO code of the region, state, or province associated with the country. Either region or region_code is required. region_code takes priority if both are given.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.zipcodeSearchByRadius() -> ZipcodeSearchByRadiusResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeSearchByRadius(
    ZipcodeSearchByRadiusRequest
        .builder()
        .apiKey("apiKey")
        .radius(1.1f)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeSearchByRadiusRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**code:** `Optional<String>` — Postal/Zip code to be used as the center point for the search.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Float>` — Latitude coordinate for the base location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Float>` — Longitude coordinate for the base location.
    
</dd>
</dl>

<dl>
<dd>

**country:** `Optional<String>` — Country code in ISO 3166-1 alpha-2 format. Required only when using the code parameter.
    
</dd>
</dl>

<dl>
<dd>

**radius:** `Float` — Search radius for the query. The maximum allowed values are: - 100 km - 100 mi - 109361 yd - 100000 m - 328084 ft - 3937007.75 in
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional<ZipcodeSearchByRadiusRequestUnit>` — Supported distance units are m, km, mi, ft, yd, in.
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` — Page no. to retrieve paginated results.
    
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

<dl>
<dd>

Get distance between postal codes. Maximum `100` postal codes per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeDistance(
    ZipcodeDistanceRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .compare(
            Arrays.asList("compare")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeDistanceRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**compare:** `List<String>` — Comma separated list of postal / zip codes with which base point is compared w.r.t. Max 100 zip codes can be provided.
    
</dd>
</dl>

<dl>
<dd>

**code:** `Optional<String>` — Postal/Zip code to be used as the base point.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude coordinate for the base location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude coordinate for the base location.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional<ZipcodeDistanceRequestUnit>` — Supported distance units are m, km, mi, ft, yd, in.
    
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

<dl>
<dd>

Get matching ZIP/postal code pairs within a specified distance. Maximum `100` postal codes per request.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.zipcodeDistanceMatch(
    ZipcodeDistanceMatchRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .codes(
            Arrays.asList("codes")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<ZipcodeDistanceMatchRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**codes:** `List<String>` — Comma-separated list of postal/zip codes. Maximum 100 values allowed.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**distance:** `Optional<Float>` — Maximum allowed distance between postal code pairs.
    
</dd>
</dl>

<dl>
<dd>

**unit:** `Optional<ZipcodeDistanceMatchRequestUnit>` — Supported distance units are m, km, mi, ft, yd, in.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.currentWeather() -> CurrentWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get current weather data including temperature, humidity, precipitation, wind conditions, atmospheric pressure, and air quality for any location. Accepts city names, coordinates, or IP addresses. Also includes astronomy data and timezone-aware timestamps.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.currentWeather(
    CurrentWeatherRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<CurrentWeatherRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
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

<dl>
<dd>

Retrieve current weather conditions for up to `50 locations` in a single request. A maximum of 50 locations (city names, IP addresses, or geographic coordinates) can be included in the request body.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkCurrentWeather(
    BulkCurrentWeatherRequest
        .builder()
        .apiKey("apiKey")
        .locations(
            Arrays.asList(
                BulkCurrentWeatherRequestLocationsItem
                    .builder()
                    .location("lahore")
                    .build(),
                BulkCurrentWeatherRequestLocationsItem
                    .builder()
                    .lat(32.5)
                    .long_(74.5)
                    .build(),
                BulkCurrentWeatherRequestLocationsItem
                    .builder()
                    .ip("8.8.8.8")
                    .build(),
                BulkCurrentWeatherRequestLocationsItem
                    .builder()
                    .location("seoul")
                    .build()
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkCurrentWeatherRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>

<dl>
<dd>

**locations:** `List<BulkCurrentWeatherRequestLocationsItem>` — Array of locations to fetch weather data for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.weatherForecast() -> WeatherForecastResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Access comprehensive weather forecasts with customizable precision - choose from daily overviews, hourly breakdowns, or even minute-by-minute data. Configure your date ranges or use the default 7-day forecast for standard weather planning.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.weatherForecast(
    WeatherForecastRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<WeatherForecastRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<String>` — Start date for the forecast in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between startDate and endDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — End date for the forecast in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between startDate and endDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**forecastDays:** `Optional<Integer>` — Number of days for the forecast, from 1 to 16. Default is 7. Maximum value is 16.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<WeatherForecastRequestPrecision>` — Precision of the forecast data.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.historicalWeather() -> HistoricalWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Access past weather conditions for specific dates with records going back to 1940. Retrieve comprehensive historical data with both daily and hourly precision options.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.historicalWeather(
    HistoricalWeatherRequest
        .builder()
        .apiKey("apiKey")
        .date("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<HistoricalWeatherRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**date:** `String` — Specific date for which to fetch weather data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<HistoricalWeatherRequestPrecision>` — Precision of the historical data. **Note:** 'daily' returns daily aggregates, 'hourly' returns hourly data.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.weatherTimeSeries() -> WeatherTimeSeriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Pull historical weather information for date ranges up to 90 days (daily data) or 7 days (hourly data). Get consistent formatting across your specified date range with reliable historical weather patterns.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.weatherTimeSeries(
    WeatherTimeSeriesRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<WeatherTimeSeriesRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Starting date for the data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards. For precision=daily, the difference between endDate and startDate must not exceed 90 days. For precision=hourly, the difference must not exceed 7 days.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date for the data in YYYY-MM-DD format. Historical dates must be past dates only. Current or future dates are not allowed for historical data. Data available from 1940 onwards. For precision=daily, the difference between endDate and startDate must not exceed 90 days. For precision=hourly, the difference must not exceed 7 days.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<WeatherTimeSeriesRequestPrecision>` — Precision of the data.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.marineWeather() -> MarineWeatherResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Provides hourly forecasts of marine conditions including wave heights, wave directions, wave periods, swell info, sea surface temperatures, and ocean currents. Supports multiple geographical points and returns daily max wave statistics for up to 7 days. Ideal for maritime planning, navigation, and coastal activities.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.marineWeather(
    MarineWeatherRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<MarineWeatherRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<String>` — Starting date for marine forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — End date for marine forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<MarineWeatherRequestPrecision>` — Precision of the marine data.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.airQuality() -> AirQualityResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Monitor and predict air quality conditions using European and US AQI standards. Track pollutant concentrations including PM10, PM2.5, carbon monoxide, nitrogen dioxide, sulfur dioxide, ozone, and dust particles. Get current readings plus hourly forecasts up to 5 days ahead, complete with UV index and aerosol measurements for comprehensive air quality assessment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.airQuality(
    AirQualityRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<AirQualityRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<String>` — Starting date for AQI forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 5 days.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<String>` — End date for AQI forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 5 days.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<AirQualityRequestPrecision>` — Only hourly precision is supported; returns hourly AQI data for the selected date range.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.floodForecast() -> FloodForecastResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Provides flood forecast data for a given location, including river discharge metrics such as mean, median, maximum, minimum, and percentile values (p25, p75). Requires a startDate and endDate, with the date range limited to 16 days. Location can be specified using city name, latitude/longitude, or IP address.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.floodForecast(
    FloodForecastRequest
        .builder()
        .apiKey("apiKey")
        .startDate("2023-01-15")
        .endDate("2023-01-15")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<FloodForecastRequestFormat>` — Response format returned by the API. Only JSON is supported.
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `String` — Starting date for flood forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `String` — End date for flood forecast data in YYYY-MM-DD format. Forecast dates must be current or future dates only. Past dates are not allowed for forecast data. The difference between endDate and startDate must not exceed 16 days.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — City name, place name, or full address.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Double>` — Latitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Double>` — Longitude of the location.
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP(v4 or v6) address for location inference.
    
</dd>
</dl>

<dl>
<dd>

**precision:** `Optional<FloodForecastRequestPrecision>` — Only daily precision is supported; returns flood forecast data for the selected date range.
    
</dd>
</dl>

<dl>
<dd>

**timezone:** `Optional<String>` — Timezone for the results.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getCountries() -> GetCountriesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve countries, optionally filtered by region or subregion.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getCountries(
    GetCountriesRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetCountriesRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Optional filter to return countries within a specific region from the region endpoint.
    
</dd>
</dl>

<dl>
<dd>

**subregion:** `Optional<String>` — Optional filter to return countries within a specific subregion from the subregion endpoint.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getCountryDetails() -> GetCountryDetailsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getCountryDetails(
    GetCountryDetailsRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetCountryDetailsRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getRegions() -> GetRegionsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getRegions(
    GetRegionsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetRegionsRequestFormat>` — Format of the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getSubregions() -> GetSubregionsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getSubregions(
    GetSubregionsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetSubregionsRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**region:** `Optional<String>` — Name of the region. If omitted, all subregions are returned.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getAdminLevels() -> GetAdminLevelsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve administrative units based on ISO 3166-1 alpha-2 country code.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getAdminLevels(
    GetAdminLevelsRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetAdminLevelsRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getAdminUnits() -> GetAdminUnitsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve administrative divisions for a given country using ISO 3166-1 alpha-2 country codes. You can optionally filter by administrative levels.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getAdminUnits(
    GetAdminUnitsRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetAdminUnitsRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**adminLevel:** `Optional<String>` — Filter results by one or more administrative level names (e.g. `land`, `state`, `province`), sent as a comma-separated list. Use the admin levels endpoint to list the levels a country has.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getAdminUnitDetails() -> GetAdminUnitDetailsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve detailed administrative unit information by country and optionally filtered by admin code.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getAdminUnitDetails(
    GetAdminUnitDetailsRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .adminUnit("admin_unit")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetAdminUnitDetailsRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**adminUnit:** `String` — Optional admin code to fetch details for a specific administrative unit.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getCities() -> GetCitiesResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve a list of cities within a country, optionally filtered by an administrative unit code.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getCities(
    GetCitiesRequest
        .builder()
        .apiKey("apiKey")
        .country("country")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetCitiesRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**country:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**adminUnit:** `Optional<String>` — Administrative unit code used to filter cities within a specific region.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getSupportedFlags() -> GetSupportedFlagsResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Get list of all supported flags with their metadata
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getSupportedFlags(
    GetSupportedFlagsRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getFlags() -> InputStream</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve the flag for a specific country
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getFlags(
    GetFlagsRequest
        .builder()
        .apiKey("apiKey")
        .name("name")
        .shape(GetFlagsRequestShape.FLAT)
        .type(GetFlagsRequestType.COUNTRY)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — Country code in ISO 3166-1 alpha-2 format.
    
</dd>
</dl>

<dl>
<dd>

**shape:** `GetFlagsRequestShape` — Flag shape. One of: `'flat'` or `'round'`.
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetFlagsRequestFormat>` — Flag format. Applicable only for PNG or WEBP formats. Default is png.
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<GetFlagsRequestSize>` — Flag size in pixels. Valid options: `16px`, `24px`, `32px`, `48px`, `64px`. Applicable only for PNG or WEBP formats.
    
</dd>
</dl>

<dl>
<dd>

**type:** `GetFlagsRequestType` — Type of flag. One of: `country` or `organization`.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.timezoneLookup() -> TimezoneLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve current time, date, and timezone-related information by specifying a timezone name, location address, location coordinates, IP address, or use the client IP address if no parameter is passed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.timezoneLookup(
    TimezoneLookupRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<TimezoneLookupRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IPv4 or IPv6 address to extract timezone information.
    
</dd>
</dl>

<dl>
<dd>

**tz:** `Optional<String>` — Timezone name (e.g., "Asia/Kolkata") to retrieve information directly.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — Location string (preferably city and country) to extract timezone.
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Float>` — Latitude for geolocation lookup.
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Float>` — Longitude for geolocation lookup.
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<TimezoneLookupRequestLang>` — Language code for response localization (default is "en").
    
</dd>
</dl>

<dl>
<dd>

**iataCode:** `Optional<String>` — 3-letter IATA airport code (e.g., JFK).
    
</dd>
</dl>

<dl>
<dd>

**icaoCode:** `Optional<String>` — 4-letter ICAO airport code (e.g., KJFK).
    
</dd>
</dl>

<dl>
<dd>

**loCode:** `Optional<String>` — 5-letter UN/LO city code.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.timezoneConvert() -> TimezoneConvertResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Converts a given time from one timezone to another using various input types like timezone name, coordinates, location, or codes.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.timezoneConvert(
    TimezoneConvertRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<TimezoneConvertRequestFormat>` — Format of the response .
    
</dd>
</dl>

<dl>
<dd>

**time:** `Optional<String>` — Time to convert in `yyyy-MM-dd HH:mm` or `yyyy-MM-dd HH:mm:ss` format.
    
</dd>
</dl>

<dl>
<dd>

**tzFrom:** `Optional<String>` — Source timezone name (e.g., `Asia/Kolkata`).
    
</dd>
</dl>

<dl>
<dd>

**tzTo:** `Optional<String>` — Target timezone name (e.g., `America/New_York`).
    
</dd>
</dl>

<dl>
<dd>

**latFrom:** `Optional<Double>` — Latitude of source location.
    
</dd>
</dl>

<dl>
<dd>

**longFrom:** `Optional<Double>` — Longitude of source location.
    
</dd>
</dl>

<dl>
<dd>

**latTo:** `Optional<Double>` — Latitude of target location.
    
</dd>
</dl>

<dl>
<dd>

**longTo:** `Optional<Double>` — Longitude of target location.
    
</dd>
</dl>

<dl>
<dd>

**locationFrom:** `Optional<String>` — From location (city/country).
    
</dd>
</dl>

<dl>
<dd>

**locationTo:** `Optional<String>` — To location (city/country).
    
</dd>
</dl>

<dl>
<dd>

**iataFrom:** `Optional<String>` — From IATA airport code (e.g., JFK).
    
</dd>
</dl>

<dl>
<dd>

**iataTo:** `Optional<String>` — To IATA airport code.
    
</dd>
</dl>

<dl>
<dd>

**icaoFrom:** `Optional<String>` — From ICAO airport code (e.g., KJFK).
    
</dd>
</dl>

<dl>
<dd>

**icaoTo:** `Optional<String>` — To ICAO airport code.
    
</dd>
</dl>

<dl>
<dd>

**locodeFrom:** `Optional<String>` — From UN/LO CODE.
    
</dd>
</dl>

<dl>
<dd>

**locodeTo:** `Optional<String>` — To UN/LO CODE.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.userAgentLookup() -> UserAgentLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Parse User Agent string to get detailed browser, device, and operating system information
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.userAgentLookup(
    UserAgentLookupRequest
        .builder()
        .apiKey("apiKey")
        .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**userAgent:** `String` — The User-Agent string to parse, sent as the `User-Agent` HTTP header.
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<UserAgentLookupRequestFormat>` — Format of the response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.bulkUserAgentLookup(request) -> List&amp;lt;BulkUserAgentLookupResponseItem&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Parse up to `20000 User-Agent strings` at once in a single request; exceeding that returns a 413, not a 400.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.bulkUserAgentLookup(
    BulkUserAgentLookupRequest
        .builder()
        .apiKey("apiKey")
        .uaStrings(
            Arrays.asList("uaStrings")
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<BulkUserAgentLookupRequestFormat>` — Format of the response
    
</dd>
</dl>

<dl>
<dd>

**uaStrings:** `List<String>` — Array of User-Agent strings to parse. Maximum 20000 strings per request — exceeding that returns a 413.
    
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

<dl>
<dd>

Perform Optical Character Recognition (OCR) on images, PDFs, or ZIP archives. Supports two models: `mini-ocr-v1` for CAPTCHA-optimized OCR and `ocr-v1` for general-purpose document text extraction. Supports zonal OCR to extract text from specific regions of an image.

**Notes:**
- The `zone` query parameter cannot be given with .pdf and .zip types as it can only be applied to single image query.
- The `page_range` query parameter cannot be given in any other type except .pdf types.
- PDFs containing images in them are allowed only for processing.
- The `mini-ocr-v1` model doesn’t support the following query parameters:
    - `page_range` (.pdf types)
    - `zone`
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.ocrPredict(
    Optional.of(new File("image.png")),
    OcrPredictRequest
        .builder()
        .apiKey("apiKey")
        .model(OcrPredictRequestModel.MINI_OCR_V1)
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**model:** `OcrPredictRequestModel` — OCR model to use. `mini-ocr-v1` for CAPTCHA OCR, `ocr-v1` for general OCR.
    
</dd>
</dl>

<dl>
<dd>

**url:** `Optional<String>` — URL of the image or PDF (required if `file` is not uploaded).
    
</dd>
</dl>

<dl>
<dd>

**pageRange:** `Optional<String>` — Specify page range for multi-page PDFs (e.g., '1,3,5-10' or 'allpages'). **Note:** This parameter can only be used with .pdf file types.
    
</dd>
</dl>

<dl>
<dd>

**zone:** `Optional<String>` — Define OCR zones using coordinates (top:left:height:width). Multiple zones can be defined using commas. Only available for model 'ocr-v1'. **Note:** This parameter cannot be used with .pdf and .zip file types as it can only be applied to single image queries.
    
</dd>
</dl>

<dl>
<dd>

**newLine:** `Optional<Integer>` — Set to 1 to split output text into individual lines (default: 0). This changes the shape of `OCRText` (see the response).
    
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

<dl>
<dd>

Analyze text for grammar errors and return the exact words flagged as grammatically incorrect with zero-based word positions.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.grammarDetect(
    GrammarDetectRequest
        .builder()
        .apiKey("apiKey")
        .text("The global mental is health crisis is now a serious and compelex problem. It need quick and ongoing action from policymakers, healthcare workers, and the whole society.")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for grammar errors
    
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

<dl>
<dd>

Submit text with grammatical issues and receive a clean grammar-corrected result for proofreading and content workflows.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.grammarCorrect(
    GrammarCorrectRequest
        .builder()
        .apiKey("apiKey")
        .text("The global mental is health crisis is now a serious and compelex problem. It need quick and ongoing action from policymakers, healthcare workers, and the whole society.")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to correct
    
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

<dl>
<dd>

Analyze text and return weak, vague, or filler words with zero-based word positions to help writers produce clearer and more concise content.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.weakWordsDetect(
    WeakWordsDetectRequest
        .builder()
        .apiKey("apiKey")
        .text("Many people cannot get the support they need to handle their conditions well.")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for weak words
    
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

<dl>
<dd>

Analyze text readability using industry-standard formulas including Flesch Reading Ease, Flesch-Kincaid Grade Level, Gunning Fog Index, SMOG Index, Coleman-Liau Index, and Automated Readability Index.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.readabilityScore(
    ReadabilityScoreRequest
        .builder()
        .apiKey("apiKey")
        .text("The global mental is health crisis is now a serious and compelex problem. It needs quick and ongoing action from policymakers, healthcare workers, and the whole society.")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**target:** `Optional<ReadabilityScoreRequestTarget>` — Target audience used to tune sentence difficulty levels
    
</dd>
</dl>

<dl>
<dd>

**exclude:** `Optional<String>` — Comma-separated response sections to omit. Possible values are readability_scores, sentence_readability, readability_grade
    
</dd>
</dl>

<dl>
<dd>

**text:** `String` — Text to analyze for readability
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.astronomyLookup() -> AstronomyLookupResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve sunrise and sunset times, current position of the moon, and other related information by specifying a location address, location coordinates, IP address, or using the client IP address if no parameter is passed.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.astronomyLookup(
    AstronomyLookupRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<AstronomyLookupRequestFormat>` — Format of the response.
    
</dd>
</dl>

<dl>
<dd>

**location:** `Optional<String>` — Location name or address
    
</dd>
</dl>

<dl>
<dd>

**lat:** `Optional<Float>` — Latitude for location coordinates
    
</dd>
</dl>

<dl>
<dd>

**long_:** `Optional<Float>` — Longitude for location coordinates
    
</dd>
</dl>

<dl>
<dd>

**ip:** `Optional<String>` — IP address for location detection
    
</dd>
</dl>

<dl>
<dd>

**lang:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**date:** `Optional<String>` — Date for astronomy data (YYYY-MM-DD)
    
</dd>
</dl>

<dl>
<dd>

**elevation:** `Optional<Double>` — Timezone of the location for which astronomy data is required
    
</dd>
</dl>

<dl>
<dd>

**timeZone:** `Optional<String>` — 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.getCreditsUsage() -> GetCreditsUsageResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns subscription, subscription-surcharge, and one-off credit balances for the authenticated organization's account.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.getCreditsUsage(
    GetCreditsUsageRequest
        .builder()
        .apiKey("apiKey")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**apiKey:** `String` — Your API key
    
</dd>
</dl>

<dl>
<dd>

**format:** `Optional<GetCreditsUsageRequestFormat>` — Format of the response. Possible values: json, xml.
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

