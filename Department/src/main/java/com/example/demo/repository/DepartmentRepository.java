package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.jpa.demo.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}

