package com.neet.rank.predictor.demo.service;

import com.neet.rank.predictor.demo.model.CurrentQuizData;
import com.neet.rank.predictor.demo.model.HistoricalQuizData;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Service
public class PerformanceAnalyzer {
    public static String identifyWeakTopics(CurrentQuizData currentQuiz) {
        // Logic to find weak topics from quiz data
        return currentQuiz.getTopicsCovered().toString();  // Example placeholder
    }

    public static double calculateImprovementRate(HistoricalQuizData history) {
        // Simple trend analysis formula
        return history.getAverageScore() - history.getPastAccuracy();
    }
    public Map<String, Object> analyzeStudentPerformance(Long studentId) {
        Map<String, Object> performance = new HashMap<>();

        // Example analysis logic
        performance.put("weakTopics", "Physics, Chemistry");
        performance.put("improvementNeeded", "Focus on weak areas and practice more");

        return performance;
    }
}
