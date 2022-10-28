package com.company;
import  java.util.*;

public class linklist {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        List<Integer> list =new LinkedList<>();
        Set<Integer> set=new TreeSet<>();
        System.out.println("Enter 10 numbers :");
        for(int i=0;i<10;i++){
            int number=sc.nextInt();
            list.add(number);
            set.add(number);
        }
        for (int element :list){
            System.out.print(element +",");
        }
        System.out.println();
        System.out.println("Original list :"+list);
        Collections.sort(list);
        System.out.println("Sorted list   :"+list);
        Collections.reverse(list);
        System.out.println("Reverse list  :"+list);
        System.out.println("Size          :"+list.size());
        System.out.println("Minimum number:"+Collections.min(list));
        System.out.println("Index of max no:"+list.indexOf(Collections.max(list)));
        //System.out.println(list[1]);
        System.out.println("*******************************");
        for (int element :set){
            System.out.print(element +",");
        }
        System.out.println();
        System.out.println("Set :"+set);
        //Collections.reverse(set);
        System.out.println("Size :"+set.size());
        System.out.println("Max :"+Collections.max(set));
    }

}

