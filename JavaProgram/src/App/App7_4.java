package App;
//���ù��췽������ʼ��Բ����ĳ�Ա����

class Cylinderrrr{                           //������
	private double radius;
	private int height;
	private double pi = 3.14;
	public Cylinderrrr(double r,int h){     //�����в����Ĺ��췽��
		radius = r;
		height = h;
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}

public class App7_4 {
	public static void main(String[] args) {
		Cylinderrrr volu = new Cylinderrrr(3.5,8);        //�����вι��췽����������
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�����="+volu.volume());
	}
}
