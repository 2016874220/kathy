package App;

//filename��App14_12.java         ��Ͽ��Ӧ��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App14_12 extends JFrame
{
static App14_12 frm=new App14_12();
static JComboBox<String> combo;                    //������Ͽ����combo
static JTextArea ta=new JTextArea(5,15);
static String[] color={"��ɫ","��ɫ","��ɫ","��ɫ"};
public static void main(String[] args)
{
  frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
  combo=new JComboBox<String>(color);
  combo.setEditable(true);                         //������Ͽ�ɱ༭
  combo.addItemListener(new MyItemListener());      //Ϊ��Ͽ�ע����굥��������
  combo.addActionListener(new MyActionListener());  //Ϊ��Ͽ�ע�ᰴEnter��������
  frm.add(combo);
  frm.add(ta);
  frm.setSize(350,180);
  frm.setVisible(true);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
static class MyItemListener implements ItemListener
{
  public void itemStateChanged(ItemEvent e)       //�������¼��ĳ������
  {
    JComboBox cb=(JComboBox)e.getSource();    //��ȡ�¼�Դ
    String clr=(String)cb.getSelectedItem();        //ȡ�ñ�ѡ��ѡ�������
    if(clr.equals("��ɫ"))
      ta.setBackground(Color.RED);
    else if(clr.equals("��ɫ"))
      ta.setBackground(Color.GREEN);
    else if(clr.equals("��ɫ"))
      ta.setBackground(Color.BLUE);
    else if(clr.equals("��ɫ"))
      ta.setBackground(Color.YELLOW);
    frm.setTitle("��ѡ���ˡ�"+clr+"��");
    ta.setText("��ѡ����ǣ�"+clr+"\n");         //��ѡ�е�ѡ��������ӵ��ı�����
  }
}
static class MyActionListener implements ActionListener
{
  public void actionPerformed(ActionEvent e)      //����ʾ���а�Enter��ʱ�Ĵ������
  {
    JComboBox cb=(JComboBox)e.getSource();    //��ȡ�¼�Դ
    String s=(String)cb.getSelectedItem();         //ȡ������ʾ�ı��������������
    ta.setText(s+"\n");         //���û�����ʾ���������������ӵ��ı���ta��
  }
}
}