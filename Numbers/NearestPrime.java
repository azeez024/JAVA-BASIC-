Description:
Write a Program to print the Nearest Prime Number of a Given Number?


Constraints:
Input          :- First Line of Input Consists of One Integer Value.

Output        :- Print the Nearest Prime Number of a Given Number.

Constraints  :- Given Input Must be Greater than Zero or else Print InValid Input.


Example:
Input 1  :    83

Output 1:    79

 

Input 2  :    182

Output 2:    181

 

Input 3  :    228

Output 3:    227

                  229

 


Explanation:
Input 1  :    83

Output 1:    79

Explanation:

Prime Number After the Given Number ( 83 ) is 89.

Prime Number Before the Given Number ( 83 ) is 79.

Before Number( 79 ) is Nearest Number to the Given Number so print this Number

 

Input 2  :    182

Output 2:    181

Explanation:

Prime Number After the Given Number ( 182 ) is 191.

Prime Number Before the Given Number ( 182 ) is 181.

Before Number( 181 ) is Nearest Number to the Given Number so print this Number

 

Input 3  :    228

Output 3:    227

                  229

Explanation:

Prime Number After the Given Number ( 228 ) is 229.

Prime Number Before the Given Number ( 228 ) is 227.

Above 2 numbers are of same Difference with respective to the Given Number so Print Both the Number.


import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rp=0;
        int lp=0;
        if(n<=0){
            System.out.print("InValid Input");
            return;
        }
        for(int i=n+1;;i++){
            int fc1=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fc1++;
                }
            }
            if(fc1==2){
                rp=i;
                break;
            }
        }
        
        for(int i=n-1;i>=1;i--){
            int fc2=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fc2++;
                }
            }
            if(fc2==2){
                lp=i;
                break;
            }
        }
       
        if((rp-n)<(n-lp)){
            System.out.print(rp);
        }
        else if((rp-n)>(n-lp)){
            System.out.print(lp);
        }
        else{
            System.out.println(lp);
            System.out.print(rp);
        }
    }
}
