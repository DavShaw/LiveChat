package org.davshaw.livechat.exception.http;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message != null ? message : "Unauthorized");
    }
}