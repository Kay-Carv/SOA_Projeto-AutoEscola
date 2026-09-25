create  table instrotores (
    id BIGINT AUTO_INCREMENT,
    nome varchar(100) not null,
    email varchar(100) not null unique ,
    telefone varchar(20) not null,
    cnh varchar(11) not null unique ,
    especialidade varchar(10) not null ,
    logradouro varchar(100) not null ,
    numero varchar(10),
    complemento varchar(25),
    bairro varchar(100) not null ,
    cidade varchar(100) not null,
    uf varchar(2) not null,
    cep varchar(9) not null,
    primary key (id)
);