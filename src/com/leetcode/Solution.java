package com.leetcode;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

//        MyQueue queue = new MyQueue();
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//        queue.push(4);
//        System.out.println(queue.pop());
//        queue.push(5);
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println("Top "+queue.peek());
//        System.out.println(queue.pop());
//        System.out.println(queue.empty());

//        MyStack stack = new MyStack();
//        stack.push(1);
//        stack.push(2);
//        System.out.println("Top "+stack.top());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());

//        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
//        System.out.println(parkingSystem.addCar(1));
//        System.out.println(parkingSystem.addCar(2));
//        System.out.println(parkingSystem.addCar(3));
//        System.out.println(parkingSystem.addCar(1));

//        MovingAverage average = new MovingAverage(3);
//        System.out.println(average.next(1));
//        System.out.println(average.next(10));
//        System.out.println(average.next(3));
//        System.out.println(average.next(5));

//        LogStorageSystem logSystem = new LogStorageSystem();
//        logSystem.put(1, "2017:01:01:23:59:59");
//        logSystem.put(2, "2017:01:01:22:59:59");
//        logSystem.put(3, "2016:01:01:00:00:00");
//        System.out.println(logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Year"));
//        System.out.println(logSystem.retrieve("2016:01:01:01:01:01", "2017:01:01:23:00:00", "Hour"));

//        MyHashSet hashSet = new MyHashSet();
//        hashSet.add(1);
//        hashSet.add(2);
//        hashSet.contains(1);    // returns true
//        hashSet.contains(3);    // returns false (not found)
//        hashSet.add(2);
//        hashSet.contains(2);    // returns true
//        hashSet.remove(2);
//        hashSet.contains(2);

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
//        root.right.left.left = new TreeNode(11);
//        root.right.left.right = new TreeNode(4);
//        root.right.left.left.right = new TreeNode(23);
//        root.right.left.right.right = new TreeNode(7);
//        root.right.right.left = new TreeNode(5);
//        root.right.right.left.left = new TreeNode(6);
//        System.out.println(solution.verticalTraversal(root));
//        System.out.println(solution.preorderTraversal(root));
//        System.out.println(solution.inorderTraversal(root));
//        System.out.println(solution.postorderTraversal(root));
//        System.out.println(solution.levelOrder(root));
//        System.out.println(solution.isSymmetric(root));
//        System.out.println(solution.searchBST(root,4));
//        System.out.println(solution.insertIntoBST(root,17));
//        System.out.println("Node value is :"+solution.lowestCommonAncestor(root,root.left,root.left.right).val);
//        TreeNode resultNode = solution.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
//        System.out.println("Sorted Arr to BST : " + resultNode);
//        System.out.println(solution.preorderTraversal(resultNode));

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);

        //Remove duplicates from sorted list
        ListNode nodeDup = new ListNode(1);
//        nodeDup.next = new ListNode(1);
//        nodeDup.next.next = new ListNode(2);
//        nodeDup.next.next.next = new ListNode(3);
//        nodeDup.next.next.next.next = new ListNode(3);

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(4);
//        solution.reorderList(node);
//        solution.removeElements(node,7);
//        solution.deleteNode(node.next.next);
//        solution.swapNodes(node, 2);
//        node = solution.swapPairs(node);
//        while(node != null){
//            System.out.println(node.val);
//            node = node.next;
//        }
//        System.out.println(solution.hasCycle(node));
//        ListNode resultNode = solution.mergeTwoLists(node, node1);
//        ListNode resultNode = solution.deleteDuplicates(nodeDup);
//        while(resultNode != null){
//            System.out.println(resultNode.val);
//            resultNode = resultNode.next;
//        }

        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        //        System.out.println(myCircularQueue.enQueue(6)); // return True
        //        System.out.println(myCircularQueue.Rear());    // return 3
        //        System.out.println(myCircularQueue.Rear());    // return 3
        //        System.out.println(myCircularQueue.deQueue());// return True
        //        System.out.println(myCircularQueue.enQueue(5)); // return True
        //        System.out.println(myCircularQueue.Rear());    // return 3
        //        System.out.println(myCircularQueue.deQueue()); // return True
        //        System.out.println(myCircularQueue.Front());   // return 3
        //        System.out.println(myCircularQueue.deQueue()); // return True
        //        System.out.println(myCircularQueue.deQueue()); // return True
        //        System.out.println(myCircularQueue.deQueue()); // return True

//        System.out.println(myCircularQueue.enQueue(1)); // return True
//        System.out.println(myCircularQueue.enQueue(2)); // return True
//        System.out.println(myCircularQueue.enQueue(3)); // return True
//        System.out.println(myCircularQueue.enQueue(4));// return False
//        System.out.println(myCircularQueue.Rear());    // return 3
//        System.out.println(myCircularQueue.isFull()); // return True
//        System.out.println(myCircularQueue.deQueue()); // return True
//        System.out.println(myCircularQueue.enQueue(4)); // return True
//        System.out.println(myCircularQueue.Rear());


