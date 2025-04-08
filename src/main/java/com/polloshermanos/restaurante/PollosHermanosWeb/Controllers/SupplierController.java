package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Supplier;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveSupplier;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supplier")

public class SupplierController {
    @Autowired
    ISupplierService supplierService;

    @PostMapping
    public void imprimiMundo(DtoSaveSupplier supplier){
        System.out.println("Hola Mundo");
        var newSupplier = new Supplier();
        newSupplier.setName(supplier.name());
        newSupplier.setProduct(supplier.product());
        newSupplier.setDescription(supplier.description());
        newSupplier.setAnnotations(supplier.annotations());

        supplierService.saveSupplier(newSupplier);
    }
}
