package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class integertostring {
    public static void main(String [] args){
        ArrayList<Character> charact=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        try {
            int x = sc.nextInt();
            String s = String.valueOf(x);
            String s1 = "";
            String s2[] = s.split("");
            System.out.println(Arrays.toString(s2));
            for (String s3 : s2) {
                int i = Integer.valueOf(s3);
                i = i + 2;
                String s4 = String.valueOf(i);
                s1 = s1 + s4;
                charact.add(s4.charAt(0));
            }
            System.out.println("String :" + s1);
            System.out.println("String length :" + s1.length());
            System.out.println("Character :" + charact);
            System.out.println("Integer :" + Integer.valueOf(s1));
            String s5[] = s1.split("");
            Arrays.sort(s5);
            System.out.println(Arrays.toString(s5));
            System.out.println(s5.length);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
