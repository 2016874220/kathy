package App;

//App16_2.java          С�������HTML�ļ����ݽ����Ĳ���
import java.awt.*; 
import javax.swing.JApplet;
public class App16_2 extends JApplet
{
private String v_name;
private int v_age;
public void init()
{
  v_name=getParameter("vname");
  v_age=Integer.parseInt(getParameter("age"));
}
public void paint(Graphics g)
{
  g.drawString("������"+ v_name+" �����䣺"+ v_age,10,20);
  System.out.println("�����ϵ");
}
}