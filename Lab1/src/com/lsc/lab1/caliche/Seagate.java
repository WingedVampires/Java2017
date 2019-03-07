package com.lsc.lab1.caliche;

public class Seagate extends Caliche {

    public Seagate() {
        setName("Seagate");
        setPrice(80);
        setVolume(5);
    }

    public Seagate(String name, int price, int volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    @Override
    public void work() {
        System.out.println("Caliche work");
    }
}
