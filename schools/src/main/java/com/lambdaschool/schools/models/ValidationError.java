package com.lambdaschool.schools.models;

public class ValidationError {

    // string, variable, or column that caused the error
    private String code;

    // explains what the problem is
    private String message;

    public ValidationError() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
