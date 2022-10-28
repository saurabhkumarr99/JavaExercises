package com.company;
import  java.util.*;

public class set {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n numbers :");
        int n=sc.nextInt();
        List<Integer> original=new ArrayList<>();
        List<Integer> duplicate=new LinkedList<>();
        Set<Integer> unique1 =new TreeSet<>();
        Set<Integer> unique2 =new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            original.add(sc.nextInt());
        }
        for(int e:original){
            if(unique1.add(e)==false){
                duplicate.add(e);
            }
            unique2.add(e);
        }
        for(int e :unique1){
            System.out.println(e);
        }
        System.out.println("Original :"+original + "size is : "+original.size());
        System.out.println("Unique1   :"+unique1+ "size is : "+unique1.size());
        System.out.println("Unique2   :"+unique2+ "size is : "+unique2.size());
        System.out.println("Duplicate:"+duplicate+ "size is : "+duplicate.size());
    }
}
