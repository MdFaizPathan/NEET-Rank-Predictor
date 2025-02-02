package com.neet.rank.predictor.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CollegePredictor {
    public static String predictCollege(int rank) {
        if (rank <= 500) return "AIIMS Delhi";
        if (rank <= 2000) return "JIPMER, Pondicherry";
        if (rank <= 5000) return "Kasturba Medical College";
        return "Private Medical College";
    }

}
