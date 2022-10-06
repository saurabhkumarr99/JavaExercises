package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        //Name of user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        String name1=name.toUpperCase();

        //values of two operands.
        System.out.println("Enter two number :");
        float a =sc.nextFloat();
        float b =sc.nextFloat();

        //operation.
        System.out.println("Select a number ,for \n " +
                "1-Addition\n2-Substraction\n3-Multiplication\n4-Division");
        int c=sc.nextInt();


        switch(c){
            case 1:
              float d=a+b;
                System.out.println("Hi " + name1 +"!");
                System.out.printf("The Addition %f and %f is %f",a,b,d);
              break;
            case 2:
                 d=a-b;
                System.out.println("Hi " + name1 +"!");
                System.out.printf("The Substraction of %f and %f is %f" ,a,b,d);
                break;
            case 3:
                d=a*b;
                System.out.println("Hi " + name1 +"!");
                System.out.printf("The Multiplication of %f and %f is %f", a,b,d);
                break;
            case 4:
                 d=a/b;
                System.out.println("Hi " + name1 +"!");
                System.out.printf("The %s of %f and %f is %f" ,"Division ",a,b,d);
                break;
            default :
                System.out.println("Sorry "+ name1+",you have chosen wrong option.");
        }
    }
}
