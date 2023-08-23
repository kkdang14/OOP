package JavaBasic;

import java.util.Scanner;

public class CheckPrime2 {
	public static Boolean PriNum(int n) {
		Boolean prinum = true;
		for(int i=2; i<=Math.sqrt(n); i++)
			if(n % i==0)
				prinum = false;
		return prinum;
	}
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n; 
		n = sc.nextInt();
		if(PriNum(n))	
			System.out.println("n là số nguyên tố");
		else
			System.out.println("n không là số nguyên tố");
		System.out.print(Integer.toBinaryString(n));
	}
}
