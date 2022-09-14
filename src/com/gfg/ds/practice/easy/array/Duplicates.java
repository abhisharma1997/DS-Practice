package com.gfg.ds.practice.easy.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
    Find duplicates in an array
    Given an array a[] of size N which contains elements from 0 to N-1,
    you need to find all the elements occurring more than once in the given array.
 */

public class Duplicates {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ;i<n; i++){
            int index = arr[i] % n;
            arr[index] += n;

        }

        for(int i  = 0 ; i< n ;i++){
            if((arr[i] / n) >= 2)
                al.add(i);
        }
        if(al.isEmpty()){
            al.add(-1);
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Number of elements in Array :");
        int n = scan.nextInt();
        System.out.println("Please enter elements of Array :");
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println(duplicates(arr, n));

    }
}
