package com.company;
import java.util.*;

public class integertostring {
    public static void main(String [] args){
        ArrayList<Character> charact=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        try {
            int x = sc.nextInt();
            String s = String.valueOf(x);
            String s1 = "";
            String s2[] = s.split("");
            System.out.println(Arrays.toString(s2));
            for (String s3 : s2) {
                int i = Integer.valueOf(s3);
                i = i + 2;
                String s4 = String.valueOf(i);
                s1 = s1 + s4;
                charact.add(s4.charAt(0));
            }
            System.out.println("String :" + s1);
            System.out.println("String length :" + s1.length());
            System.out.println("Character :" + charact);
            System.out.println("Integer :" + Integer.valueOf(s1));
            String s5[] = s1.split("");
            Arrays.sort(s5);
            ArrayList<String> rev=new ArrayList<>();
            for(int k=s5.length-1;k>=0;k--){
                rev.add(s5[k]);
            }

            System.out.println(Arrays.toString(s5));
            System.out.println(rev);

            Set<Integer> un =new TreeSet<>();
            for(String s6:s5){
                int k=Integer.valueOf(s6);
                un.add(k);
            }
            System.out.println(un);
            Collections.sort(rev);
            System.out.println(rev);
            Collections.reverse(rev);
            System.out.println(rev);
            System.out.println(s5.length);


            System.out.println("********");
            //HashSet<Integer> un=new HashSet<>();


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
