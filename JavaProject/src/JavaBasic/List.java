package JavaBasic;

import java.util.Scanner;

public class List {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
		int n;
		int cnt = 0;
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		int x;
		x = sc.nextInt();
		
		//sort list
		for(int i=0; i<n; i++)
			for(int j=i+1; j<n; j++)
				if(arr[i] > arr[j]) {
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
		//count x
		for(int i=0; i<n; i++)
			if(arr[i] == x)
				cnt++;
		//print to screen
		System.out.println(cnt);
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+ " ");
	}
}
