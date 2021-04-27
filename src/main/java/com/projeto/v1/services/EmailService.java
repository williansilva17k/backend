package com.projeto.v1.services;

import org.springframework.mail.SimpleMailMessage;

import com.projeto.v1.domain.Cliente;
import com.projeto.v1.domain.Pedido;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
}
