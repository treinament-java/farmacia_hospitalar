package com.senai.backend.farmacia_hospitalar.models;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")   
public class Medicamento {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name="validade")
    private LocalDate validade;

    @Column(name = "condc_armazenamento")
    private String condcArmazenamento;

    @Column(name = "lote")
    private String lote;

    @Column(name = "estoque")
    private Integer estoque;

    @Column(name="dosagem")
    private Integer dosagem;

    @Column(name="forma_administracao")
    private String formaAdministracao;

    public Medicamento() {
    }

    public Medicamento(Integer id, String nome, LocalDate validade, String condcArmazenamento, String lote,
            Integer estoque, Integer dosagem, String formaAdministracao) {
        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.condcArmazenamento = condcArmazenamento;
        this.lote = lote;
        this.estoque = estoque;
        this.dosagem = dosagem;
        this.formaAdministracao = formaAdministracao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getCondcArmazenamento() {
        return condcArmazenamento;
    }

    public void setCondcArmazenamento(String condcArmazenamento) {
        this.condcArmazenamento = condcArmazenamento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Integer getDosagem() {
        return dosagem;
    }

    public void setDosagem(Integer dosagem) {
        this.dosagem = dosagem;
    }

    public String getFormaAdministracao() {
        return formaAdministracao;
    }

    public void setFormaAdministracao(String formaAdministracao) {
        this.formaAdministracao = formaAdministracao;
    }
    
    
}
