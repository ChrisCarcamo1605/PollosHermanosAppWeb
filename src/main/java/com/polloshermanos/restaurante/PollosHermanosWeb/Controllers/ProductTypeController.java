package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.ProductType;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveProductType;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productType")
public class ProductTypeController {

    @Autowired
    IProductTypeService productTypeService;

    @PostMapping
    public void imprimirMundo(DtoSaveProductType productType) {
        System.out.println("Hola Mundo");
        var newProductType = new ProductType();
        newProductType.setPrice(productType.price());
        newProductType.setDescription(productType.description());
        newProductType.setAsset(productType.asset());

        productTypeService.saveProductType(newProductType);

    }
}
