package LineSegment;

import java.util.Scanner;

public class SDDoanThang {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Diem A = new Diem(2,5);
		System.out.println("Toạ độ điểm A ");
		System.out.print("A");
		A.hienThi();
		Diem B = new Diem(20,35);
		System.out.println("Toạ độ điểm B ");
		System.out.print("B");
		B.hienThi();
		
		DoanThang AB =  new DoanThang(A, B);
		System.out.println("Tọa độ đường thẳng AB ");
		AB.in();
		AB.tinhTien(5, 3);
		System.out.println("Tọa độ đường thẳng AB sau khi tịnh tiến ");
		AB.in();
		
		DoanThang CD = new DoanThang();
		CD.nhapToaDo();
		System.out.println("Độ dài đường thẳng CD: d = "+ CD.doDai());
		System.out.println("Góc giữa CD và Ox = "+ CD.doDaiOx());
		
		
	}
}
