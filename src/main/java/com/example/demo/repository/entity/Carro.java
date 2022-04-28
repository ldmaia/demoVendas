package com.example.demo.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "carro")
public class Carro {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "seguro_id")
    private Seguro seguro;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
