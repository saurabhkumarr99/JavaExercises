package com.company;
import java.util.*;

public class arraylist_multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> determinant=new ArrayList<>();
        System.out.println("Write dimensions of determinant");
        int r=sc.nextInt();
        int c= sc.nextInt();
        for(int i=0;i<r;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<c;j++){
                list.add(sc.nextInt());
            }
           determinant.add(list);
        }
        System.out.println(determinant);
       for(ArrayList<Integer> e:determinant){
           System.out.println(e);
           Collections.sort(e);
           System.out.println(e);
       }
        for(ArrayList<Integer> e:determinant){
            Collections.sort(e);
            for(Object ele:e){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
