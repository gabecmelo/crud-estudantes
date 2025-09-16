package com.poo.estudantes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_aluno")
public class Estudante {
    @Id
    @GeneratedValue
    private Long id;

    private String email;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private Integer age;

    public Estudante(Long id, String email, String name, Integer age) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
