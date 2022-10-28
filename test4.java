package com.company;
import java.util.Scanner;
public class test4 {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Write a sentence");
        String name= sc.nextLine();
        String result="";
        for(int i=0;i<name.length();i++){
            result= name.charAt(i)+result;
        }
        System.out.println(result);
    }
}
