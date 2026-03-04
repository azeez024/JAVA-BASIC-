import java.util.*;
class Sorting implements Comparable<Sorting>{
    int day;
    String month;
    int year;
    Sorting(int day,String month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    static int monthNo(String s){
        String allmonths[] = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        for(int i=0;i<allmonths.length;i++){
            if(s.equals(allmonths[i])){
                return i;
            }
        }
        return -1;
    }
    public String toString(){
        return day+" "+month+" "+year;
    }
    
    public int compareTo(Sorting x){
        if(x.year>this.year){
            return -1;  
        }
        else if(x.year==this.year){
            if(monthNo((x.month).substring(0,3)) > monthNo(this.month.substring(0,3))) return -1;
            else if(monthNo((x.month).substring(0,3)) == monthNo(this.month.substring(0,3))){
                return -(x.day-this.day);
            }
            else return 1;
        }
        else return 1;
    }
}
public class Main{
	public static void main(String[] args) {
		String s = "10 march 2024,5 october 2019,3 march 2024,19 february 2024";
		String dates[] = s.split(",");
		ArrayList<Sorting> ali = new ArrayList<>();
		for(int i=0;i<dates.length;i++){
		    String dd = dates[i];
		    String al[] = dd.split(" ");
		    ali.add(new Sorting(Integer.parseInt(al[0]),al[1],Integer.parseInt(al[2])));
		}
		
		Collections.sort(ali);
		for(int i=0;i<ali.size();i++)   System.out.println(ali.get(i));
	}
}
