package org.davshaw.livechat.exception;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message != null ? message : "Forbidden");
    }
}