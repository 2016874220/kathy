package App;

//filename��App18_2.java      ����InetAddress���
import java.net.*;
public class App18_2
{
InetAddress myIPAddress=null;
InetAddress myServer=null;
public static void main(String[] args)
{
  App18_2 search=new App18_2();
  System.out.println("��������IP��ַΪ��"+ search.myIP());
  System.out.println("��������IP��ַΪ��"+ search.serverIP());
}
public InetAddress myIP()
{
  try    //��ȡ������IP��ַ
  { myIPAddress=InetAddress.getLocalHost(); }
  catch(UnknownHostException e) {  }
  return (myIPAddress);
}
public InetAddress serverIP()
{
  try
  { myServer=InetAddress.getByName("www.tom.com"); }
  catch(UnknownHostException e) {  }
  return (myServer);
}
}
