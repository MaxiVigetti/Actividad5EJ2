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
public class Perro extends Animal {
    
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Perro(String _color, String _tamaño) {
        super(_color, _tamaño);
    }
    
    public void mostrarDatos() {
        
        JOptionPane.showMessageDialog(null,"PERRO \nTamaño: " + getTamaño()+ "\nColor" + getColor() +"\nRaza: " + getRaza());
    }
}
