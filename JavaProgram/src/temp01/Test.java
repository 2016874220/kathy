package temp01;

public class Test {
	
	public static void main(String[] args) {
		
		Student stu = new Student("��","Ů");
		Teacher tea = new Teacher("��������ʦ","��");
		
		Study sdy = new Study();
		Teach tch = new Teach();
		Address addr1 = new Address();
		Address addr2 = new Address();
		
		addr1.setName("տ��");
		addr2.setName("��ʦ");
		
		stu.doSomething(sdy, addr1);
		System.out.println();
		tea.doSomething(tch, addr2);
	}
	
}
