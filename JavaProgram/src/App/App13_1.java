package App;
//filename��App13_1.java
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
public class App13_1
{
  static JFrame jfrm=new JFrame("���Ǹ�Swing����");
  public static void main(String[] args)
  {
    JLabel lab=new JLabel("����һ����ǩ"); 
    Image im=
    		(new ImageIcon("src\\chap13\\�й���.jpg")).getImage();
    jfrm.setIconImage(im);
    jfrm.setSize(250,140);
    jfrm.setBackground(Color.YELLOW);     //���õ��Ƕ��㴰�ڣ���ɫ���ǣ��޷���ʾ�����������ݴ��ڵ���ɫ�������д��롣
    jfrm.getContentPane().setBackground(Color.green);
    jfrm.setLocation(260,150);
    jfrm.add(lab); 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
  }
}
