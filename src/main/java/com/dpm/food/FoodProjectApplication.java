package com.dpm.food;

import com.dpm.food.model.entity.ClienteEntity;
import com.dpm.food.notificacao.NotiFicadorSMS;
import com.dpm.food.notificacao.Notificador;
import com.dpm.food.notificacao.NotificadorEmail;
import com.dpm.food.service.AtivacaoClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodProjectApplication.class, args);
		
		AtivacaoClienteService serviceEmail = new AtivacaoClienteService(new NotificadorEmail());
		AtivacaoClienteService serviceSMS = new AtivacaoClienteService(new NotiFicadorSMS());

		ClienteEntity joao = new ClienteEntity("joao", "joao@ermail.com", "988776655");
		ClienteEntity maria = new ClienteEntity("Maria", "maria@ermail.com", "911223344");

		serviceEmail.ativar(joao);
		serviceSMS.ativar(maria);

	}
}
