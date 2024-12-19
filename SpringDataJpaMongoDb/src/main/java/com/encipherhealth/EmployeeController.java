package com.encipherhealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/emp")
    public List<Employee> getEmp()
    {
        return employeeRepository.findAll();
    }

    @PostMapping("/emp")
    public Employee setEmp(@RequestBody Employee emp)
    {
        employeeRepository.save(emp);
        return emp;
    }
}
