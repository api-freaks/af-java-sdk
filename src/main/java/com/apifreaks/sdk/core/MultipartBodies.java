/**
 * This file was added by af-sdk-generation/scripts/lib/fix_java_empty_multipart.py.
 */

package com.apifreaks.sdk.core;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public final class MultipartBodies {
  private MultipartBodies() {
  }

  /**
   * Builds the multipart body, or an empty body (no content type) when no part was added,
   * e.g. when the file is referenced only by a {@code file_id} query parameter.
   * OkHttp's {@link MultipartBody.Builder#build()} refuses to build a body with zero parts.
   */
  public static RequestBody buildOrEmpty(MultipartBody.Builder builder) {
    try {
      return builder.build();
    }
    catch (IllegalStateException e) {
      return RequestBody.create(new byte[0], null);
    }
  }
}
