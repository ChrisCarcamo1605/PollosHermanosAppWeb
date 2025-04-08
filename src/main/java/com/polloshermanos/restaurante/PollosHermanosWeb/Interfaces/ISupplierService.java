package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Supplier;

public interface ISupplierService {

    public Supplier getSupplier();

    public  Supplier saveSupplier(Supplier supplier);
}
