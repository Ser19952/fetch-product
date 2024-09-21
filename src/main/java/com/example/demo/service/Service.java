package com.example.demo.service;

import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
   private final  Repository repository;

    public Service(Repository repository){
        this.repository = repository;
    }

    public List<String> getProducts(String name){
        return repository.getProductName(name);
    }




}
