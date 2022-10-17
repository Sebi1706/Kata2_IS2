package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    
    public static void main(String[] args) {
        int [] data = {1,4,4,6,3,7,1,9,8,5,3,2,6,1,7};
        
        Map <Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i< data.length; i++){
            histogram.put(data[i],histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
            
            
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
}