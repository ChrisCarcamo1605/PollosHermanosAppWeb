package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Supplier;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.SupplierRepository;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService implements ISupplierService {

    @Autowired
    SupplierRepository supplierRepository;

    @Override
    public Supplier getSupplier() {return null;}

    @Override
    public Supplier saveSupplier(Supplier supplier) {return supplierRepository.save(supplier);}

}
