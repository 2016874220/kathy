package App;
//filename��App13_6.java       ���ø�ѡ��͵�ѡ��ť��
import javax.swing.*; 
public class App13_6 extends JFrame
{
  static JFrame frm=new JFrame("��ѡ��͵�ѡ��ť��ѡȡ��");
  static JCheckBox jchk1=new JCheckBox("����",true);
  static JCheckBox jchk2=new JCheckBox("б��");
  static JCheckBox jchk3=new JCheckBox("�»���");
  static JRadioButton jrb1=new JRadioButton("��ɫ");
  static JRadioButton jrb2=new JRadioButton("��ɫ", true);
  static JRadioButton jrb3=new JRadioButton("��ɫ");
  public static void main(String[] args)
  {
    ButtonGroup grp=new ButtonGroup();
    frm.setLocation(200,150);
    frm.setSize(300,220);
    frm.setLayout(null); 
    jchk1.setBounds(20,20,150,20);
    jchk2.setBounds(20,40,150,20);
    jchk3.setBounds(20,60,150,20);
    jrb1.setBounds(20,80,150,20);
    jrb2.setBounds(20,100,150,20);
    jrb3.setBounds(20,120,150,20);
    grp.add(jrb1);
    grp.add(jrb2);
    grp.add(jrb3);
    frm.add(jchk1);
    frm.add(jchk2);
    frm.add(jchk3);
    frm.add(jrb1);
    frm.add(jrb2);
    frm.add(jrb3);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setVisible(true);
  }
}
