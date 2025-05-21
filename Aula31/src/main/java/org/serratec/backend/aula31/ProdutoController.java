package org.serratec.backend.aula31;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/produtos")
    public class ProdutoController {

        @Autowired
        private ProdutoRepository repository;

        @PostMapping
        public Produto inserir(@RequestBody Produto produto) {
            if (produto.getDataCadastro() == null) {
                produto.setDataCadastro(LocalDate.now());
            }
            repository.save(produto);
            return produto;
        }

        @PostMapping("/multi")
        public List<Produto> inserirMultiplos(@RequestBody List<Produto> produtos) {
            produtos.forEach(produto -> {
                if (produto.getDataCadastro() == null) {
                    produto.setDataCadastro(LocalDate.now());
                }
            });
            return repository.saveAll(produtos);
        }

        @GetMapping
        public List<Produto> listarTodosProdutos() {
            return repository.findAll();
        }
        @GetMapping("{id}")
        public ResponseEntity<Produto> listarPorId(@PathVariable Long id) {
            Optional<Produto> produto = repository.findById(id);
            if (!produto.isPresent()) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(produto.get());
        }
    }

