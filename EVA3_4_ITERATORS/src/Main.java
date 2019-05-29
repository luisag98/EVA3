
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Integer> alDatos = new ArrayList();
        alDatos.add(100);
        alDatos.add(200);
        alDatos.add(300);
        alDatos.add(400);
        alDatos.add(500);
        
        // IMPRIMIR CADA DATO
        for (int i = 0; i < alDatos.size(); i++) {
            System.out.print("[" + alDatos.get(i) + "]");
        }
        System.out.println("\nUSANDO ITERATOR");
        for (Iterator<Integer> iterator = alDatos.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.print("[" + next + "]");
        }
        Iterator itMiItera = alDatos.iterator();
        System.out.println("");
        while(itMiItera.hasNext()){
            System.out.print("[" + itMiItera.next() + "]");
        }
    }
    
}
