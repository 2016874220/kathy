package App;
//filename��App13_5.java          �������ť
import javax.swing.*; 
public class App13_5 extends JFrame
{
  public static void main(String[] args)
  {
    App13_5 jfrm=new App13_5();
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ImageIcon ic=new ImageIcon("�й�����.jpg");
    JButton btn=new JButton("����",ic);
    jfrm.setLayout(null);
    jfrm.setSize(200,180);
    jfrm.setTitle("��ť�ര��");
    btn.setBounds(50,45,100,40); 
    btn.setToolTipText("���ǰ�ť");
    jfrm.add(btn); 
    jfrm.setVisible(true);
  }
}
