package com.neet.rank.predictor.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class RankPredictor {
    public static int predictRank(double accuracy) {
        if (accuracy >= 90) return 500;
        if (accuracy >= 80) return 2000;
        if (accuracy >= 70) return 5000;
        return 10000;
    }

    public Map<String, Object> predictStudentRank(Long studentId) {
        Map<String, Object> rankData = new HashMap<>();
        rankData.put("predictedRank", 1500); // Example rank calculation logic
        return rankData;
    }
}
