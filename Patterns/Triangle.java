Description:
Write a Program to Print the Following Pattern?

If Input is 4 and 5 then Print

50 
45 40 
35 30 25 
20 15 10 5 


Constraints:
Input          :- First Line of Input Consists of One Integer Value ( Rows ).

                     Second Line of Input Consists of One Integer Value.

Output        :- Print the Given Pattern.

Constraints  :- No of Rows Must be Greater than Zero or else Print Invalid Input.


Example:
Input 1  :    4

                  5

Output 1: 

50 
45 40 
35 30 25 
20 15 10 5 

Input 2  :    6  

                  4

Output 2: 

84 
80 76 
72 68 64 
60 56 52 48 
44 40 36 32 28 
24 20 16 12 8 4 


Explanation:
Print the Following Right angle Triangle Pattern by taking Given Integer Value.


import java.util.*;
class Main{
    public static void main(String []args){
        //Write Your Code Here
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        int n =sc.nextInt();
        if(r<=0){
            System.out.print("Invalid Input");
            return;
        }
        int s=0;
        for(int i=1;i<=r;i++){
            s=s+i;
        }
        int a=s*n;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a=a-n;
            }
            System.out.println();
        }
    }
}
