Description:
Write a program to print whether a given number is an even prime, odd prime, even, or odd.


Constraints:
Input:             First Line of the Input Consists of one Integer Value.

Output:          Print that Given Number is an Even Prime or Odd Prime or Even or Odd.

Constraints:   Assume that User will Give you Only Positive Numbers.


Example:
Example-1

Input:             6

Output:          Even

 

Example-2

Input:             2

Output:          Even Prime

 

Example-3

Input:             9

Output:          Odd

 

Example-4

Input:             23

Output:          Odd Prime


Explanation:
Example-1

Input:             6

Output:          Even

Explanation:   Given Number is 6. Here, 6 is having 4 factors (1, 2, 3, 6). So, it is Not a Prime Number but, it is an Even Number because it is Divisible by 2. So, we Have to Print, "Even".

 

Example-2

Input:             2

Output:          Even Prime

Explanation:   Given Number is 2. Here, 2 is having 2 factors (1, 2). So it is a Prime Number, and it is also an Even Number, because it is Divisible by 2. So, we Have to Print "Even Prime".

 

Example-3

Input:             9

Output:          Odd

Explanation:   Given Number is 9. Here, 9 is having 3 factors (1, 3, 9), So, it is not a Prime Number and it is Odd Number because it is not Divisible by 2, So, we Have to Print that "Odd".

 

Example-4

Input:             23

Output:          Odd Prime

Explanation:   Given Number is 23. Here, 23 is having 2 factors (1, 23), So, it is Prime Number and it is an Odd Number, because it is not Divisible by 2. So, we Have to Print "Odd Prime".



import java.util.*;
class Main{
    static boolean isPrime(int n){
        int fc=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fc++;
            }
        }
        if(fc==2) return true;
        else return false;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 && isPrime(n)){
            System.out.println("Even Prime");
            return;
        }
        if(n%2==1 && isPrime(n)){
            System.out.println("Odd Prime");
            return;
        }
        if(n%2==0){
            System.out.println("Even");
            return;
        }
        if(n%2==1){
            System.out.println("Odd");
        }
    }
}
