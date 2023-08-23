package JavaBasic;

import java.util.Scanner;
public class Tong2SoNguyen {
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		int n; String s = "";
		do {
			System.out.println("Nhap vao 1 so nguyen:");
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			}
			catch (Exception e1) {
				n = Integer.MAX_VALUE;
				System.out.println("Ban da nhap sai dinh dang so!");
				System.out.println("Yeu cau ban nhap lai");
			}
		}while(n==Integer.MAX_VALUE);
		return n;
	}
	public static void main(String s[]) {
		Tong2SoNguyen t = new Tong2SoNguyen();
		System.out.println("Nhap vao a:");
		int a = t.nhap();
		System.out.println("Nhap vao b:");
		int b = t.nhap();
		System.out.println("Tong 2 so a va b la: "+(a+b));
		}
}





