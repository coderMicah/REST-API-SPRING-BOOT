package com.micah.rest.webservices.exception;

import java.time.LocalDate;

public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDate timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    // Getter for 'timestamp'
    public LocalDate getTimestamp() {
        return timestamp;
    }

    // Setter for 'timestamp'
    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    // Getter for 'message'
    public String getMessage() {
        return message;
    }

    // Setter for 'message'
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for 'details'
    public String getDetails() {
        return details;
    }

    // Setter for 'details'
    public void setDetails(String details) {
        this.details = details;
    }

    // toString method
    @Override
    public String toString() {
        return "ErrorDetails{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
