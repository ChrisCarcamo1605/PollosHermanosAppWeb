package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Product;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IProductService;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductService implements IProductService {

    @Autowired
    ProductRepository  productRepository;

    @Override
    public Product getProduct() {return null;}

    @Override
    public Product saveProduct(Product product) { return productRepository.save(product);}

}
