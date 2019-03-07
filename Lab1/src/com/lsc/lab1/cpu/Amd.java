package com.lsc.lab1.cpu;

public class Amd extends Cpu {

    public Amd() {
        setName("AMD");
        setPrice(50);
        setCoreNum(2);
    }
    public Amd(String name, int price, int coreNum) {
        setName(name);
        setPrice(price);
        setCoreNum(coreNum);
    }

    @Override
    public void work() {
        System.out.println("CPU work");
    }
}
