package com.knf.dev.request;

import com.knf.dev.models.Product;
import com.knf.dev.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private  final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
    public void addProduct(Product data)
    {
        repository.save(data);
    }

    public Product productbyid(long Id)
    {

        return repository.findById(Id).get();
    }
    public void  deletebyid(long id)
    {
        repository.deleteById(id);
    }
    public Product updatebyid(long id, Product updatebyid)
    {
        updatebyid.setId(id);
        return repository.save(updatebyid);

    }

    public List<Product> getProductList() {
        return repository.findAll();
    }
}
