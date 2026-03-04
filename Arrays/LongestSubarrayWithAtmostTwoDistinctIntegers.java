Input: arr[] = [2, 1, 2]
Output: 3
Explanation: The entire array [2, 1, 2] contains at most two distinct integers (2 and 1). Hence, the length of the longest subarray is 3.

Input: arr[] = [3, 1, 2, 2, 2, 2]
Output: 5
Explanation: The longest subarray containing at most two distinct integers is [1, 2, 2, 2, 2], which has a length of 5.

import java.util.*;
public class Main{
    public static int totalElements(int[] arr) {
        int ans=0,i=0,j=0;
        while(i<arr.length){
            HashSet<Integer> set = new HashSet<>();
            for(int k=i;k<=j;k++){
                set.add(arr[k]);
            }
            if(j==arr.length-1){
                i++;
                j=i;
            }
            else j++;
            if(set.size()==2 && ans<j-i+1) ans = j-i+1;
        }
        return ans;
    }
	public static void main(String[] args) {
		int arr[] = {6,4,9,10,1};
		System.out.println(totalElements(arr));
	}
}
