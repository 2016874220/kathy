package MidExam;

/**
 * 
 * ����һ��������Person���������һЩ�˵����ԣ�������name
 *
 */
public abstract class Person {
	
	/**
	 * Person������֮һ��������name
	 */
	private String name;
	
	/**
	 * �����޲����Ĺ��췽��Person
	 */
	public Person(){
		
	}
	
	/**
	 * ���췽��������
	 */
	public Person(String _name){
		
		/**
		 * this�����ø���ĳ�Ա����
		 */
		this.name = _name;
	}

	/**
	 * ���巽��
	 */
	public void setName(String _name) {
		
		/**
		 * ��this���ʳ�Ա����name�������丳ֵ
		 */
		this.name = _name;
	}
	
	/**
	 * ���巽������nameֵ
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * �������󷽷�
	 */
	public abstract void doSomthing(Address ad,Action ac);

}