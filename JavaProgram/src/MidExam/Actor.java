package MidExam;

/**
 *����̳���Person������Actor��Actor�����������е���������ҡ�
 */
public class Actor extends Person {
	
	/**
	 * �����޲����Ĺ��췽��Actor
	 */
	public Actor(){
		
	}
	
	/**
	 * ���췽��������
	 */
	public Actor(String name){
		
		/**
		 * super���ڵ��ø���Ĺ��췽��
		 */
		super(name);
	}
	
	/**
	 * ʵ�ֳ������е�doSomething()����
	 */
	public void doSomthing( Address ad,Action ac) {
		System.out.print(this.getName());
		ac.act(ad);
	}

}
