package App;
//filename��App11_5.java
class ThreadSale implements Runnable  //implements��һ���࣬ʵ��һ���ӿ��õĹؼ��֣���������ʵ�ֽӿ��ж���ĳ��󷽷���
//ʵ��һ���ӿڣ�����ʵ�ֽӿ��е����з���������Runnable�ӿ��࣬ģ�⺽����Ʊ���ڡ�
{
  private int tickets=10;
  public void run()
  {
    while(true)
    {
      if(tickets>0)
        System.out.println(Thread.currentThread().getName()+"�ۻ�Ʊ��"+tickets--+"��");   //��ʹ��Runnable�ӿڣ�
      //Ҫ�ڴ����л�õ�ǰ�̣߳�����ʹ��Thread.currentThread()
      else
        System.exit(0);
    }
  }
}
public class App11_5
{
  public static void main(String[] args)
  {
    ThreadSale t=new ThreadSale();
    Thread t1=new Thread(t, "��1��Ʊ����");
    Thread t2=new Thread(t, "��2��Ʊ����");
    Thread t3=new Thread(t, "��3��Ʊ����");
    t1.start();
    t2.start();
    t3.start();         //ÿ�����н�����ܲ�һ������Ϊ����ӳ�
  }
}
