/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.service;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.springframework.stereotype.Service;

/**
 *
 * @author ryszard.mroczka
 */
@Service
public class EmailService {

    protected String mailSmtpAuth = "true";
    protected String mailSmtpHost = "smtp.gmail.com";
    protected int mailSmtpPort = 587;
    protected String mailSmtpStarttlsEnable = "true";
    protected String mailEmailFrom = "@gmail.com";
    protected String username = "@gmail.com";
    protected String password = "pass";

    public boolean sendTextEmail(String recipientEmail, String subject, String content) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", mailSmtpAuth);
        props.put("mail.smtp.starttls.enable", mailSmtpStarttlsEnable);
        props.put("mail.smtp.host", mailSmtpHost);
        props.put("mail.smtp.port", mailSmtpPort);

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailEmailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(content);

            Transport.send(message);
            return true;
        } catch (MessagingException e) {
            //do nothing
            System.err.println("" + e);
        }

        return false;
    }

}
