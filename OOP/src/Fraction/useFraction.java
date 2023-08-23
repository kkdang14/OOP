package Fraction;

import java.util.Scanner;

public class useFraction {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Tạo 2 phân số a = 3/7, b = 4/9
		Fraction a = new Fraction(3,7);
		Fraction b = new Fraction(4,9); 
		
		//In giá trị của a, b ra màn hình
		
		a.outPut(); 
		b.outPut();
		
		//Nhập phân số x, y từ bàn phím và in ra màn hình
		
		Fraction x = new Fraction();
		System.out.println("Enter fraction x: ");
		x.inPut(); //
		Fraction y = new Fraction();
		System.out.println("Enter fraction y: ");
		y.inPut();
		
		//Hiện thị giá trị nghịch đảo của x(không làm thay đổi giá trị
		
		x.Reverse();
		System.out.println("After reverse fraction x: ");
		x.outPut();
		
		//Tổng của x và y, in ra màn hình
		System.out.println("Sum of x and y: ");
		x.addiFraction(y).outPut();
	
		//Tạo danh sách phân số
		int i,n; 
		Fraction Sum = new Fraction(0,1);
		Fraction max = new Fraction(0,1);
		Fraction tmp = new Fraction();
		System.out.println("Enter n: ");
		n= s.nextInt();
		Fraction arr[]=  new Fraction[n];
		for(i=0; i<n; i++) {
			arr[i] = new Fraction();
			System.out.println("Enter the fraction "+ (i+1) +" : ");
			arr[i].inPut();
		}
		
		//Tổng n phân só trong danh sách
		for(i=0; i<n; i++)
			Sum = Sum.addiFraction(arr[i]);
		System.out.println("Sum of fractions:  ");
		Sum.simpFraction().outPut();
		
		//Phân số lớn nhất trong danh sách 
		for(i=0; i<n; i++)
			if(arr[i].fractionGeater(max))
				max = arr[i];
		System.out.println("The largest fraction: ");	
		max.outPut();
		
		// Sắp xếp danh sách tăng dần
		for(i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++ )
				if(arr[i].fractionGeater(arr[j])) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
 				}
		System.out.println("After sorting the fractions: ");
		for(i=0; i<n; i++)
			arr[i].outPut();
	}
}