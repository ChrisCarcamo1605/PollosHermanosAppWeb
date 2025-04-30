package com.polloshermanos.restaurante.PollosHermanosWeb.Interfaces;

import com.polloshermanos.restaurante.PollosHermanosWeb.Domain.Ingredients;

public interface IIngredientsService {

    public Ingredients getIngredients();

    public Ingredients saveIngredients(Ingredients ingredients);
}
