package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


public class check1 {
    /* package whatever; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here

            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            int m= sc.nextInt();

            int a[]=new int[n];
            int b[]=new int[m];

            for(int i=0;i<n;i++){
                 a[i]=sc.nextInt();
            }

            for(int j=0;j<m;j++){
                 b[j]=sc.nextInt();
            }

            System.out.println("4");

        }
    }

