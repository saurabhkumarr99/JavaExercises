package com.company;
import java.util.Scanner;

public class Factorial {

    static int fact(int x){
        if((x==0)||(x==1)){
            return 1;
        }
        else{
            return x=x*fact(x-1);
        }

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Hi,Enter your name: ");
        String name=sc.nextLine();
        String name1=name.toUpperCase();
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.printf("Hi %s ,\nthe factorial of %d is %d ",name1,a,fact(a));
    }
}
