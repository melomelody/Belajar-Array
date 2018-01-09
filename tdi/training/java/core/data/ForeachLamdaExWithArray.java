package tdi.training.java.core.data;

import java.util.List;
import java.util.Arrays;
import java.math.BigDecimal;

public class ForeachLamdaExWithArray {

    public static void main(String[] args){
        List<Object> values = Arrays.asList(
            "Dimas Maryanto", 
            23, 
            false, 
            new BigDecimal(100000), 
            20.5d
        );

        values.forEach((value) -> { System.out.println(value); });
    }
}