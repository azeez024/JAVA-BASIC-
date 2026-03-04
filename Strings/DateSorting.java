Input 2:      10 march 2024,5 october 2019,3 march 2024,19 february 2024

Output 2 :    5 october 2019

              19 february 2024

              3 march 2024

              10 march 2024



import java.util.*;
public class Main{
    static int monthNo(String s){
        String allmonths[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        for(int i=0;i<allmonths.length;i++){
            if(s.equals(allmonths[i])){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		String s = "10 march 2024,5 october 2019,3 march 2024,19 february 2024";
		String dates[] = s.split(",");
	    int day[] = new int[dates.length];
		String month[] = new String[dates.length];
		int year[] = new int[dates.length];
		for(int i=0;i<dates.length;i++){
		    String dd = dates[i];
		    String al[] = dd.split(" ");
		    day[i]=Integer.parseInt(al[0]);
		    month[i]=al[1];
		    year[i]=Integer.parseInt(al[2]);
		}
		
		for(int i=0;i<day.length;i++){
		    for(int j=i;j<day.length;j++){
		        if(year[i]>year[j]){
		            day[i]=day[i]+day[j]-(day[j]=day[i]);
		            year[i]=year[i]+year[j]-(year[j]=year[i]);
		            String dum = month[i];
		            month[i]=month[j];
		            month[j]=dum;
		        }
		        else if(year[i]==year[j]){
		            int m1 = monthNo(month[i].substring(0,3));
		            int m2 = monthNo(month[j].substring(0,3));
		            if(m1>m2){
		                day[i]=day[i]+day[j]-(day[j]=day[i]);
    		            year[i]=year[i]+year[j]-(year[j]=year[i]);
    		            String dum = month[i];
    		            month[i]=month[j];
    		            month[j]=dum;
		            }
		            else if(m1==m2){
		                if(day[i]>day[j]){
		                    day[i]=day[i]+day[j]-(day[j]=day[i]);
        		            year[i]=year[i]+year[j]-(year[j]=year[i]);
        		            String dum = month[i];
        		            month[i]=month[j];
        		            month[j]=dum;
		                }
		            }
		        }
		    }
		}
		for(int i=0;i<day.length;i++)   System.out.println(day[i]+" "+month[i]+" "+year[i]);
	}
}
