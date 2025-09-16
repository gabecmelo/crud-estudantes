package com.poo.estudantes.repository;

import com.poo.estudantes.entity.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> { }
