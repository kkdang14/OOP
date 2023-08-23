package JavaBasic;

import java.util.Scanner;

public class Nhap {
	public static Scanner sc = new Scanner(System.in);
	public int sdNhap(){
		String S;
		int n;
		do {
			S = sc.nextLine();
			try {
				n = Integer.parseInt(S);
			}
			catch(Exception e){
				n = Integer.MIN_VALUE;
				System.out.println("Dữ liệu không hợp lệ ");
			}
		}while(n==Integer.MIN_VALUE); 
	
		return n;
	}
}
