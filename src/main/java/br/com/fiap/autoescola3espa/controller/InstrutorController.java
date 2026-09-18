package br.com.fiap.autoescola3espa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
//Receber informações de fora
public class InstrutorController {
    @PostMapping
    public void cadastrarInstrutor(@RequestBody String corpo) {
        System.out.println(corpo);
    }
}
