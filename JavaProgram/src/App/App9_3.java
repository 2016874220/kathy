package App;
//ʹ��throw����ڷ������׳��쳣������ͬһ�����ڽ�����Ӧ���쳣����

public class App9_3
{
	public static void main(String[] args)
	{
		int a = 5,b = 0;
		try
		{
			if(b == 0)
			{
				throw new ArithmeticException(); 
//throw�׳����쳣�����Ķ���Ҳ���ǵ�19�������e�����յĶ����׳�ϵͳ���������ʱ�쳣û��̫�����壩
			}
			else
			{
				System.out.println(a+"/"+b+"="+a/b);
			}
		}
			catch(ArithmeticException e)
			{
				System.out.println("�쳣��"+e+"���׳��ˣ�\n");
				e.printStackTrace();   //�����ǰ�쳣����Ķ�ջʹ�ù켣
			}
	}
}
