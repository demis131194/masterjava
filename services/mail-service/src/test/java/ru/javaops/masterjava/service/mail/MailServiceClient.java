package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;
import ru.javaops.web.WebStateException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

public class MailServiceClient {

    public static void main(String[] args) throws MalformedURLException, WebStateException {
        Service service = Service.create(
                new URL("http://localhost:8080/mail/mailService?wsdl"),
                new QName("http://mail.javaops.ru/", "MailServiceImplService"));

        MailService mailService = service.getPort(MailService.class);

        String state = mailService.sendToGroup(ImmutableSet.of(new Addressee("demis131194@mail.ru", null)), null,
                "Group mail subject", "Group mail body");
        System.out.println("Group mail state: " + state);

        GroupResult groupResult = mailService.sendBulk(ImmutableSet.of(
                new Addressee("Мастер Java Denis <demis131194@mail.ru>"),
                new Addressee("Bad Email <bad_email.ru>")), "Bulk mail subject", "Bulk mail body");
        System.out.println("\nBulk mail groupResult:\n" + groupResult);
    }
}
