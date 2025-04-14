package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
