package checkout;

public class Cylinda {
	public static void main(String[] args) {   //static��ͨ������ֱ�ӷ���
		car c=new car();             //������ɼӲ�����ǰ�ᶨ���˺�����Ŀǰ���ܼӣ�
		c.color="gray";
		//c.name="Cariol";
		//System.out.println(c.name);
		System.out.println(c.getName());  //ͨ����һ�ַ�ʽ��ȡ����
	}
}

class car{
	private String name;            //˽�з��ʿ��Ʒ�
	//String name;
	static String color;            //��̬���η�
	//final static String color="black";    //���վ�̬���η�
	String date;
	String getName(){
		return name;
	}
	void setName(String _name){
		name=_name;
	}
}

abstract class BBB{
	abstract void aaa();
}