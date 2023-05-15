package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');

        integers.add(1);
        integers.add(2);
        integers.add(3);

        System.out.println(alternatingly(characters, integers));
    }

    public static List<Integer> alternatingly(List<Character> characters, List<Integer> integers){
        List list = new ArrayList();
        for(int a = 0; a < integers.size(); a++){
            list.add(characters.get(a));
            list.add(integers.get(a));
        }
        return  list;
    }
}
