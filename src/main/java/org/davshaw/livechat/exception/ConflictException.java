package org.davshaw.livechat.exception;

public class ConflictException extends RuntimeException {
    public ConflictException(String message) {
        super(message != null ? message : "Conflict");
    }
}