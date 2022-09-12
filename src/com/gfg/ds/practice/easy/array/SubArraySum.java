package com.gfg.ds.practice.easy.array;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Subarray with given sum
    Given an unsorted array A of size N that contains only non-negative integers,
    find a continuous sub-array which adds to a given number S.

    In case of multiple subarrays, return the subarray which comes first on moving from left to right.

 */

public class SubArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter size of Array :");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i < n ;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Please enter required sum from Array :");
        int s = scan.nextInt();

        ArrayList<Integer> subArrayPos = subArraySum(arr, n, s);

        System.out.println(subArrayPos);

    }

    public static ArrayList<Integer> subArraySum(int[] arr , int n , int s) {

        ArrayList<Integer> al = new ArrayList<>();

        int sum = 0;
        int left = 0, right = 1;
        sum = arr[left];
        while (s != sum && left < arr.length && right < arr.length) {
            if (sum < s) {
                sum = sum + arr[right];
                right++;
            }

            if (sum > s) {
                sum = sum - arr[left];
                left++;
            }

            if (sum == s && left != right) {
                al.add(left + 1);
                al.add(right);
                return al;

            }
            if (sum == s && left == right) {
                al.add(left + 1);
                al.add(left + 1);
                return al;

            }

        }
        al.add(-1);
        return al;
    }
}
