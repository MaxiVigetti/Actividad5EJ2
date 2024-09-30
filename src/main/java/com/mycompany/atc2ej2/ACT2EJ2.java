
package com.mycompany.atc2ej2;


public class ACT2EJ2 {

    public static void main(String[] args) {
        
        Perro objPerro = new Perro(":negro", ":Mediano");
        
        objPerro.setRaza(":Galgo");
        objPerro.mostrarDatos();
     
        Gato objGato = new Gato(":Blanco", ":Chico");
        
        objGato.setPelaje(":Largo");
        objGato.mostrarDatos();
        
        Caballo objCaballo = new Caballo(":Marron", ":Grande");
        
        objCaballo.setDeporte("Polo");
        objCaballo.mostrarDatos();
         
        System.out.println("Para probar git");
       System.out.println("Para probar git");
               
  
    }
}
