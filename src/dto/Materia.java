/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author jdcob
 */
public class Materia implements Serializable {
    private String nombremate;
    
     
    
    public String obtenerNombre(){
        return this.nombremate;
    }

    
    public void modificaNombre(String nombre){
        this.nombremate = nombre;
    }
  
    public String getNombre() {
        return nombremate ;
    }

    public void setNombre(String nombre) {
        this.nombremate = nombre;
    }

  


    @Override
    public String toString() {
        return this.nombremate;
    }
}
