/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Alejandro
 */
public enum Direccionales {
    APAGADAS("apagadas"), IZQUIERDA("a la izquierda"), DERECHA("a la derecha"), 
            INTERMITENTES("en intermitencia");
    private String estado;
    
    private Direccionales(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
