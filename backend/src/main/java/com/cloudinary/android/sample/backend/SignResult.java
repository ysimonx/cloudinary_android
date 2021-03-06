package com.cloudinary.android.sample.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class SignResult {
    private final String signature;
    private final String apiKey;
    private final long timestamp;

    public SignResult(String signature, String apiKey, long timestamp) {
        this.signature = signature;
        this.apiKey = apiKey;
        this.timestamp = timestamp;
    }

    public String getSignature() {
        return signature;
    }

    public String getApiKey() {
        return apiKey;
    }

    public long getTimestamp() {
        return timestamp;
    }
}