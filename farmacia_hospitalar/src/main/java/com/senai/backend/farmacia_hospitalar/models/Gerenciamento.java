package com.senai.backend.farmacia_hospitalar.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gerenciamento")
public class Gerenciamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_chegada")
    private LocalDate dataChegada;

    @Column(name="data_saida")
    private LocalDate dataSaida;

    @Column(name="medicamento_id")
    private Integer medicamentoId;

    public Gerenciamento() {
    }

    public Gerenciamento(Integer id, LocalDate dataChegada, LocalDate dataSaida, Integer medicamentoId) {
        this.id = id;
        this.dataChegada = dataChegada;
        this.dataSaida = dataSaida;
        this.medicamentoId = medicamentoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(Integer medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    
}
