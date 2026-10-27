package com.example.demo.DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

public record ContaRequest (
    @NotBlank
    @Size(max = 100)
    String titular,

    @NotNull
    @DecimalMin("0.00")
    BigDecimal valor
) { }
