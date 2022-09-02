package com.example.springio;

public class Telenor implements Sim{
    @Override
    public void call() {
        System.out.println("Calling from Telenor");
    }

    @Override
    public void browsing() {
        System.out.println("Browsing through Telenor");
    }
}
