package com.senai.backend.farmacia_hospitalar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.farmacia_hospitalar.services.MedicamentoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.senai.backend.farmacia_hospitalar.models.Medicamento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @GetMapping("/contar-Medicamentos")
    public Long contarMedicamentos(){
        return medicamentoService.contarMedicamentos();
    }

    @GetMapping("/buscar-Medicamentos/{id}")
    public Medicamento buscarMedicamento(@PathVariable Integer id){ {
        return medicamentoService.buscarMedicamento(id);
    }
    }

    @GetMapping("/listar-Medicamentos")
    public List<Medicamento> listarMedicamentos(){
        return medicamentoService.listarMedicamentos();
    }

    @DeleteMapping("/deletar-Medicamento/{id}")
    public String deletarMedicamento(@PathVariable Integer id){
        if(medicamentoService.deletarMedicamento(id)){
            return "Medicamneto removido com sucesso!";
        }
        return "Não foi possível remover o medicamento!";
    }
    
    @PostMapping("/salvar-medicamento")
    public Medicamento cadastrarMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoService.cadastrarMedicamento(medicamento);
    }

    @PutMapping("/atualizar-medicamento/{id}")
    public String atualizarMedicamento(@PathVariable Integer id, @RequestBody Medicamento medicamento) {
        if(medicamentoService.atualizarMedicamento(id, medicamento) != null){
            return "Medicamento atualizado com sucesso!";
        }
        return "Não foi possível atualizar o medicamento!";
    }
    
}
