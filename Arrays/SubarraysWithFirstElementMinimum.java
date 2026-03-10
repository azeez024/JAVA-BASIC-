You are given an integer array arr[ ]. Your task is to count the number of subarrays where the first element is the minimum element of that subarray.

Note: A subarray is valid if its first element is not greater than any other element in that subarray.

Examples:

Input: arr[] = [1, 2, 1]
Output: 5
Explanation:
All possible subarrays are:
[1], [1, 2], [1, 2, 1], [2], [2, 1], [1]
Valid subarrays are:
[1], [1, 2], [1, 2, 1], [2], [1] -> total 5
Input: arr[] = [1, 3, 5, 2]
Output: 8
Explanation:
Valid subarrays are: [1], [1, 3], [1, 3, 5], [1, 3, 5, 2], [3], [3, 5], [5], [2] -> total 8



class Solution {
    static boolean valid(ArrayList<Integer> al){
        for(int i=0;i<al.size();i++){
            int t1 = al.get(0);
            int t2 = al.get(i);
            if(t1>t2) return false;
        }
        return true;
    }
    public int countSubarrays(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ArrayList<Integer> al = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    al.add(arr[k]);
                }
                if(valid(al)) count++;
            }
        }
        return count;
    }
}
