package com.bootcamp.smarthome.exception;

public class InvalidCommandException extends HomeAutomationException{
    public InvalidCommandException(String message){
        super(message);
    }
    public InvalidCommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
