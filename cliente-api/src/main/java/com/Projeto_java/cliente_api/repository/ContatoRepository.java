package com.seuprojeto.clienteapi.repository;

import com.seuprojeto.clienteapi.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
