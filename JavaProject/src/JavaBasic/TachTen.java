package JavaBasic;

import java.util.Scanner;

public class TachTen{
	public static String layTen(String hoten){
		String ten = null;
		for(int i=hoten.length()-1; i>=0; i--) {
			if(hoten.charAt(i)==' ') {
				ten =  hoten.substring(hoten.lastIndexOf(" ")+1, hoten.length());
				break;
			}
		}
		return ten;		
	}
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String hoten;
		hoten = s.nextLine();
		hoten = hoten.trim();
		System.out.println(layTen(hoten));
	}
}