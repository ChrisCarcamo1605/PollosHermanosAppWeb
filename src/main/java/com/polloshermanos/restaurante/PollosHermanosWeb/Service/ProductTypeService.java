package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.ProductType;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IProductTypeService;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService implements IProductTypeService {

    @Autowired
    ProductTypeRepository productTypeRepository;

    @Override
    public ProductType getProductType() {return null;}

    @Override
    public ProductType saveProductType(ProductType productType) {return productTypeRepository.save(productType);}

}
