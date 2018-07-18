//JMenuBar  ���ʽ
//JMenu     ���������ɫ
//JMenuItem ���ɫ...������...

package App;

//filename��App14_13.java              ���ڲ˵��������
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App14_13 extends JFrame
{
	private Color[] colorValues={Color.BLACK,Color.BLUE,Color.RED,Color.GREEN};
	private JRadioButtonMenuItem[] colorItems,fonts;
	private JCheckBoxMenuItem[] styleItems;
	private JTextArea display;
	private ButtonGroup colorGroup,fontGroup;
	private int style;
	public App14_13()
	{
		super("�˵�Ӧ�ó���");
		JMenu fileMenu=new JMenu("�ļ�(F)");
		fileMenu.setMnemonic(KeyEvent.VK_F);
  
		//---------------------------------------------�ļ��˵�����ӹ��ڲ˵�---------------------------------------------
		JMenuItem aboutItem=new JMenuItem("���ڡ�(A)");
		aboutItem.setMnemonic(KeyEvent.VK_A);
		aboutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		aboutItem.addActionListener
		(
				new ActionListener()  //�����ڲ��������
				{
					public void actionPerformed(ActionEvent e)
					{
						JOptionPane.showMessageDialog(App14_13.this,"����һ���˵�Ӧ������","����",JOptionPane.PLAIN_MESSAGE);
					}
				}
		);
		fileMenu.add(aboutItem);
  
		//------------------------------------------------����˳��˵���----------------------------------------------------
		JMenuItem exitItem=new JMenuItem("�˳�(X)");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{ System.exit(0); } 
				}
		); 
		fileMenu.add(exitItem);
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		bar.add(fileMenu);
  
		//-------------------------------------------------������ʽ�˵�------------------------------------------------
		JMenu formatMenu=new JMenu("��ʽ(R)");
		formatMenu.setMnemonic(KeyEvent.VK_R);
		String[] colors={"��ɫ","��ɫ","��ɫ","��ɫ"};
		JMenu colorMenu=new JMenu("��ɫ(C)");
		colorMenu.setMnemonic(KeyEvent.VK_C);
  
		//---------------------------------------------����4����ɫ�����������Ӳ˵�-----------------------------------------
		colorItems=new JRadioButtonMenuItem[colors.length];
		colorGroup=new ButtonGroup();
		ItemHandler itemHandler=new ItemHandler();      //�ڲ������������
		for(int count=0;count<colors.length;count++)
		{
			colorItems[count]=new JRadioButtonMenuItem(colors[count]);
			colorMenu.add(colorItems[count]);
			colorGroup.add(colorItems[count]);
			colorItems[count].addActionListener(itemHandler);
		}
		colorItems[0].setSelected(true);
		formatMenu.add(colorMenu);
		formatMenu.addSeparator();         //��ӷָ���
  
		//--------------------------------------------���������˵��Ĵ�������ѡ��------------------------------------------
		String[] fontNames={"Serif","����","����"};
		JMenu fontMenu=new JMenu("����(N)");
		fontMenu.setMnemonic(KeyEvent.VK_N);  //����˵�fontMennu����Ϊ�ȼ�N
		fonts=new JRadioButtonMenuItem[fontNames.length];
		fontGroup=new ButtonGroup(); 
		for(int count=0;count<fonts.length;count++)
		{
			fonts[count]=new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]);
			fontGroup.add(fonts[count]);
			fonts[count].addActionListener(itemHandler);
		}
		fonts[0].setSelected(true); 
		fontMenu.addSeparator();
		String[] styleNames={"����","б��"};
		styleItems=new JCheckBoxMenuItem[styleNames.length];  
		StyleHandler styleHandler=new StyleHandler();
		for(int count=0;count<styleNames.length;count++)
		{
			styleItems[count]=new JCheckBoxMenuItem(styleNames[count]);
			fontMenu.add(styleItems[count]);
			styleItems[count].addItemListener(styleHandler);
		}
		formatMenu.add(fontMenu);
		bar.add(formatMenu);
		display=new JTextArea("�������������ɫ");
		display.setForeground(colorValues[0]);
		display.setFont(new Font("����",Font.PLAIN,20));
		add(display,BorderLayout.CENTER);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		App14_13 frm=new App14_13();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//----------------------------------------------��ɫ������ļ�����---------------------------------------------------
	private class ItemHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for(int count=0;count<colorItems.length;count++)
				if(colorItems[count].isSelected())
				{
					display.setForeground(colorValues[count]);
					break;
				}
			for(int count=0;count<fonts.length;count++)
				if(e.getSource()==fonts[count])
				{
					display.setFont(new Font(fonts[count].getText(),style,20));
					break;
				}
		}
	}

//------------------------------------------------���εļ�����---------------------------------------------------------
	private class StyleHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			style=0;
			if(styleItems[0].isSelected())
				style+=Font.BOLD;
			if(styleItems[1].isSelected())
				style+=Font.ITALIC;
			display.setFont(new Font(display.getFont().getName(),style,20));
		}
	}
}