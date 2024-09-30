/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atc2ej2;

import javax.swing.JOptionPane;

/**
 *
 * @author prueba
 */
public class Gato extends Animal {

    private String pelaje;

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Gato(String color, String tamaño) {
        super(color, tamaño);
    }    
        
    public void mostrarDatos() {
        
        JOptionPane.showMessageDialog(null,"GATO \nTamaño: " + getTamaño()+ "\nColor" + getColor() +"\nPelaje: " + getPelaje());
    }    
    

}
