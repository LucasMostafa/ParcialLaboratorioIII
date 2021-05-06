package com.company;

public class Notebook extends Informatic{
    //Ejercicio 1
    //Atributos
    private  int memory;

    //Constructor
    public Notebook(){
        super();
    }

    public Notebook(int stock, String name, double price, String maker, int memory){
        super(stock, name, price, maker);
        this.memory= memory;
    }

    //Getter and Setter
    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    //Metodos
    //Ejercicio 2
    @Override
    public String toString(){
        return super.toString() + "Nootebok: " + "Espacio de memoria en GB: " + this.memory;
    }
}
