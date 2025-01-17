package com.seuprojeto.clienteapi.controller;

import com.seuprojeto.clienteapi.dto.ClienteDTO;
import com.seuprojeto.clienteapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteDTO> cadastrarCliente(@RequestBody ClienteDTO clienteDTO) {
        ClienteDTO clienteCadastrado = clienteService.cadastrarCliente(clienteDTO);
        return ResponseEntity.ok(clienteCadastrado);
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listarClientes() {
        List<ClienteDTO> clientes = clienteService.listarClientes();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> consultarClientePorId(@PathVariable Integer id) {
        ClienteDTO cliente = clienteService.consultarClientePorId(id);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> atualizarCliente(@PathVariable Integer id, @RequestBody ClienteDTO clienteDTO) {
        ClienteDTO clienteAtualizado = clienteService.atualizarCliente(id, clienteDTO);
        return clienteAtualizado != null ? ResponseEntity.ok(clienteAtualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCliente(@PathVariable Integer id) {
        return clienteService.excluirCliente(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
