package com.java.trials;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryStr = sc.nextLine();
        isMagicalString(binaryStr);
    }

    private static void isMagicalString(String binaryStr) {
        int countOfOne = 0, countOfZero = 0;
        List<String> prefix = new ArrayList<>();
        List<String> prefixSatisfyCondition = new ArrayList<>();
        StringBuilder tempPrefix = new StringBuilder();
        for (int i = 0; i < binaryStr.toCharArray().length; i++) {
            char c = binaryStr.charAt(i);
            if(c == '1')
                countOfOne ++;
            else
                countOfZero++;
            tempPrefix.append(c);
            prefix.add(tempPrefix.toString());
        }
        if(countOfOne == countOfZero){
            for (String s:prefix) {
                int countOfOneInPrefix = 0, countOfZeroInPrefix=0;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '1')
                        countOfOneInPrefix++;
                    else
                        countOfZeroInPrefix++;
                }
                if(countOfOneInPrefix < countOfZeroInPrefix)
                    break;
                prefixSatisfyCondition.add(s);
            }
            if(prefixSatisfyCondition.size() == prefix.size())
                System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
