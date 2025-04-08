package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.ProductType;

public interface IProductTypeService {

        public ProductType getProductType();

        public ProductType saveProductType(ProductType productType);
}
