package com.neet.rank.predictor.demo.repository;

import com.neet.rank.predictor.demo.model.HistoricalQuizData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricalQuizRepository extends JpaRepository<HistoricalQuizData, Long> {
    List<HistoricalQuizData> findByStudentId(Long studentId);
}
