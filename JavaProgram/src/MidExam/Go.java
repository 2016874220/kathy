package MidExam;

/**
 *��Action�ӿ���ʵ��Go��
 */
public class Go implements Action{
	
	/**
	 * ��������go
	 */
	public String go;

	/**
	 * ���巽������goֵ
	 */
	public String getName() {
		return go;
	}

	/**
	 * ���巽��
	 */
	public void setName(String _go) {
		
		/**
		 * ��this���ʳ�Ա����go�������丳ֵ
		 */
		this.go = _go;
	}

	/**
	 * ʵ�ֽӿ��е�act()����
	 */
	@Override public void act(Address ad) {
		// TODO Auto-generated method stub
		
	}
		
}