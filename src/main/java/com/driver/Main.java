package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        RWOnly name = new RWOnly();
        name.setName("Pushp Ratan");
        System.out.println(name.getName());
    }
}