//        System.out.println(solution.searchInsert(new int[]{1,3,5,6},2));
//        System.out.println(solution.canWinNim(3));
//        System.out.println(solution.reverse(32));
//        System.out.println(solution.isPalindrome(-232));
//        System.out.println(solution.isPalindrome("abc"));
//        System.out.println(solution.hammingDistance(0,1));
//        System.out.println(solution.totalHammingDistance(new int[]{1337}));
//        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
//        System.out.println("Array without duplicates "+solution.findDuplicates(new int[]{0,4,3,2,7,8,2,3,1}));
//        System.out.println("Rotting Oranges "+solution.orangesRotting(new int[][]{{0, 2}}));
//        System.out.println("Candy "+solution.distributeCandies(10,3));
//        System.out.println("is valid : "+solution.isValid("{[]}"));
//        System.out.println("fibonacci : "+solution.fib(4));
//        System.out.println("Remove Nth node from list : "+solution.removeNthFromEnd(node, 2));
//        System.out.println("Place Queens : " + solution.solveNQueens(5)); //Works only for 4 and not anything above it.
//        System.out.println("Prime Palindrome : " + solution.primePalindrome(9989900));
//        System.out.println("Roman to Int : " + solution.romanToInt("MCMXCIV"));
//        System.out.println("Invalid Transactions : " + solution.invalidTransactions(new String[]{"alice,20,800,mtv","alice,50,100,mtv","alice,51,100,frankfurt"}));
//        System.out.println("Count of smaller elements : " + solution.smallerNumbersThanCurrent(new int[]{7,7,7,7}));
//        System.out.println("Count of smaller after self : " + solution.countSmaller(new int[]{5, 2, 6, 1}));
//        System.out.println("Atoi : " + solution.myAtoi(""));
//        System.out.println("PrefixDivisibleBy5 : " + solution.prefixesDivBy5(new int[]{0,1,1}));
//        System.out.println("Truncate sentence : " + solution.truncateSentence("Hello how are you Contestant",4));
//        System.out.println("Prefix of word in sentence : " + solution.isPrefixOfWord("Hello how are you contestant","cont"));
//        System.out.println("Replace digits with char : " + solution.replaceDigits("a1b2c3d4e"));
//        System.out.println("Shift letters : " + solution.shiftingLetters("bad", new int[]{10,20,30}));
//        System.out.println("Longest common Prefix : " + solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println("Find Median of Sorted Arrays : " + solution.findMedianSortedArrays(new int[]{1},new int[]{2,3,4}));
//        System.out.println("Unique Permutations : " + solution.permuteUnique(new int[]{1,2,1}));
//        System.out.println("Permutations : " + solution.permute(new int[]{1,2,3}));
//        System.out.println("Contains Duplicate : " + solution.containsDuplicate(new int[]{1,2,3,1}));
//        System.out.println("Contains Duplicate 2 : " + solution.containsNearbyDuplicate(new int[]{1,2,3,1},3));
//          System.out.println("Contains Duplicate 3 : " + solution.containsNearbyAlmostDuplicate(new int[]{8,7,15,1,6,1,9,15},1,3));
//        System.out.println("Max subarry sum : " + solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
//        System.out.println("Intersection of array : " + solution.intersect(new int[]{1,1,2,2}, new int[]{2,2}));
//        System.out.println("Reshape matrix : " + solution.matrixReshape(new int[][]{{1,2},{3,4}},1,4));
//        System.out.println("Pascal's triangle : " + solution.generate(5));
//        System.out.println("Check if valid sudoku : " + solution.isValidSudoku( new char [][]{
//                 {'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}}));
//        System.out.println("Efficient search in a 2d matrix: " +solution.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},23));
//        System.out.println("Efficient search in a 2d matrix: " +solution.searchMatrix(new int[][]{{1,3,5}},6));
//        System.out.println("First unique char in string: " +solution.firstUniqChar("leetcode"));
//        System.out.println("Ransom Note: " +solution.canConstruct("fffbfg","effjfggbffjdgbjjhhdegh"));
//        System.out.println("Valid anagram: " +solution.isAnagram("anagram","nagaram"));
//        System.out.println("Find all anagram: " +solution.findAnagrams("cbaebabacd","abc"));
//        System.out.println("Valid String: " +solution.isValid1("({[)"));
//        System.out.println("Count of Odds : " +solution.countOdds(278382788,569302584));
//        System.out.println("Avg of salaries : " +solution.average(new int[]{4000,3000,1000,2000,5000}));
//        System.out.println("SubProdAndSum : " +solution.subtractProductAndSum(705));
//        System.out.println("Largest Perimeter : " + solution.largestPerimeter(new int[]{2,1,2}));
//        System.out.println("Nearest valid point : " + solution.nearestValidPoint(3,4,new int[][]{{2,3}}));
//        System.out.println("Pascal Triangle get row by index : " + solution.getRowData(3));
//        System.out.println("Max Area of water : " + solution.maxArea(new int[]{1,1}));
//        System.out.println("Add Binary String : " + solution.addBinary("11","1"));
//        System.out.println("Integer to Roman : " + solution.intToRoman(1994));
//        System.out.println("Number to words : " + solution.numberToWords(12345));
//        System.out.println("Plus one in and return array : " + Arrays.toString(solution.plusOne(new int[]{9})));
//        System.out.println("Multiply strings : " + solution.multiply("123456789", "987654321"));
//        System.out.println("String half is same : " + solution.halvesAreAlike("textbook"));
        System.out.println("String are equivalent : " + solution.checkAlmostEquivalent("zzzyyy","iiiiii"));
    }

    //2068 - Strings are equivalent
    public boolean checkAlmostEquivalent(String word1, String word2) {
        boolean isEquivalent = true;
        Map<Character,Integer> charCountWord1 = new HashMap<>();
        Map<Character,Integer> charCountWord2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if(charCountWord1.containsKey(word1.charAt(i)))
                charCountWord1.put(word1.charAt(i),charCountWord1.get(word1.charAt(i))+1);
            else
                charCountWord1.put(word1.charAt(i),1);
        }

        for (int i = 0; i < word2.length(); i++) {
            if(charCountWord2.containsKey(word2.charAt(i)))
                charCountWord2.put(word2.charAt(i),charCountWord2.get(word2.charAt(i))+1);
            else
                charCountWord2.put(word2.charAt(i),1);
        }
        for (Map.Entry<Character, Integer> entry : charCountWord1.entrySet()) {
            Character key = entry.getKey();
            if (Math.abs(entry.getValue() - charCountWord2.getOrDefault(key, 0)) > 3) {
                isEquivalent = false;
            }
            if(charCountWord2.containsKey(key)) charCountWord2.remove(key);
        }

        for (Map.Entry<Character,Integer> entry1:charCountWord2.entrySet()) {
            if (Math.abs(entry1.getValue() - charCountWord1.getOrDefault(entry1.getKey(),0))>3){
                isEquivalent = false;
            }
        }

        return isEquivalent;
    }

    //1704 - String in halves is same
    public boolean halvesAreAlike(String s) {
        if(s.isEmpty()) return false;
        int mid =  (s.length() - 1) / 2 ;
        int count1 =0, count2=0;
        int i= 0 , j = mid+1;
        for (; i <= mid && j< s.length(); i++,j++) {
            count1 += checkForVowel(s,i);
            count2 += checkForVowel(s,j);
        }
        if(i <= mid){
            for (; i <= mid; i++) {
                count1 +=  checkForVowel(s,i);
            }
        }
        if(j <= s.length()){
            for (; j < s.length(); j++) {
                count2 += checkForVowel(s,j);
            }
        }
        return (count1 == count2);
    }

    private int checkForVowel(String s, int loopVariable) {
        int count = 0 ;
        if(s.charAt(loopVariable) == 'a' || s.charAt(loopVariable) == 'e' || s.charAt(loopVariable) == 'i' || s.charAt(loopVariable) == 'o' || s.charAt(loopVariable) == 'u'
                || s.charAt(loopVariable) == 'A' || s.charAt(loopVariable) == 'E' || s.charAt(loopVariable) == 'I' || s.charAt(loopVariable) == 'O' || s.charAt(loopVariable) == 'U')
            count++;
        return count;
    }

    public String multiply(String num1, String num2) {
        if(Integer.parseInt(num1) == 0 || Integer.parseInt(num2) == 0)
            return "0";

        int carry = 0;
        List<Deque<Integer>> dequeList = new ArrayList<>();
        for (int i = num1.length() - 1; i >= 0; i--) {
            carry = 0;
            Deque<Integer> intermediate = new ArrayDeque<>();
            int numberOfZeroes = (num1.length() - 1) - i;
            for (int k = 0; k < numberOfZeroes; k++) {
                intermediate.add(0);
            }
            for (int j = num2.length() - 1; j >= 0; j--) {
                int multipliedInts = Integer.parseInt(num1.charAt(i) + "") * Integer.parseInt(num2.charAt(j) + "");
                int product = (carry != 0) ? multipliedInts + carry : multipliedInts;
                carry = 0;
                if (product >= 10) {
                    intermediate.addFirst(product % 10);
                    carry = product / 10;
                } else {
                    intermediate.addFirst(product);
                }
            }
            if (carry != 0) intermediate.addFirst(carry);
            dequeList.add(intermediate);
        }
        String result = sumMultipliedOutput(dequeList);
        return result;
    }

    private String sumMultipliedOutput(List<Deque<Integer>> intermediateResult) {
        StringBuilder finalString = new StringBuilder();
        Deque<Integer> list1, list2, medianResult = new ArrayDeque<>();
        for (int i = 0; i < intermediateResult.size(); ) {
            if (i + 1 != intermediateResult.size()) {
                if (medianResult.isEmpty()) {
                    list1 = intermediateResult.get(i);
                    list2 = intermediateResult.get(i + 1);
                    medianResult = addList(list1, list2);
                    finalString = extractResultFrom(medianResult);
                } else {
                    list1 = intermediateResult.get(i);
                    medianResult = addList(list1, medianResult);
                    finalString = extractResultFrom(medianResult);
                }
                i = i + 2;
            } else {
                if (i <= intermediateResult.size() && !medianResult.isEmpty()) {
                    list1 = intermediateResult.get(i);
                    medianResult = addList(list1, medianResult);
                    finalString = extractResultFrom(medianResult);
                }else if(medianResult.isEmpty()){//single digit answer case
                    finalString = extractResultFrom(intermediateResult.get(i));
                }
                i = i + 2;
            }
        }
        return finalString.toString();
    }

    private StringBuilder extractResultFrom(Deque<Integer> medianResult) {
        StringBuilder sb = new StringBuilder();
        for (Integer item : medianResult) {
            sb.append(item);
        }
        return sb;
    }

    private Deque<Integer> addList(Deque<Integer> list1, Deque<Integer> list2) {
        int min = Math.min(list1.size(), list2.size());
        int sum = 0, carry = 0;
        Deque<Integer> finalSum = new ArrayDeque<>();
        for (int i = min - 1; i >= 0; i--) {
            sum = (carry != 0) ? list1.pollLast() + list2.pollLast() + carry : list1.pollLast() + list2.pollLast();
            if (sum >= 10) {
                finalSum.addFirst(sum % 10);
                carry = sum / 10;
            } else {
                finalSum.addFirst(sum);
            }
            sum = 0;
        }

        if (list1.iterator().hasNext()) {
            if (carry != 0)
                finalSum.addFirst(list1.iterator().next() + carry);
            else
                finalSum.addFirst(list1.iterator().next());
        }
        if (list2.iterator().hasNext()) {
            if (carry != 0)
                finalSum.addFirst(list2.iterator().next() + carry);
            else
                finalSum.addFirst(list2.iterator().next());
        }
        return finalSum;
    }

    public int[] plusOne(int[] digits) {
        Deque<Integer> result = new ArrayDeque<>();
        int sum = 0;
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry != 0) {
                sum = digits[i] + carry;
            }
            if (sum >= 10) {
                result.addFirst(sum % 10);
                carry = sum / 10;
            } else {
                result.addFirst((sum != 0) ? sum : digits[i]);
                carry = 0;
                sum = 0;
            }
        }
        if (carry != 0) {
            result.addFirst(carry);
        }
        int[] finalArray = new int[result.size()];
        Iterator<Integer> it = result.iterator();
        int i = 0;
        while (it.hasNext()) {
            finalArray[i++] = it.next();
        }
        return finalArray;
    }

    String[] units = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = new String[]{"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] base = new String[]{"", "Thousand", "Million", "Billion"};

    //123.NumberToWords(String)
    public String numberToWords(int num) {
        //Constants added in class for this solution like units, tens, base;
        if (num == 0) return "ZERO";
        Deque<String> deque = new ArrayDeque<>();
        int i = 0;
        while (num > 0) {
            String current = helper(num % 1000, base[i]);
            if (!current.isEmpty())
                deque.addFirst(current);
            num = num / 1000;
            i++;
        }
        return String.join(" ", deque);
    }

    private String helper(int num, String currBase) {
        if (num == 0) return "";
        List<String> numberStrings = new ArrayList<>();
        if (num >= 100) {
            numberStrings.add(units[num / 100 - 1]);
            numberStrings.add("Hundred");
            num = num % 100;
        }
        if (num >= 20) {
            numberStrings.add(tens[(num - 20) / 10]);
            num = num % 10;
        }
        if (num != 0) {
            numberStrings.add(units[num - 1]);
        }
        if (!currBase.isEmpty()) {
            numberStrings.add(currBase);
        }
        return String.join(" ", numberStrings);
    }

    //12. IntToRoman(String)
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder finalRomanString = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (num >= value) {
                int numberOfTimesSymbolHasToBeTaken = num / value;
                for (int j = 0; j < numberOfTimesSymbolHasToBeTaken; j++) {
                    finalRomanString.append(keys[i]);
                }
                num %= value;
            }
        }
        return finalRomanString.toString();
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0, carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            carry = (sum > 1) ? 1 : 0;
            ans.append(sum % 2);
        }
        if (carry != 0)
            ans.append(carry);
        return ans.reverse().toString();
    }

    public String convert(String s, int numRows) {
        StringBuilder output = new StringBuilder();
        output.append(s.charAt(0));
        for (int i = 0; i < s.toCharArray().length; i++) {
            output.append(s.charAt(i + numRows));
        }
        return output.toString();
    }

    public int maxArea(int[] height) {
        int maxContainerArea = 0;
        if (height.length == 0)
            return 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxContainerArea = Integer.max(maxContainerArea, Integer.min(height[i], height[j]) * (j - i));
            }
        }
        return maxContainerArea;
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> finalResult = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> intermediateResult = new ArrayList<>();
            if (finalResult.size() == 0) {
                intermediateResult.add(1);
                finalResult.add(intermediateResult);
            } else if (finalResult.size() == 1) {
                intermediateResult.add(1);
                intermediateResult.add(1);
                finalResult.add(intermediateResult);
            } else {
                List<Integer> row = finalResult.get(i - 1);
                intermediateResult.add(1);
                for (int j = 0, k = j + 1; j < row.size() && k < row.size(); j++, k++) {
                    intermediateResult.add(row.get(j) + row.get(k));
                }
                intermediateResult.add(1);
                finalResult.add(intermediateResult);
            }

        }
        return finalResult.get(rowIndex);
    }

    public List<Integer> getRowData(int rowIndex) {
        List<Integer> intermediateResult = new ArrayList<>();
        if (rowIndex == 0) {
            intermediateResult.add(1);
        } else if (rowIndex == 1) {
            intermediateResult.add(1);
            intermediateResult.add(1);
        } else {
            List<Integer> tmp = getRowData(rowIndex - 1);
            for (int i = 0; i <= tmp.size(); i++) {
                if (i == 0 || i == tmp.size())
                    intermediateResult.add(1);
                else
                    intermediateResult.add(tmp.get(i - 1) + tmp.get(i));
            }
        }
        return intermediateResult;
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int[][] validPoints = new int[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (points[i][j] == x && points[i][j + 1] == y)
                    return 0;
                if (points[i][0] == x || points[0][j] == y)
                    validPoints[i][j] = points[i][j];
            }
        }
        return -1;
    }

    //Remember basic amth theorm sum of 2 sides is greater than 3rd otherwise triangle cant be formed.
    public int largestPerimeter(int[] nums) {
        if (nums.length <= 0)
            return 0;
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2])
                return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }

    public int subtractProductAndSum(int n) {
        if (n <= 0)
            return 0;
        int sum = 0, product = 1;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            product *= lastDigit;
            n = n / 10;
        }
        return product - sum;
    }

    public double average(int[] salary) {
        if (salary.length == 0)
            return 0;
        Arrays.sort(salary);
        double sum = Arrays.stream(salary).sum();
        double min = salary[0];
        double max = salary[salary.length - 1];
        double actualSum = sum - (min + max);
        return actualSum / (salary.length - 2);
    }

    public int countOdds(int low, int high) {
        int countOdds = 0;
        if (low % 2 == 0 && high % 2 == 0) {
            countOdds = (high - low) / 2;
        } else {
            countOdds = (high - low) / 2 + 1;
        }
        return countOdds;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, 0, mid - 1);
        root.right = createTree(nums, mid + 1, end);
        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > Math.max(p.val, q.val))
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < Math.min(p.val, q.val))
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }

    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return root;
