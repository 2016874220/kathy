package App;

//filename��App13_10.java        BorderLayout���ʹ�� 
import java.awt.*; 
import javax.swing.*;
public class App13_10 extends JFrame
{
static JFrame frm=new JFrame("�߽�ʽ���ֹ�����BorderLayout");
public static void main(String[] args)
{
  BorderLayout border=new BorderLayout (5,10);
  frm.setLayout(border);
  frm.setSize(330,200);
  frm.add(new JButton("�ϱ�"), BorderLayout.NORTH);
  frm.add(new JButton("����"), BorderLayout.SOUTH);
  frm.add(new JButton("����"), BorderLayout.WEST);
  frm.add(new JButton("�Ҷ�"), BorderLayout.EAST);
  frm.add(new JButton("����"), BorderLayout.CENTER);
  
  frm.add(new JButton("lalala"));   //������һ�����밴ť
  
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setVisible(true);
}
}
