package vending.exceptions;

import vending.exceptions.ProductNotFoundException;

public class ChocolatesAllGoneException extends ProductNotFoundException {
    public ChocolatesAllGoneException(String message) {
        super(message);
    }
}