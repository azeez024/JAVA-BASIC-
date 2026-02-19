Description:
Write a program to check if the given number is a Fibonacci Number or not and if it's a Fibonacci Number, then print it's position.

Constraints:
Input          :- First Line of Input Consists of One Integer Value ( N ) .

Output         :-  If N is not a Fibonacci number, print: Not a Fibonacci

                   If N is a Fibonacci number, print: Fibonacci, Position = X.

Constraints :- Given Input Must be Greater than zero or else Print "Invalid Input".


Example:
Input 1: 8

Output: Fibonacci, Position = 7.

 
Input 1: 34
Output: Fibonacci, Position = 10.
 

Input 2: 15
Output: Not a Fibonacci


Explanation:
Input 1: 8
Explanation: Fibonacci series is as following: 0, 1, 1,  2, 3, 5, 8. So, 8 is the 7th Fibonacci.


Input 2: 34
Explanation: Fibonacci series is as following: 0, 1, 1,  2, 3, 5, 8, 13, 21, 34. So, 34 is the 10th Fibonacci.

 
Input 3: 15
Explanation: Given number is not in the Fibonacci series. So, print Not a Fibonacci.


import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int a =0;
        int b =1;
        int co=0;
        while(n>a){
            co++;
            int c =a+b;
            a=b;
            b=c;
        }
        if(a==n){
            System.out.println("Fibonacci, Position = "+(co+1)+".");
        }
        else{
            System.out.println("Not a Fibonacci");
        }
    }
}

