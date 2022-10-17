package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,6,8,9,2,1,3,0,2,4,5,8};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }
            else{
                histogram.put(data[i], 1);
            }
            
        }
        
        for(Integer key: histogram.keySet()){
           System.out.println(key + " ==> " + histogram.get(key)); 
        }
    
    }
    
}
