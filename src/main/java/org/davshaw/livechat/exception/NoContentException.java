package org.davshaw.livechat.exception;

public class NoContentException extends RuntimeException {
    public NoContentException(String message) {
        super(message != null ? message : "No Content");
    }
}