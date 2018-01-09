package tdi.training.java.core.array;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class ArrayFwList{
    public static void main(String[] args){
        List values = new ArrayList();
        values.add("Mel");
        values.add("odie");
        values.add(10);
        values.add(true);
        values.add(new BigDecimal(1000000));

        for(int i=0; i < values.size(); i++)
            System.out.println(values.get(i));

    }
}
