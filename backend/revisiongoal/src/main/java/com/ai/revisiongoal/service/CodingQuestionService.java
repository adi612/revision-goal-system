package com.ai.revisiongoal.service;




import org.springframework.stereotype.Service;

import com.ai.revisiongoal.entity.CodingQuestion;
import com.ai.revisiongoal.repository.CodingQuestionRepository;

import java.util.List;

@Service
public class CodingQuestionService {

    private final CodingQuestionRepository repository;

    public CodingQuestionService(CodingQuestionRepository repository) {
        this.repository = repository;
    }

    public CodingQuestion addQuestion(CodingQuestion question) {
        return repository.save(question);
    }

    public List<CodingQuestion> getAllQuestions() {
        return repository.findAll();
    }
}
