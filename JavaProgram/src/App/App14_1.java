//filename��App14_1.java           �򵥵��¼���������Ѽ����¼�������룩

package App;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App14_1 extends JFrame implements ActionListener
{
  static App14_1 frm=new App14_1();
  static JButton bt=new JButton("����������ɫ");
  static JTextArea ta =new JTextArea ("������ɫ",5,20);
  public static void main(String[] args)
  {
    bt.addActionListener(frm);
    frm.setTitle("�����¼�");
    frm.setLayout(new FlowLayout());
    frm.setSize(260,170);
    frm.add(ta);
    frm.add(bt);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    ta.setForeground(Color.RED);
  }
}