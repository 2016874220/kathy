package App;
//���÷��������������ó�Ա����

class Cylinderrr{
	private double radius;
	private int height;
	private double pi = 3.14;
	private String color;
	public double setCylinder(double r,int h){         //���ط���
		radius = r;
		height = h;
		return r + h;
	}
	public void setCylinder(String str){              //���ط���
		color = str;
	}
	public void show(){
		System.out.println("Բ�������ɫ��"+color);
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}

public class App7_3 {
	public static void main(String[] args) {
		Cylinderrr volu = new Cylinderrr();
		//System.out.println(volu.setCylinder(2.5, 3));
		double sum = volu.setCylinder(2.5, 3);           //Ϊ�������Բ����뾶�͸�֮��=����������sum
		System.out.println("Բ����뾶�͸�֮��="+sum);
		volu.setCylinder("gray");                        //������ɫ
		volu.show();                                     //�����ɫ
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�����="+volu.volume());
	}
}