package com.lsc.lab1.memory;

public class Samsung extends Memory {

    public Samsung() {
        setName("Samsung");
        setPrice(90);
        setVolume(3);
    }

    public Samsung(String name, int price, int volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    @Override
    public void work() {
        System.out.println("Memory work");
    }
}
