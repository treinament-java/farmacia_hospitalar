package com.senai.backend.farmacia_hospitalar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.farmacia_hospitalar.models.Historico;
import com.senai.backend.farmacia_hospitalar.services.HistoricoService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/historico")
public class HistoricoController {
    
        @Autowired
    private HistoricoService historicoService;

    @GetMapping("/contar-historicos")
    public Long contarHistoricos(@RequestParam String param) {
        return historicoService.contarHistoricos();
    }
    

    @GetMapping("/buscar-Historicos/{id}")
    public Historico buscarHistorico(@PathVariable Integer id){ {
        return historicoService.buscarHistorico(id);
    }
    }

    @GetMapping("/listar-Historicos")
    public List<Historico> listarHistoricos(){
        return historicoService.listarHistoricos();
    }

    @DeleteMapping("/deletar-Historico/{id}")
    public String deletarHistorico(@PathVariable Integer id){
        if(historicoService.deletarHistorico(id)){
            return "Histórico removido com sucesso!";
        }
        return "Não foi possível remover o histórico!";
    }
    
    @PostMapping("/salvar-historico")
    public Historico cadastrarHistorico(@RequestBody Historico historico) {
        return historicoService.cadastrarHistorico(historico);
    }

    @PutMapping("/atualizar-historico/{id}")
    public String atualizarHistorico(@PathVariable Integer id, @RequestBody Historico historico) {
        if(historicoService.atualizarHistorico(id, historico) != null){
            return "Histórico atualizado com sucesso!";
        }
        return "Não foi possível atualizar o histórico!";
    }
}
