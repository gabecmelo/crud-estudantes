package com.poo.estudantes.controller;

import com.poo.estudantes.entity.Estudante;
import com.poo.estudantes.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    @Autowired
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping
    public Estudante create(@RequestBody Estudante estudante) {
        return estudanteService.create(estudante);
    }

    @GetMapping
    public List<Estudante> findAll() {
        return estudanteService.findAll();
    }

    @DeleteMapping
    public void delete(Long id) {
        estudanteService.delete(id);
    }
}
