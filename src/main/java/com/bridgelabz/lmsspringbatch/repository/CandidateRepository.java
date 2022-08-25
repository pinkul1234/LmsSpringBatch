package com.bridgelabz.lmsspringbatch.repository;


import com.bridgelabz.lmsspringbatch.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
