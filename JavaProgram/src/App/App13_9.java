package App;

//filename��App13_9.java        FlowLayout���ʹ�� 
import java.awt.*; 
import javax.swing.*;
public class App13_9 extends JFrame
{
static JFrame frm=new JFrame("��ʽ�������ù�����FlowLayout");
public static void main(String[] args)
{
  FlowLayout flow=new FlowLayout (FlowLayout.CENTER,5,10);
  JButton but=new JButton("��ť");
  JLabel lab=new JLabel("����һ����ǩ");
  frm.setLayout(flow);
  frm.setSize(260,150);
  frm.add(but);
  frm.add(lab);
  frm.add(new JTextField("��ʽ���ֲ���FlowLayout",18));
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setVisible(true);
}
}
