package com.ai.revisiongoal.service;



import org.springframework.stereotype.Service;

import com.ai.revisiongoal.entity.MCQQuestion;
import com.ai.revisiongoal.repository.MCQQuestionRepository;

import java.util.List;

@Service
public class MCQService {

    private final MCQQuestionRepository mcqRepository;

    public MCQService(MCQQuestionRepository mcqRepository) {
        this.mcqRepository = mcqRepository;
    }

    public MCQQuestion addMCQ(MCQQuestion mcq) {
        // business logic goes here
        return mcqRepository.save(mcq);
    }

    public List<MCQQuestion> getAllMCQs() {
        return mcqRepository.findAll();
    }
}
