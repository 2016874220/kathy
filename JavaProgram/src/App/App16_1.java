package App;

//filename��App16_1.java           С�����Ӧ��
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.JApplet;
public class App16_1 extends JApplet implements ActionListener
{
private JTextField name;              //�û����ı���
private JPasswordField password;       //�����ı���
private JComboBox<String> mailBox;          //������Ͽ�
private JButton login;                //��¼��ť
public void init()                    //��ʼ������
{
	Container c=getContentPane();       //��ȡ���ݴ���
	c.setBackground(Color.WHITE);     //�������ݴ���ı���Ϊ��ɫ
	c.setLayout(new FlowLayout(FlowLayout.LEFT));
	c.add(new JLabel("����"));
	name=new JTextField("�û���",10);
  name.addActionListener(this);      //����С������Ϊ�ı���ļ�����
  c.add(name);
  c.add(new JLabel("@"));
  String[] box={"tom.com","263.net"};
  mailBox=new JComboBox<String>(box);
  c.add(mailBox);
  c.add(new JLabel("����"));
  password=new JPasswordField("*",10);
  c.add(password);
  login=new JButton("��¼");
  c.add(login);
  login.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
  if(e.getSource()==login||e.getSource()==password)
  {}   //�û������Լ�������Ҫ��Ӵ���
}
}