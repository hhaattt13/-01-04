package Exesize1;

import Exesize1.Intefaces.Printable;

public class Book implements Printable {

    String name;
    public Book(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    public static void printBooks(Printable[] printable){
        System.out.println("Книги: ");
        for (Printable print : printable){
            if (print instanceof Book){
                print.print();
            }
        }
    }
}
