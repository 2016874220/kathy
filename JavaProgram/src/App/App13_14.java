package App;

//filename��App13_14.java               BoxLayout���ֹ�������ʹ��
import java.awt.Container;
import javax.swing.*;
public class App13_14
{
public static void main(String[] args)
{
  JFrame frm=new JFrame("��ʽ���ֹ�����");
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setSize(220,130);
  Container app=frm.getContentPane();
  BoxLayout bl=new BoxLayout(app,BoxLayout.X_AXIS);
  frm.setLayout(bl);
  JButton but;
  for(int i=1;i<4;i++)
  {
    but=new JButton("��ť"+i); 
    frm.add(but);
  }
  frm.setVisible(true);
}
}
