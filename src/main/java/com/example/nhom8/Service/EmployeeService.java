package com.example.nhom8.Service;

import com.example.nhom8.Dto.EmployeeDto;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    String addEmployee(EmployeeDto employeeDTO);
}
