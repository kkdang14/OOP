package THBUOI5;

import java.util.Scanner;

public class ChiTiet {
	private HangHoa h;
	private int sl;
	private long dgia;
	
	public ChiTiet() {
		h = new HangHoa();
		sl = 0;
		dgia = 0;
		
	}
	
	public ChiTiet(ChiTiet ct) {
		h = new HangHoa(ct.h);
		sl = ct.sl;
		dgia = ct.dgia;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		h.nhap();
		System.out.println("Nhap so luong hang hoa: ");
		sl = sc.nextInt();
		System.out.println("Nhap don gia: ");
		dgia = sc.nextLong();
		
	}
	
	public void in() {
		h.in();
		System.out.println("+ So luong hang hoa: "+ sl);
		System.out.println("+ Don gia: " + dgia);
	}
	
	public long ttien() {
		return dgia*sl;
	}
}