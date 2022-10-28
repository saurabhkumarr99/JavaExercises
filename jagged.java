package com.company;

import java.util.Arrays;

public class jagged {
    public static void main(String[] args) {
        int arr[][]={{1},{1,2},{1,2,3},{1,2},{1}};
        for(int[] e:arr) {
            System.out.println(Arrays.toString(e));
        }
    }
}
