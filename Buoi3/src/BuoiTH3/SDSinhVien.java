package BuoiTH3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Yêu cầu 1
		
//		SinhVien a = new SinhVien();
//		System.out.println("Nhap thong tin sinh vien a: ");
//		a.nhapThongTin();
//		a.themHocPhan();
//		System.out.println(a.toString());
//		
		// Yêu cầu 2
		int n,i;
		System.out.println("Nhap so sv: ");
		n =s.nextInt();
		
		SinhVien[] sv = new SinhVien[n];
		for(i=0; i<n; i++) {
			System.out.println("Nhap thong tin sv thu "+ (i+1) +": ");
			sv[i] = new SinhVien();
			sv[i].nhapThongTin();
			sv[i].nhapDiem();
		}
		
		//Yêu cầu 3
		System.out.println("---------------------------------------");
		System.out.println("Cac sinh vien bi canh bao hoc vu: ");
		for(i=0; i<n; i++) {
			if(sv[i].diemTB() < 0.8) 
				System.out.println("+ "+ sv[i].getHoTen());
		}
		System.out.println("---------------------------------------");
		System.out.println("Sinh vien co diem trung binh cao nhat: ");
		double max = Double.MIN_VALUE;
		for(i=0; i<n; i++) {
			if(sv[i].diemTB() > max)
				max = sv[i].diemTB();
		}
		
		for(i=0; i<n; i++)
			if(sv[i].diemTB() == max)
				System.out.println("+ "+ sv[i].getHoTen());
		
		SinhVien tmp;
		for(i=0; i<n-1; i++) 
			for(int j =i+1; j<n; j++)
				if(sv[j].getName().compareTo(sv[i].getName()) <0) {
					tmp = sv[i];
					sv[i] = sv[j];
					sv[j] = tmp;
				}
		System.out.println("---------------------------------------");
		System.out.println("Danh sach cac sinh vien: ");
		for(i=0; i<n; i++)
			System.out.println(sv[i].toString());
		System.out.println("---------------------------------------");
	}
}