//        if(root.left == p && root.right == q)
//            return root;
//        else if(root.val < p.val && root.val < q.val)
//            root.right = lowestCommonAncestor(root.right,p,q);
//        else if(root.val > p.val && root.val < q.val)
//            root.left = lowestCommonAncestor(root.left,p,q);
        List<TreeNode> ancestorsForStartNode = findAllAncestorsForStartNode(root, p);
        List<TreeNode> ancestorsForEndNode = findAllAncestorsForStartNode(root, q);
        TreeNode lowestAncestor = new TreeNode(Integer.MAX_VALUE);
        for (int i = 0, j = 0; i < ancestorsForStartNode.size() && j < ancestorsForEndNode.size(); i++, j++) {
            if (ancestorsForStartNode.get(i).val == ancestorsForEndNode.get(i).val)
                if (lowestAncestor.val > ancestorsForStartNode.get(i).val)
                    lowestAncestor = ancestorsForStartNode.get(i);
        }
        return (lowestAncestor.val == Integer.MAX_VALUE) ? p : lowestAncestor;
    }

    private List<TreeNode> findAllAncestorsForStartNode(TreeNode root, TreeNode p) {
        List<TreeNode> nodes = new ArrayList<>();
        if (root == null)
            return nodes;
        TreeNode current = root;
        while (true) {
            if (current.val < p.val) {
                nodes.add(current);
                if (current.left == null) {
                    break;
                } else {
                    current = current.left;
                }
            } else {
                nodes.add(current);
                if (current.right == null) {
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return nodes;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        //Iterative
        TreeNode current = root;
        while (true) {
            if (current.val > val) {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    break;
                } else
                    current = current.right;
            } else {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    break;
                } else
                    current = current.left;
            }
        }
        //Recursive
//        if (root.val > val)
//            root.left = insertIntoBST(root.left, val);
//        else
//            root.right = insertIntoBST(root.right,val);
        return root;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = null;
        if (root == null)
            return null;
        result = searchBSTRecursion(root, val);
        return result;
    }

    private TreeNode searchBSTRecursion(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (root.val < val)
            return searchBSTRecursion(root.right, val);
        else
            return searchBSTRecursion(root.left, val);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        invertRecursive(root);
        return root;
    }

    private void invertRecursive(TreeNode root) {
        if (root == null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertRecursive(root.left);
        invertRecursive(root.right);

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);

    }

    //https://www.youtube.com/watch?v=K7LyJTWr2yA
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null)
            return left == right;
        if (left.val != right.val)
            return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    //https://www.youtube.com/watch?v=9PHkM0Jri_4
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelValues = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return levelValues;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> child = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                child.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            levelValues.add(child);
        }
        return levelValues;
    }

    //https://www.youtube.com/watch?v=k21VKEM8OFY&t=89s
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        if (root == null)
            return postOrder;
        //Iterative one -
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null)
                stack1.push(temp.left);
            if (temp.right != null)
                stack1.push(temp.right);
        }
        while (!stack2.isEmpty()) {
            postOrder.add(stack2.pop().val);
        }
        //Recursive
