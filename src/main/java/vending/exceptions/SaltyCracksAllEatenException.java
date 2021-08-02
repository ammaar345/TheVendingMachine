package vending.exceptions;
public class SaltyCracksAllEatenException extends ProductNotFoundException {
    public SaltyCracksAllEatenException(String message) {
        super(message);
    }
}