import java.util.*;
public class Main{
    static int subSum(int a[],int t, int s,int e){
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=a[i];
        }
        if(sum==t && e-s>=1) return e-s+1;
        else return 0;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inn = sc.nextInt();
		int a[] =new int[inn];
		for(int i=0;i<inn;i++)a[i]=sc.nextInt();
		int t = sc.nextInt();
		int s=0,e=0,n=0;
		for(int i=0;i<a.length;i++){
		    for(int j=i;j<a.length;j++){
		        if(n<subSum(a,t,i,j)){
		            n=subSum(a,t,i,j);
		            s=i; e=j;
		        }
		    }
		}
		if(s!=e)for(int i=s;i<=e;i++) System.out.print(a[i]+" ");
	}
}
