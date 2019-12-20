package com.wcs.edf.controllers;

import com.wcs.edf.entity.Question;
import com.wcs.edf.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class QuestionnaireController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questionnaire")
    public String question(Model out) {
        out.addAttribute("questions", questionRepository.findAll());
        out.addAttribute("check", false);

        return "questionnaire";
    }

    @PostMapping("/send")
    public String getAll(Model out, @RequestParam Long answer1,@RequestParam Long answer2,@RequestParam Long answer3,@RequestParam Long answer4,@RequestParam Long answer5)  {
        int score = 0;
        List<Question> questions = questionRepository.findAll();
        if (questions.get(0).getNumber()== answer1){
            score ++;
        }
        if (questions.get(1).getNumber()== answer2){
            score ++;
        }
        if (questions.get(2).getNumber()== answer3){
            score ++;
        }
        if (questions.get(3).getNumber()== answer4){
            score ++;
        }
        if (questions.get(4).getNumber()== answer5){
            score ++;
        }
        out.addAttribute("score", score);
        out.addAttribute("check", true);
        return "questionnaire";
    }
}
