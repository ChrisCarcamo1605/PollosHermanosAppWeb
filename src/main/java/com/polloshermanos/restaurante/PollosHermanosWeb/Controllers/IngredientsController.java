package com.polloshermanos.restaurante.PollosHermanosWeb.Controllers;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ingredients;
import com.polloshermanos.restaurante.PollosHermanosWeb.Dto.DtoSaveIngredients;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController {

    @Autowired
    IIngredientsService ingredientsService;

    @PostMapping
    public void imprimirMundo(DtoSaveIngredients ingredients){
        System.out.println("Hola Mundo");
         var newIngredients = new Ingredients();
         newIngredients.setName(ingredients.name());
         newIngredients.setDescription(ingredients.description());
         newIngredients.setUnitOfMeasurement(ingredients.unitOfMeasurement());
         newIngredients.setUnitPrice(ingredients.unitPrice());
         newIngredients.setAsset(ingredients.asset());

         ingredientsService.saveIngredients(newIngredients);

    }
}
