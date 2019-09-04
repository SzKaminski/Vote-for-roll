package com.szkaminski.voteforroll.services;

import com.szkaminski.voteforroll.entieties.Skates;
import com.szkaminski.voteforroll.repositories.SkatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class SkatesService {

    private final SkatesRepository skatesRepository;

    @Autowired
    public SkatesService(SkatesRepository skatesRepository) {
        this.skatesRepository = skatesRepository;
    }

    public String addSkates(Skates skates){
        skatesRepository.save(skates);
        return skates.getModel();
    }
}