//        postorderRecursion(root,postOrder);
        return postOrder;
    }

    private void postorderRecursion(TreeNode root, List<Integer> postorderValues) {
        if (root == null)
            return;
        postorderRecursion(root.left, postorderValues);
        postorderRecursion(root.right, postorderValues);
        postorderValues.add(root.val);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root == null)
            return result;
        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.add(root);
                root = root.left;
            }
            root = st.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
    //This iterative fails in some cases either balanced or unbalanced only but not in both cases
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> inorderValues = new ArrayList<>();
//        if(root == null)
//            return inorderValues;
////        inorderRecursion(root,inorderValues);
//        //Below is iterative solution
//        Stack<TreeNode> branches = new Stack<>();
//        while (root != null){
//            branches.push(root);
//            root = root.left;
//            if(root == null){
//                if(branches.isEmpty())
//                    break;
//                while (!branches.isEmpty()){
//                    root = branches.pop();
//                    inorderValues.add(root.val);
//                    root = root.right;
//
//                    if(root == null && branches.isEmpty())
//                        break;
//
//                    if(root == null && !branches.isEmpty())
//                        continue;
//
//                    if(root.left == null && !branches.isEmpty())
//                        inorderValues.add(root.val);
//
//                    if(root.left !=null){
//                        branches.push(root);
//                        root = root.left;
//                        break;
//                    }
//                }
//            }
//        }
//        return inorderValues;
//    }

    private void inorderRecursion(TreeNode root, List<Integer> preorderValues) {
        if (root == null)
            return;
        inorderRecursion(root.left, preorderValues);
        preorderValues.add(root.val);
        inorderRecursion(root.right, preorderValues);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorderValues = new ArrayList<>();
        if (root == null)
            return preorderValues;
//        preorderRecursion(root,preorderValues);
        //Below is iterative solution
        Stack<TreeNode> branches = new Stack<>();
        while (root != null) {
            if (root.right != null)
                branches.push(root.right);
            preorderValues.add(root.val);
            root = root.left;
            if (root == null) {
                if (branches.isEmpty())
                    break;
                root = branches.pop();
            }
        }
        return preorderValues;
    }

    private void preorderRecursion(TreeNode root, List<Integer> preorderValues) {
        if (root == null)
            return;
        preorderValues.add(root.val);
        preorderRecursion(root.left, preorderValues);
        preorderRecursion(root.right, preorderValues);
    }

    public boolean isValid1(String s) {
        Stack<Character> charStack = new Stack<Character>();
        if (s.isEmpty())
            return false;
        char[] inputStr = s.toCharArray();
        for (int i = 0; i < inputStr.length; i++) {
            if (!charStack.isEmpty()) {
                if (charStack.peek().equals('(') && inputStr[i] == ')' || charStack.peek().equals('{') && inputStr[i] == '}' || charStack.peek().equals('[') && inputStr[i] == ']')
                    charStack.pop();
                else
                    charStack.push(inputStr[i]);
            } else
                charStack.push(inputStr[i]);
        }
        return charStack.isEmpty();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode merged = null, last = null;
        while (t1.next != null && t2.next != null) {
            if (t1.val <= t2.val) {
                if (merged == null) {
                    merged = t1;
                    last = merged;
                } else {
                    last.next = t1;
                    last = last.next;
                }
                t1 = t1.next;
            } else {
                if (merged == null) {
                    merged = t2;
                    last = merged;
                } else {
                    last.next = t2;
                    last = last.next;
                }
                t2 = t2.next;
            }
        }

        if (t1 != null) {
            if (last == null) {
                merged = t1;
            } else {
                last.next = t1;
            }
        } else if (t2 != null) {
            if (last == null) {
                merged = t2;
            } else {
                last.next = t2;
            }
        }
        return merged;
    }

    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if (temp == null)
            return false;
        ListNode fast, slow;
        fast = slow = temp;
        while (true) {
            slow = slow.next;
            if (fast.next != null)
                fast = fast.next.next;
            else
                return false;

            if (fast == null || slow == null)
                return false;
            if (fast == slow)
                return true;
        }
    }

    //Not completed its half done need to fix this.
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagramIndex = new ArrayList<>();
        if (s.isEmpty() || p.isEmpty())
            return anagramIndex;

        int len = p.length();
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length() && i + len < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < len; j++) {
                sb.append(s.charAt(j));
            }
            for (int j = 0; j < p.length(); j++) {
                if (charCount.containsKey(p.charAt(j)))
                    charCount.put(p.charAt(j), charCount.get(p.charAt(j)) + 1);
                else
                    charCount.put(p.charAt(j), 1);
            }
            for (int j = 0; j < sb.length(); j++) {
                if (charCount.containsKey(sb.charAt(j)))
                    charCount.put(sb.charAt(j), charCount.get(sb.charAt(j)) - 1);
            }
            for (int j = 0; j < charCount.size(); j++) {
                if (charCount.get(p.charAt(j)) > 0)
                    break;
            }
            anagramIndex.add(i);
        }
        return anagramIndex;
    }

    public boolean isAnagram(String s, String t) {
        int[] dict = new int[26];
        int[] dict2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            dict[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            dict2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (dict[i] != dict2[i])
                return false;
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
//        Map<Character,Integer> charWithCount = new HashMap<>();
//        if(ransomNote.isEmpty() || magazine.isEmpty())
//            return false;
//        for (int i = 0; i < ransomNote.length(); i++) {
//            if(charWithCount.containsKey(ransomNote.charAt(i)))
//                charWithCount.put(ransomNote.charAt(i),charWithCount.get(ransomNote.charAt(i))+1);
//            else
//                charWithCount.put(ransomNote.charAt(i),1);
//        }
//        for (int i = 0; i < magazine.length(); i++) {
//            if(charWithCount.containsKey(magazine.charAt(i)))
//                charWithCount.put(magazine.charAt(i),charWithCount.get(magazine.charAt(i))-1);
//        }
//        for (int i = 0; i < ransomNote.length(); i++) {
//            if(charWithCount.get(ransomNote.charAt(i)) > 0)
//                return false;
//        }
//        return true;

        int[] dict = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            dict[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            dict[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (dict[i] < 0)
                return false;
        }
        return true;
    }

    public int firstUniqChar(String s) {
        char[] actualArr = s.toCharArray();
        Map<Character, Integer> charIndexMap = new HashMap<>();
        if (s.isEmpty())
            return -1;
        for (int i = 0; i < actualArr.length; i++) {
            charIndexMap.put(actualArr[i], charIndexMap.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < actualArr.length; i++) {
            if (charIndexMap.get(actualArr[i]) == 1)
                return i;
        }
        return -1;
    }

    //Better approach using array of 26 char
//    public int firstUniqChar(String s) {
//        int [] charCount = new int[26];
//
//        for(int i=0; i < s.length(); i++){
//            char c = s.charAt(i);
//            charCount[c - 'a'] = charCount[c - 'a'] + 1;
//        }
//
//        for(int i=0; i< s.length(); i++){
//            char c = s.charAt(i);
//            if(charCount[c - 'a'] == 1){
//                return i;
//            }
//        }
//        return -1;
//    }

    //Optimized solution.
    public boolean searchMatrix(int[][] matrix, int target) {
        int end = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][end - 1] >= target) {
                return binarySearch(target, matrix[i]);
            }
        }
        return false;
    }

