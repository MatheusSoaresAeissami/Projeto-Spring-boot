package com.seuprojeto.clienteapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipo;

    private String texto;
}
