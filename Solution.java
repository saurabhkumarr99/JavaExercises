package com.company;

import java.util.*;
public class Solution {
    static int ZeroPairSum(int n, ArrayList<Integer> arr) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                arr.add(sc.nextInt());
            }
            int count = ZeroPairSum(n, arr);
            System.out.println(count);
        }
    }
}


