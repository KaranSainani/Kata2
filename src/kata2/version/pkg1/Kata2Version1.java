package kata2.version.pkg1;

import java.util.Map;

public class Kata2Version1 {

    public static void main(String[] args) {
        String [] data = {"Rosa", "Pepe", "Juan", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr;
        histogr = histo.getHistogram();
        
            
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));   
        }
            
    }
    
}
