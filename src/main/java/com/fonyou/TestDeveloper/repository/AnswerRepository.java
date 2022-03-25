package com.fonyou.TestDeveloper.repository;

import com.fonyou.TestDeveloper.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    List<Answer> getByExamStudent(Long examStudent);
}

