package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14));
        Integer s1 = list1.size();
        List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(40, 50, 7, 8, 9, 15, 16, 17, 19, 10, 11, 12, 13, 14));
        Integer s2 = list2.size();
        System.out.println(list1);
        System.out.println(list2 + "\n");

        System.out.println("Первый способ: ");

        for(Integer iter1 : list1) {
            for(Integer iter2 : list2) {
                if(iter1 == iter2){
                    System.out.print(iter1 + " ");
                }
            }
        }

        System.out.println("\n\n" + "Второй способ: ");

        Set<Integer> set = new HashSet<>(list2);
        for(Integer iter1 : list1) {
            if(set.contains(iter1)){
                System.out.print(iter1 + " ");
            }
        }

        System.out.println("\n\n" + "Третий способ: ");

        Iterator<Integer> iter1 = list1.iterator();
        Iterator<Integer> iter2 = list2.iterator();
        for(int i = 0; i < (s2 - s1); i++){
            iter2.next();
        }
        Integer val = 0;
        for(int i = 0; i < s1; i++){
            val = iter1.next();
            if(val == iter2.next()){
                System.out.print(val + " ");
            }
        }
    }
}

/*
    Iterator<Integer> iter1 = list1.iterator();
    Iterator<Integer> iter2 = list2.iterator();
    ListIterator<Integer> iterator2 = list1.listIterator(list1.size());
    ListIterator<Integer> iterator1 = list1.listIterator();
    System.out.println(iterator1.next());
    System.out.println(iterator1.next());
    System.out.println(list1.iterator().next());
 */