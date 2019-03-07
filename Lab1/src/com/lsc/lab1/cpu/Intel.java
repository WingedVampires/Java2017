package com.lsc.lab1.cpu;


public class Intel extends Cpu {

    public Intel() {
        setName("Intel");
        setPrice(100);
        setCoreNum(1);
    }

    public Intel(String name, int price, int coreNum) {
        setName(name);
        setPrice(price);
        setCoreNum(coreNum);
    }

    @Override
    public void work() {
        System.out.println("CPU work");
    }
}
