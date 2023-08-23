  package Fraction;

import java.util.Scanner;

public class PhanSo {
	public static Scanner s = new Scanner(System.in);
	
	private int tu, mau;
	
	PhanSo(){
		tu = 1;
		mau = 1;
	}
	
	public PhanSo(int n, int d) {
		this.tu = n;
		this.mau = d;
	}
	
	// Hàm nhập vào giá trị.
	public void nhap(){
		int a, b;
		a = s.nextInt();
		tu = a;
		b = s.nextInt();
		if(b == 0)
			System.out.println("Erorr! Please enter again!");
		mau = b;
	}
	
	// Hàm xuất ra giá trị.
	public void in(){
		if(tu ==0)	
			System.out.println("0");
		else if(mau == 1)
				System.out.println(tu);	 
		else if(mau < 0)
				System.out.println("-"+ tu +"/"+ Math.abs(mau));
		else System.out.println(tu + "/" + mau + " ");	 
		}
	
	// Hàm nghịch đảo (Không làm thay đổi giá trị).
	public void nghichDao() {
		int t;
		t= tu;
		tu = mau;
		mau = t;
	}
	
	// Hàm nghịch đảo giá trị.
	public PhanSo giaTriNghichDao() {
		PhanSo r = new PhanSo();
		r.tu = mau;
		r.mau = tu;
		return r;
	}
	
	// Hàm xuất ra giá trị thực. 
	public double giaTriThuc() {
		return (float)(tu)/mau;
	}
	
	// Hàm kiểm tra phân số lớn hơn. 
	boolean lonHon(PhanSo a){
		return this.giaTriThuc() > a.giaTriThuc();
	}
	 
	// Hàm cộng 2 phân số.
	public PhanSo cong(PhanSo a) {
		PhanSo add = new PhanSo();
		add.tu = (this.tu*a.mau + a.tu*this.mau);
		if(mau == a.mau)
			add.mau = this.mau = a.mau;
		else add.mau =this.mau * a.mau;
		return add;
	}
	 
	// Hàm trừ 2 phân số. 
	public PhanSo tru(PhanSo a ) {
		PhanSo sub = new PhanSo();
		sub.tu = (this.tu*a.mau - a.tu*this.mau);
		if(this.mau == a.mau)
			sub.mau = this.mau = a.mau;
		else sub.mau =this.mau * a.mau;
		return sub;
	}

	// Hàm nhân 2 phân số.
	public PhanSo nhan(PhanSo a) {
		PhanSo mul = new PhanSo();
		mul.tu = this.tu * a.tu;
		mul.mau = this.mau * a.mau;
		return mul;
	}
	
	// Hàm chia 2 phân số. 
	public PhanSo chia(PhanSo a) {
		PhanSo div = new PhanSo();
		div.tu= this.tu * a.mau;
		div.mau = this.mau * a.tu;
		return div;
		// return this.multPhanSo(a.valueReverse(a,1));
	}
	
	// Hàm công 1 phân só với 1 số nguyên.
	public PhanSo congsonguyen(int a) {
		return this.cong(new PhanSo(a,1));	
	}
	
	// Hàm trừ 1 phân só với 1 số nguyên. 
	public PhanSo truSoNguyen(int a) {
		return this.tru(new PhanSo(a,1));	
	}
	
	// Hàm nhân 1 phân só với 1 số nguyên. 
	public PhanSo nhanSoNguyen(int a) {
		return this.nhan(new PhanSo(a,1));	
	}
	
	// Hàm chia 1 phân só với 1 số nguyên.
	public PhanSo chiaSoNguyen(int a) {
		return this.chia(new PhanSo(a,1));	
	}
	
	// Rút gọn phân số chưa tối giản trong tính tổng các phân số trong danh sách
	// Tìm ước chung lớn nhất.
	public int GCD(int x, int y) {
		if(x % y!= 0)
			return GCD(y, x%y);
		else 
			return y;
	}
	// Rút gọn phân số.
	public PhanSo rutGonPhanSo() {
		PhanSo simp = new PhanSo();
		simp.tu = this.tu;
		simp.mau = this.mau;
		int k = GCD(simp.tu,simp.mau);
		simp.tu/=k;
		simp.mau/=k;
		return simp;
	}
}