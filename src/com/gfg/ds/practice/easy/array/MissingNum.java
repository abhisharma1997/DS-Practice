package com.gfg.ds.practice.easy.array;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
    Missing number in array
    Given an array of size N-1
    such that it only contains distinct integers in the range of 1 to N. Find the missing element.
 */

public class MissingNum {

    public static int missingNumber(int[] arr,int n){
                int sum = ((n) * (n + 1)) / 2;
                for (int i = 0; i < n-1; i++)
                    sum -= arr[i];
                return sum;

        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Number of elements in Array :");
        int n = scan.nextInt();
        System.out.println("Please enter elements of Array :");
        int[] arr = new int[n-1];
        for(int i =0 ; i < n-1 ;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Missing Number from Array :"+ missingNumber(arr,n));


    }
}
