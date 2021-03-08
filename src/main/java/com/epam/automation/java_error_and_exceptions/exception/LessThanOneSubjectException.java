package com.epam.automation.java_error_and_exceptions.exception;

public class LessThanOneSubjectException extends Exception {
    public LessThanOneSubjectException() {
        super();
    }

    public LessThanOneSubjectException(String message) {
        super(message);
    }

    public LessThanOneSubjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public LessThanOneSubjectException(Throwable cause) {
        super(cause);
    }
}
