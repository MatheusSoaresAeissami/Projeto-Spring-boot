package com.seuprojeto.clienteapi.mapper;

import com.seuprojeto.clienteapi.dto.ClienteDTO;
import com.seuprojeto.clienteapi.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    Cliente toEntity(ClienteDTO dto);
    ClienteDTO toDTO(Cliente entity);
}
