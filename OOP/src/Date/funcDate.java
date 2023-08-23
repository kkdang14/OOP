package Date;

import java.util.Scanner;

public class funcDate{	
	public static Scanner sc = new Scanner(System.in);
	int in[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int d, m, y;
	
	funcDate(){
		d =1;
		m =1;
		y =1900;
	}
	public  funcDate(int d, int m, int y){
		this.d = d;
		this.m = m;
		this.y = y;
	}												
	// check date
	public boolean checkDate() {
		if ((y%4==0 && y%100!=0) || y % 400==0) 
			in[2] =29;
		if(m < 1 || m >12)
			return false;
		else
			return (d >=1 && d<=in[m]);
	}
		
	public void scan() {
		do {
			System.out.print("Enter day: "); 
			d = sc.nextInt();
			System.out.print("Enter month: "); 
			m = sc.nextInt();
			System.out.print("Enter year: "); 
			y = sc.nextInt();
			if(!this.checkDate())
				System.out.println("Error. Please re-enter! ");
		} while(!this.checkDate());
	}
		
	public void printDate() {
		System.out.println("Date: " +this.d +"/"+ this.m +"/"+ this.y);
	}
		
	public funcDate tomorrow() {
		funcDate tmr = new funcDate();
		if ((y%4==0 && y%100!=0) || y % 400==0) 
			in[2] =29;
		if(d >=1 && d<=in[m]) {
			tmr.d = d + 1;
			tmr.m = m;
			tmr.y = y;
		}
		else {
			tmr.d = 1;
			tmr.m = m+1;
			tmr.y = y;
		}
			
		if(tmr.m == 13) {
			tmr.m = 1;
			tmr.y++ ;
		}
		return tmr;
	}
	public funcDate addDay() {
		funcDate sd = new funcDate(d,m,y);
		int n;
		System.out.println("Enter the number of days add: ");
		n = sc.nextInt();
		for(int i=0; i<n; i++)
			sd = sd.tomorrow();
		System.out.println("After add " + n + " days: ");
		return sd;
	}
}

