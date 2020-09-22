package com.example.employeeserv.api;

import com.example.employeeserv.entity.Employee;

public interface EmployeeResource {

    Employee saveEmployee(Employee employee);
    Employee getEmployee(Integer employeeId);
}
