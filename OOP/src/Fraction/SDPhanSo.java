package Fraction;

import java.util.Scanner;

public class SDPhanSo {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Tạo 2 phân số a = 3/7, b = 4/9
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9); 
		
		//In giá trị của a, b ra màn hình
		
		a.in(); 
		b.in();
		
		//Nhập phân số x, y từ bàn phím và in ra màn hình
		
		PhanSo x = new PhanSo();
		System.out.println("Nhập phân số x: ");
		x.nhap(); //
		PhanSo y = new PhanSo();
		System.out.println("Nhập phân số y: ");
		y.nhap();
		
		//Hiện thị giá trị nghịch đảo của x(không làm thay đổi giá trị
		
		x.nghichDao();
		System.out.println("Sau khi nghịch đảo phân số x: ");
		x.in();
		
		//Tổng của x và y, in ra màn hình
		System.out.println("Tổng hai phân số x và y: ");
		x.cong(y).in();
	
		//Tạo danh sách phân số
		int i,n; 
		PhanSo Sum = new PhanSo(0,1);
		PhanSo max = new PhanSo(0,1);
		PhanSo tmp = new PhanSo();
		System.out.println("Nhập số phần tử trong danh sách phân số: ");
		n= s.nextInt();
		PhanSo arr[]=  new PhanSo[n];
		for(i=0; i<n; i++) {
			arr[i] = new PhanSo();
			System.out.println("Nhập phân số thứ "+ (i+1) +" : ");
			arr[i].nhap();
		}
		
		//Tổng n phân só trong danh sách
		for(i=0; i<n; i++)
			Sum = Sum.cong(arr[i]);
		System.out.println("Tổng các phần tử trong danh sách phân số:  ");
		Sum.rutGonPhanSo().in();
		
		//Phân số lớn nhất trong danh sách 
		for(i=0; i<n; i++)
			if(arr[i].lonHon(max))
				max = arr[i];
		System.out.println("Phân số lớn nhất trong danh sách: ");	
		max.in();
		
		// Sắp xếp danh sách tăng dần
		for(i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++ )
				if(arr[i].lonHon(arr[j])) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
 				}
		System.out.println("Sau khi sắp xếp các phần tử phân số: ");
		for(i=0; i<n; i++)
			arr[i].in();
	}
}
