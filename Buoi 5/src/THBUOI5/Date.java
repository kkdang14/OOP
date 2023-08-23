package THBUOI5;
 
import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	
	
	public Date(){
		ngay =0;
		thang =0;
		nam =0;
	}
	
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ngay: ");
		ngay = sc.nextInt();
		System.out.println("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		nam = sc.nextInt();
	}
	
	public void in() {
		System.out.println(+ ngay +"/"+ thang +"/"+ nam);
	}
}