package br.com.fiap.autoescola3espa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheckController {
    @GetMapping
    public String healthCheck() {
        return "OK - Teste de integridade da AutoEscola3ESPA";
    }
}
