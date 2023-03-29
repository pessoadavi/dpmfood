package com.dpm.food.service;

import com.dpm.food.model.entity.ClienteEntity;
import com.dpm.food.model.entity.ProdutoEntity;
import com.dpm.food.notificacao.NotiFicadorSMS;
import com.dpm.food.notificacao.Notificador;
import com.dpm.food.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private Notificador notificador;
    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }
    public void emitir(ClienteEntity cliente, ProdutoEntity produto){
        this.notificador.notificar(cliente, "Nota fiscal" + produto.getNome() + " foi emitida.");
    }
}
