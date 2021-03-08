package com.epam.automation.java_error_and_exceptions.exception;

public class LackOfGroupsInTheFacultyException extends Exception{
    public LackOfGroupsInTheFacultyException() {
        super();
    }

    public LackOfGroupsInTheFacultyException(String message) {
        super(message);
    }

    public LackOfGroupsInTheFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfGroupsInTheFacultyException(Throwable cause) {
        super(cause);
    }
}
