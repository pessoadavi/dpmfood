package com.dpm.food.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {

    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo = false;

    public ClienteEntity(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


    public void ativar(){
        this.ativo = true;
    }
}
