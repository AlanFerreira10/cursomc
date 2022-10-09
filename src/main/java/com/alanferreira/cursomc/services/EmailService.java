package com.alanferreira.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.alanferreira.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
