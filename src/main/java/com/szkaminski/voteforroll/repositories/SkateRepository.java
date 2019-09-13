package com.szkaminski.voteforroll.repositories;

import com.szkaminski.voteforroll.entieties.SkateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SkateRepository extends JpaRepository<SkateEntity, UUID> {

}
