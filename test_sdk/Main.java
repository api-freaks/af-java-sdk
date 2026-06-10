import requests.GeolocationLookupRequest;
import types.GeolocationLookupResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        ApifreaksApiClient client = ApifreaksApiClient.builder().build();

        GeolocationLookupRequest request = GeolocationLookupRequest.builder()
                .apiKey("YOUR_API_KEY")
                .ip("8.8.8.8")
                .build();

        GeolocationLookupResponse response = client.geolocationLookup(request);

        System.out.println(response);
    }
}