package com.algaworks.algalog.algalogapi.api.controllers;

import java.util.List;

import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import com.algaworks.algalog.algalogapi.domain.repoditory.ClienteRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/clientes")
@AllArgsConstructor
public class ClienteController {

    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> String() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
        return clienteRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
