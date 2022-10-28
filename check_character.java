package com.company;
import java.util.*;
public class check_character {
    static void check(String s){
        ArrayList<ArrayList<Integer>> arr1=new ArrayList<>();
        ArrayList<ArrayList<Character>> arr2=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Character> list3=new ArrayList<>();
        ArrayList<Character> list4=new ArrayList<>();
        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);
            if(c>='0' &&c<='9' ){
                int j=Integer.valueOf(String.valueOf(c));
                list1.add(j);
            }

            if(Character.isDigit(c)){
                int j=Integer.valueOf(String.valueOf(c));
                list2.add(j);
            }

            if((c>='A'&&c<='Z')||(c>='a'&&c<'z')){
                list3.add(c);
            }

            if(Character.isAlphabetic(c)){
                list4.add(c);
            }

            arr1.add(list1);
            arr1.add(list2);
            arr2.add(list3);
            arr2.add(list4);

        }

        System.out.println("The alphanumeric sentence is : "+s +" and length is : "+ s.length());
        for(int i=0;i<arr1.size();i++){
            if(i==0){
                System.out.println("The numeric value via layman in sentence is "+ arr1.get(i)+" Size is : "+arr1.get(i).size());
            }
            if(i==1){
                System.out.println("The numeric value via method in sentence is "+ arr1.get(i)+" Size is : "+arr1.get(i).size());
            }
        }

        for(int i=0;i<arr1.size();i++){
            if(i==0){
                System.out.println("The alphabatic value via layman in sentence is "+ arr2.get(i)+" Size is : "+arr2.get(i).size());
            }
            if(i==1){
                System.out.println("The alphabatic value via method in sentence is "+ arr2.get(i)+" Size is : "+arr2.get(i).size());
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);
        System.out.println("After sorting ");
        System.out.println("List 1 is : "+list1);
        System.out.println("List 2 is : "+list2);
        System.out.println("List 3 is : "+list3);
        System.out.print("List 4 is : ");
        for(Character c:list4){
            System.out.print(c+" ");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Wrrite alphanumeric");
        String s=sc.nextLine();
        check(s);
    }
}
