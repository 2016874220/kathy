package App;

//App14_9.java         �ü�����������KeyAdapter����KeyEvent�¼�
import javax.swing.*;
import java.awt.event.*; 
public class App14_9 extends JFrame
{
int x,y;
JButton bt=new JButton("�ƶ���");
JTextField tf=new JTextField(50);
public App14_9(String s)
{
  super(s);
  setLayout(null);
  setBounds(100,100,300,300);
  bt.setBounds(30,30,80,20);
  bt.addKeyListener(new MyKey());
  tf.setBounds(60,200,170,20);
  add(bt);
  add(tf);
  setVisible(true);
  //setResizable(false);
}
public static void main(String[] args)
{
  App14_9 frm=new App14_9("�����¼�");
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
class MyKey extends KeyAdapter                    //��ס�ϣ��¡����ң������ţ���ֵ���䣬�ɿ�ʱ��ֵͻ��
{
  public void keyPressed(KeyEvent e)
  {
    JButton but=(JButton)e.getSource(); 
    x=but.getLocation().x; 
    y=but.getLocation().y; 
    if(e.getKeyCode()==KeyEvent.VK_UP)
    { 
      y=y-2;
      if(y<=0) y=0;
     }
    else if(e.getKeyCode()==KeyEvent.VK_DOWN)
    {
      y=y+2;
      if(y>=240) y=240;
    }
    else if(e.getKeyCode()==KeyEvent.VK_LEFT)
    {
      x=x-2;
      if(x<=0) x=0;
    }
    else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
    {
      x=x+2;
      if(x>=200) x=200;
    }
    but.setLocation(x,y);
  }
  public void keyReleased(KeyEvent e)
  {
    String str="��ť���Ͻ�����λ����("+x+","+y+")";
    tf.setText(str);
  }
}
}
