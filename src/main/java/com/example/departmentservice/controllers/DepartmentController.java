package com.example.departmentservice.controllers;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
    private DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department saveDepartment= departmentService.saveDepartment(department);
        return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long departmentId){
        Department department= departmentService.getDepartmentById(departmentId);
        return ResponseEntity.ok(department);
    }
}
