package App;
class Cylinda{
	double radius;
	int height;
	double pi=3.14;
	
	//double area=pi*radius*radius;
	double area(){
		return pi*radius*radius;
	}
	//double volume=area*height;
	double volume(){
		return area()*height;
	}
}

public class App6_3 {
	public static void main(String[] args) {
		Cylinda volu=new Cylinda();        //�����µĶ���
		volu.radius=2.8;
		volu.height=5;
		System.out.println("��Բ�뾶="+volu.radius);
		System.out.println("Բ����="+volu.height);
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�������="+volu.volume());
	}
}

//���н����
//��Բ�뾶=2.8
//Բ����=5
//Բ�������=0.0
//Բ�������=0.0