Given an array arr[], return true if there is a triplet (a, b, c) from the array (where a, b, and c are on different indexes) that satisfies a2 + b2 = c2, otherwise return false.

Examples:

Input: arr[] = [3, 2, 4, 6, 5]
Output: true
Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.
Input: arr[] = [3, 8, 5]
Output: false
Explanation: No such triplet possible.
Input: arr[] = [1, 1, 1]
Output: false



import java.util.*;
class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Long> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            long sq = (long)arr[i] * arr[i];
            set.add(sq);
        }
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                long sum = (long)arr[i] * arr[i] + (long)arr[j] * arr[j];
                
                if(set.contains(sum))
                    return true;
            }
        }
        
        return false;
    }
}
