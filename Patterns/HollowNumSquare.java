Description:
Write a Program to Print the following Basic Pattern?


Constraints:
Input          :- First Line of Input Consists of One Integer Value ( Rows & Columns ).

Output        :- Print the Following Pattern.

Constraints  :- Given Input Must be Greater than Zero or else if input is 0 then Print the Invalid Input or convert the given input negative value to positive value and then print the Pattern.


Example:
Input 1  :    4

Output 1: 

4 4 4 4 4 4 4 

4 3 3 3 3 3 4 

4 3 2 2 2 3 4 

4 3 2 1 2 3 4 

4 3 2 2 2 3 4 

4 3 3 3 3 3 4 

4 4 4 4 4 4 4 

 

Input 2  :    -6

Output 2: 

6 6 6 6 6 6 6 6 6 6 6 

6 5 5 5 5 5 5 5 5 5 6 

6 5 4 4 4 4 4 4 4 5 6 

6 5 4 3 3 3 3 3 4 5 6 

6 5 4 3 2 2 2 3 4 5 6 

6 5 4 3 2 1 2 3 4 5 6 

6 5 4 3 2 2 2 3 4 5 6 

6 5 4 3 3 3 3 3 4 5 6 

6 5 4 4 4 4 4 4 4 5 6 

6 5 5 5 5 5 5 5 5 5 6 

6 6 6 6 6 6 6 6 6 6 6 


Explanation:
Print the Given Pattern by taking one integer Input






import java.util.*;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Invalid Input");
            return;
        }
        if(n<0) n=Math.abs(n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(n-j+1+" ");
                }
                else{
                    System.out.print(n-i+1+" ");
                }
            }
            for(int j=n-1;j>=1;j--){
                if(j<=i){
                    System.out.print(n-j+1+" ");
                }
                else{
                    System.out.print(n-i+1+" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(n-j+1+" ");
                }
                else{
                    System.out.print(n-i+1+" ");
                }
            }
            for(int j=n-1;j>=1;j--){
                if(j<=i){
                    System.out.print(n-j+1+" ");
                }
                else{
                    System.out.print(n-i+1+" ");
                }
            }
            System.out.println();
        }
    }
}
