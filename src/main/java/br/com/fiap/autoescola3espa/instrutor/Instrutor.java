package br.com.fiap.autoescola3espa.instrutor;

import br.com.fiap.autoescola3espa.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Instrutor")
@Table(name = "Instrutores")
//Utilizando lombok
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Instrutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cnh;
    private String especialidade;

    @Embedded
    private Endereco endereco;

    public Instrutor(InstrutorDTO corpo) {
        this.nome = corpo.nome();
        this.email = corpo.email();
        this.telefone = corpo.telefone();
        this.cnh = corpo.cnh();
        this.especialidade = corpo.especialidade();
        this.endereco = new Endereco(corpo.endereco());
    }
}
