package App;

//filename��App14_7.java       �����¼���WindowEvent��Ӧ��
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
public class App14_7 extends JFrame
{
static JLabel lab=new JLabel();
static App14_7 frm=new App14_7();
static MyWinListener winlist= new MyWinListener();
public static void main(String[] args)
{
  frm.setLayout(null);
  frm.setTitle("�����¼�");
  frm.setBounds(120,50,260,150);
  lab.setBounds(15,10,150,50);
  frm.add(lab);
  frm.addWindowListener(winlist);
  frm.setVisible(true);
}
static class MyWinListener implements WindowListener
{
  public void windowOpened(WindowEvent e)
   { lab.setText("���´���"); }
  public void windowIconified(WindowEvent e)
   { frm.setTitle("���ڱ���С��"); }
  public void windowDeiconified(WindowEvent e)
   { frm.setTitle("���ڱ���ԭ��������С"); }
  public void windowActivated(WindowEvent e)
   { lab.setText("���ڱ�����"); }
  public void windowClosing(WindowEvent e) 
  {
    frm.dispose(); 
    System.exit(0);
  }
  public void windowDeactivated(WindowEvent e)
   {    }
  public void windowClosed(WindowEvent e)
   {    } 
}
}
