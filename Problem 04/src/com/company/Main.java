package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Vector<String> arr = new Vector<>();
        arr.add("50");
        arr.add("2");
        arr.add("1");
        arr.add("9");
        largestNumber(arr);
    }

    public static void largestNumber(Vector<String> arr){
        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String  x, String y) {
                String xy = x + y;
                String yx = y + x;
                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });

        Iterator iterator = arr.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
