package com.szkaminski.voteforroll.repositories;

import com.szkaminski.voteforroll.entieties.Skates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SkatesRepository extends JpaRepository<Skates, UUID> {

}
