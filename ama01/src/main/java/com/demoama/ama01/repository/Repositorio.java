package com.demoama.ama01.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoama.ama01.model.Usuario;

public interface Repositorio extends CrudRepository<Usuario,Integer> {
    
}
