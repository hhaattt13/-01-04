package Exesize1;

import Exesize1.Intefaces.Printable;

public class Main {
    public static void main(String[] args) {
        Book Kon = new Book("Конь");
        Magazine Maksim = new Magazine("Максим");
        Book oChemDymaytEzi = new Book("О чем думают ежи?");
        Magazine MyMoscow = new Magazine("Моя Москва");

        Printable[] printable;
        printable = new Printable[] {
                Kon, Maksim, oChemDymaytEzi, MyMoscow
        };

        for (Printable print : printable){
            print.print();
        }

        System.out.println();
        Magazine.printMagazines(printable);

        System.out.println();
        Book.printBooks(printable);
    }
}