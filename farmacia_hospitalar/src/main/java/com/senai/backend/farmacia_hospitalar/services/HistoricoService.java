package com.senai.backend.farmacia_hospitalar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.farmacia_hospitalar.models.Historico;
import com.senai.backend.farmacia_hospitalar.repositories.HistoricoRepository;

@Service
public class HistoricoService {

    @Autowired
    private HistoricoRepository historicoRepository;

    public Long contarHistoricos() {
        return historicoRepository.count();
    }

    public Historico buscarHistorico(Integer id) {
        return historicoRepository.findById(id).get();
    }

    public List<Historico> listarHistoricos() {
        return historicoRepository.findAll();
    }

    public Boolean deletarHistorico(Integer id) {
        if (historicoRepository.existsById(id)) {
            historicoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Historico cadastrarHistorico(Historico historico) {
        return historicoRepository.save(historico);
    }

    public Historico atualizarHistorico(Integer id, Historico historico) {
        Historico historicoRecuperado = buscarHistorico(id);
        if(historicoRecuperado != null){
            historicoRecuperado.setId(id);
            if(historico.getCliente() != null){
                historicoRecuperado.setCliente(historico.getCliente());
            }
            if(historico.getGerenciamentoId() != null){
                historicoRecuperado.setGerenciamentoId(historico.getGerenciamentoId());
            }
            return historicoRepository.save(historicoRecuperado);
        }
        return null;
    }
}
