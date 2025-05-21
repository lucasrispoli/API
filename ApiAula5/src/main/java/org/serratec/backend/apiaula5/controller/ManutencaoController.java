package org.serratec.backend.apiaula5.controller;

import org.serratec.backend.apiaula5.entity.Mantencao;
import org.serratec.backend.apiaula5.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/manutencoes")
public class ManutencaoController {

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    @GetMapping
    public List<Mantencao> listarTodos() {
        return manutencaoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mantencao> buscarPorId(@PathVariable Long id) {
        Optional<Mantencao> manutencao = manutencaoRepository.findById(id);
        return manutencao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Mantencao> criar(@RequestBody Mantencao novaManutencao) {
        Mantencao salva = manutencaoRepository.save(novaManutencao);
        return ResponseEntity.ok(salva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mantencao> atualizar(@PathVariable Long id, @RequestBody Mantencao manutencaoAtualizada) {
        Optional<Mantencao> manutencaoExistente = manutencaoRepository.findById(id);
        if (manutencaoExistente.isPresent()) {
            manutencaoAtualizada.setId(id);
            return ResponseEntity.ok(manutencaoRepository.save(manutencaoAtualizada));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (manutencaoRepository.existsById(id)) {
            manutencaoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping("/lista")
    public ResponseEntity<List<Mantencao>> criarLista(@RequestBody List<Mantencao> manutencoes) {
        List<Mantencao> salvas = manutencaoRepository.saveAll(manutencoes);
        return ResponseEntity.ok(salvas);
    }
}
