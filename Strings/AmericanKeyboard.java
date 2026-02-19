Description:
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
If no words found then print []

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase). 

Example:
Input:   4

Hello  Alaska  Dad  Peace

Output: Alaska  Dad

 
Input:  1
omk

Output: [ ]

 
Input: 2
adsdf  sfd

Output: adsdf  sfd


Explanation:
Input:   4

Hello  Alaska  Dad  Peace

Output: Alaska  Dad

Explanation : Alaska and Dad are in the same row

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for(int i=0;i<n;i++) a[i] = sc.next();
        String frow="qwertyuiop";
        String srow="asdfghjkl";
        String trow="zxcvbnm";
        int ans=0;
        for(int i=0;i<n;i++){
            String temp=a[i];
            int one=0,two=0,three=0;
            for(int j=0;j<temp.length();j++){
                char ch = temp.charAt(j);
                if(frow.contains(String.valueOf(ch))) one++;
                else if(srow.contains(String.valueOf(ch))) two++;
                else if(trow.contains(String.valueOf(ch))) three++;
            }
            if(one>0 && two==0 && three==0){
                System.out.print(temp+" ");
                ans++;
            }
            else if(two>0 && one==0 && three==0){
                System.out.print(temp+" ");
                ans++;
            } 
            else if(three>0 && one==0 && two==0){
                System.out.print(temp+" ");
                ans++;
            }
        }
        String t[] = new String[0];
        if(ans==0) System.out.print(Arrays.toString(t));
    }
    
}
