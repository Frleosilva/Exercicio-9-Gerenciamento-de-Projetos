package com.atividade9.projetos.Controllers;

import com.atividade9.projetos.Models.ProjetoModel;
import com.atividade9.projetos.Services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ProjetoModel criarProjeto(@RequestBody ProjetoModel projeto) {
        return projetoService.criarProjeto(projeto);
    }

    @GetMapping
    public List<ProjetoModel> listarProjetos() {
        return projetoService.listarProjetos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjetoModel> buscarProjetoPorId(@PathVariable Long id) {
        return projetoService.buscarProjetoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProjeto(@PathVariable Long id) {
        projetoService.deletarProjeto(id);
        return ResponseEntity.noContent().build();
    }
}
