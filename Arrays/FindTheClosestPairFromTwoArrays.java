Given two sorted arrays arr1[] and arr2[] of size n and m and a number x, find the pair whose sum is closest to x and the pair has an element from each array. In the case of multiple closest pairs return any one of them.

Note : In the driver code, the absolute difference between the sum of the closest pair and x is printed.

Examples:

Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 32
Output : [1, 30]
Explanation:The closest pair whose sum is closest to 32 is [1, 30] = 31.
Input : arr1[] = [1, 4, 5, 7], arr2[] = [10, 20, 30, 40], x = 50 
Output : [7, 40] 
Explanation: The closest pair whose sum is closest to 50 is [7, 40] = 47.


import java.util.*;

class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int t = Integer.MAX_VALUE;
        int a = 0, b = 0;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                int diff = Math.abs(arr1[i] + arr2[j] - x);
                if(diff < t){
                    t = diff;
                    a = arr1[i];
                    b = arr2[j];
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        return al;
    }
}
