//���ϵͳ�����п������������
package checkout;

import java.awt.GraphicsEnvironment;

public class AllFont {
	public static void main(String[] args) {
		GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontName = e.getAvailableFontFamilyNames();
		for (int i = 0; i < fontName.length; i++) {
			System.out.println(fontName[i]);
		}
	}
}
