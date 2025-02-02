package com.neet.rank.predictor.demo.controller;

import com.neet.rank.predictor.demo.model.*;
import com.neet.rank.predictor.demo.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;
    private final QuizService quizService;
    private final PerformanceAnalyzer performanceAnalyzer;
    private final RankPredictor rankPredictor;
    private final CollegePredictor collegePredictor;

    public StudentController(StudentService studentService, QuizService quizService,
                             PerformanceAnalyzer performanceAnalyzer, RankPredictor rankPredictor,
                             CollegePredictor collegePredictor) {
        this.studentService = studentService;
        this.quizService = quizService;
        this.performanceAnalyzer = performanceAnalyzer;
        this.rankPredictor = rankPredictor;
        this.collegePredictor = collegePredictor;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @PostMapping("/{studentId}/quiz")
    public ResponseEntity<CurrentQuizData> submitQuiz(@PathVariable Long studentId, @RequestBody CurrentQuizData quizData) {
        return ResponseEntity.ok(quizService.submitQuiz(studentId, quizData));
    }

    @GetMapping("/{studentId}/quiz")
    public ResponseEntity<CurrentQuizData> getLatestQuiz(@PathVariable Long studentId) {
        return ResponseEntity.ok(quizService.getLatestQuiz(studentId));
    }

    @PostMapping("/{studentId}/history")
    public ResponseEntity<HistoricalQuizData> submitHistoricalQuiz(@PathVariable Long studentId, @RequestBody HistoricalQuizData historyData) {
        return ResponseEntity.ok(quizService.submitHistoricalQuiz(studentId, historyData));
    }

    @GetMapping("/{studentId}/history")
    public ResponseEntity<List<HistoricalQuizData>> getPastPerformance(@PathVariable Long studentId) {
        return ResponseEntity.ok(quizService.getPastPerformance(studentId));
    }

    @GetMapping("/{studentId}/performance")
    public ResponseEntity<Map<String, Object>> analyzePerformance(@PathVariable Long studentId) {
        return ResponseEntity.ok(performanceAnalyzer.analyzeStudentPerformance(studentId));
    }

    @GetMapping("/{studentId}/predict-rank")
    public ResponseEntity<Map<String, Object>> predictRank(@PathVariable Long studentId) {
        return ResponseEntity.ok(rankPredictor.predictStudentRank(studentId));
    }
    @GetMapping("/{studentId}/predict-college")
    public ResponseEntity<Map<String, Object>> predictCollege(@PathVariable Long studentId) {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> rankData = rankPredictor.predictStudentRank(studentId);
        int predictedRank = (int) rankData.get("predictedRank");

        String college = CollegePredictor.predictCollege(predictedRank);
        response.put("predictedRank", predictedRank);
        response.put("possibleCollege", college);

        return ResponseEntity.ok(response);
    }

    }
