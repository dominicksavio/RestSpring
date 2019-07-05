package com.example.BootRest;

class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(Long id) {
        super("Could not find emplyee "+id);
    }
}
