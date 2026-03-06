Given two strings s1 and s2 consisting of only lowercase English letters and of equal length, check if these two strings are isomorphic to each other.
If the characters in s1 can be changed to get s2, then two strings, s1 and s2 are isomorphic. A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Examples:

Input: s1 = "aab", s2 = "xxy"
Output: true
Explanation: Each character in s1 can be consistently mapped to a unique character in s2 (a → x, b → y).
Input: s1 = "aab", s2 = "xyz"
Output: false
Explanation: Same character 'a' in s1 maps to two different characters 'x' and 'y' in s2.


class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int a1[] = new int[256];
        int a2[] = new int[256];
        for(int i=0;i<s1.length();i++){
            int x = s1.charAt(i);
            int y = s2.charAt(i);
            if(a1[x]!=a2[y]) return false;
            a1[x]=i+1;
            a2[y]=i+1;
        }
        return true;
    }
}
