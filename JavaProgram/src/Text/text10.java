//1����˾���ƺ͹�˾�绰ͨ���������룬��#��������2����˾����Ϊ������˾�绰Ϊֵ��
//3��������������ҵĹ�˾���ƣ���������ù�˾��Ӧ�ĵ绰���룻4�����������ɾ���Ĺ�˾���ƣ�����ִ��ɾ����������ɾ�������������HashMap�е�ֵ��

package Text;

import java.util.*;
public class text10
{
  public static void main(String[] args)
  {
    HashMap<String,String> hm=new HashMap<String,String>();     //����HashMap����hm
    System.out.println("�����빫˾���ơ��绰��");
    Scanner reader = new Scanner(System.in);
    while(true)
    {
    	String cphone = reader.next();
    	String cname = reader.next();
    	if(!((cphone.equals("#"))&&(cname.equals("#"))))
    	{
    		hm.put(cphone, cname);
    	}
    	else break;
    }
    
    //���hmԪ��
    System.out.println("\n�洢�Ĺ�˾��Ϣ����\n"+hm+"\n");
    
    //������������ҵĹ�˾���ƣ���������ù�˾��Ӧ�ĵ绰����
    System.out.println("������������ҵĹ�˾�����ƣ�");
    String find = reader.next();
    String cphone = hm.get(find);
    System.out.println("�ù�˾�ĵ绰����Ϊ��"+cphone);
    
    //���������ɾ���Ĺ�˾���ƣ�����ִ��ɾ��
    System.out.println("\n��������Ҫɾ���Ĺ�˾������");
    String del = reader.next();
    String dname=hm.remove(del);   //ɾ��hm�м�ֵΪdel������
    
    //�������֮�������
    System.out.println("\n����֮��Ĺ�˾��Ϣ���£�");
    Set keys=hm.keySet();
    Iterator ki=keys.iterator();
    while(ki.hasNext())
    {
      String phoneNum=(String)ki.next();
      String nextName=hm.get(phoneNum);
      System.out.println(phoneNum+":"+nextName);
    } 
  }
}
