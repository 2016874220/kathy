package App;
//��һ�����췽��������һ�����췽����this�ؼ��ֵ����ã�

class Cylinderrrrrr{
	private double radius;
	private int height;
	private double pi = 3.14;
	private String color;
	public Cylinderrrrrr(){
		this(2.2,5,"brown");                               //��this�ؼ�����������һ���췽��
		System.out.println("�޲ι��췽����������");
	}
	public Cylinderrrrrr(double _r,int _h,String _str){
		System.out.println("�вι��췽����������");
		radius = _r;
		height = _h;
		color = _str;
	}
	public void show(){
		System.out.println("Բ����뾶��" + radius);
		System.out.println("Բ����ߣ�" + height);
		System.out.println("Բ������ɫ��" + color);
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}

public class App7_6 {
	public static void main(String[] args) {
		Cylinderrrrrr volu=new Cylinderrrrrr();               //������һ��ʱ������Cylinder���е�Cylinder���췽��
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�����="+volu.volume());
		volu.show();
	}
}
