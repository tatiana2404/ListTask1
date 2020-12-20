package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Elements {
    private static ArrayList <Integer> element=new ArrayList<>();

    public static void actions(){
        for (int i=0; i<10;i++){
            element.add(i+5);
        }
        System.out.println(Arrays.toString(element.toArray()));
        
        element.remove(0);
        element.remove(0);
        element.remove(element.size()-1);

        System.out.println(Arrays.toString(element.toArray()));
    }
}
