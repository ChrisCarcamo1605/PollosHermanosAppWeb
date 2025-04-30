package com.polloshermanos.restaurante.PollosHermanosWeb.Service;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ingredients;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IngredientsRepository;
import com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces.IIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientsService implements IIngredientsService {

    @Autowired
    IngredientsRepository ingredientsRepository;

    @Override
    public Ingredients getIngredients(){return null;}

    @Override
    public Ingredients saveIngredients(Ingredients ingredients){
        return ingredientsRepository.save(ingredients);
    }
}
