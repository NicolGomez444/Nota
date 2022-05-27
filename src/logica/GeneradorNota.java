/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Estudiante;
import dto.Materia;
import dto.Nota;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import memory.Memoy;

/**
 *
 * @author jdcob
 */
public class GeneradorNota  {
public String ultimaOperacion;
    public double ultimoResultado;
    private Map<String, Nota> listaNotas;
    public GeneradorNota(){
        if (listaNotas == null){
           listaNotas = (Map<String, Nota> )Memoy.recuperar();
            if (listaNotas == null){
                listaNotas = new HashMap<>();
            }
        }
    }
   
    
    public Nota generarNota (double num1,double num2,double num3,double num4,String nombre, String codigo,String materia){
       
          Materia laMateria = this.crearMateria(materia);
           Estudiante elEstudiante = this.crearEstudiante(nombre,codigo);
           Nota c = new Nota(laMateria,elEstudiante,num1,num2,num3,num4);
           listaNotas.put(c.getCodigo(),c);
           Memoy.guardar(listaNotas);
           return c;
       
}
    private Estudiante crearEstudiante(String nombre, String codigo){
        Estudiante p = new Estudiante();
        p.modificaCodigo(codigo);
        p.modificaNombre(nombre);
        return p;
    }
    private Materia crearMateria(String materia){
        Materia m = new Materia();
        m.modificaNombre(materia);
        return m;
    }
    public Map<String, Nota> obtenerLista(){
        return this.listaNotas;
    }

    public Nota buscarNota(String codEstud, String nommateria) {
        for (Iterator<Map.Entry<String, Nota>> entries = this.listaNotas.entrySet().iterator(); entries.hasNext();) {
            Map.Entry<String, Nota> entry = entries.next();
            Nota lanota = entry.getValue();
            if (lanota.obtenerEstudiante().getCodigo().equals(codEstud)
                    && lanota.obtenerMateria().obtenerNombre().equals(nommateria)) {
                return lanota;
            }
            else
                return null;
        }
        return null;
    }

   
}