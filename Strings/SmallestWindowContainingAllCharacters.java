Given two strings s and p. Find the smallest substring in s consisting of all the characters (including duplicates) of the string p. Return empty string in case no such substring is present.
If there are multiple such substring of the same length found, return the one with the least starting index.

Examples:

Input: s = "timetopractice", p = "toc"
Output: "toprac"
Explanation: "toprac" is the smallest substring in which "toc" can be found.
Input: s = "zoomlazapzo", p = "oza"
Output: "apzo"
Explanation: "apzo" is the smallest substring in which "oza" can be found.
Input: s = "zoom", p = "zooe"
Output: ""
Explanation: No substring is present containing all characters of p.



import java.util.*;
public class Main{

    static boolean equals(String s,String p){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);

        for(char ch : p.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0)
                return false;

            map.put(ch,map.get(ch)-1);
        }

        return true;
    }

    public static String minWindow(String s, String p) {

        String ans="";
        int l=Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String t = s.substring(i,j);

                if(equals(t,p) && l>t.length()){
                    ans = t;
                    l = t.length();
                }
            }
        }

        return ans;
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(minWindow(s1,s2));
	}
}
