package com.epam.automation.java_error_and_exceptions.exception;

public class ScoreBelowZeroOrAboveTenException extends Exception {
    public ScoreBelowZeroOrAboveTenException() {
        super();
    }

    public ScoreBelowZeroOrAboveTenException(String message) {
        super(message);
    }

    public ScoreBelowZeroOrAboveTenException(String message, Throwable cause) {
        super(message, cause);
    }

    public ScoreBelowZeroOrAboveTenException(Throwable cause) {
        super(cause);
    }
}
