package tdi.training.java.core.data;

import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;

public class ForeachLamdaExWithArrayMap {

    public static void main(String[] args){
        Map<String, Boolean> values = new HashMap<>();
        values.put("dimas", true);
        values.put("adib", false);
        values.put("rega", true);
        values.put("yusuf", true); 
        values.put("hadi", false);

        values.forEach((key, value) -> { 
            System.out.println(
                "nilai key " + key + 
                " sedangkan valuenya " + value
            ); 
        });
    }
}