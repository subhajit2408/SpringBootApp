package com.org.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {}
