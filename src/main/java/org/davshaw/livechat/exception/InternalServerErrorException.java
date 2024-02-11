package org.davshaw.livechat.exception;

public class InternalServerErrorException extends RuntimeException {
    public InternalServerErrorException(String message) {
        super(message != null ? message : "Internal Server Error");
    }
}