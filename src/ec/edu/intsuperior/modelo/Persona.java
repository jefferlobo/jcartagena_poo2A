/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jeffe
 */
public class Persona {
    String ci;
        String nombre;
        String apellido;
        String direccion;
       public enum TipoGenero{
        
        
        Masculino,Femenino
        }
        TipoGenero genero;
        public Persona(){
        
        
        }
        
        public Persona(String ci, String nombre, String apellido, String direccion, TipoGenero genero) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Los nombres de la persona solicitada es ;"
                + "cedula"+getCi()+"\n"
        +"Nomnre y Apellido:"+getNombre()+getApellido()+"\n"
        +"genero:"+getGenero();
    }

}
