package com.example.Lipekry.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
public record ProductRecordDto(@NotNull @NotBlank String prod_name, @NotNull BigDecimal prod_value, boolean prod_active) {

}
