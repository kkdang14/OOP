package Date;

import java.util.Scanner;
 
public class SDDate {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Date d = new Date();
		d.nhap();
		d.in();
		d.ngayHomSau().in();
		System.out.println("Nhập số ngày cộng thêm: ");
		int n = s.nextInt();
		d.congNgay(n).in();
	}
}
