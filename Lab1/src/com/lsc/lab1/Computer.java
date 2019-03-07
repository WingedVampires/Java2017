package com.lsc.lab1;

import com.lsc.lab1.caliche.*;
import com.lsc.lab1.cpu.*;
import com.lsc.lab1.mainboard.*;
import com.lsc.lab1.memory.*;

public class Computer {
    private Caliche caliche;
    private Cpu cpu;
    private MainBoard mainBoard;
    private Memory memory;
    private String name;

    public Computer() {
        caliche = new Seagate();
        cpu = new Intel();
        mainBoard = new Asus();
        memory = new Samsung();
        name = "Computer";
    }

    public Computer(String name, Caliche caliche, Cpu cpu, MainBoard mainBoard, Memory memory) {
        this.name = name;
        this.caliche = caliche;
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.memory = memory;
    }

    public int getPrice() {
        return caliche.getPrice() + cpu.getPrice() + mainBoard.getPrice() + memory.getPrice();
    }

    public String getDescription() {
        return cpu.getName()+ " " + memory.getName() + " " + mainBoard.getName() + " " + caliche.getName();
    }

    public void work() {
        cpu.work();
        memory.work();
        mainBoard.work();
        caliche.work();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCaliche(Caliche caliche) {
        this.caliche = caliche;
    }

    public Caliche getCaliche() {
        return caliche;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Memory getMemory() {
        return memory;
    }
}
