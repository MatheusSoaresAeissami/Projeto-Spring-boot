package com.seuprojeto.clienteapi.mapper;

import com.seuprojeto.clienteapi.dto.EnderecoDTO;
import com.seuprojeto.clienteapi.model.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EnderecoMapper {
    EnderecoMapper INSTANCE = Mappers.getMapper(EnderecoMapper.class);

    EnderecoDTO toDTO(Endereco endereco);

    Endereco toEntity(EnderecoDTO enderecoDTO);
}
