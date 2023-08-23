package THBUOI5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tlg;
	private Date d;

	public KhachHangVIP(){
		super();
		tlg = 0.0f;
		d= new Date();
	
	}
	
	public KhachHangVIP(KhachHangVIP k) {
		super(k);
		tlg = k.tlg;
		d = new Date(k.d);
		
	}
	
	public void nhap() {
		Scanner  sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap ti le giam cua khach hang VIP: ");
		tlg = sc.nextFloat();
		System.out.println("Nhap ngay giam gia: ");
		d.nhap();
	}
	
	public void in() {
		super.in();
		System.out.println(" ");
	}
	
	public float gettlg() {
		return tlg;
	}
	
	public Date getd() {
		return d;
	}
}

