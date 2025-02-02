package com.neet.rank.predictor.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class CurrentQuizData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;
    private int totalQuestions;
    private int correctAnswers;
    private double accuracy;

    @ElementCollection
    private List<String> topicsCovered;

    public double getAccuracy() {
        return accuracy;
    }
    public List<String> getTopicsCovered() {
        return topicsCovered;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
