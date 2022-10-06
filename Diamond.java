package com.company;
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hi! what's your name :");
        String name = sc.nextLine();
        String name1 = name.toUpperCase();
        System.out.printf("Hello %s \n", name1);
        System.out.print("Enter number of line of diamond :");
        int a = sc.nextInt();
        int b = (a + 1) / 2;


        for (int i = 1; i < b; i++) {
            for(int j=i;j<=b-1;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i - 1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=b;i>=1;i--){
            for(int j=1;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
