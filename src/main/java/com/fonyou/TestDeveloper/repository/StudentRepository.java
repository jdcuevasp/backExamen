package com.fonyou.TestDeveloper.repository;

import com.fonyou.TestDeveloper.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
