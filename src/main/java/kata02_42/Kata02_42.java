package kata02_42;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class Kata02_42 {
    
    public static void main(String[] args) {
    
        int[] data = {1, 3, 3, 4, 5, 6, 7, 9, 9, 10, 11, 11, 14, 14, 14};

        HashMap<Integer, Integer> histogram = new HashMap<Integer, Integer>();

        
        
        
        
        for (int i = 0; i < data.length; i++) {

            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            }

            else {
                histogram.put(data[i], 1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            
            System.out.println(key + " ==> " + histogram.get(key));
        
        }
    
    }
}