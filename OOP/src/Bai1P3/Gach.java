package Bai1P3;

import java.util.Scanner;

public class Gach {
	private String maSo;
	private String mauSac;
	private int soLuong;
	private int cdai;
	private int cngang;
	private long gia;
	
	public Gach(){
		maSo = new String();
		mauSac = new String();
		soLuong = 0;
		cdai = 0;
		cngang = 0;
		gia = 0;
	}
	
	public Gach(String code, String color, int amount, int length, int width, long price) {
		this.maSo = code;
		this.mauSac = color;
		this.soLuong = amount;
		this.cdai = length;
		this.cngang = width;
		this.gia = price;
	}
	
	public Gach(Gach tiles) {
		maSo= new String(tiles.maSo);
		mauSac = new String(tiles.mauSac);
		soLuong = tiles.soLuong;
		cdai= tiles.cdai;
		cngang = tiles.cngang;
		gia = tiles.gia;
	}
	
	public long getGia() {
		return gia;
	}
	
	public void nhapTT() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap vao ma so: ");
		maSo = s.nextLine();
		System.out.println("Nhap vao mau sac: ");
		mauSac = s.nextLine();
		System.out.println("Nhap vao so luong: ");
		soLuong = s.nextInt();
		System.out.println("Nhap vao chieu dai: ");
		cdai = s.nextInt();
		System.out.println("Nhap vao chieu rong: ");
		cngang = s.nextInt();
		System.out.println("Nhap vao gia ban: ");
		gia = s.nextLong();

	}
	
	public void hienThi() {
		System.out.println("+ Ma so: "+ maSo);
		System.out.println("+ Mau sac: "+ mauSac);
		System.out.println("+ So luong: "+ soLuong);
		System.out.println("+ Chieu dai: "+ cdai);
		System.out.println("+ Chieu rong: "+ cngang);
		System.out.println("+ Gia ban: "+ gia);
		
	}
	
	public float giaBanLe() {
		return (float)((gia/soLuong)*1.2);
	}
	
	public int dtnenmax() {
		return soLuong*(cdai*cngang);
	}
	
	public int soLuongHop(int D, int N) {
		int slvDai = D /cdai;
		if(D % cdai !=0) slvDai++;
		int slvNgang = N/cngang;
		if(N % cngang !=0) slvNgang++;
		int tongVien = slvDai * slvNgang;
		int slhop = tongVien/soLuong;
		if(tongVien % soLuong != 0) slhop++;
		return slhop;
	}
	
}
