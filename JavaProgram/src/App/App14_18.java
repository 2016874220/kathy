package App;

//filename��App14_18.java
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
public class App14_18 extends JFrame
{
DefaultColorSelectionModel model=new DefaultColorSelectionModel();
JColorChooser colorChooser=new JColorChooser(model);
JLabel label=new JLabel("��ѡ����ɫ���ı䱳��ɫ",JLabel.CENTER);
Font font=new Font("����",Font.ITALIC|Font.BOLD,30);
Color newColor;
public static void main(String[] args)
{
  App14_18 frm=new App14_18();
  frm.setTitle("��ɫ��ɫ��Ӧ��");
  frm.setSize(500,400);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frm.setVisible(true);
}
public App14_18()
{
  label.setFont(font);
  add(label,BorderLayout.NORTH);
  add(colorChooser,BorderLayout.CENTER);
  model.addChangeListener(new ChangeLis());
}
class ChangeLis implements ChangeListener
{
  public void stateChanged(ChangeEvent e)
  {
    newColor=colorChooser.getColor();
    getContentPane().setBackground(newColor);
  }
}
}