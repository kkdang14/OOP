package JavaBasic;

import java.util.Scanner;

public class CheckPrime {
	public static int kt(int a) {
		int cnt = 0;
		for(int i=2; i<=Math.sqrt(a); i++) {
			if(a % i==0)
				cnt++;
		}
		if(cnt == 2)
			return 1;
		else return 0;
	}      
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
			if(kt(n) == 1)
				System.out.println("n là số nguyên tố");
			else
				System.out.println("n không là số nguyên tố");
	System.out.print(Integer.toBinaryString(n));
	}
}