package tdi.training.java.core.data;

import java.util.List;
import java.util.ArrayList;

public class GenericsTypeInList {

    public static void main(String[] args){
        List<String> listValue = new ArrayList();

        listValue.add("Value");

        // no need convert, karena udah menggunakan tipe data String
        String singleValue = listValue.get(0);
    }
}