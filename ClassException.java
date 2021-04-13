package com.exceptionspack;

public class ClassException extends Exception {
    exceptionType type;

    public ClassException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    enum exceptionType {

        given_null_input,
        given_empty_input;
    }

}
