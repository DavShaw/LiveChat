package org.davshaw.livechat.exception.http;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String message) {
        super(message != null ? message : "Internal Server Error");
    }
}