package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class equal_array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);;
        System.out.println("Word");
        String word=sc.nextLine();
        String revword="";
        for(int i=0;i<word.length();i++){
            revword=word.charAt(i)+revword;
        }
        if(word.equals(revword)){
            System.out.println(word+'\n'+revword);
            System.out.println("Matching");
        }
        else{
            System.out.println(word+"\n"+revword);
            System.out.println("Not matching");
        }
    }
}