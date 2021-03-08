package com.epam.automation.java_error_and_exceptions;

public enum StudentSubject {

    MATH("Math"), LANGUAGE("Language"), ECONOMY("Economy"), CHEMISTRY("Chemistry");

    String value;

    StudentSubject(String value) {
        this.value = value;
    }
}
