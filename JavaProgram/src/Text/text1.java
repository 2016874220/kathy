package Text;

import java.io.IOException;
import java.util.Scanner;

public class text1
{
	private static Scanner reader;
	public static void main(String[] args) throws IOException
	{
		int num= 0,max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		System.out.println("������������");
		System.out.println("�����롰#��ʱ��������");
		reader = new Scanner(System.in);
		while(reader.hasNextInt())
		{
			num=reader.nextInt();
			max=max>num?max:num;
			min=min<num?min:num;
		}
		System.out.println("���ֵ�ǣ�"+max);
		System.out.println("��Сֵ�ǣ�"+min);
	}
}