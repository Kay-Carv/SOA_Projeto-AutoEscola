package br.com.fiap.autoescola3espa.controller;

import br.com.fiap.autoescola3espa.instrutor.Instrutor;
import br.com.fiap.autoescola3espa.instrutor.InstrutorDTO;
import br.com.fiap.autoescola3espa.instrutor.InstrutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrutor")
//Receber informações de fora
public class InstrutorController {
    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    public void cadastrarInstrutor(@RequestBody InstrutorDTO corpo) {
        Instrutor instrutor = new Instrutor(corpo);
        repository.save(instrutor); //gravar dentro do banco
//        System.out.println(corpo);
    }
}
