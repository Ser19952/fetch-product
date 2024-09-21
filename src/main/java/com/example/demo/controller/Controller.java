package com.example.demo.controller;

import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Service service;

    public Controller(Service service){
        this.service = service;
    }

    @GetMapping("/products/fetch-product")
    public List<String>fetchProduct (@RequestParam ("name") String name){
        return service.getProducts(name);

    }

}
