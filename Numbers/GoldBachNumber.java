Description:
Write a Program to print the given number is Goldbach Number or not?

 

Goldbach Number :

If the number can be expressed as addition of any two different Odd Prime number pairs(Minimum 2 Pairs), then it said to be a Goldbash Number


Constraints:
Input           :    Frist Line of the input consists of one Integer Value

Output        :    Print Goldbach Number or not

                         If Given Number is Goldbach Number then Print those pairs also.

Constraints :   Given Input Must be Greater than zero or else print "Invalid Input" .

                         If there is no pairs found for Given Input then Print "No Pairs Found So not a Goldbach Number" .

                         If only pair found for Given Input then Print "Only one Pair Found So not a Goldbach Number" . 


Example:
Input 1            :      50

Output 1         :      3 47

                                7 43

                               13 37

                               19 31

                               Goldbach Number

 

Input 2            :      47

Output 2         :      No pairs Found So not a Goldbach Number

 

Input 3            :      38

Output 3         :      Only one pair Found So not a Goldbach Number

 

 


Explanation:
Input 1            :      50

Output 1         :      3 47

                                7 43

                               13 37

                               19 31

                               Goldbach Number

Explanation   :      50 is a GoldBach number 

3 + 47 = 50 -> 3 and 47 are odd prime numbers

7 + 43 = 50 -> 7 and 43 are odd prime numbers

13 + 37 = 50 -> 13 and 37 are odd prime numbers

19 + 31 = 50 -> 19 and 31 are odd prime numbers

like this we have 4 pairs for odd prime numbers which sum is 50(given number) so it is GoldBach Number.

 

Input 2            :      47

Output 2         :      No pairs Found So not a Goldbach Number

Explanation   :      47 is not a GoldBach number 

There is not pairs of odd Prime numbers to form the 47 ( Given number) so it is not a GoldBach Number.

 

Input 3            :      38

Output 3         :      Only one pair Found So not a Goldbach Number

Explanation   :      38 is not a GoldBach number 

7 + 31 = 38 -> 7 and 31 are odd prime numbers

like this we have only 1 pair for odd prime numbers which sum is 38(given number) so it is not a GoldBach Number.


import java.util.*;
class A{
    static boolean isPrime(int a){
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        for(int i=1;i<n/2;i++){
            for(int j=1;j<=n;j++){
                if(i%2==1 && j%2==1){
                    if(isPrime(i)&&isPrime(j)){
                        if(i+j==n){
                            c++;
                        }
                    }
                }
            }
        }
        if(c==0){
            System.out.print("No Pairs Found So not a Goldbach Number");
            return;
        }
        if(c==1){
            System.out.print("Only one Pair Found So not a Goldbach Number");
            return;
        }
        for(int i=1;i<n/2;i++){
            for(int j=1;j<=n;j++){
                if(i%2==1 && j%2==1){
                    if(isPrime(i) && isPrime(j)){
                        if(i+j==n){
                            System.out.println(i+" "+j);
                        }
                    }
                }
            }
        }
        System.out.print("Goldbach Number");
    }
}
