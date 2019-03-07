package com.lsc.lab1.cpu;

public abstract class Cpu {
    private String name;
    private int coreNum;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum= coreNum;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract void work();
}
