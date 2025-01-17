package com.seuprojeto.clienteapi.mapper;

import com.seuprojeto.clienteapi.dto.ContatoDTO;
import com.seuprojeto.clienteapi.model.Contato;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContatoMapper {
    ContatoMapper INSTANCE = Mappers.getMapper(ContatoMapper.class);

    ContatoDTO toDTO(Contato contato);

    Contato toEntity(ContatoDTO contatoDTO);
}
