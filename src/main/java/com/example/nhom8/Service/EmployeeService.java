package com.example.nhom8.Service;

import com.example.nhom8.Dto.EmployeeDto;
import com.example.nhom8.Dto.LoginDTO;
import com.example.nhom8.response.LoginResponse;
import org.springframework.stereotype.Service;

public interface EmployeeService {

    public String addEmployee(EmployeeDto employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
