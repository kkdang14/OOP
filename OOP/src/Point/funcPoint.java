package Point;

import java.util.Scanner;

public class funcPoint {
	private int x= 0;
	private int y= 1;
	
 	public funcPoint(){
		x = 0;
		y = 1;
	}
	
	public funcPoint(int m, int n) {
		this.x = m;
		this.y = n;
	}
	public static Scanner sc = new Scanner(System.in);
	public void read() {
		int a=0, b=0;
		a= sc.nextInt();
		b= sc.nextInt();
		x =a;
		y =b;
	}
	public void print() {
		System.out.println("("+ x +", "+ y +")");
	}
	public void move(int dx, int dy) {
		x+= dx;
		y+= dy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}
	public double distance(funcPoint P) {
		return Math.sqrt((x-P.x)*(x-P.x) + (y-P.y)*(y-P.y));
	}
}

