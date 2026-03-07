You are given an array of intervals arr[][], where each interval is represented by two integers [start, end] (inclusive). Return the maximum number of intervals that overlap at any point in time.

Examples :

Input: arr[][] = [[1, 2], [2, 4], [3, 6]]
Output: 2
Explanation: The maximum overlapping intervals are 2(between (1, 2) and (2, 4) or between (2, 4) and (3, 6))
 
Input: arr[][] = [[1, 8], [2, 5], [5, 6], [3, 7]]
Output: 4
Explanation: The maximum overlapping intervals are 4 (between (1, 8), (2, 5), (5, 6) and (3, 7))


import java.util.*;

class Solution {
    public static int overlapInt(int[][] arr) {

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i][0], map.getOrDefault(arr[i][0],0) + 1);
            map.put(arr[i][1] + 1, map.getOrDefault(arr[i][1] + 1,0) - 1);
        }

        int sum = 0;
        int max = 0;

        for(int val : map.values()){
            sum += val;
            max = Math.max(max, sum);
        }

        return max;
    }
}
