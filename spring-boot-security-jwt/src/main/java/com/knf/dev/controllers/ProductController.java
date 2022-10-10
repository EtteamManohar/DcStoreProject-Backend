package com.knf.dev.controllers;

import com.knf.dev.models.Product;
import com.knf.dev.request.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/product_api")
public class ProductController {
    @Autowired
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Product productbyid(@PathVariable long id)
    {
        return service.productbyid(id);

    }

    @GetMapping("deleteId/{id}")
    public void deletebyId(@PathVariable("id") long id) {

        service.deletebyid(id);
    }
    @PostMapping("/insert_product")
    public void insert(@RequestBody Product data)
    {

        service.addProduct(data);
    }
    @PutMapping("update/{id}")
    public Product updatebyId(@PathVariable Long id,@RequestBody Product entry)

    {
        return service.updatebyid(id,entry);
    }



}



