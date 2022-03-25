package com.fonyou.TestDeveloper.repository;

import com.fonyou.TestDeveloper.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {

}
