package com.company;

public class Piece extends Product{
    //Ejercicio 1
    //Constructores
    public Piece(){
        super();
    }

    public Piece(int stock, String name, double price){
        super(stock, name, price);
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return "\nMueble: \n" + super.toString();
    }
}
