package com.ai.revisiongoal.controller;




import org.springframework.web.bind.annotation.*;

import com.ai.revisiongoal.entity.MCQQuestion;
import com.ai.revisiongoal.service.MCQService;

import java.util.List;

@RestController
@RequestMapping("/api/mcq")
@CrossOrigin
public class MCQController {

    private final MCQService mcqService;

    public MCQController(MCQService mcqService) {
        this.mcqService = mcqService;
    }

    @PostMapping
    public MCQQuestion addMCQ(@RequestBody MCQQuestion mcq) {
        return mcqService.addMCQ(mcq);
    }

    @GetMapping
    public List<MCQQuestion> getAllMCQs() {
        return mcqService.getAllMCQs();
    }
}
