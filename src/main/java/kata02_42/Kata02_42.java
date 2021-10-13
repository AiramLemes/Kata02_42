package kata02_42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Kata02_42 {
    
    public static void main(String[] args) {
      
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};

        
        Histogram histo = new Histogram(data);
       
        
        Map<String, Integer> histogr = histo.getHistogram();
        

        
        for (String key : histogr.keySet()) {
            
            System.out.println(key + " ==> " + histogr.get(key));
        
        }
    
    }
}
