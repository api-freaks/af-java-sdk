/**
 * This file was added by af-sdk-generation/scripts/lib/fix_java_deserialization_errors.py.
 */

package com.apifreaks.sdk.core;

import java.lang.String;
import java.lang.Throwable;
import okhttp3.Response;

/**
 * Thrown when the API returned a successful (2xx) response whose body could not be
 * deserialized into the SDK's response type. {@link #statusCode()} and {@link #body()}
 * (the raw response text) describe the response; {@link #getCause()} is the parser error.
 */
public class ApifreaksApiDeserializationException extends ApifreaksApiApiException {
  public ApifreaksApiDeserializationException(Response rawResponse, String responseBody,
      Throwable cause) {
    super("Failed to deserialize the HTTP " + rawResponse.code() + " response body: "
        + cause.getMessage(), rawResponse.code(), responseBody, rawResponse);
    initCause(cause);
  }
}