//    public boolean searchMatrix(int[][] matrix, int target) {
//        if(matrix.length ==0)
//            return false;
//        int[] convertedArr = convert2DTo1D(matrix);
//        return binarySearch(target,convertedArr);
//    }

    private int[] convert2DTo1D(int[][] matrix) {
        int len = matrix.length * matrix[0].length;
        int[] arr = new int[len];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }
        return arr;
    }

    public boolean isValidSudoku(char[][] board) {
        int size = 9;
        HashSet<Character>[] rowMap = new HashSet[size];
        HashSet<Character>[] colMap = new HashSet[size];
        HashSet<Character>[] subMatrixMap = new HashSet[size];
        if (board.length == 0)
            return false;

        for (int r = 0; r < size; r++) {
            rowMap[r] = new HashSet<Character>();
            colMap[r] = new HashSet<Character>();
            subMatrixMap[r] = new HashSet<Character>();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                char val = board[i][j];
                if (val == '.')
                    continue;

                if (rowMap[i].contains(val))
                    return false;
                rowMap[i].add(val);

                if (colMap[j].contains(val))
                    return false;
                colMap[j].add(val);

                //submatrix logic
                int idx = (i / 3) * 3 + j / 3;
                if (subMatrixMap[idx].contains(val)) {
                    return false;
                }
                subMatrixMap[idx].add(val);
            }
        }
        return true;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalResult = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> intermediateList = new ArrayList<>();
            if (finalResult.size() == 0) {
                intermediateList.add(1);
                finalResult.add(intermediateList);
            } else if (finalResult.size() == 1) {
                intermediateList.add(1);
                intermediateList.add(1);
                finalResult.add(intermediateList);
            } else {
                List<Integer> row = finalResult.get(i - 1);
                intermediateList.add(1);
                for (int j = 0, k = j + 1; j < row.size() && k < row.size(); j++, k++) {
                    intermediateList.add(row.get(j) + row.get(k));
                }
                intermediateList.add(1);
                finalResult.add(intermediateList);
            }
        }
        return finalResult;
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] grid = new int[r][c];

        if (m * n != r * c) {
            return mat;
        }

        int row = 0;
        int col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[row][col++] = mat[i][j];
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        System.out.println("Grid rows and col : " + grid.length + " ---- " + grid[0].length);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        return grid;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList();
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        Map<Integer, Integer> valueToCount = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (valueToCount.containsKey(nums1[i])) {
                valueToCount.put(nums1[i], valueToCount.get(nums1[i]) + 1);
            } else
                valueToCount.put(nums1[i], 1);
        }
        for (int num : nums2) {
            if (valueToCount.containsKey(num) && valueToCount.get(num) > 0) {
                res.add(num);
                valueToCount.put(num, valueToCount.get(num) - 1);
            }
        }
        //Using Binary Search if 2 arrays are sorted.
//        if(nums1.length > nums2.length){
//            for (int i = 0; i < nums2.length; i++) {
//                if(binarySearch(nums2[i],nums1))
//                    res.add(nums2[i]);
//            }
//        }else {
//            for (int i = 0; i < nums1.length; i++) {
//                if(binarySearch(nums1[i],nums2))
//                    res.add(nums1[i]);
//            }
//        }
        //just to display result
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
            System.out.println(result[i]);
        }
        return result;
    }

    private boolean binarySearch(int eleToSearch, int[] arr) {
        int exists = binarySearchRecursive(0, arr.length - 1, eleToSearch, arr);
        return exists != -1;
    }

    private int binarySearchRecursive(int start, int end, int eleToSearch, int[] arr) {
//        int mid = start + ((end-start)/2);
        int mid = (start + end) % 2 == 0 ? (start + end) / 2 : (start + end) / 2 + 1;
        if (end < start) {
            return -1;
        }
        if (arr[mid] == eleToSearch) {
            return arr[mid];
        } else if (arr[mid] < eleToSearch) {
            return binarySearchRecursive(mid + 1, end, eleToSearch, arr);
        } else {
            return binarySearchRecursive(start, mid - 1, eleToSearch, arr);
        }
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length == 0)
            return false;
        HashMap<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = numberIndexMap.getOrDefault(nums[i], 0);
            if (numberIndexMap.containsKey(nums[i]) && (Math.abs(i) - Math.abs(index) <= k) && (Math.abs(nums[i]) - Math.abs(nums[index]) <= t))
                return true;
            numberIndexMap.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0)
            return false;
        HashMap<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberIndexMap.containsKey(nums[i]) && (Math.abs(i) - Math.abs(numberIndexMap.get(nums[i])) <= k))
                return true;
            numberIndexMap.put(nums[i], i);
        }
        return false;
    }

    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);    //To ake it balance out when numbers are negative too.
        }
        return maxSum;
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0)
            return false;
        HashMap<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numberIndexMap.containsKey(nums[i]))
                return true;
            numberIndexMap.put(nums[i], i);
        }
        return false;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> permutations = new ArrayList<>(nums.length);
        createPermutationsWithoutDuplicates(nums, res, permutations, used);
        return res;
    }

    private void createPermutationsWithoutDuplicates(int[] nums, List<List<Integer>> res, List<Integer> permutations, boolean[] used) {
        if (permutations.size() == nums.length) {
            res.add(new ArrayList<>(permutations));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (used[i])
                continue;
            used[i] = true;
            permutations.add(nums[i]);
            createPermutations(nums, res, permutations, used);
            permutations.remove(permutations.size() - 1);
            used[i] = false;
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        boolean[] used = new boolean[nums.length];
        List<Integer> permutations = new ArrayList<>(nums.length);
        createPermutations(nums, res, permutations, used);
        return res;
    }

    private void createPermutations(int[] nums, List<List<Integer>> res, List<Integer> permutations, boolean[] used) {
        if (permutations.size() == nums.length) {
            res.add(new ArrayList<>(permutations));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (used[i])
                continue;
            used[i] = true;
            permutations.add(nums[i]);
            createPermutations(nums, res, permutations, used);
            permutations.remove(permutations.size() - 1);
            used[i] = false;
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        DecimalFormat df = new DecimalFormat("#.#####");
        double median = 0;
        int totalArrayLength = nums1.length + nums2.length;
        boolean isEven = totalArrayLength % 2 == 0;
        int nums1Ptr = 0, nums2Ptr = 0, counter = 0;
        int[] sortedArr = new int[totalArrayLength];

        if (nums1.length == 0 && nums2.length == 0)
            return Double.parseDouble(df.format(median));
        if (nums1.length <= 0) {
            //consider other array as sorted and return median.
            isEven = nums2.length % 2 == 0;
            if (isEven) {
                double mid = (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2;
                return Double.parseDouble(df.format(mid));
            } else {
                return Double.parseDouble(df.format(nums2[nums2.length / 2]));
            }
        }
        if (nums2.length <= 0) {
            //consider other array as sorted and return median.
            isEven = nums1.length % 2 == 0;
            if (isEven) {
                double mid = (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
                return Double.parseDouble(df.format(mid));
            } else {
                return Double.parseDouble(df.format(nums1[nums1.length / 2]));
            }
        }

        while (counter < totalArrayLength) {

            if (nums1.length == nums1Ptr) {
                sortedArr[counter] = nums2[nums2Ptr];
                nums2Ptr++;
                Double df1 = getResult(df, totalArrayLength, isEven, counter, sortedArr);
                if (df1 != null) return df1;
                counter++;
                continue;
            }
            if (nums2.length == nums2Ptr) {
                sortedArr[counter] = nums1[nums1Ptr];
                nums1Ptr++;
                Double df1 = getResult(df, totalArrayLength, isEven, counter, sortedArr);
                if (df1 != null) return df1;
                counter++;
                continue;
            }
            if (nums1[nums1Ptr] <= nums2[nums2Ptr]) {
                sortedArr[counter] = nums1[nums1Ptr];
//               if(nums1.length -1 > nums1Ptr)
                nums1Ptr++;
            } else if (nums1[nums1Ptr] >= nums2[nums2Ptr]) {
                sortedArr[counter] = nums2[nums2Ptr];
//               if(nums2.length -1 > nums2Ptr)
                nums2Ptr++;
            }
            Double df1 = getResult(df, totalArrayLength, isEven, counter, sortedArr);
            if (df1 != null) return df1;
            counter++;
        }
        return Double.parseDouble(df.format(median));
    }

    private Double getResult(DecimalFormat df, int totalArrayLength, boolean isEven, int counter, int[] sortedArr) {
        if (!isEven) {
            if (counter == totalArrayLength / 2)
                return Double.parseDouble(df.format(sortedArr[counter]));
        } else {
            if (counter == totalArrayLength / 2) {
                double mid = (double) (sortedArr[counter - 1] + sortedArr[counter]) / 2;
                return Double.parseDouble(df.format(mid));
            }
        }
        return null;
    }

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;

            }
        }

        return nums.length;
    }

    public int reverse(int x) {
        long rev = 0;
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return (int) rev;
        }
        while (x != 0) {
            rev = rev * 10;
            rev = rev + x % 10;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE)
            return 0;
        else
            return (int) rev;
    }

    public boolean isPalindrome(int x) {
        int rev = 0;
        int originalNum = x;
        if (x < 0 || x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return false;
        }
        while (x != 0) {
            rev = rev * 10;
            rev = rev + x % 10;
            x = x / 10;
        }
        if (rev == originalNum)
            return true;
        else
            return false;
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String input = s.replaceAll("\\p{Punct}", "").toLowerCase().replace(" ", "");
        char[] inputArr = input.toCharArray();
        int i = 0, j = inputArr.length - 1;
        while (i < j) {
            if (inputArr[i] != inputArr[j])
                return false;

            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int originalNum = 1;
        while (temp.next != null) {
            originalNum = originalNum * 10 * temp.val;
            System.out.println(originalNum);
        }
        return true;
    }

    public boolean canWinNim(int n) {
        return (n % 4 != 0);
    }

    public int hammingDistance(int x, int y) {
        if (x <= 0 && y <= 0) return 0;
        int diff = 0;
        String xBin = String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
        String yBin = String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0");
        System.out.println(xBin + " " + yBin);
        int minLen = Math.min(xBin.length(), yBin.length());
        for (int i = minLen - 1; i > 0; i--) {
            if (xBin.charAt(i) != yBin.charAt(i)) diff++;
        }
        return diff;
    }

    public int totalHammingDistance(int[] nums) {
        if (nums.length < 2) return 0;
        List<Integer> diff = new ArrayList<Integer>();
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                diff.add(i, hammingDistance(nums[i], nums[j]));
                System.out.println(diff.get(i));
            }
        }
        total = diff.stream().reduce(Integer::sum).get();
        return total;
    }

    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int temp = n & 1;
            if (temp == 1)
                ans++;
            n = n >>> 1;
        }
        return ans;
    }

    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> mapofDuplicates = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        if (nums.length <= 0) {
            return duplicates;
        }
        for (int i = 0; i < nums.length; i++) {
            if (mapofDuplicates.containsKey(nums[i])) {
                mapofDuplicates.put(nums[i], mapofDuplicates.get(nums[i]) + 1);
            } else {
                mapofDuplicates.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapofDuplicates.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;

        //OTHER Approach 1 space n time but doesnt work in all cases

//        List<Integer> duplicates = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            nums[nums[i] %  nums.length] = nums[nums[i] %  nums.length] + nums.length;
//        }
//        System.out.println("The repeating elements are : ");
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= nums.length*2) {
//                System.out.println(i + " ");
//                duplicates.add(i);
//            }
//        }
//        return duplicates;

    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> levelNodes = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>(new ArrayList<>());
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        CalculateDistance(root, 0, map);
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            entry.getValue().sort(null);
            System.out.println(entry.getValue());
            levelNodes.add(entry.getValue());
        }
        return levelNodes;
    }

    private void CalculateDistance(TreeNode root, int hd, TreeMap<Integer, List<Integer>> map) {
        if (root == null)
            return;

        List<Integer> list = map.get(hd);

        if (list == null) {
            list = new ArrayList<>();
            list.add(root.val);
        } else {
            list.add(root.val);
        }

        map.put(hd, list);

        CalculateDistance(root.left, hd - 1, map);
        CalculateDistance(root.right, hd + 1, map);
    }

    //Complex problem of orange need to look into it.
    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) return -1;
        int minute = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 2) {
                    if (grid[i + 1][j] == 1 || grid[i - 1][j] == 1 || grid[i][j + 1] == 1 || grid[i][j - 1] == 1) {
                        minute++;
                    } else {
                        minute = -1;
                    }
                }
            }
        }
        return minute;
    }

    public void reorderList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode fast = head;
            ListNode slow = head;

            while (fast != null && fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode second = slow.next;
            slow.next = null;

            second = reverseLL(second);

            ListNode first = head;
            ListNode reversed = second;

            while (reversed != null) {
                ListNode temp1 = first.next;
                ListNode temp2 = reversed.next;

                first.next = reversed;
                reversed.next = temp1;

                first = temp1;
                reversed = temp2;
            }
        }

    }

    private ListNode reverseLL(ListNode second) {
        if (second == null || second.next == null) {
            return second;
        }

        ListNode pre = second;
        ListNode curr = second.next;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        second.next = null;
        return pre;
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] distributionArr = new int[num_people];
        if (candies <= 0 || num_people <= 0) {
            return distributionArr;
        }
        int currCandyCount = 1;

        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies > currCandyCount) {
                    distributionArr[i] += currCandyCount;
                    candies = candies - currCandyCount;
                    currCandyCount++;
                } else {
                    distributionArr[i] += candies;
                    candies = 0;
                }
            }
        }
        for (int i = 0; i < distributionArr.length; i++) {
            System.out.println(distributionArr[i]);
        }
        return distributionArr;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty()) {
                Character top = stack.peek();
                if (top == '(' && s.charAt(i) == ')' || top == '[' && s.charAt(i) == ']' || top == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }

    public int fib(int n) {
        return fibonacci(n);

//        public int fib(int N) {       //constant space and time complexity.
//            double goldenRatio = (1 + Math.sqrt(5)) / 2;
//            return (int)Math.round(Math.pow(goldenRatio, N)/ Math.sqrt(5));
//        }
    }

    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode headCopy = dummy;
        ListNode headCopy2 = dummy;

        for (int i = 0; i < n + 1; i++) {
            headCopy = headCopy.next;
        }

        while (headCopy != null) {
            headCopy = headCopy.next;
            headCopy2 = headCopy2.next;
        }
        headCopy2.next = headCopy2.next.next;
        return dummy.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = head;
        ListNode dummyHeadPrev = null;
        while (dummyHead != null) {
            if (dummyHead.val == val && dummyHead == head) {
                head = dummyHead.next;
            } else if (dummyHead.val == val && dummyHeadPrev != null && dummyHead != null) {
                dummyHeadPrev.next = dummyHead.next;
                dummyHead = dummyHead.next;
            } else {
                dummyHeadPrev = dummyHead;
                dummyHead = dummyHead.next;
            }
        }
        return head;
    }

    //Far better solution than mine.
