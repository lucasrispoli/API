package org.serratec.backend;    //dita em qual pacote esta
import org.springframework.web.bind.annotation.RequestMapping; //importa o mapping
import org.springframework.web.bind.annotation.GetMapping; //importa o get mapping
import org.springframework.web.bind.annotation.RestController; //importa o controller

@RestController //chama o restcontroller
@RequestMapping("/teste") //declara o nome da porta

    public class teste{ //publica a classe dita

        @GetMapping    //chama o getmapping para publicar nele
        public String hello() {
            System.out.println("nao importa oq ta aqui");//nao sei esta bosta
            return "imprime oq ta escrito aqui";  //retorna a mensagem escolhida
            }
    }
