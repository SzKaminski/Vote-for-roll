package com.szkaminski.voteforroll.services;

import com.szkaminski.voteforroll.entieties.SkateEntity;
import com.szkaminski.voteforroll.repositories.SkateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SkateService {

    private final SkateRepository skateRepository;

    @Autowired
    public SkateService(SkateRepository skateRepository) {
        this.skateRepository = skateRepository;
    }

    public String addSkates(SkateEntity entity){
        skateRepository.save(entity);
        return entity.getModel();
    }

    public List<SkateEntity> getAll() {
        return skateRepository.findAll();
    }
}
