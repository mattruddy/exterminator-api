package com.exterminator.app.exception;

public enum ErrorMessage {

    ;

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }

}
