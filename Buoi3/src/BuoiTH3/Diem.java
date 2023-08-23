package BuoiTH3;

import java.util.Scanner;

public class Diem {
	private int x= 0;
	private int y= 1;
	
 	public Diem(){
		x = 0;
		y = 1;
	}
	public Diem(int m, int n) {
		this.x = m;
		this.y = n;
	}
	public static Scanner sc = new Scanner(System.in);
	public void nhapDiem() {
		int a,b;
		System.out.print("+ Hoành độ: ");
		a= sc.nextInt();
		System.out.print("+ Tung độ : ");
		b= sc.nextInt();
		x =a;
		y =b;
	}
	public void hienThi() {
		System.out.println("("+ x +", "+ y +")");
	}
	public void doiDiem(int dx, int dy) {
		x+= dx;
		y+= dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double khoangcach() {
		return Math.sqrt(x*x + y*y);
	}
	public double khoangcach(Diem d) {
		return Math.sqrt((x-d.x)*(x-d.x) + (y-d.y)*(y-d.y));
	}
}

