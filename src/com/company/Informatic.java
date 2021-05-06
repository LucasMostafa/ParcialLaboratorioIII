package com.company;

public class Informatic extends Product{
    //Ejercicio 1
    //Atributos
    private String maker;

    //Cosntructores
    public Informatic(){
        super();
    }

    public Informatic(int stock, String name, double price, String maker){
        super(stock, name, price);
        this.maker= maker;
    }

    //Getter and Setter
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return "\nProducto informatico: \n" + super.toString() + " | Fabricante: " + this.maker;
    }
}
