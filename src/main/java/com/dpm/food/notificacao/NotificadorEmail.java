package com.dpm.food.notificacao;

import com.dpm.food.model.entity.ClienteEntity;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements  Notificador{
    @Override
    public void notificar(ClienteEntity cliente, String mensagem){
        System.err.printf("Notificando %s através do E-MAIL %s: %s", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
