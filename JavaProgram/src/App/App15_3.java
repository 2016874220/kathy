package App;

//App15_3.java            手工绘画程序
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class App15_3 extends JFrame
{
private int x1,y1,x2,y2;
private int[][] p=new int[1000][4];
private int index=0;
private NewPanel panel=new NewPanel();
App15_3()
{
  setTitle("交互式绘图");
  setBounds(10,10,250,200);
  add(panel);
}
public static void main(String[] args)
{
  App15_3 frm=new App15_3();
  frm.setVisible(true);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private class NewPanel extends JPanel
{
  public NewPanel()
  {
    this.addMouseMotionListener(new MyMouseMotionList());
    this.addMouseListener(new MyMouseList());  
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    for(int i=0;i<index-1;i++)
      g.drawLine(p[i][0],p[i][1],p[i][2],p[i][3]); 
  }    
}
class MyMouseList extends MouseAdapter
{
  public void mousePressed(MouseEvent e)
  {
    x1=e.getX();
    y1=e.getY();
  }
}
class MyMouseMotionList extends MouseMotionAdapter
{
  public void mouseDragged(MouseEvent e)
  {
    x2=e.getX();
    y2=e.getY(); 
    p[index][0]=x1;
    p[index][1]=y1;
    p[index][2]=x2;
    p[index][3]=y2;
    index++;
    repaint();
    x1=x2;
    y1=y2;
  }
}
}
