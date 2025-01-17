package com.seuprojeto.clienteapi.dto;

import lombok.Data;

@Data
public class ContatoDTO {
    private Integer id;
    private String tipo;
    private String texto;
}