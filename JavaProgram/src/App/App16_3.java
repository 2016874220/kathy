package App;

//App16_3.java          ��С��������ʾͼ��
import java.awt.*; 
import javax.swing.JApplet;
public class App16_3 extends JApplet
{
Image img;
public void init()
{
  img=getImage(getCodeBase(),"��ɽ.jpg");
}
public void paint(Graphics g)
{
  g.drawString("��ɽ�羰",50,15);
  g.drawImage(img,30,30,200,150,this);
  play(getDocumentBase(),"��Ȫ��.mid");
}
}