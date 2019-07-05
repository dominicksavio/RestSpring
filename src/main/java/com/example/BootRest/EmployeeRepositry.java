package com.example.BootRest;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepositry extends JpaRepository<Employee, Long> {

}
