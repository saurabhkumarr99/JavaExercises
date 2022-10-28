package com.company;
import java.util.*;

public class Array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of element");
        int x=sc.nextInt();
        int[]  arr=new int[x];
        for(int i=1;i<=x;i++){
            arr[i-1]=sc.nextInt();
        }


        List<Integer> list =new ArrayList<>();
        for (int e :arr){
            list.add(e);
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
        System.out.println("without sorting"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("with sorting"+Arrays.toString(arr));
        for(int i=0;i<x;i++){
            arr[i]=arr[i]+1;

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Length of the array is : "+arr.length);
        System.out.println("Max of the array is : "+arr[(arr.length-1)]);
        System.out.println("Min of the array is : "+arr[(0)]);

        System.out.println("*******************************************************");

        System.out.println("without sorting"+list);
        //Arrays.sort(list);
        Collections.sort(list);
        System.out.println("with sorting"+list);
        System.out.println("Length of the arraylist is : "+list.size());
        System.out.println("Max of the arraylist is : "+Collections.max(list));
        System.out.println("Min of the arraylist is : "+Collections.min(list));
    }
}
