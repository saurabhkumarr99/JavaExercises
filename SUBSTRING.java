package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SUBSTRING {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write the sentence : ");
        String string=sc.nextLine();
        System.out.println();
        ArrayList<String> substring=new ArrayList<>();
        for(int i=0;i<string.length();i++){

            for(int j=i;j<string.length();j++){
                String sub="";
                for(int k=i;k<=j;k++){
                    sub=sub+string.charAt(k);
                }
               substring.add(sub);
            }
        }
        System.out.println("String is : "+string);
        System.out.println("Substring is : "+substring);
        System.out.println("Size of substring is : "+substring.size());
        //Collections.sort(substring);
        //System.out.println("Sorted sublist is : "+substring );
    }
}
