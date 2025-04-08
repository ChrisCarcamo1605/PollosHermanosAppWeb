package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Product;

public interface IProductService {

    public Product getProduct();

    public Product saveProduct(Product product);
}
