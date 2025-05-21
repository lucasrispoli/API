package org.serratec.backend.apiaula4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class Clientecontroller {
    @Autowired
    public Repository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente inserir(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }
}
