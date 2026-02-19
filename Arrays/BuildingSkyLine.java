Description:
There are n buildings in a line. You are given an integer array of size n representing the heights of the buildings along the line.

The ocean is to the right of the buildings. A building has a skyline view if it can see the ocean without obstructions. Formally, a building has a skyline view if all the buildings to its right have a smaller height than that particular building.

Return all indices (0-indexed) of buildings that have a skyline view, sorted in increasing order.

Input : The first line of input consists of an integer value, representing the size of an array.

The second line of input consists of all the integer values.

Output : The output consists of all the indices of buildings that have a skyline view.

Example:
Example 1:

Input 1:    4 

                 4 2 3 1

Output 2: 0, 2, 3

Explanation: Building 2 (1-index) does not have a skyline view because building 3 is taller.


Example 2:

Input 2:    6

8 12 6 7 4 3

Output 2: 1, 3, 4, 5

Explanation: Buildings 2, 4, 5, and 6 have a skyline view, so print their indices 1, 3, 4, 5 respectively.


Example 3:

Input 3:     4

1 3 2 4

Output 3: 3


import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            boolean view=true;
            for(int j=i;j<a.length-1;j++){
                if(a[i]<=a[j+1]){
                    view=false;
                }
            }
            if(view) al.add(i);
        }
        Collections.sort(al);
        String ans="";
        for(int i=0;i<al.size();i++) ans=ans+al.get(i)+", ";
        ans=ans.substring(0,ans.length()-2);
        System.out.println(ans);
    }
}

Explanation: Only building 4 has a skyline view, so print its index i.e. 3.
