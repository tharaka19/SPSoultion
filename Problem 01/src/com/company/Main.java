package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        System.out.println(functionOne(nums));
        System.out.println(functionTwo(nums));

    }

    public static int functionOne (List<Integer> numList){
        int sum = 0;
        for (int number : numList){
            sum += number;
        }
        return sum;
    }

    public static int functionTwo(List<Integer> numList){
        int sum = 0;
        int a = 0;
        while(a < numList.size()){
            sum += numList.get(a);
            a++;
        }
        return sum;
    }

    public static int recursion(List<Integer> numList){

    }



}
