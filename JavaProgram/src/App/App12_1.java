package App;
//filename:App12_1.java          �������Ӧ��

public class App12_1<T,S>         //���巺���࣬T�����Ͳ���
{
  private T obj;            //���巺����ĳ�Ա����
  public T getObj()         //���巺����ķ���getObj()
  {
    return obj;
  }
  public void setObj(T obj)   //���巺����ķ���setObj()
  {
    this.obj=obj;
  }
  
  private S obj1;            //���巺����ĳ�Ա����
  public S getObj1()         //���巺����ķ���getObj()
  {
    return obj1;
  }
  public void setObj1(S obj1)   //���巺����ķ���setObj()
  {
    this.obj1=obj1;
  }
  
  public static void main(String[] args)
  {
    App12_1<String,Integer> name=new App12_1<String,Integer>();  //����App12_1<String>�Ͷ���String��Integer��˳��
    App12_1<Integer,String> age=new App12_1<Integer,String>();  //����App12_1<Integer>�Ͷ���
    name.setObj("��С��"); 
    String newName=name.getObj();
    System.out.println("������"+newName);
    name.setObj1(45);
    Integer newName1=name.getObj1();
    System.out.println("������"+newName1+"(�������ԣ������棡)");
    age.setObj(25);                //Java�Զ���25��װΪnew Integer(25)
    int newAge=age.getObj();       //Java��Integer�����Զ������int����
    System.out.println("���䣺"+newAge);
  }
}
