package App;
//filename��App12_11.java
//HashSet��HashMap�����𣿣���

import java.util.*;
public class App12_11
{
  public static void main(String[] args)
  {
    Map<String,String> hm=new HashMap<String,String>();   //����HashMap����hm
    hm.put("006","��  ɮ");    //��Ԫ����ӵ�ӳ��hm�С�***�������ӳ����޷����Ԥ������
//    hm.put("008","�����");
//    hm.put("009","��˽�");
    hm.put("108","�����");
    hm.put("059","��˽�");
    hm.put("007","ɳ����");
    hm.put("010","������");
    System.out.println("��ϣӳ���е��������£�\n"+hm);   //���hm�е�Ԫ��
    String str=(String)hm.remove("010");   //��hm��ɾ����ֵΪ��010����Ԫ��
    Set keys=hm.keySet();     //��ȡ��ϣӳ��hm�ļ����󼯺�
    Iterator it=keys.iterator();   //��ȡ�����󼯺�keys�ĵ�����
    System.out.println("HashMap��ʵ�ֵ�Mapӳ�䣬����");
    while(it.hasNext())        //�ж��Ƿ��к���Ԫ��
    {
      String xh=(String)it.next();        //���ؼ�ֵ
      String name=(String)hm.get(xh);   //���ؼ�ֵ����Ӧ��ֵ
      System.out.println(xh+"  "+ name);
    }
    TreeMap<String,String> tm=new TreeMap<String,String>(); //����TreeMap����tm
    tm.putAll(hm);                  //����ӳ�����tm���Ԫ�ء�**
    Iterator iter=tm.keySet().iterator();  //��ȡ������
    System.out.println("TreeMap��ʵ�ֵ�Mapӳ�䣬��ֵ����");
    while(iter.hasNext())                //�ж��Ƿ��к���Ԫ��
    {
      String xh=(String)iter.next();       //���ؼ�ֵ
      String name=(String)hm.get(xh);    //���ؼ�ֵ����Ӧ��ֵ
      System.out.println(xh+"  "+ name);
    }
  }
}
