package com.example.springio;

import com.example.springio.Sim;

public class Zong implements Sim {
    @Override
    public void call() {
        System.out.println("Calling from zong");
    }

    @Override
    public void browsing() {
        System.out.println("Browsing from zong");

    }

}
