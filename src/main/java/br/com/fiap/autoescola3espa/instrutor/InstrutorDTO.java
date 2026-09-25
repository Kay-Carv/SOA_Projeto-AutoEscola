package br.com.fiap.autoescola3espa.instrutor;

import br.com.fiap.autoescola3espa.endereco.EnderecoDTO;

public record InstrutorDTO (
        String nome,
        String email,
        String telefone,
        String cnh,
        String especialidade,
        EnderecoDTO endereco) {
}