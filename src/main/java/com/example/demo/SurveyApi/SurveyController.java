package com.example.demo.SurveyApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurveyController {

    private final SurveyRepository repository;

    public  SurveyController(SurveyRepository repository) {
        this.repository = repository;
    }



    @PostMapping("/survey/add")
    public ResponseEntity<String> addSurvey(@RequestBody Survey newSurvey){
        try{
            repository.save(newSurvey);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
