package com.lsc.lab1.mainboard;

public class Asus extends MainBoard{

    public Asus() {
        setName("Asus");
        setPrice(70);
        setSpeed(7.0);
    }
    public Asus(String name, int price, Double speed) {
        setName(name);
        setPrice(price);
        setSpeed(speed);
    }

    @Override
    public void work() {
        System.out.println("MainBoard work");
    }
}
