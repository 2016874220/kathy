package App;

//filename��App13_13.java            GridBagLayout���ֹ�������ʹ��
import java.awt.*; 
import javax.swing.*;
import java.awt.GridBagConstraints.*;
public class App13_13 extends JFrame
{
static App13_13 frm=new App13_13();
static JLabel jlab=new JLabel("��ǩ���������ڵĴ�С�����GridBagLayout",JLabel.CENTER);
static JTextArea jta1=new JTextArea("�ı���1",5,15);
static JTextArea jta2=new JTextArea("�ı���2",5,15);
static JTextField jtf=new JTextField("�ı���");
static JPanel jp=new JPanel(); 
static JButton jbt1=new JButton("��ť1");
static JButton jbt2=new JButton("��ť2"); 
public static void main(String[] args)
{
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setTitle("������������ù�����GridBagLayout");
  frm.setSize(350,130);
  frm.setLayout(new GridBagLayout());
  GridBagConstraints gbc=new GridBagConstraints();
  gbc.fill=GridBagConstraints.BOTH; 
  gbc.anchor=GridBagConstraints.CENTER;
  Container conta=frm.getContentPane(); 
  frm.addCom(jlab,conta,gbc,0,0,1,4,0,0);     //�������㣺���ű���
  frm.addCom(jta1,conta,gbc,1,0,2,1,5,1);
  frm.addCom(jta2,conta,gbc,1,3,1,1,5,1);
  frm.addCom(jtf,conta,gbc,2,3,1,1,5,0);          //���һ���㣺�߶�����������в��䣬����ռ����jta2
  frm.addCom(jbt1,conta,gbc,3,1,1,1,5,0);
  frm.addCom(jbt2,conta,gbc,3,2,1,1,5,0);
  
  jp.setBackground(Color.CYAN);
  
  jp.setBorder(new javax.swing.border.LineBorder(Color.RED));
  gbc.insets=new Insets(10,10,10,10);
  frm.addCom(jp,conta,gbc,1,1,2,2,10,1);
  frm.setVisible(true);
}
private void addCom(Component c,Container con,GridBagConstraints gbcon,
                    int row,int col,int numberOfRow,int numberOfCol,
                    double weightX,double weightY)
{
	gbcon.gridx=col;
	gbcon.gridy=row;
	gbcon.gridwidth=numberOfCol;
	gbcon.gridheight=numberOfRow;
	gbcon.weightx=weightX;
	gbcon.weighty=weightY;
	con.add(c,gbcon);
}
}
