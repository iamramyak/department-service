package com.example.departmentservice.service.service.impl;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.repository.DepartmentRepoistory;
import com.example.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepoistory departmentRepoistory;
    @Override
    public Department saveDepartment(Department department){
        return departmentRepoistory.save(department);
    }
    @Override
    public Department getDepartmentById(Long departmentId){
        return departmentRepoistory.findById(departmentId).get();
    }

}
