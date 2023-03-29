package com.dpm.food.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity {

    private String nome;
    private BigDecimal valorTotal;
}
