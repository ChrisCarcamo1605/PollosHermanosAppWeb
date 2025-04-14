package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Product;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveProduct;

public interface IProductService {

    public Product getProduct();

    public Product saveProduct(DtoSaveProduct product);
}
