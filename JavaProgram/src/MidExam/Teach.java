package MidExam;

/**
 *����̳���Person������Teach
 */
public class Teach extends Person{

	/**
	 * �����޲����Ĺ��췽��Teach
	 */
	public Teach() {
		
		/**
		 * super���ڵ��ø���Ĺ��췽��
		 */
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * ���췽��������
	 */
	public Teach(String name) {
		
		/**
		 * super���ڵ��ø���Ĺ��췽��
		 */
		super(name);
	}
	
	/**
	 * ʵ�ֳ������е�doSomething()����
	 */
	@Override public void doSomthing(Address ad, Action ac) {
		// TODO Auto-generated method stub
		System.out.print(this.getName());
		ac.act(ad);
	}

}
