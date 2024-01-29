package com.example.departmentservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="department")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@SequenceGenerator(name="department_seq", allocationSize=10)
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,
            generator="department_seq")
    private Long id;
    @Column(name="departmentName")
    private String departmentName;
    @Column(name="departmentAddress")
    private String departmentAddress;
    @Column(name="departmentCode")
    private String departmentCode;
}
