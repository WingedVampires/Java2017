package com.lsc.lab1.mainboard;

public class Gigabyte extends MainBoard {

    public Gigabyte() {
        setName("Gigabyte");
        setPrice(35);
        setSpeed(8.0);
    }

    public Gigabyte(String name, int price, Double speed) {
        setName(name);
        setPrice(price);
        setSpeed(speed);
    }

    @Override
    public void work() {
        System.out.println("MainBoard work");
    }
}
