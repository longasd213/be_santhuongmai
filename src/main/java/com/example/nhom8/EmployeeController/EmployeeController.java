package com.example.nhom8.EmployeeController;

import com.example.nhom8.Dto.EmployeeDto;
import com.example.nhom8.Dto.LoginDTO;
import com.example.nhom8.Entity.EmployeeEntity;
import com.example.nhom8.Repo.EmployeeRepo;
import com.example.nhom8.Service.EmployeeService;
import com.example.nhom8.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepo employeeRepo;
    @PostMapping(path = "/save")
    public ResponseEntity<?> saveEmployee(@RequestBody EmployeeDto employeeDTO)
    {
        EmployeeEntity existingEmployee = employeeRepo.findByEmail(employeeDTO.getEmail());
        if(existingEmployee!=null)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Email already exists");

        }else {

        String id = employeeService.addEmployee(employeeDTO);
        return ResponseEntity.ok(id);
    }}
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }
}
