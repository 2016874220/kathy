package App;
//filename��App12_9.java
import java.util.*;
public class App12_9
{
  public static void main(String[] args)
  {
    HashSet<String> hs=new HashSet<String>(); //������ϣ���϶���hs����ʼ����Ϊ16
    for(String a:args)
      if(!hs.add(a))          //���ϣ����hs���Ԫ�أ����ظ���Ԫ�ز����
        System.out.println("Ԫ��"+a+"�ظ�");        //����ظ���Ԫ��
    System.out.println("���ϵ�����Ϊ��"+hs.size()+"����Ԫ��Ϊ��");
    
    Iterator it=hs.iterator();             //������ϣ����hs�ĵ�����it��*��������
    while(it.hasNext())                //�жϼ������Ƿ��к���Ԫ��
      System.out.print(it.next()+"  ");   //�����ϣ�����е�Ԫ��
  }
}
