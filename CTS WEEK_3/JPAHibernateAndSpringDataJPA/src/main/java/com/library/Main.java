package com.library;

import com.library.service.EmployeeService;
public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Aishwarya");
        emp.setDepartment("ECE");
        EmployeeService service=new EmployeeService();
        Integer id =service.addEmployee(emp);
        System.out.println("Employee saved with ID:"+id);

    }
}
