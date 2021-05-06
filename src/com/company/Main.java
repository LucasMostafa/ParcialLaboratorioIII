package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //Ejercicio 3
        Chair chair= new Chair(10, "Silla de escritorio", 25000, true);
        Desk desk= new Desk(5, "Escritorio gamer", 15000, 0.75, 1.75);
        Printer printer= new Printer(50, "HP1500", 30000, "HP", 10);
        Notebook notebook= new Notebook(25, "Lenovo JP21L", 150000, "Lenovo", 960);

        List<Product> listProduct= new ArrayList<>();
        listProduct.add(chair);
        listProduct.add(desk);
        listProduct.add(printer);
        listProduct.add(notebook);

        for (Product x: listProduct) {
            System.out.println(x.toString());
        }

        //Ejercicio 4
        chair.setPrice(chair.offer(15));
        System.out.println(chair.toString());

        printer.setPrice(printer.offer(10));
        System.out.println(printer.toString());

        //Ejercicio 5
        for (Product x: listProduct) {
            x.priceUpdate(x);
        }
    }
}
