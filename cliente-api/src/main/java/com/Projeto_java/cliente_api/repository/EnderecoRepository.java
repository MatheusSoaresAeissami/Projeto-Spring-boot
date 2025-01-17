package com.seuprojeto.clienteapi.repository;

import com.seuprojeto.clienteapi.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
