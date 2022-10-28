package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class sorting {

    static void method(int array1[]){
        Arrays.sort(array1);
        System.out.println("Sorting via method is :"+Arrays.toString(array1));
    }

    static void bubble_sort(int array2[]){

        for(int i=0;i<array2.length-1;i++){
            for(int j=0;j<array2.length-i-1;j++){
                if(array2[j]>array2[j+1]){
                    int temp=array2[j];
                    array2[j]=array2[j+1];
                    array2[j+1]=temp;
                }
            }
        }

        System.out.println("Sorting via bubble sort is :"+Arrays.toString(array2));
    }

    static void selection_sort(int array3[]){

        for(int i=0;i<array3.length-1;i++){
            int min_index=i;

            for(int j=i+1;j<array3.length;j++){
                if(array3[min_index]>array3[j]){
                    min_index=j;
                }
            }
            int temp=array3[i];
            array3[i]=array3[min_index];
            array3[min_index]=temp;

        }

        System.out.println("Sorting via selection sort is :"+Arrays.toString(array3));
    }

    static void insertion_sort(int array4[]){

        for(int i=1;i<array4.length;i++){

            for(int j=0;j<i;j++){
                int key=array4[i];
                if(key<array4[j]){
                  int temp=array4[j];
                  array4[j]=key;
                  array4[i]=temp;
                }

            }
        }

        System.out.println("Sorting via insertion sort is :"+Arrays.toString(array4));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size :");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" number :");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int arr1[]=arr;
        int arr2[]=arr;
        int arr3[]=arr;
        int arr4[]=arr;

        System.out.print("Initial array is :");
        System.out.println(Arrays.toString(arr));

        //method(arr1);

       // bubble_sort(arr2);

        //selection_sort(arr3);

        insertion_sort(arr4);

        System.out.print("Initial array is :");
       System.out.println(Arrays.toString(arr4));

    }
}
