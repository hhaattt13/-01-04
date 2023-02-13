package Exesize2;

import Exesize2.Interfaces.Tool;

public class Main {
    public static void main(String[] args){
        Guitar classic = new Guitar(6);
        Drum tom = new Drum("70x70");
        Tube bi = new Tube(10);

        Tool[] tools = new Tool[] {
          classic, tom, bi
        };

        for (Tool tool : tools){
            tool.play();
        }
    }
}
