package com.dpm.food.controller;

import com.dpm.food.model.entity.ClienteEntity;
import com.dpm.food.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class PrimeiroController {

    private AtivacaoClienteService service;

    public PrimeiroController(AtivacaoClienteService service){
        this.service = service;
    }
    @GetMapping("/hello")
    public String hello(){
        ClienteEntity joao = new ClienteEntity("joao", "joao@ermail.com", "988776655");
        service.ativar(joao);
        return "hello";
    }
}
