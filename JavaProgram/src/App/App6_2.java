package App;
//filename App6_2.java 
class Cylindaa{
	double radius;
	int height;
	double pi=3.14;
	int area(){
		System.out.println("Բ�������="+pi*radius*radius);
		return height;
	}
	double volume(){
		return (pi*radius*radius)*height;
	}
}

//void setCylinda(double _radius,int _height,double _pi){ //1��"_"������ѧ 2���Ա���Ϊ����
//		this.radius=_radius;     //this����������ã���ָ��Ա��������ָ��������radius
//	}

public class App6_2 {             //������
	public static void main(String[] args) {
		Cylindaa volu1=new Cylindaa();
		Cylindaa volu2=new Cylindaa();
		volu1.radius=volu2.radius=2.5;
		volu2.pi=3;
		System.out.println("�޸�ǰ��");
		System.out.println("Բ��piֵ="+volu1.pi);
		System.out.println("Բ���װ뾶="+volu1.radius);
		volu1.area();
		System.out.println("�޸ĺ�");
		System.out.println("Բ��piֵ="+volu2.pi);
		System.out.println("Բ���װ뾶="+volu2.radius);
		volu2.area();
	}
}
