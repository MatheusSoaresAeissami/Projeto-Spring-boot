package com.seuprojeto.clienteapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cep;

    private String logradouro;

    private String cidade;

    private String numero;

    private String complemento;
}
