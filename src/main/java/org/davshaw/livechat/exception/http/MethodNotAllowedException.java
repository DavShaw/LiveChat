package org.davshaw.livechat.exception.http;

public class MethodNotAllowedException extends RuntimeException {
    public MethodNotAllowedException(String message) {
        super(message != null ? message : "Method Not Allowed");
    }
}