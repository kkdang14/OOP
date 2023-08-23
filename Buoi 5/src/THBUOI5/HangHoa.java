package THBUOI5;

import java.util.Scanner;

public class HangHoa {
	private String maso;
	private String ten;
	private int nsx;

	public HangHoa(){
		maso = new String();
		ten = new String();
		nsx = 1;
		
	}
	
	public HangHoa(HangHoa hh) {
		maso = new String(hh.maso);
		ten = new String(hh.ten);
		nsx = hh.nsx;
		
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so mat hang: ");
		maso = sc.nextLine();
		System.out.println("Nhap ten mat hang: ");
		ten = sc.nextLine();
		System.out.println("Nhap nam san xuat: ");
		nsx = sc.nextInt();
	}
	
	public void in() {
		System.out.println("+ Ma so mat hang: "+ maso);
		System.out.println("+ Ten mat hang: "+ ten);
		System.out.println("+ Nam san xuat: "+ nsx);
	
	}
	
}