package com.company;

import java.util.Scanner;
    public class test{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int[] power =new int[N];
            for(int i=1;i<=N;i++){
                power[i-1]=sc.nextInt();
            }
            int K=sc.nextInt();

            int count=0;
            for(int i=1;i<=K;i++){
                for(int j=0;j<N;j++){
                    if(i%power[j]==0){
                        count++;
                      break;
                    }
                }
            }
            System.out.println(count);
        }
    }

