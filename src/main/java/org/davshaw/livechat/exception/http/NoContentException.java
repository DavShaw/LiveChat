package org.davshaw.livechat.exception.http;

public class NoContentException extends RuntimeException {
    public NoContentException(String message) {
        super(message != null ? message : "No Content");
    }
}