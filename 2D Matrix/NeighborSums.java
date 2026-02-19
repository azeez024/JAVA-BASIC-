Description:
Write a program that reads the matrix and prints the resulting matrix of neighbor sums.


Constraints:
Input :       First Line of the Input consists of one Integer Value ( Rows )

                  Second line of the Input consists of one Integer Value ( Columns )

                  Next Line of the Input Consists of all the Array elements

Output :   Print the 2D Array (create another matrix where each element is the sum of all its 8 neighboring elements (top, bottom, left, right, and 4 diagonals). The matrix boundaries must be handled properly, do not access out-of-bound indices)


Example:
Input 1 :       3

                      3

                      1 2 3

                      4 5 6

                      7 8 9

Output 1 : 

                     11 19 13

                     23 40 27

                     17 31 19

Input 2 :       2

                      3

                     -13 5 0

                      9 -3 21

Output 2 : 

                    11 14 23

                    -11 22 2

Input  3 :       2

                      2

                      56 -9

                     -44 1

Output 3 : 

                    -52 13

                     48 3


Explanation:
Input 1 :       3

                      3

                      1 2 3

                      4 5 6

                      7 8 9

Output 1 : 

                     11 19 13

                     23 40 27

                     17 31 19

Explanation :

(0,0)=1 → 2 (right) + 4 (bottom) + (5)(diagonal) = 11

(0,1)=2 → 1 (left) + 3 (right) + 5 (bottom) + (4+6)(diagonal) = 19

(0,2)=3 → 2 (left) + 6 (bottom) + (5)(diagonal) = 13

(1,0)=4 → 1 (top) + 5 (right) + 7 (bottom) + (2+8)(diagonal) = 23

(1,1)=5 → 2 (top) + 4 (left) + 6 (right) + 8 (bottom) + (1+3+7+9)(diagonal) = 40

(1,2)=6 → 3 (top) + 5 (left) + 9 (bottom) + (2+8)(diagonal) = 27

(2,0)=7 → 4 (top) + 8 (right) + (5)(diagonal) = 17

(2,1)=8 → 5 (top) + 7 (left) + 9 (right) + (4+6)(diagonal) = 31

(2,2)=9 → 6 (top) + 8 (left) + (5)(diagonal) = 19

 

Input 2 :       2

                      3

                     -13 5 0

                      9 -3 21

Output 2 : 

                    11 14 23

                    -11 22 2

Explanation :

(0,0) = -13 → 5 (right) + 9 (bottom) + (-3)(diagonal) = 11

(0,1) = 5 → -13 (left) + 0 (right) + -3 (bottom) + (9+21)(diagonal) = 14

(0,2) = 0 → 5 (left) + 21 (bottom) + (-3)(diagonal) = 23

(1,0) = 9 → -13 (top) + -3 (right) + (5)(diagonal) = -11

(1,1) = -3 → 5 (top) + 9 (left) + 21 (right) + (0)(diagonal) = 22

(1,2) = 21 → 0 (top) + -3 (left) + (5)(diagonal) = 2

 

Input  3 :       2

                      2

                      56 -9

                     -44 1

Output 3 : 

                    -52 13

                     48 3
Explanation :

(0,0) = 56 → -9 (right) + -44 (bottom) + (1)(diagonal) = -52

(0,1) = -9 → 56 (left) + 1 (bottom) + (-44)(diagonal) = 13

(1,0) = -44 → 56 (top) + 1 (right) + (-9)(diagonal) = 48

(1,1) = 1 → -9 (top) + -44 (left) + (56)(diagonal) = 3





import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int sum=0;
                int le=j-1;
                int ri=j+1;
                int t=i-1;
                int b=i+1;
                if(le>=0 && le<c){
                    sum=sum+a[i][le];
                }
                if(ri>=0 && ri<c){
                    sum=sum+a[i][ri];
                }
                if(t>=0 && t<r){
                    sum=sum+a[t][j];
                }
                if(b>=0 && b<r){
                    sum=sum+a[b][j];
                }
                if((le>=0 && le<c)&& (t>=0 && t<r)){
                    sum=sum+a[t][le];
                }
                if((le>=0 && le<c) && (b>=0 && b<r)){
                    sum=sum+a[b][le];
                }
                if((ri>=0 && ri<c) && (t>=0 && t<r)){
                    sum=sum+a[t][ri];
                }
                if((ri>=0 && ri<c) && (b>=0 && b<r)){
                    sum=sum+a[b][ri];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
