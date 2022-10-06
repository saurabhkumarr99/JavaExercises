package com.company;
import java.util.Scanner;


class TestClass {
    public static void main(String args[] )  {

        Scanner sc=new Scanner(System.in);


        int l=sc.nextInt();
        for(int i=0;i<l;i++){

            // System.out.println("Matrix size");
            int n=sc.nextInt();
            int m=sc.nextInt();
            char [][] table=new char[n][m];
            //System.out.println("Fill matrix");
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    table[j][k]=sc.next().charAt(0);
                }
            }
            int [] bor=new int[n];
            for(int j=0;j<n;j++){
                int border=0;
                for(int k=0;k<m;k++){
                    if( table[j][k] == ('#')){
                        border++;
                    }

                }
                bor[j]=border;
            }
            int border=0;
            for(int z:bor){

                if(z>border){
                    border=z;
                }
            }

            System.out.println(border);

        }
    }
}

