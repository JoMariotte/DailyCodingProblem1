package com.problem.jo;

import java.util.ArrayList;

public class Util {

    public static boolean findPair(int[] arr, int k) {
        boolean foundIt = false;
        ArrayList<Integer> comp = new ArrayList<>();
        int counter = 0;
        while(foundIt != true && counter < arr.length) {
            if(comp.contains(arr[counter]))
                foundIt = true;
            else
                comp.add(k - arr[counter]);
            counter++;
        }
        System.out.println("counter : " + counter + "\n");
        return foundIt;
    }

}
