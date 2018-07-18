package App;
//������pi��num����Ϊ��̬����

class Cylinder{
	private static int num = 0;
	private double radius;
	private int height;
	private static double pi = 3.14;
	public Cylinder(double r,int h){     //�����в����Ĺ��췽��
		radius = r;
		height = h;
		num ++;
	}
	public void count(){
		System.out.println("������"+num+"������");
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}

public class App7_8 {
	public static void main(String[] args) {
		Cylinder volu1 = new Cylinder(2.5,5);
		volu1.count();
		System.out.println("Բ��1�����="+volu1.volume());
		Cylinder volu2 = new Cylinder(1.0,2);
		volu2.count();
		System.out.println("Բ��2�����="+volu2.volume());
	}
}
