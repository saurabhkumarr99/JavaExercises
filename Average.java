package com.company;
import java.util.Scanner;

public class Average {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter no. of elements :");
       int x=sc.nextInt();
       float []y =new float[x];
       for(int i=0;i<y.length;i++){
           y[i]=sc.nextInt();
       }
       float total=0;
       for(float element :y){
           total=total+element;
       }
       System.out.println("Average is ;"+total/x);
   }
}
