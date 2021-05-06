package com.company;

public class Product {
    //Ejercicio 1
    //Atributos
    private int stock;
    private String name;
    private double price;

    //Constructor
    public Product(){
    }

    public Product(int stock, String name, double price){
        this.stock= stock;
        this.name= name;
        this.price= price;
    }

    //Getter and Setter
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return "Stock: " + this.stock + " | Nombre: " + this.name + " | Precio: " + this.price;
    }

    //Ejercicio 5
    public void priceUpdate(Product product){

        if(product instanceof Chair){
            System.out.println("\nRuedas:\nPrecio anterior: " + product.getPrice());
            product.setPrice(product.getPrice()*1.05);
            System.out.println("Precio nuevo: " + product.getPrice());
        }
        if(product instanceof Desk){
            System.out.println("\nEscritorio:\nPrecio anterior: " + product.getPrice());
            product.setPrice(product.getPrice() * 1.10);
            System.out.println("Precio nuevo: " + product.getPrice());
        }
        if(product instanceof Printer){
            System.out.println("\nImpresora:\nPrecio anterior: " + product.getPrice());
            product.setPrice(product.getPrice() * 1.15);
            System.out.println("Precio nuevo: " + product.getPrice());
        }
        if(product instanceof Notebook){
            System.out.println("\nNotebook:\nPrecio anterior: " + product.getPrice());
            product.setPrice(product.getPrice() * 1.10);
            System.out.println("Precio nuevo: " + product.getPrice());
        }
    }

}
