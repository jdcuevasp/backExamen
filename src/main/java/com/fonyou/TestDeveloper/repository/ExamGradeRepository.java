package com.fonyou.TestDeveloper.repository;

import com.fonyou.TestDeveloper.model.ExamGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamGradeRepository extends JpaRepository<ExamGrade, Long> {
}
