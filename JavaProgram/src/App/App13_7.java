package App;
//filename��App13_7.java        �����ı��С������ı��к��ı������
import javax.swing.*; 
public class App13_7 extends JFrame
{
  JTextField jtf=new JTextField("���ı��򲻿ɱ༭",30);
  static JPasswordField jpf=new JPasswordField ("̫����3��",30);
  public App13_7(String str)
  {
    super(str);
    jtf.setBounds(20,40,140,20);
    jtf.setEditable(false);      //���ɱ༭
    add(jtf);
  }
  public static void main(String[] args)
  {
    App13_7 frm=new App13_7("�ı��༭���ܴ���");
    JTextArea jta=new JTextArea ("����",10,30);
    JScrollPane jsp=new JScrollPane(jta);
    frm.setLocation(200,150);
    frm.setSize(240,220);
    frm.setLayout(null);
    jsp.setBounds(20,70,160,100);
    jpf.setBounds(20,10,140,20);
    frm.add(jpf);
    frm.add(jsp);
    char[] password=jpf.getPassword();
    String str=new String(password);
    System.out.println("��������ǣ�"+ password +"  ת�����ı����ǣ�"+str);
    frm.setVisible(true);
    frm.setResizable(false);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
