package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//student class
class StudentClass{
    String name;
    int classs;
    int [] marks ;
    int total;
    //constructor
    public  StudentClass(){
        name="no name";

    }
    public void studentInfo(){
        System.out.println("Information of "+name+":");
        System.out.println("Clss:"+classs+"\nResult :");
        for(int i=0;i<marks.length;i++){
            System.out.printf("Marks in %d Subject : %d \n",i+1,marks[i]);
        }
        System.out.printf("Total marks is %d",total);
    }
}

public class Student {

      static int total(int []marks){
        int total=0;
        for(int a:marks){
            total+=a;
        }
        return total;
    }

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name =sc.nextLine();
        System.out.print("Enter class :");
        int classs=sc.nextInt();
        System.out.print("Enter no. of subjects :");
        int y=sc.nextInt();
        int [] marks=new int[y];

        System.out.printf("Enter marks of %s in :\n",name);
        for(int i=1;i<=marks.length;i++) {
            System.out.printf("%d Subject : ",i);
            marks[i-1]=sc.nextInt();
        }
        int tot=total(marks);

        StudentClass stud=new StudentClass();
        stud.name= name.toUpperCase();
        stud.classs=classs;
      /*  for(int i=0;i<=4;i++){
            stud.marks[i]=marks[i];
        }*/
        stud.marks=marks;
        stud.total=tot;
        stud.studentInfo();

    }
}
