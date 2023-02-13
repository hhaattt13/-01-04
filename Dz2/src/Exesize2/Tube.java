package Exesize2;

import Exesize2.Interfaces.Tool;

public class Tube implements Tool {

    int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}
