package com.example.springio;

public class Ufone implements Sim{
    public Ufone() {
        System.out.println("---Ufone object is called----");
    }

    @Override
    public void call() {
        System.out.println("Calling from Ufone");
    }

    @Override
    public void browsing() {
        System.out.println("Browsing from Ufone");

    }
}
