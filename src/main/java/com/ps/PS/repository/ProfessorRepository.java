package com.ps.PS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.PS.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}