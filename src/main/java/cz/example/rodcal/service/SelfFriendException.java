package cz.example.rodcal.service;

public class SelfFriendException extends RuntimeException {

    public SelfFriendException() {
        super("Cannot add self as friend.");
    }
}