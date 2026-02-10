package com.ai.revisiongoal.entity;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizAttempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long questionId;

    private String questionType; // MCQ / CODE
    private boolean correct;
    private double score;

    private LocalDateTime attemptedAt;
}
