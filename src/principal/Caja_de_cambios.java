
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Alejandro
 */
public enum Caja_de_cambios {
    NEUTRAL("en neutral"), PRIMERA("en primera"), SEGUNDA("en segunda"), TERCERA("en tercera"), CUARTA("en cuarta");
     private String estado;
    
    private Caja_de_cambios(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
