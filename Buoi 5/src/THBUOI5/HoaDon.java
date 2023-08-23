package THBUOI5;

import java.util.Scanner;

public class HoaDon {
	private String  madon, tieude, hoten;
	private Date nglap;
	private KhachHang k;
	private ChiTiet c[];
	
	
	public HoaDon() {
		madon= new String();
		tieude = new String();
		hoten = new String();
		nglap = new Date();
		k = new KhachHang();
		c= new ChiTiet[20];
	}
	
	public HoaDon(HoaDon hd) {
		madon = new String(hd.madon);
		tieude = new String(hd.tieude);
		hoten = new String(hd.hoten);
		nglap = new Date(hd.nglap);
		k = new KhachHang(hd.k);
		c = new ChiTiet[20];
		int i=0;
		for(ChiTiet t : hd.c) {
			if(t == null) break;
			else {
				c[i] = new ChiTiet(hd.c[i]);
				i++;
			}
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma don hang: ");
		madon = sc.nextLine();
		System.out.println("Nhap tieu de hoa don: ");
		tieude = sc.nextLine();
		System.out.println("Nhap ho ten khach hang: ");
		hoten = sc.nextLine();
		System.out.println("Ngay lap hoa don: ");
		nglap.nhap();
		int s;
		System.out.println("Nhap thong tin khach hang (1) hay khach hang VIP (2)");
		s = sc.nextInt();
		if(s == 1)	k = new KhachHang();
		else k = new KhachHangVIP();
		k.nhap();
		System.out.println("Nhap so luong hang hoa: ");
		s = sc.nextInt();
		if(s > c.length) s = c.length;
		for(int i=0; i<s; i++) {
			System.out.println("Nhap chi tiet mat hang thu "+ (i+1) +": ");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.println("+ Ma don hang: "+ madon);
		System.out.println("+ Tieu de hoa don: "+ tieude);
		System.out.println("+ Ho ten khach hang: "+ hoten);
		System.out.print("+ Ngay lap hoa don: ");
		nglap.in();
		System.out.println("+ Thong tin khach hang: ");
		k.in();
		for(ChiTiet t: c)
			if(t == null) break;
			else {
				System.out.println("+ Chi tiet don hang: "); 
				t.in();
			}			
		System.out.println("Tong so tien cua hoa don: " + tong());
	}
	
	public long tong() {
		long s =0;
		for(ChiTiet t: c)
			if(t == null) break;
			else s+= t.ttien();
		return s;
	}
	
}
