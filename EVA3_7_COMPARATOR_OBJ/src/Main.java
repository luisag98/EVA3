
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Persona> llObjetos = new LinkedList();
        llObjetos.add(new Persona());
        llObjetos.add(new Persona("Juan", "Gonzalez", 52));
        llObjetos.add(new Persona("Claudia", "Ordoñez", 46));
        llObjetos.add(new Persona("Pedro", "Picapiedra", 39));
        llObjetos.add(new Persona("Cristina", "Perez", 14));
        
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre: "+next.getNombre());
            System.out.println("Apellido: "+next.getApellido());
            System.out.println("Edad: "+next.getEdad());
        }
        
        Comparator cEdad = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                    Persona pPer1 = (Persona)o1;
                    Persona pPer2 = (Persona)o2;
                    return pPer1.getEdad() - pPer2.getEdad();
            }
        };
            
        llObjetos.sort(cEdad);
        System.out.println("///////////////////////////");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre: "+next.getNombre());
            System.out.println("Apellido: "+next.getApellido());
            System.out.println("Edad: "+next.getEdad());
        }
        
    }

    
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        nombre = "Luisa";
        apellido = "González";
        edad = 20;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}