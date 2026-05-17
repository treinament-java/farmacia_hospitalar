package com.senai.backend.farmacia_hospitalar.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "historico")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "cliente")
    private String cliente;

    @Column(name="gerenciamento_id")
    private Integer gerenciamentoId;

    public Historico() {
    }

    public Historico(Integer id, String cliente, Integer gerenciamentoId) {
        this.id = id;
        this.cliente = cliente;
        this.gerenciamentoId = gerenciamentoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getGerenciamentoId() {
        return gerenciamentoId;
    }

    public void setGerenciamentoId(Integer gerenciamentoId) {
        this.gerenciamentoId = gerenciamentoId;
    }

    
}
