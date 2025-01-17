package com.seuprojeto.clienteapi.dto;

import lombok.Data;

@Data
public class EnderecoDTO {
    private Integer id;
    private String cep;
    private String logradouro;
    private String cidade;
    private String numero;
    private String complemento;
}
