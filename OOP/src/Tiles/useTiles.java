package Tiles;

import java.util.Scanner;

public class useTiles {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Tiles box1 = new Tiles();
		box1.nhapThongTin();
		System.out.println("Thông tin hộp gạch: " +"\n"+ box1.toString());
		System.out.print("Giá bán lẻ / 1 viên gạch: ");
		box1.giaBanLe();
		System.out.println("\n");
		System.out.print("Diện tích nền tối đa có thể lót của một viên gạch: ");
		box1.dtnmax();
	}
}