//    public ListNode removeElements(ListNode head, int val)
//    {
//        if(head==null)
//        {
//            return head;
//        }
//        ListNode temp=head ;
//        while(temp.next!=null)
//        {
//            if(temp.next.val==val)
//            {
//                temp.next=temp.next.next;
//            }
//            else
//            {
//                temp=temp.next;
//            }
//        }
//        return head.val==val?head.next:head;
//    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode nthNodeFromEndOfList = findNthNodeFromEndOfList(temp, k);
        System.out.println("nth node from end " + nthNodeFromEndOfList.val);
        for (int i = 0; i < k - 1; i++) {
            temp = temp.next;
        }
        System.out.println("moved temp " + temp.val);
        int tempNodeVal = temp.val;
        temp.val = nthNodeFromEndOfList.val;
        nthNodeFromEndOfList.val = tempNodeVal;
        return head;
    }

    private ListNode findNthNodeFromEndOfList(ListNode temp, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = temp;
        ListNode headCopy = dummy;
        ListNode headCopy2 = dummy;

        for (int i = 0; i < n; i++) {
            headCopy = headCopy.next;
        }

        while (headCopy != null) {
            headCopy = headCopy.next;
            headCopy2 = headCopy2.next;
        }
        return headCopy2;
    }

    public ListNode swapPairs(ListNode head) {
        //Iterative solution.
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newStart = head.next;
        ListNode temp1 = null;
        while (true) {
            temp1 = temp.next;
            ListNode forward = temp1.next;
            temp1.next = temp;
            if (forward == null) {
                temp.next = null;
                break;
            }
            if (forward.next == null) {
                temp.next = forward;
                break;
            }
            temp.next = forward.next;
            temp = forward;

        }
        return newStart;

        //Recursive solution
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode first = head;
//        ListNode second = head.next;
//        ListNode rest = swapPairs(second.next);
//        second.next = first;
//        first.next = rest;
//        return second;
    }

    public int primePalindrome(int n) {
        int primePalindrome = 0;
        if (n <= 1) {
            return 2;
        }
        while (true) {
            if (n > 9) {
                if (checkIfNumberIsPalindrome(n)) {
                    if (checkIfPrime(n)) {
                        primePalindrome = n;
                        break;
                    }
                }
            } else {
                if (checkIfPrime(n)) {
                    primePalindrome = n;
                    break;
                }
            }
            n = n + 1;
        }
        return primePalindrome;
    }

    private boolean checkIfNumberIsPalindrome(int primePalindrome) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(primePalindrome));
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        return reverse.equals(String.valueOf(primePalindrome));
    }

    private boolean checkIfPrime(int n) {
        if (n == 2)
            return true;
        if (n > 2 && n % 2 == 0)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public List<String> invalidTransactions(String[] transactions) {
        List<String> invalidTrans = new ArrayList<>();
        String[] prevTrans = new String[]{};
        if (transactions.length == 0)
            return invalidTrans;
        for (int i = 0; i < transactions.length; i++) {
            String[] str = transactions[i].split(",");
            if (Integer.parseInt(str[2]) > 1000)
                invalidTrans.add(transactions[i]);
            if (prevTrans.length != 0 && Integer.parseInt(str[1]) - Integer.parseInt(prevTrans[1]) <= 60) {
                if (prevTrans[0].equals(str[0]) && !prevTrans[3].equals(str[3])) {
                    invalidTrans.add(String.join(",", prevTrans));
                    invalidTrans.add(transactions[i]);
                }
            }
            prevTrans = str;
        }
        return invalidTrans;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countArr = new int[nums.length];
        if (nums.length == 0) {
            return countArr;
        }
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            List<Integer> tempArr = IntStream.of(nums).boxed().collect(Collectors.toList());
            tempArr.remove(i);
            Collections.sort(tempArr);
            long count = tempArr.stream().filter(n -> n < number).count();
            countArr[i] = (int) count;
        }
//        System.out.println(Arrays.toString(countArr));
        return countArr;
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> smallerOnRight = new ArrayList<>();
        Item[] items = new Item[nums.length];
        if (nums.length == 0) {
            return smallerOnRight;
        }
//        for (int i = 0; i < nums.length; i++) {
//            int number = nums[i];
//            List<Integer> tempList = IntStream.of(nums).boxed().collect(Collectors.toList());
//            if(i > 0){
//                for (int j = i; j >= 0 ; j--) {
//                    tempList.remove(j);
//                }
//            }else{
//                tempList.remove(i);
//            }
//            Collections.sort(tempList);
//            long count = tempList.stream().filter(n -> n < number).count();
//            smallerOnRight.add((int) count);
//        }

        for (int i = 0; i < nums.length; i++) {
            items[i] = new Item(i, nums[i]);
        }
        int[] count = new int[nums.length];
        mergeSort(items, 0, nums.length - 1, count);

        for (int c : count) {
            smallerOnRight.add(c);
        }
        return smallerOnRight;
    }

    private void mergeSort(Item[] items, int start, int end, int[] count) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        mergeSort(items, start, mid, count);
        mergeSort(items, mid + 1, end, count);
        merge(items, start, mid, mid + 1, end, count);
    }

    private void merge(Item[] items, int start, int startEnd, int end, int highEnd, int[] count) {
        int m = highEnd - start + 1; //Coz its inclusive
        Item[] sorted = new Item[m]; //Extra space to keep sorted item.
        int index = 0;
        int loPtr = start, hiPtr = end;
        int rightCounter = 0;
        while (loPtr <= startEnd && hiPtr <= highEnd) {
            if (items[hiPtr].value < items[loPtr].value) {
                rightCounter++;
                sorted[index++] = items[hiPtr++];
            } else {
                count[items[loPtr].index] += rightCounter;
                sorted[index++] = items[loPtr++];
            }
        }

        while (loPtr <= startEnd) {
            count[items[loPtr].index] += rightCounter;
            sorted[index++] = items[loPtr++];
        }

        while (hiPtr <= highEnd) {
            sorted[index++] = items[hiPtr++];
        }

        System.arraycopy(sorted, 0, items, start, m);
    }

    public int myAtoi(String s) {       //Usage of horner's rule where we can use * 10 + num. coz we cant use parse func of java.
        int sign = 1;
        String regex = "\\d+";
        StringBuilder onlyNumbers = new StringBuilder();
        String withoutSpaces = (s.contains(" ")) ? s.trim() : s;
        StringBuilder builderWithoutSpaces = new StringBuilder().append(withoutSpaces);

        if (!withoutSpaces.isEmpty() && Character.toString(withoutSpaces.charAt(0)).equals("-")) {
            sign = -1;
            builderWithoutSpaces.deleteCharAt(0);
        } else if (!withoutSpaces.isEmpty() && Character.toString(withoutSpaces.charAt(0)).equals("+")) {
            builderWithoutSpaces.deleteCharAt(0);
        }
        withoutSpaces = builderWithoutSpaces.toString();
        char[] numbersDigArr = withoutSpaces.toCharArray();
        if (numbersDigArr.length > 0 && !Character.toString(numbersDigArr[0]).matches(regex)) {
            return 0;
        }

        for (int i = 0; i < numbersDigArr.length; i++) {
            if (Character.toString(numbersDigArr[i]).matches(regex)) {
                onlyNumbers.append(numbersDigArr[i]);
            } else {
                break;
            }
        }
        if (onlyNumbers.length() == 0) {
            return 0;
        }
        String onlyNumber = onlyNumbers.toString();
        return (int) parseNumber(onlyNumber, sign);
    }

    private long parseNumber(String s1, int sign) {
        char[] chars = s1.toCharArray();
        long val = 0;
        int i = 0;
        while (i < chars.length) {
            val = val * 10 + (chars[i++] - '0');
            if (val * sign > Integer.MAX_VALUE || val * sign < Integer.MIN_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        ;
        return val * sign;
    }

    //Optimized to handle all overflow longer than long
    //https://leetcode.com/problems/binary-prefix-divisible-by-5/discuss/265554/Java-7-liner-left-shift-bitwise-or-and-mod.
    public List<Boolean> prefixesDivBy5(int[] A) {
        int k = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int a : A) {
            k = (k << 1 | a) % 5; // left shift k by 1 bit and plus current element a is the binary number.
            ans.add(k == 0);
        }
        return ans;
    }

//    public List<Boolean> prefixesDivBy5(int[] nums) {
//        List<Boolean> divisibleBy5 = new ArrayList<>();
//        StringBuilder binaryNumber = new StringBuilder();
//        if(nums.length <= 0){
//            return divisibleBy5;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            binaryNumber.append(nums[i]);
//            int currNum = convertBinaryToInt(binaryNumber);
////            int currNum = Integer.parseInt(binaryNumber.toString(), 2);
//            System.out.println(currNum);
//            divisibleBy5.add(currNum % 5 == 0);
//        }
//        return divisibleBy5;
//    }
//
//    private int convertBinaryToInt(StringBuilder binaryNumber) {
//        long binaryNumberVal = Long.parseLong(binaryNumber.toString());
//        int number = 0;
//        int counter = 0;
//        while (true){
//            if (binaryNumberVal == 0){
//                break;
//            }else{
//                long temp = binaryNumberVal%10;
//                number += temp * Math.pow(2,counter);
//                binaryNumberVal = binaryNumberVal/10;
//                counter++;
//            }
//        }
//        return number;
//    }

    public String truncateSentence(String s, int k) {
        if (s.isEmpty())
            return "";
        String[] sArr = s.split(" ");
        String[] resArr = new String[k];
        StringBuilder response = new StringBuilder();
        int i = 0;
        while (i < k) {
//            response.append(sArr[i]);
            resArr[i] = sArr[i];
            i++;
        }
        return String.join(" ", resArr);
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = -1;
        String[] sentenceArr = sentence.split(" ");
        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i].startsWith(searchWord)) {
                index = i + 1;
                break;
            }
        }
        return index;
    }

    public String replaceDigits(String s) {
        StringBuilder response = new StringBuilder();
        int i = 0;
        int j = i + 1;
        if (s.isEmpty()) {
            return response.toString();
        }
        char[] inputArrr = s.toCharArray();
        for (; j < inputArrr.length; ) {
            response.append(shiftChar(inputArrr[i], Integer.parseInt(Character.toString(inputArrr[j]))));
            i += 2;
            j += 2;
        }
        if (i <= inputArrr.length - 1 && !(Character.toString(inputArrr[i])).isEmpty()) {
            response.append(inputArrr[i]);
        }
        return response.toString();
    }

    private String shiftChar(char c, int num) {
        String result = "" + c;
        int i = (c + num);
        return result + (char) i;
    }

    public String shiftingLetters(String s, int[] shifts) {
        String toChange = "";
        char[] inputString = s.toCharArray();
        if (s.isEmpty())
            return "";
        //Caused time limit exceeded so tried to optimize
//        for (int i = 0; i < shifts.length; i++) {
//            toChange += inputString[i];
//            toChange = shiftString(toChange, shifts[i]);
//        }
        char[] chars = s.toCharArray();
        int shift = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
//            chars[i] = (char)((chars[i] - 'a' + shift) % 26 + 'a');   // This or below block both take care of rounding if more than 'z'
            chars[i] += shift;
            if (chars[i] > 'z') {
                chars[i] -= 26;
            }
        }
        return new String(chars);
    }

    private String shiftString(String input, int num) {
        StringBuilder stringAfterShift = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (num > 26) {
                num = num % 26;
                int i = (c + num) > 122 ? ((c + num) % 122 + 'a' - 1) : c + num;
                stringAfterShift.append((char) i);
            } else {
                int i = (c + num) > 122 ? ((c + num) % 122 + 'a' - 1) : c + num;
                stringAfterShift.append((char) i);
            }
        }
        return stringAfterShift.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { //Idea is to keep on scanning the prefix with words untill we get prefix in word.
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    //Priyanka's solution.
    List<List<String>> res;

    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();
        solveNQueens(new int[n][n], 0, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return res;
    }

    public void solveNQueens(int[][] board, int i, Set<Integer> d1, Set<Integer> d2, Set<Integer> verticle) {
        if (i == board.length) {
            res.add(format(board));
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (!d1.contains(j - i) && !d2.contains(j + i) && !verticle.contains(j)) {
                board[i][j] = 1;
                d1.add(j - i);
                d2.add(j + i);
                verticle.add(j);
                solveNQueens(board, i + 1, d1, d2, verticle);
                board[i][j] = 0;
                d1.remove(j - i);
                d2.remove(j + i);
                verticle.remove(j);
            }
        }
    }

    public List<String> format(int[][] board) {
        List<String> ans = new ArrayList();

        for (int i = 0; i < board.length; i++) {
            StringBuffer sb = new StringBuffer();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) sb.append("Q");
                else sb.append(".");
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    //My solution below
//    public List<List<String>> solveNQueens(int n) {
//        List<String> rows = new ArrayList<>();
//        List<List<String>> chessBoard = new ArrayList<>();
//        if (n < 4) {
//            if (n == 1) {
//                rows.add("Q");
//                chessBoard.add(rows);
//            }
//        } else {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    List<String> strings = placeQueens(n, i, j);
//                    if (strings != null) {
//                        chessBoard.add(strings);
//                    }
//                }
//            }
//        }
//        return chessBoard;
//    }

    private List<String> placeQueens(int n, int Qi, int Qj) {
        String[][] matrix = new String[n][n];
        List<String> placedQueens = new ArrayList<>();
        placedQueens.add("" + Qi + Qj);
        for (String[] row : matrix)
            Arrays.fill(row, ".");
        matrix[Qi][Qj] = "Q";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!isCollide(placedQueens, i, j)) {
                    placedQueens.add("" + i + j);
                    matrix[i][j] = "Q";
                }
            }
        }
        if (placedQueens.size() == n) {
            return Arrays.stream(matrix).map(arr -> String.join("", Arrays.asList(arr))).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    private boolean isCollide(List<String> placedQueens, int i, int j) {
        Optional<String> first = placedQueens.stream().filter(q -> {
            int qi = Integer.parseInt(q.substring(0, 1));
            int qj = Integer.parseInt(q.substring(1));
            return leftDiagonal(qi, qj, i, j) || rightDiagonal(qi, qj, i, j) || horizontal(qi, qj, i, j) || vertical(qi, qj, i, j);
        }).findFirst();
        return first.isPresent();
    }

    private boolean leftDiagonal(int qi, int qj, int ci, int cj) {
        return ci + cj - qi == qj;
    }

    private boolean rightDiagonal(int qi, int qj, int ci, int cj) {
        return cj - ci + qi == qj;
    }

    private boolean horizontal(int qi, int qj, int ci, int cj) {
        return cj == qj;
    }

    private boolean vertical(int qi, int qj, int ci, int cj) {
        return ci == qi;
    }

    //Below we have better solution than this
    public int romanToInt(String s) {
        Map<String, Integer> literalToInt = new HashMap<>();
        literalToInt.put("I", 1);
        literalToInt.put("V", 5);
        literalToInt.put("X", 10);
        literalToInt.put("L", 50);
        literalToInt.put("C", 100);
        literalToInt.put("D", 500);
        literalToInt.put("M", 1000);
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (i > 0 && (chars[i] == 'V' || chars[i] == 'X')) {
                char before = chars[i - 1];
                if (before == 'I') {
                    sum += literalToInt.get(chars[i] + "") - literalToInt.get(chars[i - 1] + "");
                    i--;
                } else {
                    sum += literalToInt.get(chars[i] + "");
                }
            } else if (i > 0 && (chars[i] == 'L' || chars[i] == 'C')) {
                char before = chars[i - 1];
                if (before == 'X') {
                    sum += literalToInt.get(chars[i] + "") - literalToInt.get(chars[i - 1] + "");
                    i--;
                } else {
                    sum += literalToInt.get(chars[i] + "");
                }
            } else if (i > 0 && (chars[i] == 'D' || chars[i] == 'M')) {
                char before = chars[i - 1];
                if (before == 'C') {
                    sum += literalToInt.get(chars[i] + "") - literalToInt.get(chars[i - 1] + "");
                    i--;
                } else {
                    sum += literalToInt.get(chars[i] + "");
                }
            } else {
                sum += literalToInt.get(chars[i] + "");
            }
        }
        return sum;
    }

    //Better solution than mine
