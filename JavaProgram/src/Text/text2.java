package Text;

import java.util.Scanner;

/*�������޸�������Ȼ����������롰#����ֹ����*/

public class text2 {
	public static void main(String[] args) {
		int a=0;
		/*
		float b=0F;
		double c=0D;
		String s="";
		*/
		Scanner reader = new Scanner(System.in);
		/*
	    System.out.println("�Ӽ�������һ���ַ���");
		s = reader.nextLine();
		System.out.println("��������ַ�����"+s);
		System.out.println("�Ӽ�������һ�������ȸ�������");
		b = reader.nextFloat();
		System.out.println("��������ǵ����ȸ�������"+b);
		System.out.println("�Ӽ�������һ��˫���ȸ�������");
		c = reader.nextDouble();
		System.out.println("�������˫���ȸ�������"+c);
		*/
		System.out.println("�Ӽ�������һ��������");
		System.out.println("�����롰#��ʱ��������");
		while(reader.hasNextInt()){
			a = reader.nextInt();
			System.out.println("�������������"+a);
			System.out.println("�Ӽ�������һ��������");
		}
	}
}
