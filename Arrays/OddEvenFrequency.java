Input 1 : 15

10 12 10 22 10 18 15 22 10 22 18 18 12 10 22

Output 1 :

10 - 5

18 - 3

15 - 1

12 - 2

22 - 4


Input 1 : 10

93 36 72 36 93 72 93 36 93 93

Output 1 :

93 - 5

36 - 3

72 - 2



import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) 
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        
        int k[] = new int[map.size()];
        int v[] = new int[map.size()];
        int ind=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            k[ind]=entry.getKey();
            v[ind]=entry.getValue();
            ind++;
        }
        for(int i=0;i<v.length;i++){
            for(int j=i;j<v.length;j++){
                if(v[i]>v[j]){
                    v[i]=v[i]+v[j]-(v[j]=v[i]);
                    k[i]=k[i]+k[j]-(k[j]=k[i]);
                }
            }
        }
        for(int i=v.length-1;i>=0;i--)
            if(v[i]%2==1) System.out.println(k[i]+" - "+v[i]);
        for(int i=0;i<v.length;i++)
            if(v[i]%2==0) System.out.println(k[i]+" - "+v[i]);
    }
}
