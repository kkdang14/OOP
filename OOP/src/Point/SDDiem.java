package Point;

import java.util.Scanner;

public class SDDiem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Diem  A = new Diem(3, 4);
		System.out.print("A");
		A.hienThi();
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("B");
		B.hienThi();
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY());
		System.out.print("C");
		C.hienThi();
		System.out.println(B.khoangcach());
		System.out.println(A.khoangcach(B));
	}
}
