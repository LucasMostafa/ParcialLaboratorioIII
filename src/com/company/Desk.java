package com.company;

public class Desk extends Piece{
    //Ejercicio 1
    //Atributos
    private double high;
    private double width;

    //Constructor
    public Desk(int stock, String name, double price, double high, double width){
        super(stock, name, price);
        this.high= high;
        this.width= width;
    }

    //Getter and Setter
    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return super.toString() + "\nEscritorio: " + "Alto: " + this.high + " | Ancho: " + this.width;
    }
}
