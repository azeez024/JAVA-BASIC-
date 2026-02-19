Description:
write a program to print the pattern from the string?

Input : first line of input consists of a string

Output  :  print the pattern


Constraints:
No constraints


Example:
Input 1 : abcdefghijklmnopqrstuvwxyz

Output 1 : ab
                  cde
                  fghij
                  klmnopq
                  Remaining - rstuvwxyz

 

Input 2 : workhardinsilenceletssuccessmakethenoise

Output 2 : wo
                  rkh
                  ardin
                  silence
                  letssuccess
                  Remaining - makethenoise


Explanation:
Input 1 : abcdefghijklmnopqrstuvwxyz

Output 1 : ab
                  cde
                  fghij
                  klmnopq
                  Remaining - rstuvwxyz

Explanation:   

Split the string as group of prime numbers

The first group is 2 characters: "ab"

The second group is 3 characters: "cde"

The third group is 5 characters: "fghij"

The fourth group is 7 characters: "klmnopq"

The remaining characters are "rstuvwxyz"

Note: There are no 11 characters in the remaining string so print the reamining characters

 

Input 2 : workhardinsilenceletssuccessmakethenoise

Output 2 : wo
                  rkh
                  ardin
                  silence
                  letssuccess
                  Remaining - makethenoise

Explanation:

Split the string as group of prime number

The first group is 2 characters: "wo"

The second group is 3 characters: "rkh"

The third group is 5 characters: "ardin"

The fourth group is 7 characters: "silence"

The fifth group is 11 characters: "letssuccess"

The remaining characters are: "makethenoise"

Note :Next prime is 13 but there are no enough characters in the strings so print the reamining characters



import java.util.*;
class Main{
    static int thPrime(int a){
        int b =0;
        for(int i=1;;i++){
            int fc=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fc++;
                }
            }
            if(fc==2){
                b++;
            }
            if(b==a){
                return i;
            }
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sub2="";
        LinkedList<Character> ll = new LinkedList<>();
        for(char c:s.toCharArray()){
            ll.add(c);
        }
        for(int i=1;;i++){
            int p = thPrime(i);
            if(ll.size()>p){
                String sub="";
                for(int j=1;j<=p;j++){
                    sub+=ll.poll();
                }
                System.out.println(sub);
            }
            else{
                sub2="";
                while(!ll.isEmpty()){
                    sub2+=ll.poll();
                }
                break;
            }
            if(ll.isEmpty()){
                break;
            }
        }
        if(!s.isEmpty()){
            System.out.println("Remaining - "+sub2);
        }
        
    }
}
