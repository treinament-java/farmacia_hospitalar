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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.farmacia_hospitalar.models.Gerenciamento;
import com.senai.backend.farmacia_hospitalar.services.GerenciamentoService;

@RestController
@RequestMapping("/gerenciamento")
public class GerenciamentoController {

    @Autowired
    private GerenciamentoService gerenciamentoService;

     @GetMapping("/contar-gerenciamentos")
    public Long contarGerenciamentos(@RequestParam String param) {
        return gerenciamentoService.contarGerenciamentos();
    }
    

    @GetMapping("/buscar-Gerenciamentos/{id}")
    public Gerenciamento buscarGerenciamento(@PathVariable Integer id){ {
        return gerenciamentoService.buscarGerenciamento(id);
    }
    }

    @GetMapping("/listar-Gerenciamentos")
    public List<Gerenciamento> listarGerenciamentos(){
        return gerenciamentoService.listarGerenciamentos();
    }

    @DeleteMapping("/deletar-Gerenciamento/{id}")
    public String deletarGerenciamento(@PathVariable Integer id){
        if(gerenciamentoService.deletarGerenciamento(id)){
            return "Gerenciamento removido com sucesso!";
        }
        return "Não foi possível remover o gerenciamento!";
    }
    
    @PostMapping("/salvar-gerenciamento")
    public Gerenciamento cadastrarGerenciamento(@RequestBody Gerenciamento gerenciamento) {
        return gerenciamentoService.cadastrarGerenciamento(gerenciamento);
    }

    @PutMapping("/atualizar-gerenciamento/{id}")
    public String atualizarGerenciamento(@PathVariable Integer id, @RequestBody Gerenciamento gerenciamento) {
        if(gerenciamentoService.atualizarGerenciamento(id, gerenciamento) != null){
            return "Gerenciamento atualizado com sucesso!";
        }
        return "Não foi possível atualizar o gerenciamento!";
    }
    
}
