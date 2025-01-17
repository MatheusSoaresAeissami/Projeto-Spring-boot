package com.seuprojeto.clienteapi.dto;

import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
public class ClienteDTO {
    private Integer id;
    private String nome;
    private LocalDate dataCadastro;
    private List<ContatoDTO> contatos;
    private EnderecoDTO endereco;
}
