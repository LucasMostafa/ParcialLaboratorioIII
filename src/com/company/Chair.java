package com.company;

public class Chair extends Piece implements Discount{
    //Ejercicio 1
    //Atributos
    private boolean wheel;

    //Constructor
    public Chair(){
        super();
    }

    public Chair(int stock, String name, double price, boolean wheel){
        super(stock, name, price);
        this.wheel= wheel;
    }

    //Getter and Setter
    public boolean isWheel() {
        return wheel;
    }

    public void setWheel(boolean wheel) {
        this.wheel = wheel;
    }

    //Metodos
    public String chairWheels(boolean x){
        if(x==true)
           return "Posee";
        else
           return "No posee";
    }

    //Ejercicio 2
    @Override
    public String toString(){
        return super.toString() + "\nSilla: " + "Ruedas: " + chairWheels(this.wheel);
    }

    @Override
    public double offer(int discount){
        double price= super.getPrice();
        return price-= price * discount /100;
    }

}
