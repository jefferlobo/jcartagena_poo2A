/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author jeffe
 */
public class Aplicaccion {
    public static void main(String[]args){
    Scanner  leer=new Scanner(System.in);
    Persona p1=new Persona();
    Persona p2=new Persona();
    Persona p3=new Persona();
        System.out.println("Imgrese la cedula de la persona 1:");
    p1.setCi(leer.next());
        System.out.println("Imgrese el nombre:");
    p1.setNombre(leer.next());
    System.out.println("Imgrese el apellido:");
    p1.setApellido(leer.next());
    p1.setGenero(Persona.TipoGenero.Masculino);
        System.out.println(p1.toString());
        
        
        System.out.println("Ingresa la cedula de la persona 2:");
        p2.setCi(leer.next());
        System.out.println("Ingrese el nombre: ");
        p2.setNombre(leer.next());
        System.out.println("Imgrese el apellido:");
        p2.setApellido(leer.next());
        p2.setGenero(Persona.TipoGenero.Femenino);
        
        System.out.println(p2.toString());
        
        System.out.println("Ingresa la cedula de la persona 3:");
        p3.setCi(leer.next());
        System.out.println("Ingrese el nombre: ");
        p3.setNombre(leer.next());
        System.out.println("Imgrese el apellido:");
        p3.setApellido(leer.next());
        p3.setGenero(Persona.TipoGenero.Masculino);
        
        System.out.println(p3.toString());
        System.out.println("Fin");
    }
}
