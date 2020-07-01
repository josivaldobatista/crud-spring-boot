package com.jfb.crudspringboot.api.controllers;

import com.jfb.crudspringboot.api.models.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}