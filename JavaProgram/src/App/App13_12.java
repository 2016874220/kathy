package App;

//filename��App13_12.java         CardLayout���ʹ��
import java.awt.*; 
import javax.swing.*;
public class App13_12 extends JFrame                 //App14_4 :  ���ť���ܵ�ʵ��
{
static JFrame frm=new JFrame("��Ƭʽ�������ù�����CardLayout");
static JPanel pan1=new JPanel();
static JPanel pan2=new JPanel();
public static void main(String[] args)
{
  frm.setLayout(null);
  pan2.setLayout(new GridLayout(1,4));   //һ������
  CardLayout crd=new CardLayout (5,10);
  pan1.setLayout(crd);
  frm.setSize(350,300);
  frm.setResizable(false);
  pan1.setBounds(10,10,320,200);
  pan2.setBounds(10,220,320, 25);
  frm.add(pan1);
  frm.add(pan2) ;
  JLabel lab1=new JLabel("���ǵ�һҳ", JLabel.CENTER);
  JLabel lab2=new JLabel("���ǵڶ�ҳ", JLabel.CENTER);
  JTextField tex=new JTextField("��Ƭʽ���ֲ���CardLayout",18);
  pan1.add(lab1, "c1"); 
  pan1.add(lab2, "c2");
  pan1.add(tex, "t1"); 
  crd.show(pan1, "t1");
  pan2.add(new JButton("��һҳ"));
  pan2.add(new JButton("��һҳ"));
  pan2.add(new JButton("��һҳ"));
  pan2.add(new JButton("���ҳ"));
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setVisible(true);
}
}