package com.company;
import java.util.Scanner;

public class Fibbonacci {
    static void fibbo(int n){
        int x=0, y=1;

               for(int i=1;i<=n;i++){
                   System.out.print(x+",");
                   int z=x;
                   x+=y;
                    y=z;
               }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=sc.nextInt();
        fibbo(a);

    }
}
