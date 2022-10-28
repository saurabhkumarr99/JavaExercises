package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class kadens_algo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements:");
        int x=sc.nextInt();
        int[] arr =new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("MAX SUB ARRAY IS :"+max);
    }
}
