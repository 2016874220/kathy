package Text;

class Person{
	//����3��˽������name��department��age
	private String name;
	private String department;
	private int age;
	static String action = "�ϴ�ѧ";
	//�������صĹ��췽��
	public Person(String _name)
	{
		this.name = _name;
	}
	
	public Person(String _name,int _age)
	{
		this.name = _name;
		if(_age>=0)
			this.age = _age;
		else
			System.out.println("���벻�Ϸ���");
	}
	
	public Person(String _name,int _age,String _department)
	{
		this.name = _name;
		if(_age>=0)
			this.age = _age;
		else
			System.out.println("���벻�Ϸ���");
		this.department = _department;
	}
	 //��������������һ��Ϊ��̬����
	 public void setName(String _name) 
	 {
		 this.name = _name;
	 }
	 
	 public String getName() 
	 {
		 return this.name; 
	 } 
	 
	 public void setAge() 
	 {
		 this.age = age; 
	 } 
	 
	 public int getAge() 
	 {
		 return this.age; 
	 } 
	 
	 public void setDepartment() 
	 {
	     this.department = department; 
	 } 
	 
	 public String getDepartment() 
	 { 
	     return this.department;
     }
	 
	 public static void show(){
		 
	 }
}

public class text8
{
	public static void main(String[] args)
	{
		Person p = new Person("����",20,"տ��");
		p.show();
		System.out.print("���ܣ�\n"+p.getName()+"����"+p.getAge()+"��"+","+"��"+p.getDepartment()+p.action);
	}
}

