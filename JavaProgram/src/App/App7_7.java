package App;
//�������췽����˽�й��췽��

class Cylinderrrrrrr{
	private double radius;
	private int height;
	private double pi = 3.14;
	private String color;
	private Cylinderrrrrrr(){                                    //����˽�еĹ��췽��
		System.out.println("�޲ι��췽����������");
	}
	public Cylinderrrrrrr(double _r,int _h,String _str){
		this();                                           //�ڹ������췽������this�ؼ�����������һ���췽��
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

public class App7_7 {
	public static void main(String[] args) {
		Cylinderrrrrrr volu=new Cylinderrrrrrr(2.5,5,"black");               //������һ��ʱ������Cylinder���е�Cylinder���췽��
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�����="+volu.volume());
		volu.show();
	}
}
