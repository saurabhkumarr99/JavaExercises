package com.company;
import java.util.*;

public class stringtoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the sentence");
        String sentence = sc.nextLine();
        System.out.println("Write first and last word");
        String first=sc.nextLine();
        String last=sc.nextLine();
        List<String> list=new LinkedList<>();
        String disc[]=sentence.split(" ");
        for(String e:disc){
            list.add(e);
        }
        List<String> sublist=new LinkedList<>();
        if(list.contains(first)||list.contains(last)){
            int a=list.indexOf(first);
            int b=list.indexOf(last);
            for(int i=a;i<=b;i++){
                sublist.add(list.get(i));
            }
            System.out.println("Dictionary is:"+list);
            System.out.println("First word is:"+first);
            System.out.println("Last word is :"+last);
           // System.out.println("String list is"+sentence.substring(a,b+1));
            System.out.print("Sublist 1 is   :");
            for(String e:sublist){
                System.out.print(e+" ");
            }
            System.out.println();
            System.out.println("Sublist 2 is :"+sublist);
            List sublist3=list.subList(a,b+1);
            System.out.println("Sublist 3 is :"+sublist3);
            System.out.println("Sublist 4 is :"+list.subList(a,b+1));
            System.out.println("Size of sublist is : "+sublist.size()+" i.e "+((b-a)+1));
        }
        else {
            System.out.println("One of your first or second word is absent");
        }
    }
}
