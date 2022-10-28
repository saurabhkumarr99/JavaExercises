package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class stringoperations {

    public static void main(String[] args)

    {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int value = name.length();
        String l = name.toLowerCase();
        String u = name.toUpperCase();
        String s =name.replace(" " ,"_");
        System.out.println(name);
        System.out.println(value);
        System.out.println(u);
        System.out.println(l);
        System.out.println(s);
        //System.out.println(name.reverse());
        String nam[]=name.split(" ");
        String user=nam[0].substring(0,1)+"123"+nam[0].substring(1,3);
        System.out.println(user);
        System.out.println(Arrays.toString(nam));
        Arrays.sort(nam);
        System.out.println(Arrays.toString(nam));

        System.out.println(nam.length);
        for(String s1:nam){
            System.out.println(s1);
        }
    }
}
