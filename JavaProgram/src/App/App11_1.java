//����Thread��������������߳�

package App;
class MyThreads extends Thread
{
	private String who;
	public MyThreads(String str)
	{
		who = str;
	}
	public void run()
	{
		for (int i = 0; i < 5; i++) 
		{
			try
			{
				sleep((int)(1000*Math.random()));
			}
			catch (InterruptedException e)
			{
			}
			System.out.println(who+"�������У���");
		}
	}
}

public class App11_1
{
	public static void main(String[] args) 
	{
		MyThreads you = new MyThreads("��");
		MyThreads she = new MyThreads("��");
		you.start();
		she.start();
		System.out.println("������main()���н�����");
	}
}