package br.com.fiap.autoescola3espa.endereco;

public record EnderecoDTO (
    String logradouro,
    String numero,
    String complemento,
    String bairro,
    String cidade,
    String uf,
    String cep) {
}