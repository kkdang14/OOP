package Fraction;

import java.util.Scanner;

public class Fraction {
	public static Scanner s = new Scanner(System.in);
		
		private int number, denomin;
		
		Fraction(){
			number = 1;
			denomin = 1;
		}
		
		public Fraction(int n, int d) {
			this.number = n;
			this.denomin = d;
		}
		
		// Hàm nhập vào giá trị.
		public void inPut(){
			int a, b;
			a = s.nextInt();
			number = a;
			b = s.nextInt();
			if(b == 0)
				System.out.println("Erorr! Please enter again!");
			denomin = b;
		}
		
		// Hàm xuất ra giá trị.
		public void outPut(){
			if(number ==0)	
				System.out.println("0");
			else if(denomin == 1)
					System.out.println(number);	 
			else if(denomin < 0)
					System.out.println("-"+ number +"/"+ Math.abs(denomin));
			else System.out.println(number + "/" + denomin + " ");	 
			}
		
		// Hàm nghịch đảo (Không làm thay đổi giá trị).
		public void Reverse() {
			int t;
			t= number;
			number = denomin;
			denomin = t;
		}
		
		// Hàm nghịch đảo giá trị.
		public Fraction valueReverse() {
			Fraction r = new Fraction();
			r.number = denomin;
			r.denomin = number;
			return r;
		}
		
		// Hàm xuất ra giá trị thực. 
		public double realValue() {
			return (float)(number)/denomin;
		}
		
		// Hàm kiểm tra phân số lớn hơn. 
		boolean fractionGeater(Fraction a){
			return this.realValue() > a.realValue();
		}
		 
		// Hàm cộng 2 phân số.
		public Fraction addiFraction(Fraction a) {
			Fraction add = new Fraction();
			add.number = (this.number*a.denomin + a.number*this.denomin);
			if(denomin == a.denomin)
				add.denomin = this.denomin = a.denomin;
			else add.denomin =this.denomin * a.denomin;
			return add;
		}
		 
		// Hàm trừ 2 phân số. 
		public Fraction subtFraction(Fraction a) {
			Fraction sub = new Fraction();
			sub.number = (this.number*a.denomin - a.number*this.denomin);
			if(this.denomin == a.denomin)
				sub.denomin = this.denomin = a.denomin;
			else sub.denomin =this.denomin * a.denomin;
			return sub;
		}
	
		// Hàm nhân 2 phân số.
		public Fraction multFraction(Fraction a) {
			Fraction mul = new Fraction();
			mul.number = this.number * a.number;
			mul.denomin = this.denomin * a.denomin;
			return mul;
		}
		
		// Hàm chia 2 phân số. 
		public Fraction divsFraction(Fraction a) {
			Fraction div = new Fraction();
			div.number= this.number * a.denomin;
			div.denomin = this.denomin * a.number;
			return div;
			// return this.multFraction(a.valueReverse(a,1));
		}
		
		// Hàm công 1 phân só với 1 số nguyên.
		public Fraction addInt(int a) {
			return this.addiFraction(new Fraction(a,1));	
		}
		
		// Hàm trừ 1 phân só với 1 số nguyên. 
		public Fraction subtInt(int a) {
			return this.subtFraction(new Fraction(a,1));	
		}
		
		// Hàm nhân 1 phân só với 1 số nguyên. 
		public Fraction multInt(int a) {
			return this.multFraction(new Fraction(a,1));	
		}
		
		// Hàm chia 1 phân só với 1 số nguyên.
		public Fraction divsInt(int a) {
			return this.divsFraction(new Fraction(a,1));	
		}
		
		// Rút gọn phân số chưa tối giản.
		// Tìm ước chung lớn nhất.
		public int GCD(int x, int y) {
			if(x % y!= 0)
				return GCD(y, x%y);
			else 
				return y;
		}
		// Rút gọn phân số.
		public Fraction simpFraction() {
			Fraction simp = new Fraction();
			simp.number = this.number;
			simp.denomin = this.denomin;
			int k = GCD(simp.number,simp.denomin);
			simp.number/=k;
			simp.denomin/=k;
			return simp;
		}
}