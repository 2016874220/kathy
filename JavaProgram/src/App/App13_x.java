package App;

//filename��App13_x.java        FlowLayout���ʹ�� 
import java.awt.*; 
import javax.swing.*;
public class App13_x extends JFrame
{
public static void main(String[] args)
{
  App13_x frm=new App13_x();
}
public App13_x()
{
  this.setBounds(100,100,360,300);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setVisible(true);
  Object[] selectItem={"Բ��","������","��������"};
  Object selectValue=JOptionPane.showInputDialog(null,"��ѡ����������ͼ��","ѡ��ͼ��",JOptionPane.INFORMATION_MESSAGE,null,selectItem,selectItem[0]);
  String select=(String)selectValue;
  String inputValue=JOptionPane.showInputDialog(null,"������߳��Ͱ뾶","����߳�",JOptionPane.QUESTION_MESSAGE);
  int input=Integer.parseInt(inputValue);
  double result=caculate(select,input);
  String message="������Ϊ��"+result;
  Object[] endButton={"��������","��������"};
  JOptionPane end=new JOptionPane(message,JOptionPane.WARNING_MESSAGE,JOptionPane.DEFAULT_OPTION,null,endButton);
  JDialog endD=end.createDialog(end,"������");
  endD.setVisible(true);
  Object push=end.getValue();
  if(push==endButton[0]) System.exit(0);
  else if(push==endButton[1]) new App13_x();
}
double caculate(Object select,int value)
{
  double result=0;
  if(select.equals("Բ��")) result=value*value*3.14;
  else if(select.equals("������")) result=value*value;
  else if(select.equals("��������")) result=value/2*1.732*value/2;
  return result;
}
}

