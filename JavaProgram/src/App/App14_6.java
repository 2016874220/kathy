package App;

//filename��App14_6.java                �ı������Ӧ��
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 
public class App14_6 extends JFrame implements ActionListener
{
private JLabel[] jlArray={new JLabel("�û���"),new JLabel("��   ��")};
// private JButton[] jbArray={new JButton("��¼"),new JButton("���")};
private JTextField jName=new JTextField();
private JPasswordField jPassword=new JPasswordField();
private JTextArea jText=new JTextArea("�����ڲ��ɱ༭",10,30);
private JScrollPane jsp=new JScrollPane(jText);
public App14_6()
{
  this.setLayout(null);
  jlArray[0].setBounds(20,10,50,25);
  jName.setBounds(70,10,170,25);
  jlArray[1].setBounds(20,30,50,25);
  jPassword.setBounds(70,35,170,25);
  jsp.setBounds(20,70,220,100);
  jText.setEnabled(false);
  jText.setDisabledTextColor(Color.RED);
  this.add(jsp);
  this.add(jlArray[0]);
  this.add(jlArray[1]);
  this.add(jName);
  this.add(jPassword);
  jName.addActionListener(this);
  jPassword.addActionListener(this);
  this.setTitle("�ı������Ӧ��");
  this.setResizable(false);
  this.setBounds(100,100,280,220);
}
public void actionPerformed(ActionEvent e)
{
   if(jName.getText().equals("abc") && String.valueOf(jPassword.getPassword()).equals("123"))
   {
      jText.setEnabled(true);
      jText.setText("��ϲ��!!\n�����������ڿ��Ա��༭��!!");
      jText.setLineWrap(true);
   }
}
public static void main(String[] args)
{
  App14_6 frm=new App14_6();
  frm.setVisible(true);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}