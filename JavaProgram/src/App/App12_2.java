package App;
//filename App12_2.java
public class App12_2             //����һ���࣬���Ƿ�����
{
  public static void main(String[] args)
  {
    Integer[] num={1,2,3,4,5};                     //��������
    String[] str={"��","��","��","��","��","��","��"};
    App12_2.<Integer>display(num);    //���÷��ͷ���
    App12_2.<String>display(str);
    App12_2.<String>show("zhangsan");
  }
  
  public static <T> void display(T[] list)  //���巺�ͷ�����EΪ���Ͳ�������һ��<E>ֻ�Ƕ���
  {
    for(int i=0;i<list.length;i++)
      System.out.print(list[i]+ "  ");
    System.out.println();
  }
  
  public static <S> S show(S S)
  {
	  return S;
  }
  
}