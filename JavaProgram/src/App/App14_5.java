package App;

//filename��App14_5.java       ѡ���¼����Ӧ��
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
public class App14_5 extends JFrame implements ItemListener
{
static App14_5 frm=new App14_5();
static JCheckBox chk1=new JCheckBox("����");
static JCheckBox chk2=new JCheckBox("б��");
static JRadioButton rb1=new JRadioButton ("��ɫ");
static JRadioButton rb2=new JRadioButton ("��ɫ");
static JTextArea ta=new JTextArea ("ѡ���¼���ItemEvent��ʹ�÷���",8,30);
public static void main(String[] args)
{
  ButtonGroup grp=new ButtonGroup();
  frm.setTitle("ѡ���¼�����");
  frm.setLocation(200,150);
  frm.setSize(260,220);
  frm.setLayout(new FlowLayout(FlowLayout.LEFT)); 
  grp.add(rb1);
  grp.add(rb2);
  chk1.addItemListener(frm);
  chk2.addItemListener(frm);
  rb1.addItemListener(frm);
  rb2.addItemListener(frm);
  frm.add(chk1);
  frm.add(chk2);
  frm.add(rb1);
  frm.add(rb2);
  frm.add(ta);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setVisible(true);
}
public void itemStateChanged(ItemEvent e)
{
  Font font1=ta.getFont();
  int style1=font1.getStyle();
  if(rb1.isSelected()) ta.setForeground(Color.RED);
  if(rb2.isSelected()) ta.setForeground(Color. BLUE);
  if((e.getSource()==chk1)||( e.getSource()==chk2))
  {
    if(e.getSource()==chk1) style1=style1^1;         //���
    if(e.getSource()==chk2) style1=style1^2;
    ta.setFont(new Font(font1.getName(),style1,font1.getSize()));
    ta.append("\n��ʽstyle="+style1+";"+"״̬=" +e.getStateChange()+"��1:ѡ�� 2:ȡ����");
  }
}
}
