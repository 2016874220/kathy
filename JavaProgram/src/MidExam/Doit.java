package MidExam;

/**
 *��Action�ӿ���ʵ��Doit�࣬Doit����������ӵ�ν���״��
 */
public class Doit implements Action{
	
	/**
	 * ����һ�������������doit�������������еĶ����������ϴ�ѧ��
	 */
	private String doit;

	/**
	 * ���巽������doitֵ
	 */
	public String getName() {
		return doit;
	}

	/**
	 * ���巽��
	 */
	public void setName(String _doit) {
		
		/**
		 * ��this���ʳ�Ա����doit�������丳ֵ
		 */
		this.doit = _doit;
	}
	
	/**
	 * �����޲����Ĺ��췽��Doit
	 */
	public Doit(){
		
	}
	
	/**
	 * ���췽��������
	 */
	public Doit(String _doit){
		
		/**
		 * this�����ø���ĳ�Ա����
		 */
		this.doit= _doit;
	}

	/**
	 * ʵ�ֽӿ��е�act()����
	 */
	@Override public void act(Address ad) {
		
		System.out.println("��"+ad.getName()+doit);
		
	}

}
