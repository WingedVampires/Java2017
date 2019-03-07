package com.lsc.lab1.memory;

public abstract class Memory {
    private String name;
    private int volume;
    private int price;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract void work();
}
