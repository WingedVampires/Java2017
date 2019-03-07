package com.lsc.lab1.mainboard;

public abstract class MainBoard {
    private String name;
    private Double speed;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract void work();
}
