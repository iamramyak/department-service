package com.example.departmentservice.repository;

import com.example.departmentservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.annotation.Documented;

public interface DepartmentRepoistory extends JpaRepository<Department,Long> {
}
