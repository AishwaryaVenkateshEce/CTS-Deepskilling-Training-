package com.library.controller;

import com.library.entity.Employee;
import com.library.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private  EmployeeService service;
    @PostMapping("/add")
    public Employee add(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }
    @GetMapping("/all")
    public List<Employee> list(){
        return service.getAll();
    }
}
