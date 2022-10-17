package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    
    
    public static void main(String[] args) {
        //Integer [] data = {1,4,4,6,3,7,1,9,8,5,3,2,6,1,7};
        String [] data = {"Maria", "Alberto", "Juan","Pepe", "Juan", "Toni", "Pepe", "Maria", "Maria", "Toni"};
        
        HistogramGenerator<String> histogramGenerator = new HistogramGenerator(data);

        Map<String, Integer> histogram = histogramGenerator.getHistogram();
        
        for (Map.Entry<String, Integer> entry : histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
    
}
