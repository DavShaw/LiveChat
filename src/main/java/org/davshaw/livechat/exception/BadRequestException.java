package org.davshaw.livechat.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message != null ? message : "Bad Request");
    }
}