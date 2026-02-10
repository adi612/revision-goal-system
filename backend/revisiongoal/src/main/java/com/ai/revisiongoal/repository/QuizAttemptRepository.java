package com.ai.revisiongoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai.revisiongoal.entity.QuizAttempt;



public interface QuizAttemptRepository extends JpaRepository<QuizAttempt, Long> {
}
