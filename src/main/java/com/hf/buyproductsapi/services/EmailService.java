package com.hf.buyproductsapi.services;

import org.springframework.mail.SimpleMailMessage;

import com.hf.buyproductsapi.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
