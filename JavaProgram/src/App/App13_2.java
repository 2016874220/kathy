package App;
//filename��App13_2.java
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class App13_2
{
  public static void main(String[] args)
  {
    JFrame jfrm=new JFrame("�ҵĿ��"); //���
    jfrm.setSize(210,180);
    jfrm.setLocation(500,400);
    JPanel jpan=new JPanel();        //���
    jpan.setSize(120,90); 
    jpan.setLocation(40,30);   //����ڿ��
    JButton bun=new JButton("�����"); //��ť
    bun.setSize(80,20); 
    bun.setLocation(20,30);   //��������
    jfrm.setLayout(null);
    jpan.setLayout(null);
    jpan.add(bun);
    jpan.setBorder(new TitledBorder("�����"));
    jfrm.add(jpan);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
  }
}
