package com.jfb.crudspringboot.api.services;

import java.util.List;
import java.util.Optional;

import com.jfb.crudspringboot.api.controllers.ProdutoRepository;
import com.jfb.crudspringboot.api.models.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repo;
    
    public List<Produto>  findAll() {
        return repo.findAll();
    }
    
    public Produto findById(Integer id) {
    	Optional<Produto> obj = repo.findById(id);
    	return obj.orElseThrow(null);
    }
    
    public Produto insert(Produto obj) {
    	obj.setId(null);
    	obj = repo.save(obj);
    	return obj;
    }
    
    public void delete(Integer id) {
    	findById(id);
    	repo.deleteById(id);
    }

}