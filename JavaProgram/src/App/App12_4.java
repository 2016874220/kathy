package App;
//filename��App12_4.java
class GeneralTypes<T extends Number>     //���Ͳ���T������Number�����������
{
  T obj;
  public GeneralTypes(T obj)  //���巺����Ĺ��췽��
  {
    this.obj=obj;
  }
  public T getObj()         //���巺����ķ���
  {
    return obj;
  }
}
public class App12_4      //��������App12_4
{
  public static void main(String[] args)
  {
    GeneralTypes<Integer> num=new GeneralTypes<Integer>(5);    //�������Ͷ���num
    System.out.println("�����Ĳ����ǣ�"+num. getObj());
    //���������ǷǷ��ģ���Ϊʵ�ʲ���String����Number��Number������
    //GeneralTypes<String> s=new GeneralTypes<String>("Hello"); 
  }
}
