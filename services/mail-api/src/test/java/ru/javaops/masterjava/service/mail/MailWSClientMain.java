package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendToGroup(
                ImmutableSet.of(new Addressee("To <demis131194@mail.ru>")),
                ImmutableSet.of(new Addressee("Copy <demis131194@mail.ru>")), "Subject", "Body");
    }
}