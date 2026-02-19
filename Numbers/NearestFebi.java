Description:
Write a program to print the Nearest fibonacci Values of a Given Array Elements?


Constraints:
Input :               First line consists of one integer value represents Array Size.

                          Second line consists of Array values.

Output :            Print the nearest fibnoacci value for Array Elements.

Constraints :     Given array size must be positive or else print "Invalid Array Size".


Example:
Input 1 :        5

                 4 5 6 8 17

Output 1 :       3 5
                 3
                 5
                 5
                 13 21

 

Input 2 :        5

                 0 1 2 3 5                         

Output 2:         1

                  0 1

                  1 3

                  2

                  3  


Explanation:
NA



import java.util.*;
class Main{
    static boolean isFeb(int n){
        int a=0;
        int b=1;
        if(n==0 || n==1){
            return true;
        }
        while(a<n){
            int c = a+b;
            a=b;
            b=c;
        }
        if(a==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Array Size");
            return;
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int n1=a[i];
            int r=0;
            int l=0;
            for(int j=n1+1;;j++){
                if(isFeb(j)){
                    r=j;
                    break;
                }
            }
            for(int j=n1-1;j>=0;j--){
                if(isFeb(j)){
                    l=j;
                    break;
                }
            }
            if(n1==0){
                System.out.println(1);
            }
            else if(n1==1){
                System.out.println(0+" "+1);
            }
            else if((r-n1)>(n1-l)){
                System.out.println(l);
            }
            else if((r-n1)<(n1-l)){
                System.out.println(r);
            }
            else{
                System.out.println(l+" "+r);
            }
        }
    }
}
