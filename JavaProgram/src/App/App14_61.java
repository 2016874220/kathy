package App;

//filename��App14_6.java                �ı������Ӧ��
import java.awt.*; 
import javax.swing.*; 
import javax.swing.event.*; 
public class App14_61 extends JFrame implements CaretListener    //��������
{
private JTextField jtf=new JTextField(); 
private JTextArea jText=new JTextArea("�����ڲ��ɱ༭",10,30);
public App14_61()
{
  this.add(jtf,BorderLayout.NORTH);
  this.add(jText,BorderLayout.CENTER);
  jtf.addCaretListener(this);        //�����û����ı���ļ�����Ϊ������
  this.setTitle("�ĵ��¼���Ӧ��");
  this.setResizable(false);               //���ô��ڲ��ɸı��С
  this.setBounds(100,100,280,220);
}
public static void main(String[] args)
{
  App14_61 frm=new App14_61();
  frm.setVisible(true);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void caretUpdate(CaretEvent e)
{
  String text=jtf.getText();
  jText.setText(text);
}
}