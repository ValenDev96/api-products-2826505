package com.api.java.api_products_2826505.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.api.java.api_products_2826505.entities.Product;




import com.api.java.api_products_2826505.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //metodos 
    //Read 
    List<Product> findAll(){
        return (List<Product>) repository.findAll();

    }

}
