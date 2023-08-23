package LineSegment;

public class DoanThang {
	private Diem d1, d2;
	
	DoanThang(){
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem a, Diem b){
		d1 = new Diem(a.getX(), a.getY());
		d2 = new Diem(b.getX(), b.getY());
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	
	public void nhapToaDo() {
		System.out.println("Nhập tọa độ điểm đầu: ");
		d1.nhapDiem();
		System.out.println("Nhập tọa độ điểm cuối: ");
		d2.nhapDiem();
	}
	
	public void in() {
		System.out.print("Điểm đầu: ");
		d1.hienThi();
		System.out.print("Điểm cuối: ");
		d2.hienThi();
	}
																						
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	
	}
	
	public double doDai() {
		return Math.sqrt(Math.pow((d2.getX()-d1.getX()),2) + Math.pow((d2.getY()-d1.getY()), 2));
	}
	
	public double doDaiOx() {
		return Math.toDegrees( Math.acos(Math.abs(d2.getX() -d1.getX()) / this.doDai()));
	}
}
