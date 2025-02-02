package com.neet.rank.predictor.demo.repository;

import com.neet.rank.predictor.demo.model.CurrentQuizData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CurrentQuizRepository  extends JpaRepository<CurrentQuizData, Long> {
    Optional<CurrentQuizData> findByStudentId(Long studentId);
}
