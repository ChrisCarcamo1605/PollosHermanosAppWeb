package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveProduct;
import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Product;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @PostMapping
    public void imprimirMundo(DtoSaveProduct product){
        System.out.println("Hola Mundo");

        var newProduct = new Product();
        newProduct.setName(product.name());
        newProduct.setAsset(product.asset());
        newProduct.setDescription(product.description());

        productService.saveProduct(newProduct);
    }
}
