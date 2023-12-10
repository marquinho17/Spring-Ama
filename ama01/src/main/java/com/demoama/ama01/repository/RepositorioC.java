package com.demoama.ama01.repository;

import org.springframework.data.repository.CrudRepository;

import com.demoama.ama01.model.Conteudos;

public interface RepositorioC extends CrudRepository<Conteudos,Integer> {
    
}
