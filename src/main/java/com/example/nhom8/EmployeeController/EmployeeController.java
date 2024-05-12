package com.example.nhom8.EmployeeController;

import com.example.nhom8.Dto.EmployeeDto;
import com.example.nhom8.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
}
