package tienTruong_20003065;

public class HinhChuNhat {
	//khai bao thuoc tinh
	private double chieuDai;
	private double chieuRong;
	//dong goi va rang buoc
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi");
		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r>0) {
			this.chieuDai = r;
		} else {
			System.out.println("Loi");
		}
		
	}
	//tao contructinon  khoi tao doi tuong
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("Loi");
		}
		if (r>0) {
			this.chieuDai = r;
		} else {
			System.out.println("Loi");
		}
	}
	//xay dung phuong thuc
	private double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;

	}
	private double getDienTich() {
		return getChieuDai()*getChieuRong();

	}
	@Override
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		//khoi tao doi tuong tu ham tao
		HinhChuNhat h1 = new HinhChuNhat();
		//cap nat canh
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("Ket qua");
		System.out.println("Chieu dai la:"+h1.getChieuDai());
		System.out.println("Chieu rong la:"+h1.chieuRong);
		System.out.println("Chu vi la:"+h1.getChuVi());
		System.out.println("dien tich la:"+h1.getDienTich());
		//cap nhat 2
		HinhChuNhat h2 = new HinhChuNhat(10,8);
		System.out.println("Ket qua");
		System.out.println("Chieu dai la:"+h2.getChieuDai());
		System.out.println("Chieu rong la:"+h2.chieuRong);
		System.out.println("Chu vi la:"+h2.getChuVi());
		System.out.println("dien tich la:"+h2.getDienTich());
	}
}
