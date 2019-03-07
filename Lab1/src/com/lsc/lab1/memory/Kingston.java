package com.lsc.lab1.memory;

public class Kingston extends Memory {

    public Kingston() {
        setName("Kingston");
        setPrice(45);
        setVolume(4);
    }
    public Kingston(String name, int price, int volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    @Override
    public void work() {
        System.out.println("Memory work");
    }
}
