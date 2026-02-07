Input : 7 3
T   s   i
h  %  x
i   !   #
s  M  >
$  a   .
#   t  %    
i    r    !
Output : This is Matrix#>.%!

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char ar[][] = new char[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) ar[i][j]=sc.next().charAt(0);
        }
        String concat="";
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++) concat+=ar[j][i];
        }
        ArrayList<String> al = new ArrayList<>();
        String temp="",chars="";
        for(int i=0;i<concat.length();i++){
            if(Character.isLetter(concat.charAt(i))){ temp+=concat.charAt(i); chars="";}
            else{
                chars+=concat.charAt(i);
                if(!temp.isEmpty()) al.add(temp); temp="";
            }
        }
        if(!chars.isEmpty()){
            al.add(al.get(al.size()-1)+chars);
        }
        for(String s:al) System.out.print(s+" ");
    }
}
