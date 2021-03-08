package com.epam.automation.java_error_and_exceptions.exception;

public class LackOfStudentsInTheGroupException extends Exception{
    public LackOfStudentsInTheGroupException() {
    }

    public LackOfStudentsInTheGroupException(String message) {
        super(message);
    }

    public LackOfStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }
}
