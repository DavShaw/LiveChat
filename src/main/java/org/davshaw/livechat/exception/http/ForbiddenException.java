package org.davshaw.livechat.exception.http;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message != null ? message : "Forbidden");
    }
}