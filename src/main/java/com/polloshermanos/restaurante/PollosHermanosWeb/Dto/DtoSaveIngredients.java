package com.polloshermanos.restaurante.PollosHermanosWeb.Dto;

import java.math.BigDecimal;

public record DtoSaveIngredients(String name, String description, String unitOfMeasurement, BigDecimal unitPrice, Boolean asset) {
}
