package App;
import java.util.Scanner;

//�жϻ����ַ���

public class App5_6 {
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		String str1=new String();
		int N=str.length(),S;
		if(N%2==0)
		{
			S=N/2;
			for(int i=0,j=N-1;i<S;i++,j--)
			{
				if(str.substring(i)!=str.substring(j))
				{
					System.out.println("�����ڻ����ַ��� ");
					break;
				}
				if(i<S)
				{
					System.out.println("���ڻ����ַ���");
					break;
				}
			}
		}
		else
		{
			S=(N-1)/2;
			for(int i=0,j=N-1;i<S;i++,j--)
			{
				if(str.substring(i)!=str.substring(j))  //�ַ������������Ƚ�
				{
					System.out.println("�����ڻ����ַ���");
					break;
				}
				if(i<S)
				{
					System.out.println("���ڻ����ַ���");
					break;
				}
			}
		}
	}
}
