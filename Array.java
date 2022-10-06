package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element");
        int x=sc.nextInt();
        int [] arr=new int[x];
        for(int i=1;i<=x;i++){
            arr[i-1]=sc.nextInt();
        }
      /*  for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
