package THBUOI5;

import java.util.Scanner;

public class KhachHang {
	private String mso;
	private String hoten;
	private String sdt;
	private String diachi;
	private Boolean gioitinh;
	
	
	public KhachHang(){
		mso= new String();
		hoten = new String();
		sdt  = new String();
		diachi =  new String();
		gioitinh = null; 
	}
	
//	public KhachHang(String mso, String hoten, String sdt, String diachi, String gioitinh) {
//		this.mso= mso;
//		this.hoten = hoten;
//		this.sdt = sdt;
//		this.diachi = diachi;
//		this.gioitinh = gioitinh;
//	}
	
	public KhachHang(KhachHang kh) {
		mso= new String(kh.mso);
		hoten = new String(kh.hoten);
		sdt = new  String(kh.sdt);
		diachi =  new  String(kh.diachi);
		gioitinh = kh.gioitinh;
	}
	
	public void nhap() {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Nhap ma can cuoc cong dan:  ");
		mso= sc.nextLine();
		System.out.println("Nhap ho va ten khach hang: ");
		hoten  = sc.nextLine();
		System.out.println("Nhap so dien thoai khach hang: ");
		sdt = sc.nextLine();
		System.out.println("Nhap dia chi cua khach hang: ");
		diachi = sc.nextLine();
		System.out.println("Nhap gioi tinh cua khach hang nu (true) hoac nam (false): ");
		gioitinh = sc.nextBoolean();
	}
	
	public void in() {
		System.out.println("+ CCCD: " + mso);
		System.out.println("+ Ho ten khach hang: "+ hoten);
		System.out.println("+ Dia chi: "+ diachi);
		System.out.println("+ "+ (gioitinh == true) != null ? "Gioi tinh: Nu" : "Gioi tinh: Nam");
	}
	
}
