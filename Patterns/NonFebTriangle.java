Description:
Q. Print a right-angle triangle pattern, either with stars or non-Fibonacci numbers in a given range.
Problem Statement
You need to create a program that generates a right-angled triangle pattern based on a given input type (A or B).

If the input is 'A', the program takes a size and prints a right-angled triangle using '*'.
If the input is 'B', the program takes a size and a range, then prints the triangle using non-Fibonacci numbers from the given range in reverse order (bottom to top, right-aligned).

If there aren't enough non-Fibonacci numbers, fill the remaining positions with "**".

If there are extra numbers, print the sum of the unused numbers after the pattern.


Constraints:
Inputs
The input consists of:

The first line contains a character: either 'A' or 'B'.

If input is 'A':

The next line contains one integer n — the size of the pattern.

If input is 'B':

The next line contains three integers, n, the starting range value, and the ending range value.

Output
For Type A:

A right-angled triangle of size N using '*'.

For Type B:

 Print a right-aligned triangle of size n using non-Fibonacci numbers from [Start, End].

Fill from bottom to topand right to left in each row.

If not enough numbers, use "**" in remaining positions.

If extra numbers remain, print their sum in this format:
Sum of remaining numbers: <sum>

 


Example:
Examples
Example 1 (Type A)
Input:
A
5

Output:

           * 
        * * 
      * * * 
   * * * * 
 * * * * * 

Explanation:
Since the input is A, we print a right-angled triangle of size 5 using '*'.


Example 2 (Type B)
Input:
B
7
2
23

Output:
                                   **  
                              **  **  
                          **  **  **  
                     **  **  **  **  
             20  22  23  **  **  
      14  15  16  17  18  19  
04  06  07  09  10  11  12 

Explanation:

We need 7 rows (total 1+2+3+4+5+6+7 = 28 elements).

Only 16 non-Fibonacci numbers are available.

The remaining positions are filled with "**" and aligned to the right.

Example 3 (Type B)
Input:
B
5
11
38

Output:

                        27  
                  25  26  
            22  23  24  
      17  18  19  20  
11  12  14  15  16  
Sum of remaining numbers: 329

Explanation:

We need 5 rows (total 1+2+3+4+5 = 15 elements).

There are non-Fibonacci numbers (25 values).

Only the starting 15 numbers are used (11, 12, 14, 15, 16, 17, 18, 19, 20, 22, 23, 24, 24, 26, 27).

The sum of the remaining numbers (28+29+30+...+38) is 329.


Explanation:
Input & Output Explanation
Input Type	Size (N)	Range
(Starting, Ending)	Action
A	N	-	Print '*' pattern of size N
B	N	Start, End	

Print a pattern using non-Fibonacci numbers in reverse. If insufficient, use '**'. If extra, print their sum.
 
Note: How Non-Fibonacci Numbers Are Derived
Non-Fibonacci numbers are the numbers that do not belong to the Fibonacci sequence.

The Fibonacci sequence starts with:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
Each number is the sum of the previous two.

To find non-Fibonacci numbers in a given range [Start, End]:

First, generate all Fibonacci numbers up to End.

Then, collect all numbers in the range [Start, End] that are NOT in the Fibonacci list.

For example, if the range is [2, 10]:

Fibonacci numbers in this range: 2, 3, 5, 8

So the non-Fibonacci numbers are: 4, 6, 7, 9, 10

These values are then used to fill the triangle from bottom to top, right-aligned.





import java.util.*;
public class Main{
    public static boolean nonFeb(int n){
        int a=0,b=1;
        while(n>a){
            int c=a+b;
            a=b;
            b=c;
        }
        if(n==a) return false;
        else return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch=='A'){
		    int n = sc.nextInt();
		    for(int i=1;i<=n;i++){
		        for(int j=1;j<=n;j++){
		            if(j<=n-i)  System.out.print("  ");
		            else System.out.print("* ");
		        }
		        System.out.println();
		    }
		}
		else if(ch=='B'){
		    int n = sc.nextInt();
		    int s = sc.nextInt();
		    int e = sc.nextInt();
		    ArrayList<Integer> al = new ArrayList<>();
		    for(int i=s;i<=e;i++){
		        if(nonFeb(i)) al.add(i);
		    }
		    int nsum=n*(n+1)/2;
		    for(int i=1;i<=n;i++){
		        int t = i*(i+1)/2;
		        int x=nsum-t;
		        for(int j=1;j<=n-i;j++){
		            System.out.print("   ");
		        }
		        for(int j=1;j<=i;j++){
		            if(al.size()<=x)
		                System.out.print("** ");
		            else{  
		                int no=al.get(x);
		                if(no<10)
		                    System.out.print("0"+no+" ");
		                else
		                    System.out.print(no+" ");
		            }
		            x++;
		        }
		        System.out.println();
		    }
		}
	}
}
