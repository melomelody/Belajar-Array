package tdi.training.java.core.array;

public class ArrayAddValue {

    public static void main(String[] args){
        Integer[] values = new Integer[10];
        values[0] = 1;
        values[2] = 10;
        values = add(values ,50);
        System.out.println("Nilai values jumlanya sekarang ada "+ values.length);
        values = add(values, 51);
        System.out.println("Nilai values jumlanya sekarang ada "+ values.length);	
    }

    public static Integer[] add(Integer[] oldList, Integer newValue){
        Integer[] newList = new Integer[oldList.length + 1];
        for(int i = 0; i < oldList.length; i++)
            newList[i] = oldList[i];
        newList[oldList.length] = newValue;
        return newList;