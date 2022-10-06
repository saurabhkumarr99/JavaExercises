package com.company;
import java.util.*;

public class treemap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();

        TreeMap<Integer,String> treemap =new TreeMap<>();
        for(int i=0;i<n;i++){
            String value=sc.next();
            int key =value.length();
            treemap.put(key,value);
        }

        System.out.println(treemap);

        for(int k : treemap.keySet()){
            System.out.println("Key is : "+k +" Value is : " +treemap.get(k));
        }

        for(String v : treemap.values()){
            System.out.println("Value is : " +v);
        }

        for(Map.Entry<Integer,String> entry : treemap.entrySet()){
            System.out.println("Key is : "+entry.getKey() +" Value is : " +entry.getValue());
        }
    }
}

