package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class MailServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        Service service = Service.create(
                new URL("http://localhost:8080/mail/mailService?wsdl"),
                new QName("http://mail.javaops.ru/", "MailServiceImplService"));

        MailService mailService = service.getPort(MailService.class);
        mailService.sendToGroup(ImmutableSet.of(
                new Addressee("demis131194@mail.ru", null)), Collections.emptySet(), "Subject", "Body");
    }
}
