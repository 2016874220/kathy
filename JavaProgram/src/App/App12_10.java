package App;
//filename��App12_10.java
import java.util.*;
public class App12_10
{
  public static void main(String[] args)
  {
//    Set<String> hs=new HashSet<String>();   //������ϣ���϶���hs
    Set<Integer> hs=new HashSet<Integer>();
//    hs.add("��  ɮ");        //���ϣ���ϵĶ���hs���Ԫ��
//    hs.add("�����");
//    hs.add("��˽�");
//    hs.add("ɳ����");
//    hs.add("������");
    hs.add(123);
    hs.add(98);
    hs.add(465);
    hs.add(456);
    hs.add(567);
    
//    Iterator it=hs.iterator();
//    while(it.hasNext())
//    	System.out.println("----------------------------");
    
    TreeSet<Integer> ts=new TreeSet<Integer>(hs);  //����hs���������϶���ts
//    System.out.println("�����ϣ�"+ts);          //���������
//    System.out.println("�����ϵĵ�һ��Ԫ�أ�"+ts.first());  
//    System.out.println("���������һ��Ԫ�أ�"+ts.last());
//    System.out.println("haedSet(�����)��Ԫ�أ�"+ts.headSet("�����"));
//    System.out.println("tailSet(�����)��Ԫ�أ�"+ts.tailSet("�����"));
//    System.out.println("ceiling (ɳ)��Ԫ�أ�"+ts.ceiling ("ɳ"));
    
    Iterator<Integer> itt=ts.iterator();
    while(itt.hasNext())
    	System.out.print(itt.next()+" ");
    
  }
}
