package ru.mirea.task29;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}

