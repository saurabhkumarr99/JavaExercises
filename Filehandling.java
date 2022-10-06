package com.company;
import java.util.Scanner;
import java.io.File;

/*class createNewFile{
    public void create(String name){
        File myfile = new File(name);
        try {
            myfile.createNewFile();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void dlt(String name){
        File myfile = new File(name);
        try {
            myfile.deleteOnExit();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}*/


public class Filehandling {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter file name :");
        String name=sc.nextLine();
        File myfile = new File(name);
             try {
                    myfile.createNewFile();
                }
                 catch (Exception e){
                    System.out.println(e);
                }
        try {
            myfile.deleteOnExit();
        }
        catch (Exception e){
            System.out.println(e);
        }
       /* createNewFile file =new createNewFile();
        System.out.println("To create a new file press 1\nTo delete file press 2");
        int x= sc.nextInt();
        switch(x){
            case 1->{
                System.out.print("Enter file name :");
                String name=sc.nextLine();
                file.create(name);
               }

            case 2->{
                System.out.print("Enter file name :");
                String name=sc.nextLine();
                file.dlt(name);
            }

            default -> {
                System.out.println("Wrong option");
            }
        }*/

    }
}
