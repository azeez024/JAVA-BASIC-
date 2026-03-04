Input1         :  8

Output1      :

       **
      ****
     **  **
    **    **
   **  **  **
  **  ****  **
 **  **  **  **
**  **    **  **
 **  **  **  **
  **  ****  **
   **  **  **
    **    **
     **  **
      ****
       **

Input2         :   15

Output2      :

              **
             ****
            **  **
           **    **
          **  **  **
         **  ****  **
        **  **  **  **
       **  **    **  **
      **  **  **  **  **
     **  **  ****  **  **
    **  **  **  **  **  **
   **  **  **    **  **  **
  **  **  **  **  **  **  **
 **  **  **  ****  **  **  **
**  **  **  **  **  **  **  **
 **  **  **  ****  **  **  **
  **  **  **  **  **  **  **
   **  **  **    **  **  **
    **  **  **  **  **  **
     **  **  ****  **  **
      **  **  **  **  **
       **  **    **  **
        **  **  **  **
         **  ****  **
          **  **  **
           **    **
            **  **
             ****
              **



import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                if(j%4==1 || j%4==2)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
