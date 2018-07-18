package App;
//filename��App12_5.java
class GeneralType<T>         //���巺���࣬T�����Ͳ���
{
  T obj;                      //���巺����ĳ�Ա����
  public void setObj(T obj)      //���巺����ķ���
  {
    this.obj=obj;
  }
  public T getObj()           //���巺����ķ���
  {
    return obj;
  }
  //����ķ������յĲ���ֻ����String��String������
  public static void showObj(GeneralType<? extends String> o) 
  {
    System.out.println("������ֵ�ǣ�"+o.getObj());
  }
}
public class App12_5      //��������App12_5
{
  public static void main(String[] args)
  {
    GeneralType<String> n=new GeneralType<String>();
    
    GeneralType<?> g1=new GeneralType<Integer>();
    GeneralType<?> g2=new GeneralType<Double>();
    GeneralType<?> g3=null;
    g3=n;
    n=g3;
    g1.setObj("zhangsan");   //���ܸ���ֵ
    g1.setObj(null);
    g1.getObj();
    n.setObj("��  ��");
    
    GeneralType.showObj(n);        //����������showObj()�������
    GeneralType<Double> num=new GeneralType<Double>();
    num.setObj(25.0);
//    GeneralType.showObj(num);    // just text
    System.out.println("��ֵ��ֵ��"+num.getObj()); //���ɵ��÷���showObj(num)���
  }
}
