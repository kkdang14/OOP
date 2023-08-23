package Point;

import java.util.Scanner;

public class usePoint {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		funcPoint  A = new funcPoint(3, 4);
		System.out.print("A");
		A.print();
		funcPoint B = new funcPoint();
		B.read();
		System.out.print("B");
		B.print();
		funcPoint C = new funcPoint(-B.getX(), -B.getY());
		System.out.print("C");
		C.print();
		System.out.println(B.distance());
		System.out.println(A.distance(B));

	}
}