//    public int romanToInt(String s) {
//        HashMap<Character, Integer> m= new HashMap<>();
//        m.put('I', 1);
//        m.put('V', 5);
//        m.put('X', 10);
//        m.put('L', 50);
//        m.put('C', 100);
//        m.put('D', 500);
//        m.put('M', 1000);
//        int ans=0;
//
//        for(int i=0; i<s.length(); i++) {
//            if(i+1<s.length() && m.get(s.charAt(i))<m.get(s.charAt(i+1)))
//                ans-= m.get(s.charAt(i));
//            else ans+= m.get(s.charAt(i));
//        }
//        return ans;
//    }
}

//*
// * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class MyHashSet {
    List<Integer> values;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        values = new ArrayList<>();
    }

    public void add(int key) {
        if (values.contains(key)) {
            return;
        }
        values.add(key);
    }

    public void remove(int key) {
        int index = values.indexOf(key);
        if (index != -1) {
            values.remove(index);
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        System.out.println(values.contains(key));
        return values.contains(key);
    }
}

class MyCircularQueue {

    Queue<Integer> queue;
    int rear = 0;
    int front = 0;

    public MyCircularQueue(int k) {
        queue = new LinkedBlockingQueue<Integer>(k);
        rear = k;
    }

    public boolean enQueue(int value) {
        try {
            queue.add(value);
            front++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deQueue() {
        if (queue.poll() != null) {
            rear--;
            return true;
        }
        return false;
    }

    public int Front() {
        return front;
    }

    public int Rear() {
        return rear;
    }

    public boolean isEmpty() {
        return Front() == Rear();
    }

    public boolean isFull() {
        return Front() != Rear();
    }
}

//class LogSystem {
//
//    SortedSet<Log> logIdSet;
//
//    public LogSystem() {
//        logIdSet = new TreeSet<>();
//    }
//
//    public void put(int id, String timestamp) {
//        logIdSet.add(new Log(id,timestamp));
//    }
//
//    public List<Integer> retrieve(String start, String end, String granularity) {
//        LocalDateTime startDate = createLocalDateTimeObject(start);
//        LocalDateTime endDate = createLocalDateTimeObject(end);
//        switch (granularity) {
//            case "Year":
//                endDate =
//                break;
//        }
//        return null;
//    }
//
//    private LocalDateTime createLocalDateTimeObject(String start) {
//        String[] inputDate = start.split(":");
//        return LocalDateTime.of(
//                Integer.parseInt(inputDate[0]),
//                Integer.parseInt(inputDate[1]),
//                Integer.parseInt(inputDate[2]),
//                Integer.parseInt(inputDate[3]),
//                Integer.parseInt(inputDate[4]),
//                Integer.parseInt(inputDate[5]));
//    }
//
//    class Log{
//        int id;
//        LocalDateTime timestamp;
//
//        public Log(int id, String timestamp) {
//            this.id = id;
//            this.timestamp = createLocalDateTimeObject(timestamp);
//        }
//    }
//}

class Item {
    int index;
    int value;

    public Item(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
