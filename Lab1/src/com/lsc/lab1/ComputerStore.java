package com.lsc.lab1;

import com.lsc.lab1.caliche.*;
import com.lsc.lab1.cpu.*;
import com.lsc.lab1.mainboard.*;
import com.lsc.lab1.memory.*;

import java.util.ArrayList;

public class ComputerStore {

    private ArrayList<Computer> computers =  new ArrayList();

    public ComputerStore() {
        computers.add(new Computer("Computer1", new Seagate(), new Intel(), new Asus(), new Samsung()));
        computers.add(new Computer("Computer2", new WestDigitals(), new Intel(), new Gigabyte(), new Samsung()));
        computers.add(new Computer("Computer3", new Seagate(), new Amd(), new Asus(), new Kingston()));
    }

    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();

        computerStore.showPrices();
        computerStore.showDescriptions();
        computerStore.work();
    }

    public void showPrices() {
        for (Computer i : computers) {
            System.out.println(i.getName() + "的价格是: " + i.getPrice());
        }
    }

    public void showDescriptions() {
        for (Computer i : computers) {
            System.out.println(i.getName() + "的配置是: " + i.getDescription());
        }
    }

    public void work() {
        for (Computer i : computers) {
            System.out.println(i.getName() + " work:");
            i.work();
        }
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void setComputer(int index, Computer computer) {
        if (index > 0 && index < computers.size()) {
            computers.set(index, computer);
        }
    }
}
