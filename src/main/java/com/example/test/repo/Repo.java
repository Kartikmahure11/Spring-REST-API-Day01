package com.example.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Student;

public interface Repo extends JpaRepository<Student,Integer>
{

}
