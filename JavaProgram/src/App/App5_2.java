package App;
//����������n��������ͬ��������������������е����ֵ�ʹδ�ֵ
public class App5_2 
{
	public static void main(String[] args) 
	{
		int max,sec;
		int[] a={54,44,24,98,44,64,21,69,10};
		//�������Ԫ��
		System.out.print("�����Ԫ��Ϊ��");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(" "+a[i]);       //println:Ĭ��������У�print�����У�����
		}
		//��max��sec����ֵ
		if(a[0]>a[1])
		{
			max=a[0];
			sec=a[1];
		}
		else
		{
			max=a[1];
			sec=a[0];
		}
		//*******��max��sec********
		for (int i = 2; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
				sec=max;
				max=a[i];
			}
			else
				if(a[i]>sec)
				{
					sec=a[i];
				}
		}
		System.out.println("\n�������ֵΪ��"+max);
		System.out.println("�δ�ֵΪ��"+sec);
	}
}
