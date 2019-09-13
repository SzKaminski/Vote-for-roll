package com.szkaminski.voteforroll.controllers;

import com.szkaminski.voteforroll.entieties.SkateEntity;
import com.szkaminski.voteforroll.services.SkatesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class SkatesController {

    private final SkatesService skatesService;

    public SkatesController(SkatesService skatesService) {
        this.skatesService = skatesService;
    }

    @PostMapping("/skates/create")
    public String addSkates(@RequestBody SkateEntity skatesRequest){
        skatesService.addSkates(skatesRequest);
        return skatesRequest.getModel();
    }

    @GetMapping("/skates/getAll")
    public List<SkateEntity> getAll(){
        return skatesService.getAll();
    }
}
