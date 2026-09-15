package com.model;
public record Transaction(String senderIBAN, String receiverIBAN, double amount) {}