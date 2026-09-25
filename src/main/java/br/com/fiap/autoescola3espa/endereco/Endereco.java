package br.com.fiap.autoescola3espa.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public  Endereco(EnderecoDTO corpo){
        this.logradouro = corpo.logradouro();
        this.numero = corpo.numero();
        this.complemento = corpo.complemento();
        this.bairro = corpo.bairro();
        this.cidade = corpo.cidade();
        this.uf = corpo.uf();
        this.cep = corpo.cep();
    }
}