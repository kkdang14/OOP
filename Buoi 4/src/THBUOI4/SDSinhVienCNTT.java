package THBUOI4;

import java.util.Scanner;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
	
		System.out.println("Nhập số sinh viên: ");
		n =sc.nextInt();
		
		SinhVienCNTT SV[] = new SinhVienCNTT[n];
		for(int i=0; i<n; i++) {
			SV[i] = new SinhVienCNTT();
			System.out.println("Nhập thông tin sinh viên CNTT thứ "+ (i+1)+ ": ");
			SV[i].nhapThongTin();
		}
		
		String email;
		sc.nextLine();
		System.out.print("Nhập email cần tìm: ");
		email =sc.nextLine();
		for(int i=0; i<n; i++) {
			if(SV[i].getEmail().equals(email)) {
				System.out.println("Thông tin của sinh viên cần tìm: ");
				System.out.println(SV[i].kqHocTap());
				break;
			}
		}
 	}
}
