package com.szkaminski.voteforroll.controllers;

import com.szkaminski.voteforroll.dtos.SkatesRequest;
import com.szkaminski.voteforroll.services.SkatesService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SkatesController {

    private final SkatesService skatesService;

    public SkatesController(SkatesService skatesService) {
        this.skatesService = skatesService;
    }

    @PostMapping("/skates/create")
    public ResponseEntity addSkates(@RequestBody SkatesRequest skatesRequest){
        skatesService.addSkates(skatesRequest);
        return ResponseEntity.ok().build();
    }
}
