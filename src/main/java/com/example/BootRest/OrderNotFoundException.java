package com.example.BootRest;

public class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Could not find Order "+id);
    }
}
