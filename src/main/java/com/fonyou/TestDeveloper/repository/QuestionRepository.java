package com.fonyou.TestDeveloper.repository;

import com.fonyou.TestDeveloper.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    Question getByExam(Long aLong);
}
