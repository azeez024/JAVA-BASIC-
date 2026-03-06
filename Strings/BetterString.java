Given a pair of strings s1 and s2 of equal lengths, your task is to find which of the two strings has more distinct subsequences. If both strings have the same number of distinct subsequences, return s1.

Examples:

Input: s1 = "gfg", s2 = "ggg"
Output: "gfg"
Explanation: "gfg" have 6 distinct subsequences whereas "ggg" have 3 distinct subsequences. 
Input: s1 = "a", s2 = "b"
Output: "a"
Explanation: Both the strings have only 1 distinct subsequence.


import java.util.*;

public class Main{
    static int one(String s1){
        int n = (int)Math.pow(2,s1.length())-1;
        int ans=0;
        for(int i=1;i<=n;i++){
            int t=i;int c=0;
            ArrayList<Character> al = new ArrayList<>();
            while(t>0){
                int r = t%2;
                if(r==1){
                    al.add(s1.charAt(c));
                }
                c++;
                t=t/2;
            }
            HashSet<Character> set = new HashSet<>(al);
            if(al.size()==set.size()) ans++;
        }
        return ans;
    }
    
    public static String betterString(String s1, String s2) {
        // Code here
        if(one(s1)>one(s2)) return s1;
        else if(one(s1)<one(s2)) return s2;
        else{
            if(s1.compareTo(s2)==1) return s2;
            else return s1;
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(betterString(s1,s2));
	}
}
