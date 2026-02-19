Description:
Given two strings s and t, determine whether they are isomorphic.



Constraints:
Input:         

First Line of the Input Consists of one String Value s.

Second Line of the Input Consists of another String Value t.

Two strings are said to be isomorphic if the characters in s can be replaced to get t, such that:

-> Each character in s maps to exactly one character in t

-> The mapping is consistent throughout the string

-> No two different characters in s map to the same character in t

-> A character may map to itself

Output:          

Your task is to check whether there exists a one-to-one character mapping from string s to string t.

If such a mapping exists, print isomorphic strings

Otherwise, print not an isomorphic strings

Constraints:   

If the lengths of the two strings are not equal, print Invalid Inputs


Example:
Input1:  egg

add

Output1: isomorphic strings

 

Input2: foo

bar

Output2: not an isomorphic strings

 

Input3: abcba

xbxbx

Output3: not an isomorphic strings


Explanation:
Input1: egg

add

Output1: isomorphic strings

Explanation:

e maps to → a

g maps to → d

g maps to → d

So, the strings are isomorphic.


Input2: foo

bar

Output2: not an isomorphic strings

Explanation:

f maps to → b

o maps to → a

o maps to → r (mapping changes)

Since the character o maps to two different character.

 

Input3: abcba
xbxbx

Output3: not an isomorphic strings

Explanation:

a maps to → x

b maps to → b

c maps to → x (conflict)

Here, both a and c map to the same character x.



import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length()!=t.length()){
            System.out.println("Invalid Inputs");
            return;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++) 
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        
        for(int i=0;i<t.length();i++)
        map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        
        int sFre[] = new int[map1.size()];
        int tFre[] = new int[map2.size()];
        int ind=0;
        for(Map.Entry<Character,Integer> entry : map1.entrySet())
        sFre[ind++]=entry.getValue();
        
        ind=0;
        for(Map.Entry<Character,Integer> entry : map2.entrySet())
        tFre[ind++]=entry.getValue();
        
        Arrays.sort(sFre);
        Arrays.sort(tFre);
        
        if(Arrays.equals(sFre,tFre))
        System.out.println("isomorphic strings");
        else
        System.out.println("not an isomorphic strings");
        
    }
}
