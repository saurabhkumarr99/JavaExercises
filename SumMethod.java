package com.company;
import java.util.Scanner;

public class SumMethod {

     int sum(int x,int y){
        int z=x+y;
        return z;
    }

    static int add(int x,int y){
         int z=x+y;
         return z;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();

        SumMethod s=new SumMethod();
        int c=s.sum(a,b);

        int c1=add(a,b);

        boolean check;
        if(c==c1){
            check=true;
        }else{
            check=false;
        }

        if(check){
            System.out.println(check);
        System.out.println(c1);
        System.out.println(c);
    }}
}

