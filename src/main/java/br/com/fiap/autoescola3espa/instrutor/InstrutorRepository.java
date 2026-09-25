package br.com.fiap.autoescola3espa.instrutor;

import org.springframework.data.jpa.repository.JpaRepository;

//Criando interface para trazer métodos no banco de dados
public interface InstrutorRepository extends JpaRepository<Instrutor ,Long> {
}
