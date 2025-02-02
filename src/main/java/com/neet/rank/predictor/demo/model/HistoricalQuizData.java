package com.neet.rank.predictor.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class HistoricalQuizData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;
    private double averageScore;
    private double pastAccuracy;

    public double getAverageScore() {
        return averageScore;
    }

    public double getPastAccuracy() {
        return pastAccuracy;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
