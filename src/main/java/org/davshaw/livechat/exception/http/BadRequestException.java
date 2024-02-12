package org.davshaw.livechat.exception.http;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message != null ? message : "Bad Request");
    }
}