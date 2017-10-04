package pdf4ejem3;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Gonzalo
 */
public class PDF4Ejem3 {

    public static void main(String[] args) {
        // Definir un HashMap 
        HashMap global = new HashMap();
 
       // Insertar valores "key"-"value" al HashMap 
       global.put("Laura", "667895789");
       global.put("Pepe", "645895756");
       global.put("Abelardo", "55895711");
       global.put("Daniel", "667111788"); 
       global.put("Arturo", "667598623");
 
       // Definir Iterator para extraer o imprimir valores 
       for( Iterator it = global.keySet().iterator(); it.hasNext();) { 
           String s = (String)it.next();
           String s1 = (String)global.get(s); 
           System.out.println("Alumno: "+s + " - " + "Telefono: "+s1); 
       }
    }
    
}
