package com.seuprojeto.clienteapi.service;

import com.seuprojeto.clienteapi.dto.ClienteDTO;
import com.seuprojeto.clienteapi.model.Cliente;
import com.seuprojeto.clienteapi.repository.ClienteRepository;
import com.seuprojeto.clienteapi.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return clienteMapper.toDTO(cliente);
    }

    public List<ClienteDTO> listarClientes() {
        return clienteRepository.findAll()
                .stream()
                .map(clienteMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ClienteDTO consultarClientePorId(Integer id) {
        return clienteRepository.findById(id)
                .map(clienteMapper::toDTO)
                .orElse(null);
    }

    public ClienteDTO atualizarCliente(Integer id, ClienteDTO clienteDTO) {
        if (clienteRepository.existsById(id)) {
            Cliente cliente = clienteMapper.toEntity(clienteDTO);
            cliente.setId(id);
            cliente = clienteRepository.save(cliente);
            return clienteMapper.toDTO(cliente);
        }
        return null;
    }

    public boolean excluirCliente(Integer id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
