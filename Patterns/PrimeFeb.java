Input1 :  5

Output1 :           

2

0 3

1 5 1

7 2 11 3

13 5 17 8 19


Input2 :              8

Output2 :           

2

0 3

1 5 1

7 2 11 3

13 5 17 8 19

13 23 21 29 34 31

55 37 89 41 144 43 233

47 377 53 610 59 987 61 1597




import java.util.*;
class A{
    static int nthPrime(int n){
        int co=0;
        for(int i=2;;i++){
            int fc=0;
            for(int j=1;j<=i;j++){
                if(i%j==0) fc++;
            }
            if(fc==2){
                co++;
                if(co==n) return i;
            }
        }
    }
    static int nthFeb(int n){
        int a=0,b=1,co=0;
        while(true){
            co++;
            if(co==n) return a;
            int c=a+b;
            a=b;b=c;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int count=1,pri=1,feb=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(count%2==1){
                    System.out.print(nthPrime(pri)+" ");
                    pri++;
                }
                else{
                    System.out.print(nthFeb(feb)+" ");
                    feb++;
                }
                count++;
            }
            System.out.println();
        }
    }
}
