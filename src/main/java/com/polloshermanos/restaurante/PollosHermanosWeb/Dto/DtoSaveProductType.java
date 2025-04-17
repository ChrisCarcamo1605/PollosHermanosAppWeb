package com.polloshermanos.restaurante.PollosHermanosWeb.Dto;

import java.math.BigDecimal;

public record DtoSaveProductType(BigDecimal price, String description, Boolean asset) {
}
