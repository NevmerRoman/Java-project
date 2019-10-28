package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    private static int testTryFinally(){
        try{
            return 1;
        }
        finally{
            return 2;
        }
    }

    public static void main(String[] args) {
	    System.out.println(testTryFinally());

	    List<Integer> linlist = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14));
	    Set<Integer> hset = new HashSet<Integer>(Arrays.asList(40, 50, 7, 8, 9, 15, 16, 17, 19, 10, 11, 12, 13, 14));

        System.out.println(linlist);
        System.out.println(hset);

    }
}
