package com.library.service;

import com.library.entity.Employee;
import com.library.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public Employee addEmployee(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> getAll(){
        return  repository.findAll();
    }
}
