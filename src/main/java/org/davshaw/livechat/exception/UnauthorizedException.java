package org.davshaw.livechat.exception;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message != null ? message : "Unauthorized");
    }
}