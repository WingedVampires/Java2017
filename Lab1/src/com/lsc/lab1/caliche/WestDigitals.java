package com.lsc.lab1.caliche;

public class WestDigitals extends Caliche {

    public WestDigitals() {
        setName("WestDigitals");
        setPrice(40);
        setVolume(6);
    }

    public WestDigitals(String name, int price, int volume) {
        setName(name);
        setPrice(price);
        setVolume(volume);
    }

    @Override
    public void work() {
        System.out.println("Caliche work");
    }
}
