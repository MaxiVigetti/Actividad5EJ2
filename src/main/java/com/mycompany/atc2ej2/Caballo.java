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
public class Caballo extends Animal {

    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Caballo(String color, String tamaño) {
        super(color, tamaño);
    }
    public void mostrarDatos() {
        
        JOptionPane.showMessageDialog(null,"CABALLO \nTamaño: " + getTamaño()+ "\nColor" + getColor() + "\nDeporte: " + getDeporte());
    }    
}
