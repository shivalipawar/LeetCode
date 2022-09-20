package com.java.trials;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        String[] arrOfNum = arr.split(",");
        int[] nums = new int[arrOfNum.length];
        for (int i = 0; i< arrOfNum.length; i++) {
            nums[i] = Integer.parseInt(arrOfNum[i] + "");
        }
        int tsum = sc.nextInt();
        pairSum(nums, tsum);
    }

    private static void pairSum(int[] arr, int tsum) {
        Map<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if(h.containsKey(tsum - curr)){
                System.out.println(true);
                System.out.println(h.get(tsum - curr) +" , "+curr);
                return;
            }
            h.put(curr,i);
        }
        System.out.println(false);
    }
}
