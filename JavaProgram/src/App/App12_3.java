package App;
//filename App12_3.java         //�ڷ������ж��巺�ͷ���

class GenMet<T extends Object>              //���巺���ࡣ <T extends Object> ��ΪϵͳĬ����ʽ����Ϊ<T>��
//class GenMet<T>
{
  private T t;                 //���巺�ͱ���
  public T getObj()            //���巺����ķ���getObj()
  {
    return t;
  }
  public void setObj(T t)        //���巺����ķ���setObj()
  {
    this.t=t;
  }
  public <U> void display(U u)    //���巺�ͷ���
  {
    System.out.println("����������Ͳ���T��"+t.getClass().getName());
    System.out.println("���ͷ��������Ͳ���U��"+u.getClass().getName());
  }
}

public class App12_3
{
  public static void main(String[] args)
  {
    GenMet<Integer> gen=new GenMet<Integer>();  //�������Ͷ���
    gen.setObj(new Integer(5));
    System.out.println("��һ�������");
    gen.display("�����ı�");                     //���ַ������÷��ͷ���
    System.out.println("�ڶ��������");
    gen.display(new Double(8.0));                 //��ʵ�����÷��ͷ���
  }
}
