package tdi.training.java.core.data;

import java.util.List;
import java.util.ArrayList;

public class NoGenericsTypeInList {

    public static void main(String[] args){
        List listValue = new ArrayList();

        listValue.add("Value");

        // will be need converted because the type of list is object
        String singleValue = (String) listValue.get(0);
    }
}