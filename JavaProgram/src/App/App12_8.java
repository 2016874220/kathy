package App;
//filename��App12_8.java
import java.util.*;
public class App12_8
{
  public static void main(String[] args)
  {
    List<Integer> al=new ArrayList<Integer>();  //���������б����al
    for(int i=1;i<5;i++)
      al.add(new Integer(i));                 //�������б�al�����Ԫ��
    System.out.println("�����б��ԭʼ����"+al);   //*important
    ListIterator<Integer> listIter=al.listIterator();  //���������б�al�ĵ�����listIter
    listIter.add(new Integer(0));                //�����Ϊ0��Ԫ��ǰ���һ��Ԫ��
    System.out.println("������ݺ������б�"+al);
    if(listIter.hasNext())
    {
      int i=listIter.nextIndex();    //ִ�и����ʱi��ֵ��1
      listIter.next();             //�������Ϊ1��Ԫ��
      listIter.set(new Integer(9));  //�޸������б�al�����Ϊ1��Ԫ��
      System.out.println("�޸����ݺ������б�"+al);
    }
    listIter=al.listIterator(al.size());   //���´�����al���λ�ÿ�ʼ�ĵ�����listIter
    System.out.print("������������б�");    //������������б�
    while(listIter.hasPrevious())
      System.out.print(listIter.previous()+"  ");    //������������б�
  }
}
