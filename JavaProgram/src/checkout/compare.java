package checkout;

import java.util.*;

public class compare 
{
	public static void main(String[] args)
	  {
	    Map<String,String> hm=new HashMap<String,String>();   //����HashMap����hm
	    Scanner in=new Scanner(System.in);
	    String a;
	    String b;
	    System.out.println("�����빫˾���ƺ͵绰����");
	    while(true)
	    {
	    	a=in.next();
	    	b=in.next();
	    	if(!(a.equals("#")&&(b.equals("#"))))
	    	{
	    		hm.put(a, b);
	    	}
	    	else
	    		break;
	    }
	    System.out.println("��ϣӳ���е��������£�\n"+hm);   //���hm�е�Ԫ��
	    //����Ԫ��
	    String f;
	    String g;
	    System.out.print("��������Ҫ���ҵĹ�˾���ƣ�");
	    f=in.next();
	    g=(String)hm.get(f);
	    System.out.println("��Ҫ���ҵĹ�˾�ĵ绰�������£�");
	    System.out.println(g);
	   //ɾ��Ԫ��
	    System.out.println("��������Ҫɾ���Ĺ�˾����");
	    String del;
	    del=in.next();
	    String str=(String)hm.remove(del);   //��hm��ɾ����ֵΪdel��Ԫ��
	    System.out.println("�����Ĺ�˾���£�");
	    Set keys=hm.keySet();     //��ȡ��ϣӳ��hm�ļ����󼯺�
	    Iterator it=keys.iterator();   //��ȡ�����󼯺�keys�ĵ�����
	    while(it.hasNext())
		 {
			 String company=(String)it.next();
			 String number=(String)hm.get(company);
			 System.out.print(company +"  "+ number+"   ");
		 } 
	  }

}