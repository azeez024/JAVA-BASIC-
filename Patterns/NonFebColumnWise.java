/*
4
6 15 
7 16 23
9 17 24 29
10 18 25 30 35
11 19 26 31 36 39
12 20 27 32 37 40 42
14 22 28 33 38 41 43 44
*/

import java.util.*;
public class Main{
    static boolean nonFeb(int number){
        int a=0,b=1;
        while(number>a){
            int c=a+b;
            a=b;b=c;
        }
        if(a==number) return true;
        else return false;
    }
    static int nthNonFeb(int n){
        int co=0;
        for(int i=1;;i++){
            if(!nonFeb(i)){
                co++;
                if(co==n) return i;
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		for(int i=1;i<=n;i++){
		    int sum=i;
		    int t = n;
		    for(int j=1;j<=i;j++){
		        System.out.print(nthNonFeb(sum)+" ");
		        t--;
		        sum+=t;
		    }
		    System.out.println();
		}
	}
}
