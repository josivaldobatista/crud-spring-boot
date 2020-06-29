package com.jfb.crudspringboot.api.repositories;

import com.jfb.crudspringboot.api.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}