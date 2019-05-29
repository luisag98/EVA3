
import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList<String> llCadenas = new LinkedList();
        llCadenas.add("Hola");
        llCadenas.add("Mundo");
        llCadenas.add("Cruel");
        llCadenas.add("Estructuras");
        llCadenas.add("De");
        llCadenas.add("Datos");
        
        System.out.println(llCadenas);
/*        
        Comparator cOrdenCadenas = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                String cCade1 = (String) o1;
                String cCade2 = (String) o2;
                int iResu = 0;
                // COMPARAR
                char c1, c2;
                // HAY QUE VALIDAR QUE LA CADENA NO ESTE VACIA
                c1 = cCade1.charAt(0);
                c2 = cCade2.charAt(0);
                iResu = c1 - c2;
                return iResu;
            }
        };*/
        
        Comparator cOrdenCadenas = new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                String cCade1 = (String) o1;
                String cCade2 = (String) o2;
                int iResu = 0;
                // COMPARAR
                char c1, c2;
                // HAY QUE VALIDAR QUE LA CADENA NO ESTE VACIA
                c1 = cCade1.charAt(0);
                c2 = cCade2.charAt(0);
                iResu = c1 - c2;
                if(iResu==0){
                    int iCont = 1;
                    do {                    
                        c1=cCade1.charAt(iCont);
                        c2=cCade2.charAt(iCont);
                        iResu = c1 - c2;
                        iCont++;
                    } while (iResu==0);
                }
                return iResu;
            }
        };        
        llCadenas.sort(cOrdenCadenas);
        System.out.println(llCadenas);
    }
    
}
