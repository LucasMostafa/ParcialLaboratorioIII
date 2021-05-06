package com.company;

public class Printer extends Informatic implements Discount{
    //Ejercicio 1
    //Atributos
    private int impressionsAmount;

    //Constructores
    public Printer(){
        super();
    }

    public Printer(int stock, String name, double price, String maker, int impressionsAmount){
        super(stock, name, price, maker);
        this.impressionsAmount= impressionsAmount;
    }

    //Getter and Setter
    public int getImpressionsAmount() {
        return impressionsAmount;
    }

    public void setImpressionsAmount(int impressionsAmount) {
        this.impressionsAmount = impressionsAmount;
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return super.toString() + "\nImpresora: " + "Cantidad de impresiones por minuto: " + this.impressionsAmount;
    }

    @Override
    public double offer(int discount) {
        double price= super.getPrice();
        return price-= price * discount /100;
    }
}
