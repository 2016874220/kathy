package App;
//����Բ������Cylinder�Ĺ�����Ա���������������ڵ�˽�г�Ա����

class Cylinderr{
	private double radius;                               //����˽�����ݳ�Ա
	private int height;
	private double pi=3.14;
	public void setCylinder(double r,int h){            //ͨ���ù�����������˽�г�Աradius��height
		if(r>0&&h>0){
			radius=r;
			height=h;
		}
		else
			System.out.println("���������д��󣡣�");
	}
	double area(){
		return pi*radius*radius;                       //���ڿɷ���˽�г�Ա
	}
	double volume(){
		return area()*height;
	}
}

public class App7_2 {                                        //���幫������
	public static void main(String[] args) {
		Cylinderr volu = new Cylinderr();
		volu.setCylinder(2.5, -5);
		System.out.println("Բ��������="+volu.area());        //����˽������
		System.out.println("Բ�������="+volu.volume());
	}
}