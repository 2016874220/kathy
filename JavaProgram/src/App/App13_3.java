package App;
//filename��App13_3.java       �ڴ����м����ǩ���󣬲����ñ�ǩ����Ĵ�С
import java.awt.*; 
import javax.swing.*;
public class App13_3
{
  public static void main(String[] args)
  {
    JFrame jfrm=new JFrame("��ǩ�ര��");
    JLabel jlab=new JLabel("����һ����ǩ",JLabel.CENTER);  //center
    jfrm.setLayout(null);        //ȡ�����ֹ�����
    jfrm.setSize(300,200);
    jfrm.setBackground(Color.PINK);
    jlab.setOpaque(true);
    jlab.setBackground(Color.YELLOW);
    jlab.setForeground(Color.RED);
    jlab.setLocation(80,60); 
    jlab.setSize(130,30); 
    Font fnt=new Font("Serief",Font.BOLD+Font.ITALIC,20);
    jlab.setFont(fnt);
    jfrm.add(jlab); 
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setVisible(true);
  }
}
