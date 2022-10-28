package com.company;
import java.util.*;

public class jaggedArray {
    public static void main(String[] args) {
        String[] arr1={"Red","Blue","Green"};
        ArrayList<ArrayList<String>> arr2=new ArrayList<>();
        ArrayList<Integer> size =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            size.add(arr1[i].length());
        }
        int max=Collections.max(size);
        for(int i=0;i<arr1.length;i++){
            size.add(arr1[i].length());
            ArrayList<String> l =new ArrayList<>();
            for(String s2: arr1[i].split("")){
                l.add(s2);
            }
            for(int j=l.size()+1;j<=max;j++){
                l.add(" ");
            }
            arr2.add(l);
        }
      for(int i=0;i<max;i++){
          for(ArrayList<String> arr3 :arr2){
              System.out.print(arr3.get(i));
          }
          System.out.println();
      }

    }
}
