package checkout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TaiChi extends JPanel 
{

    public TaiChi() 
    {
        this.setPreferredSize(new Dimension(600,580)); // ������ѡ��С600,580
    }

    public void drawBaGua(Graphics2D g2d)
    {
        Color color1 = Color.WHITE; // ��ɫ1
        Color color2 = Color.BLACK; // ��ɫ2

        // ����Ե���
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        // ������
        // g2d.clearRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(new Color(240, 240, 240));
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        // �����ߴ�Բ�ױ���
        //g2d.setColor(color1);
        //g2d.fillArc(100, 100, 400, 400, 90, 180);
        // ���Ұ�ߴ�Բ�ڱ���
//        g2d.setColor(color2);
//        g2d.fillArc(100, 100, 400, 400, -90, 180);

        // �������ɫԲ
        g2d.setColor(color1);
        g2d.fillOval(200, 100, 200, 200);
        // �������ɫԲ
        g2d.setColor(color2);
        g2d.fillOval(200, 300, 200, 200);

        // �������ɫԲ�ڵ�С��Բ
        g2d.setColor(color2);
        g2d.fillOval(270, 170, 60, 60);
        // �������ɫԲ�ڵ�С��Բ
        g2d.setColor(color1);
        g2d.fillOval(270, 370, 60, 60);

        // ����Ե�ĺڻ���
        g2d.setStroke(new BasicStroke(2)); // ���û��ʿ��
        g2d.setColor(color2);
        // g2d.drawArc(100, 100, 400, 400, 0, 360);
        g2d.drawOval(100, 100, 400, 400);
    }

    public void paint(Graphics g) {
        drawBaGua((Graphics2D) g);
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("����");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new TaiChi());
        win.pack();
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}