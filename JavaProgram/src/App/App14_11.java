package App;

//filename��App14_11.java         �б��ؼ���Ӧ��
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class App14_11 extends JFrame implements ListSelectionListener
{
private JList<String> list;            //�����б�����list
private JTextField tf=new JTextField("�����ı���");
private String[] color={"��ɫ","��ɫ","��ɫ","��ɫ"};
public App14_11(String s)
{
  super(s);
  list=new JList<String>(color);         //�������������ʼ���б��
  JScrollPane ps=new JScrollPane(list);   //�������������������ʾ�������б�����list
  list.addListSelectionListener(this);      //�����б��ļ�����Ϊ������
  add(ps,BorderLayout.CENTER);       //���б������·�
  add(tf,BorderLayout.NORTH);        //���ı��������Ϸ�
  setSize(200,130);
  setVisible(true);
}
public static void main(String[] args)
{
  App14_11 frm=new App14_11("�б��Ӧ��");
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void valueChanged(ListSelectionEvent e)  //�¼�����������
{
  JList lt=(JList)e.getSource();               //��ȡ�¼�Դ
  String clr=(String)lt.getSelectedValue();      //ȡ�ñ�ѡ��ѡ�������
  if(clr=="��ɫ")
    tf.setBackground(Color.RED);
  else if(clr=="��ɫ")
    tf.setBackground(Color.GREEN);
  else if(clr=="��ɫ")
    tf.setBackground(Color.BLUE);
  else if(clr=="��ɫ")
    tf.setBackground(Color.YELLOW);
}
}