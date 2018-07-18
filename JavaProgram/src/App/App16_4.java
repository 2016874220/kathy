package App;

//filename��App16_4.java          ��С�����ﲥ����Ƶ
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;
public class App16_4 extends JApplet implements ItemListener
{
AudioClip[] midi=new AudioClip[3];   //����AudioClip�ӿ����͵�����
AudioClip song;                    //Ŀǰѡȡ����Ƶ
JComboBox<String> coi;                    //���������б����
JButton bntLoop=new JButton("ѭ��");
JButton bntStop=new JButton("ֹͣ");
public void init()
{
 String num;
 String[] musical={"��·","�Ϻ�̲","�������"};
 coi=new JComboBox<String>(musical);
 for(int i=0;i<midi.length;i++)
 {
   num=String.valueOf(i+1);
   midi[i]=getAudioClip(getCodeBase(),num+".mid");   //ȡ����Ƶ��Դ
 }
 Container c=getContentPane();                     //��ȡ���ݴ���
 c.setLayout(new FlowLayout(FlowLayout.LEFT));
 c.add(coi);   
 c.add(bntLoop);
 c.add(bntStop);
 coi.addItemListener(this);   //��С����������Ϊcoi�ļ�����
 bntLoop.addActionListener(new MyActLit());  //���ü�����
 bntStop.addActionListener(new MyActLit());  
 song=midi[0];     //��������С����ʱ���ŵ���Ƶ
 song.play();      //������Ƶ
}
public void itemStateChanged(ItemEvent e)
{
 song.stop();                   //ֹͣ���ڲ��ŵ���Ƶ
 int i=coi.getSelectedIndex();      //�������б���ѡ�񲥷���Ƶ�����
 song=midi[i];                  //���ô����ŵ���Ƶ
 song.play();                   //������Ƶ
}
class MyActLit implements ActionListener  //�����ڲ���
{
  public void actionPerformed(ActionEvent e)  //����ť�¼��ĳ������
  {
     JButton bnt=(JButton) e.getSource();     //ȡ�ñ�ѡ�еİ�ť
     if(bnt==bntLoop) song.loop();          //��ѡ��ѭ������ť����ѭ������
     else song.stop();                     //��ѡ��ֹͣ����ť����ֹͣ����
 }
}
}