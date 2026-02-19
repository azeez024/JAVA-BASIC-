Description:
Write a program to remove adjacent duplicate pairs until no duplicates remain.


Constraints:
Input             :  First line of input consists of one String

Output           :   print the output in following order 

Constraints  :  

Repeatedly remove pairs of adjacent duplicate characters from the string.

A pair means two same characters that appear next to each other.

After removing one pair, the string becomes shorter and new adjacent pairs may appear.

Continue removing until no more adjacent duplicate pairs exist.

Print final string after all possible removals.If the final string is empty then print "Empty String".


Example:
Input 1    :    "miSsissIppi"

Output 1 :     m

 

Input 2    :    "AbbacaCa"

Output 2 :     caCa

 

Input 3    :    "azxxZy"

Output 3 :     ay

 


Explanation:
Input 1    :    "miSsissIppi"

Output 1 :     m

Explanation :

miSsissIppi → remove Ss → miissIppi
miissIppi → remove ii → mssIppi
mssIppi → remove ss → mIppi
mIppi → remove pp → mIi

mIi → remove Ii → "m"
m → no duplicates → "m"

 

Input 2    :    "AbbacaCa"

Output 2 :     caCa

Explanation :

AbbacaCa → remove bb → AacaCa

AacaCa → remove Aa → caCa

caCa → no duplicates → "caCa"

 

Input 3    :    "azxxZy"

Output 3 :     ay

Explanation :

azxxZy → remove xx → azZy

azZy → remove zZ → ay

ay → no duplicates → "ay"


import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> al = new ArrayList<>();
        if(s.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty()){
                    char ch1 = st.pop();
                    char ch2 = s.charAt(i);
                    char sc1 = Character.toLowerCase(ch1);
                    char sc2 = Character.toLowerCase(ch2);
                    if(sc1!=sc2){
                        st.push(ch1);
                        st.push(ch2);
                    }
                    
                }
                
            }
        }
        if(st.isEmpty()){
            System.out.println("Empty String");
            return;
        }
        String ans="";
        for(char i:st){
            ans+=i;
        }
        System.out.print(ans);
    }
}
