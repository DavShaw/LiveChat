package org.davshaw.livechat.exception.http;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message != null ? message : "Not Found");
    }
}