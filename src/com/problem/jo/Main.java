package com.problem.jo;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class Main {

    public static void main(String[] args) {
        int[] intArrayTest1 = {10,15,3,7};
        int[] intArrayTest2 = {7,2,13,16,14,0,12,7,8,-2};
        Random random = new Random();
        int[] intArrayTestRand = random.ints(100000,-20000,20000).toArray();
        long start = currentTimeMillis();
        boolean res = Util.findPair(intArrayTestRand,1561);
        long end = currentTimeMillis();
        System.out.println(res);
        long duration = (end - start);
        System.out.println("\n\nTemps d'exécution : " + duration);
    }
}
