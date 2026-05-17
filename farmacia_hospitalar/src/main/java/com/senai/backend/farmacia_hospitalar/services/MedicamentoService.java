package com.senai.backend.farmacia_hospitalar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.farmacia_hospitalar.models.Medicamento;
import com.senai.backend.farmacia_hospitalar.repositories.MedicamentoRepository;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public  Long contarMedicamentos() {
        return medicamentoRepository.count();
    }

    public Medicamento buscarMedicamento(Integer id) {
        return medicamentoRepository.findById(id).get();
    }

    public List<Medicamento> listarMedicamentos() {
        return medicamentoRepository.findAll();
    }

    public Boolean deletarMedicamento(Integer id) {
        if (medicamentoRepository.existsById(id)) {
            medicamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Medicamento cadastrarMedicamento(Medicamento medicamento) {
    return medicamentoRepository.save(medicamento);
    }

    public Medicamento atualizarMedicamento(Integer id, Medicamento medicamento) {
        Medicamento medicamentoRecuperado = buscarMedicamento(id);
        if(medicamentoRecuperado != null){
            medicamentoRecuperado.setId(id);
            if(medicamento.getNome() != null){
                medicamentoRecuperado.setNome(medicamento.getNome());
            }
            if(medicamento.getValidade() != null){
                medicamentoRecuperado.setValidade(medicamento.getValidade());
            }
            return medicamentoRepository.save(medicamentoRecuperado);
        }
        return null;
    }
}
