package JavaBasic;

public class Diem{
	private int x, y ;
	public static int count = 0;
	public Diem(){
		x = 0; y = 0;
		count++ ;
	}
	public Diem(int x1, int y1){
		x = x1; y = y1;
		count++ ;
}
	public static void main(String args[]){
		Diem A = new Diem();
		Diem B = new Diem(13, 23);
		System.out.print("A.count = " + A.count +"\n "+ "B.count = " + B.count);
	}
}