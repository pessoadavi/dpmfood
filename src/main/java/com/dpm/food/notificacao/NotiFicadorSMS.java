package com.dpm.food.notificacao;

import com.dpm.food.model.entity.ClienteEntity;

public class NotiFicadorSMS implements  Notificador{
    @Override
    public void notificar(ClienteEntity cliente, String mensagem){
        System.err.printf("Notificando %s atrvés do SMS através do telefone %s: %s", cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
