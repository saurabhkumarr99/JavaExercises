package com.company;
import java.util.Scanner;

public class ResultArray {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Student name :");
         String name =sc.nextLine();
         String name1=name.toUpperCase();
         //marks storage.
        int [] marks=new int[5];
        int total=0;
        for(int i=0;i<=4;i++){
            System.out.printf("Enter marks in %d subject :",i+1);
             marks[i]=sc.nextInt();
            // total= total+marks[i];
        }
        for(int element :marks){
            total = total+element;
        }
        System.out.printf("Result of %s  is :\n",name1);
       for(int i=0;i<=4;i++){
          System.out.printf("Marks in %d subject is  %d\n",i+1,marks[i]);
       }
       System.out.printf("Total marks : %d",total);
    }
}
