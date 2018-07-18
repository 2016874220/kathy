package App;

//filename��App14_14.java              ����ʽ�˵��������

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App14_14 extends JFrame
{
private JPopupMenu popupMenu;
private JRadioButtonMenuItem popRed,popGreen,popBlue;
private JTextArea ta=new JTextArea("�˵��������",10,30);
public App14_14()
{
  super("����ʽ�˵�Ӧ�ó���");
  popupMenu=new JPopupMenu("����ʽ�˵�");
  ButtonGroup colorGroup=new ButtonGroup();
  ItemHandler handler=new ItemHandler();
  popRed=new JRadioButtonMenuItem("��ɫ");
  popGreen=new JRadioButtonMenuItem("��ɫ");
  popBlue=new JRadioButtonMenuItem("��ɫ");
  popupMenu.add(popRed);
  popupMenu.add(popGreen);
  popupMenu.add(popBlue);
  colorGroup.add(popRed);
  colorGroup.add(popGreen);
  colorGroup.add(popBlue);
  popRed.addActionListener(handler);
  popGreen.addActionListener(handler);
  popBlue.addActionListener(handler);
  add(ta,BorderLayout.CENTER);
  ta.addMouseListener(new MyMouseList());
  setSize(260,160);
}
public static void main(String[] args)
{
  App14_14 frm=new App14_14();
  frm.setVisible(true);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private class ItemHandler implements ActionListener
{
  public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="��ɫ")
      ta.setForeground(Color.RED);
    if(e.getActionCommand()=="��ɫ")
      ta.setForeground(Color.GREEN);
    if(e.getActionCommand()=="��ɫ")
      ta.setForeground(Color.BLUE);
  }
}
private class MyMouseList extends MouseAdapter
{
  public void mouseReleased(MouseEvent mce)
  {
    if (mce.isPopupTrigger())
      popupMenu.show((Component)mce.getSource(),mce.getX(),mce.getY()); 
  }
}
}