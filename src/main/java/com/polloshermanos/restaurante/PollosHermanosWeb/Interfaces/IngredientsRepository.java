package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IngredientsRepository extends JpaRepository<Ingredients,Long> {
}
