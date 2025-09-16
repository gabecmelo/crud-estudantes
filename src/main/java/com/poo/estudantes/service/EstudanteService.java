package com.poo.estudantes.service;

import com.poo.estudantes.entity.Estudante;
import com.poo.estudantes.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    @Autowired
    private final EstudanteRepository estudanteRepository;

    public EstudanteService(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    public Estudante create(Estudante estudante) {
        return estudanteRepository.save(estudante);
    }

    public List<Estudante> findAll() {
        return estudanteRepository.findAll();
    }

    public void delete(Long id) {
        Optional<Estudante> estudante = estudanteRepository.findById(id);
        if (estudante.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudante não encontrado");
        }
        estudanteRepository.deleteById(id);
    }
}
