package com.dpm.food.service;

import com.dpm.food.model.entity.ClienteEntity;
import com.dpm.food.notificacao.NotiFicadorSMS;
import com.dpm.food.notificacao.Notificador;
import com.dpm.food.notificacao.NotificadorEmail;
import org.springframework.stereotype.Service;

public class AtivacaoClienteService {

    private Notificador notificador;
    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }
    public void ativar(ClienteEntity cliente){
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo! \n");
    }
}
