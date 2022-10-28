package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;


public class check1 {
    /* package whatever; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception {
            // your code goes here
           char i;
          Scanner sc=new Scanner(System.in);
          do {
              i = sc.next().charAt(0);
              System.out.println(Character.isDigit(i));
          }while(i!='0');
        }
    }

