package App;

//App14_8.java        �Ի����������Ӧ���¼�����
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class App14_81
{

public App14_81()
{
  Object[] selectItem={"Բ��","������","��������"};
  Object selectValue=JOptionPane.showInputDialog(null,"��ѡ�����ͼ�ε����","ѡ��ͼ��",JOptionPane.INFORMATION_MESSAGE,null,selectItem,selectItem[0]);
  String select=(String)selectValue;   //���û�ѡ��ת�����ַ���
  String inputValue=JOptionPane.showInputDialog(null,"������߳���뾶","����߳�",JOptionPane.QUESTION_MESSAGE);
  int input=Integer.parseInt(inputValue);
}
}