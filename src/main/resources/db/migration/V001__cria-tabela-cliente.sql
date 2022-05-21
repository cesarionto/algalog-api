CREATE TABLE cliente (
    id bigint NOT NULL AUTO_INCREMENT,
    nome varchar(60) NOT NULL,
    email VARCHAR(256) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    PRIMARY KEY(id)
)