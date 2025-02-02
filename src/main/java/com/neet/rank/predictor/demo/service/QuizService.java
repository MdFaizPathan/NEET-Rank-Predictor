package com.neet.rank.predictor.demo.service;

import com.neet.rank.predictor.demo.model.*;
import com.neet.rank.predictor.demo.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuizService {
    private final CurrentQuizRepository currentQuizRepository;
    private final HistoricalQuizRepository historicalQuizRepository;

    public QuizService(CurrentQuizRepository currentQuizRepository, HistoricalQuizRepository historicalQuizRepository) {
        this.currentQuizRepository = currentQuizRepository;
        this.historicalQuizRepository = historicalQuizRepository;
    }

    public CurrentQuizData submitQuiz(Long studentId, CurrentQuizData quizData) {
        quizData.setStudentId(studentId);
        return currentQuizRepository.save(quizData);
    }

    public List<HistoricalQuizData> getPastPerformance(Long studentId) {
        return historicalQuizRepository.findByStudentId(studentId);
    }
    public CurrentQuizData getLatestQuiz(Long studentId) {
        return currentQuizRepository.findByStudentId(studentId).orElse(null);
    }
    public HistoricalQuizData submitHistoricalQuiz(Long studentId, HistoricalQuizData historyData) {
        historyData.setStudentId(studentId);
        return historicalQuizRepository.save(historyData);
    }
}





