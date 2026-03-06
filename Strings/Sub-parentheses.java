Description:
Write a program to print valid sub Parenthesis.


Constraints:
Input  : First line of Input consists of a string value.

Output  :

Print Valid SubParenthesis only.

Print there is no valid SubParenthesis then print "No Valid Parenthesis!".

 


Example:
Input1 :     {()]{}

Output1 :  (){}

Input2 :     {[]()}({){}{][)

Output2 :  {[]()}{}

Input3 :     {()]{[]}[()}[]

Output3 :  (){[]}()[]


Explanation:
Input1 :    {()]{}

Output1 : (){}

Explanation: print valid subParenthesis only in output.



import java.util.*;
class Main{
    static boolean validPar(String s){
        while(!s.isEmpty()){
            if(s.contains("{}")) s = s.replace("{}","");
            else if(s.contains("[]")) s = s.replace("[]","");
            else if(s.contains("()")) s = s.replace("()","");
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int co=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(validPar(s.substring(i,j))){
                    System.out.print(s.substring(i,j));
                    i=j;co++;
                }
            }
        }
        if(co==0) System.out.println("No Valid Parenthesis!");
    }
}


