package com.senai.backend.farmacia_hospitalar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.farmacia_hospitalar.models.Gerenciamento;
import com.senai.backend.farmacia_hospitalar.repositories.GerenciamentoRepository;

@Service
public class GerenciamentoService {
    
    @Autowired
    private GerenciamentoRepository gerenciamentoRepository;

    public Long contarGerenciamentos() {
        return gerenciamentoRepository.count();
    }

    public Gerenciamento buscarGerenciamento(Integer id) {
        return gerenciamentoRepository.findById(id).get();
    }

    public List<Gerenciamento> listarGerenciamentos() {
        return gerenciamentoRepository.findAll();
    }

    public Boolean deletarGerenciamento(Integer id) {
        if (gerenciamentoRepository.existsById(id)) {
            gerenciamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Gerenciamento cadastrarGerenciamento(Gerenciamento gerenciamento) {
        return gerenciamentoRepository.save(gerenciamento);
    }

    public Gerenciamento atualizarGerenciamento(Integer id, Gerenciamento gerenciamento) {
        Gerenciamento gerenciamentoRecuperado = buscarGerenciamento(id);
        if(gerenciamentoRecuperado != null){
            gerenciamentoRecuperado.setId(id);
            if(gerenciamento.getDataChegada() != null){
                gerenciamentoRecuperado.setDataChegada(gerenciamento.getDataChegada());
            }
            if(gerenciamento.getMedicamentoId() != null){
                gerenciamentoRecuperado.setMedicamentoId(gerenciamento.getMedicamentoId());
            }
            return gerenciamentoRepository.save(gerenciamentoRecuperado);
        }
        return null;
    }
    
}
