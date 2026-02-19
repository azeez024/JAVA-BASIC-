Description:
Write a Program to Print All Possibilities of Sum of Any Elements in a Given Array is Equal to Key Value?


Constraints:
Input: First line of the Input Consists of One Integer Value(Array Size).

       Second Line of the Input Consists of Integer Values Separated by Space.

        Third line of the Input Consists of One Integer Value(Key Value).

Output:       Print All the Possibilities where Sum of Array Elements is Equal to Key.

Constraints:  Given Array Size Must be Positive Number or else Print "Invalid Input".

              If there is No Pairs in a Given Array, Then Print "No Possibilites Available.".


Example:
Input 1:  8

          4 5 8 2 6 1 3 9

          8

Output 1:     8

              2 6

              5 2 1

              5 3

              4 1 3

 

Input 2:      9

              -8 3 2 -6 2 -8 3 2 -10

              9

Output 2:     3 2 2 2

              2 2 3 2

 

Input 3:      8

              -4 8 0 -9 -6 -10 6 2

               8

Output 3:      8

               8 0

               8 -6 6

               8 0 -6 6

               6 2

               0 6 2





import java.util.*;
class Main{
    static void print(int s,int e,int a[]){
        for(int i=s;i<=e;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int key= sc.nextInt();
        int cs=0;
        int t =(int)Math.pow(2,n)-1;
        for(int i=1;i<=t;i++){
            int temp=i;
            int c =0;
            ArrayList<Integer> al = new ArrayList<>();
            while(temp>0){
                int r = temp%2;
                if(r==1) al.add(a[c]);
                c++;
                temp=temp/2;
            }
            int sum=0;
            for(int x:al){
                sum+=x;
            }
            if(sum==key){
                for(int x: al) System.out.print(x+" ");
                cs++;
                System.out.println();
            }
            
        }
        if(cs==0){
            System.out.println("No Possibilites Available.");
        }
    }
}
