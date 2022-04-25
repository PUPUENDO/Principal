/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Motocicleta moto01 = new Motocicleta("Honda", "09", 1, 250, 250, 50999.99, "Negra", true, false, true);
        Motocicleta moto01 = new Motocicleta();
        String acelera;
        /*
        moto01.encendida = true;
        moto01.luz_delantera = false;
        moto01.luz_trasera = true;
        moto01.caja_de_cambios = 1;
        moto01.cilindraje = 250;
        moto01.color = "Negra";
        moto01.marca = "Honda";
        moto01.potencia = 250;
        moto01.precio = 50999.99;
        moto01.velocidad = 0;
        moto01.kilometraje = 0;
         
        //sentencia ? instruccion : instruccion;
        System.out.println("La moto está " + (moto01.encendida ? "encendida" : "apagada"));
        System.out.println("La luz delantera está " + (moto01.luz_delantera ? "encendida" : "apagada"));
        System.out.println("La luz trasera está " + (moto01.luz_trasera ? "encendida" : "apagada"));

              if(moto01.caja_de_cambios == 1 || moto01.potencia < 500)
            System.out.println("automática");
        else if(moto01.caja_de_cambios == 2)
            System.out.println("semiautomática");
        else if(moto01.caja_de_cambios == 3)
            System.out.println("semiestándar");
        else
            System.out.println("estándar");
         
        //es un if y un else solo que ahorrandonos lineas de codigo
        System.out.println("La caja de cambios es " + (moto01.caja_de_cambios == 1 ? "automática"
                : moto01.caja_de_cambios == 2 ? "semiautomática" : "estándar"));
        System.out.println("El cilindraje es de " + moto01.cilindraje + " cc");
        System.out.println("La moto es color " + moto01.color);
        System.out.println("La moto es marca " + moto01.marca);
        System.out.println("Tiene una potencia de " + moto01.potencia + " hp");
        System.out.println("Cuesta $" + moto01.precio);
        //System.out.println("Cuesta $" + moto01.direccionales);
        moto01.setDireccionales(0);
        System.out.println("Las direccionales estan " + moto01.getDireccionales());
        //moto01.acelerar();
        */
        
        moto01.enciendeLuzDelantera();
        moto01.enciendeLuzTrasera();

        JOptionPane.showMessageDialog(null, moto01, "Info", JOptionPane.INFORMATION_MESSAGE);
        moto01.cambiaEstadoLuzDelantera();
        
    }

}
