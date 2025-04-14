package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductTypeRepository extends JpaRepository <ProductType,Long> {

}
