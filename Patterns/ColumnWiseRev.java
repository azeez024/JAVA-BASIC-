Description:
Write a program to print the numbers in the column wise in reverse order?


Constraints:
Input  :      First line of input consists of one integer value represents number of rows and columns.

Output  :  Print the following pattern

Given integer value is negative then convert it into positive.

If given value is 0 then print "Invalid Input".


Example:
input 1:    5

output 1: 

                    1

                    6 2 

                    10 7 3

                    13 11 8 4

                    15 14 12 9 5

input 2 :     3

output 2 :

                    1

                    4 2

                    6 5 3     


Explanation:
NA


  import java.util.Scanner;
class A{
    public static void main(String []asfd){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Invalid Input");
            return;
        }
        if(n<0){
            n=Math.abs(n);
        }
        int sum=1;
        int d =n;
        for(int i=1;i<=n;i++){
            int a=d;
            int s=sum;
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(sum+" ");
                }
                else{
                    System.out.print(s+" ");
                    s-=a;
                    a++;
                }
            }
            System.out.println();
            sum+=d;
            d--;
        }
    }
}

