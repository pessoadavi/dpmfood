package com.dpm.food.notificacao;

import com.dpm.food.model.entity.ClienteEntity;

public interface Notificador {
    void notificar(ClienteEntity cliente, String mensagem);
}
