package App;
//ʹ�ù��췽��������

class Cylinderrrrr{                        //������Cylinder
	private double radius;
	private int height;
	private double pi = 3.14;
	private String color;
	public Cylinderrrrr(){                //�����޲����Ĺ��췽�������Ա������и�ֵ
		radius = 1;
		height = 2;
		color = "green";
	}
	public Cylinderrrrr(double r,int h,String str){          //���������������Ĺ��췽����������˽�г�Ա����
		radius = r;
		height = h;
		color = str;
	}
	public void setColor(){
		System.out.println("��Բ������ɫΪ��"+color);
	}
	double area(){
		return pi*radius*radius;
	}
	double volume(){
		return area()*height;
	}
}

public class App7_5 {
	public static void main(String[] args) {
		Cylinderrrrr volu1 = new Cylinderrrrr();                  //��һ��Cylinder��ʾ�࣬�ڶ���Ϊ���췽����
		System.out.println("Բ����1�����="+volu1.area());
		System.out.println("Բ�������="+volu1.volume());
		volu1.setColor();
		Cylinderrrrr volu2 = new Cylinderrrrr(1,2,"green");
		System.out.println("Բ����2�����="+volu2.area());
		System.out.println("Բ����2���="+volu2.volume());
		volu2.setColor();
	}
}
