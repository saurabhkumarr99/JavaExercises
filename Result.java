package com.company;
import java.util.Scanner;


public class Result {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter student name");
        String name = sc.nextLine();
        System.out.print("Enter marks in first subject :");
        float a =sc.nextFloat();
        System.out.print("Enter marks in second subject :");
        float b =sc.nextFloat();
        System.out.print("Enter marks in third subject :");
        float c =sc.nextFloat();
        System.out.print("Enter marks in fourth subject :");
        float d =sc.nextFloat();
        System.out.print("Enter marks in fifth subject :");
        float e =sc.nextFloat();

        float total =a+b+c+d+e;
       float percentage = total*0.2f;

        System.out.println("Result of " + name +":");
        System.out.println("Marks in first  subject :" + a );
        System.out.println("Marks in second subject :" + b );
        System.out.println("Marks in third  subject :" + c );
        System.out.println("Marks in fourth subject :" + d );
        System.out.println("Marks in fifth  subject :" + e );
       System.out.println("total marks :" + total);
       System.out.println("total percentage :" + percentage);
        System.out.printf("total marks is %f and toal percentage is %f",total ,percentage);
    }

}
