package App;

//filename:App14_8.java        �Ի����������Ӧ���¼�����
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App14_8 extends JFrame implements ActionListener
{
JTextField inputName;
JTextArea nameArea;
public App14_8(String s)
{
  super(s);
  inputName=new JTextField(20);
  inputName.addActionListener(this);
  nameArea=new JTextArea();
  add(inputName,BorderLayout.NORTH);
  add(nameArea,BorderLayout.CENTER);
  setBounds(50,50,300,200);
  setVisible(true);
}

//------------------------------------------���������������------------------------------------------------

public static void main(String[] args)
{
  App14_8 frm=new App14_8("ȷ�϶Ի��򴰿�");
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
  String str=inputName.getText();
  
//-----------------showConfirmDialogΪ��̬������ֱ�ӵ��ò���һ��ȷ�϶Ի���this�����Ի���Ϊ����App13_8��ӵ��
  int n=JOptionPane.showConfirmDialog(this,"��ȷ�����������Ƿ���ȷ","ȷ�϶Ի���",JOptionPane.YES_NO_OPTION);
  
  if(n==JOptionPane.YES_OPTION)
    nameArea.append(str+"\n");
  else if(n==JOptionPane.NO_OPTION) 
    inputName.setText(null); 
}
}
