package Tiles;

import java.util.Scanner;

public class Tiles {
		
	private String code, color;
	private int amount, length, width;
	private long price;
		
	public Tiles(){
		code = new String(); color = new String();
		amount = 1; length = 1; width = 1;
		price = 1;
	}
	
	public Tiles(Tiles t) {
		this.code = new String(t.code);
		this.color = new String(t.color);
		this.amount = t.amount;
		this.length = t.length;
		this.width = t.width;
		this.price = t.price;
	}
	
	public Tiles(String maso, String mau, int soluong, int cdai, int crong, long gia) {
		code = maso;
		color = mau;
		amount = soluong;
		length = cdai;
		width = crong;
		price = gia;
	}
	
	
	public String toString() {
		String result="";
		
		result +="+ Mã số: "+ code +"\n";
		result +="+ Màu: "+ color +"\n";
		result +="+ Số lượng: "+ amount +" viên/1 hộp \n";
		result +="+ Chiều dài: "+ length +"cm \n";
		result +="+ Chiều rộng: "+ width + "cm \n";
		result +="+ Giá: "+ price +"VND \n";
		
		return result;
	}
	
	public void nhapThongTin() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập mã số: ");
		code = s.nextLine();
		System.out.println("Nhập màu: ");
		color =s.nextLine();
		System.out.println("Nhập số lượng: ");
		amount = s.nextInt();
		System.out.println("Nhập chiều dài: ");
		length = s.nextInt();
		System.out.println("Nhập chiều rộng: ");
		width = s.nextInt();
		System.out.println("Nhập giá: ");
		price = s.nextLong();
	}
	
	public float giaBanLe() {
		return (float)price/amount;
	}
	
	public int dtnmax() {
		return length*width*amount;
	}
}

























