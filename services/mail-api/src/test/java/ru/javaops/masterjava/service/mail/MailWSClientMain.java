package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableList;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendMail(
                ImmutableList.of(new Addressee("To <demis131194@mail.ru>")),
                ImmutableList.of(new Addressee("Copy <demis131194@mail.ru>")), "Subject", "Body");
    }
}