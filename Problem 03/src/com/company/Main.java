package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci(){
        List<Long> integers = new ArrayList<>();
        integers.add(0L);
        integers.add(1L);
        for (int a= 2; a < 100; a++){
            Long nestNumber = integers.get(a-2) + integers.get(a-1);
            integers.add(nestNumber);
        }
        System.out.println(integers);
    }
}
