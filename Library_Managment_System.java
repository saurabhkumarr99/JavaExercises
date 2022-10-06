package com.company;
import java.util.Scanner;

class Library{

    String [] books=new String[5];
    String [] issuedbook=new String[5];

    public Library(){
        books[0]="A";
        books[1]="B";
        books[2]="C";

    }

    public void addBook(String b){
        for(int i=1;i<=books.length;i++){
            int j=i+1;
           if(books[i-1]==null){
               books[i-1]=b;
               System.out.printf("Book %s added successfully\n",b);
               return;
           }else if( j==(books.length+1)){
                System.out.println("Overloading");
            }
        }
    }

    public void issueBook(String b){
        for(int i=1;i<=books.length;i++){
            if(books[i-1]!=null){
            int k=i+1;
            if((books[i-1]) .equals( b) ){
                for( int j=0;j<books.length;j++){
                    if (issuedbook[j]==null) {
                        issuedbook[j]=b;
                        break;
                    }
                }
                books[i-1]=null;
                System.out.printf("Book %s issued successfully\n",b);
                return;
            }else if( k==(books.length+1)) {
                System.out.printf("%s Not available \n",b);
            }}
            else {
                System.out.printf("%s Not available \n",b);
            return;
            }
        }
    }

    public void retunBook(String b){
        for(int i=1;i<=books.length;i++){
            int k=i+1;
            if(books[i-1]==null){
                books[i-1]=b;
                System.out.printf("Book %s added successfully\n",b);
                return;
            }else if( k==(books.length+1)){
                System.out.println("Not our book");
            }
        }
    }

    public void showAvailableBook(){
     System.out.println("Available books are ;");
       for(int i=1;i<=books.length;i++){
           System.out.printf("%d : %s\n",i,books[i-1]);
       }
        System.out.println("Issued books are ;");
        for(int i=1;i<=books.length;i++){
            System.out.printf("%d : %s\n",i,issuedbook[i-1]);
        }
    }
}

public class Library_Managment_System {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        System.out.println("Welcome to library managment system :");
        System.out.println("for Available Book press 1\nfor Add Book press 2\nfor Issue Book press 3\nfor Return Book press 4");
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
                default -> System.out.println("Sorry you have enter wrong choice");
            }


        }
    }
}
