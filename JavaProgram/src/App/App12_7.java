package App;
//filename��App12_7.java
import java.util.*;
class StringStack
{
  private LinkedList<String> ld=new LinkedList<String>(); //����LinkedList����ld
  public void push(String name)  //��ջ����
  {
    ld.addFirst(name);         //��name��ӵ��б��ͷ
  }
  public String pop()
  {
    return ld.removeFirst();    //�Ƴ���ջ�еĵ�һ��Ԫ��
  }
  public boolean isEmpty()    //�ж϶�ջ�Ƿ�Ϊ��
  {
    return ld.isEmpty();
  }
}
public class App12_7
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    StringStack stack=new StringStack();
    System.out.println("����������(quit����)");
    while(true)
    {
      String input=sc.next();             //�Ӽ�����������
      if(input.equals("quit"))
        break;
      stack.push(input);                 //��ջ
    }
    System.out.println("�Ƚ������˳��");
    while(!stack.isEmpty())
      System.out.print(stack.pop()+"  ");  //��ջ
  }
}
