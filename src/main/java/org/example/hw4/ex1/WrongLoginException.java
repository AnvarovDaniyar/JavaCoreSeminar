package org.example.hw4.ex1;
class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}