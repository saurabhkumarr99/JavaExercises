package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

class NewLibrary{

    ArrayList<String> books =new ArrayList<>();
    ArrayList <String> issuedbook =new ArrayList<>(5);

    public NewLibrary(){
       books.add("A");
       books.add("B");
       books.add("C");

       issuedbook.add("H");
    }

    public void addBook(String b){
       books.add(b);
    }

    public int check(String b){
        int k;
        if (books.contains(b)) {
             k =books.indexOf(b);
            return k;
        }
        else{
           return k=77;
        }
    }

    public void setbook(int i,String b){
        books.set(i,b);
        System.out.println("Book name changed successfully. ");
    }

    public void issueBook(String b){
        if(books.contains(b)){
            issuedbook.add(b);
            books.remove(b);
            System.out.println("Book "+b+" issued successfully");
        }
        else {
            System.out.printf("%s Not available \n",b);
        }
    }

    public void retunBook(String b){
        if(issuedbook.contains(b)){
            books.add(b);
            issuedbook.remove(b);
        }
        else{
            System.out.println("Not our book");
        }
    }

    public void showAvailableBook(){
        System.out.println("Available books are ;");
        for(int i=1;i<=books.size();i++){
            System.out.printf("%d : %s\n",i,books.get(i-1));
        }
        System.out.println("Issued books are ;");
        for(int i=1;i<=issuedbook.size();i++){
            System.out.printf("%d : %s\n",i,issuedbook.get(i-1));
        }
    }
}

public class NewLibrary_managment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        NewLibrary library=new NewLibrary();
        System.out.println("Welcome to library managment system :");
        library.showAvailableBook();
        System.out.println("for Available Book press 1\nfor Add Book press 2\nfor Issue Book press 3\nfor Return Book press 4\nfor change book name press 5");
        int x=sc.nextInt();
        if(x==1){
            library.showAvailableBook();
        }else{
            System.out.print("Enter book name :");
            String book=sc.next();

            switch (x) {
                case 2 -> {
                    library.addBook(book);
                    library.showAvailableBook();

                }
                case 3 -> {
                    library.issueBook(book);
                    library.showAvailableBook();

                }
                case 4 -> {
                    library.retunBook(book);
                    library.showAvailableBook();

                }
                case 5 -> {
                    int k=library.check(book);
                    if (k !=77) {
                        System.out.print("Enter new name of "+ book+":");
                        String new_name=sc.next();
                        library.setbook(k,new_name);
                    }
                    else{
                        System.out.println("Book "+book+" is not in list.");
                    }
                    library.showAvailableBook();
                }

                default -> System.out.println("Sorry you have enter wrong choice");
            }


        }
    }
}
