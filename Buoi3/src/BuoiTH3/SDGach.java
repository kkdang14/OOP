package BuoiTH3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Nhap vao so loai gach: ");
		n = s.nextInt();
		Gach gach[] = new Gach[n];
		for(int i =0; i<n; i++) {
			gach[i] = new Gach();
			System.out.println("Nhap vao thong tin loai gach thu "+ (i+1) +" :");
			gach[i].nhapTT();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin loai gach thu "+ (i+1) +" :");
			gach[i].hienThi(); 
		}
		Gach g = gach[0];
		double cp_min = gach[0].getGia() / gach[0].dtnenmax();
		for(int i =1; i<n; i++) {
			if((gach[i].getGia()/gach[i].dtnenmax()) < cp_min){
				cp_min = gach[i].getGia() / gach[i].dtnenmax();
				g = gach[i];
			}
		System.out.println("Loai gach co chi phi lot thap nhat: ");
		g.hienThi();
		
		for(int j=0; j<n; j++) {
			long cp = gach[j].soLuongHop(20, 5) * gach[j].getGia();
			System.out.println("Chi phi lot cua loai gach thu "+ (j+1) +" :" + cp);
			
		}	
		}
	}
}
