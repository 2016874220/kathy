package MidExam;

/**
 *��������
 */
public class Text {

	public static void main(String[] args) {
		
		/**
		 * ����per����
		 */
		Teach per=new Teach("��");
		
		/**
		 * ����ac_doit����
		 */
		Doit ac_doit=new Doit();
		/**
		 * ����setName()����
		 */
		ac_doit.setName("�ϴ�ѧ");
		/**
		 * ����ad_doit����
		 */
		Address ad_doit=new Address();
		/**
		 * ����setName()����
		 */
		ad_doit.setName("տ��");
		
		/**
		 * ����doSomething()����
		 */
		per.doSomthing(ad_doit,ac_doit);
		
	}
}
