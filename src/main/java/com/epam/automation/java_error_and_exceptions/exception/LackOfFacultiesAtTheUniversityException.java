package com.epam.automation.java_error_and_exceptions.exception;

public class LackOfFacultiesAtTheUniversityException extends Exception{
    public LackOfFacultiesAtTheUniversityException() {
        super();
    }

    public LackOfFacultiesAtTheUniversityException(String message) {
        super(message);
    }

    public LackOfFacultiesAtTheUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfFacultiesAtTheUniversityException(Throwable cause) {
        super(cause);
    }
}
