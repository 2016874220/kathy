package checkout;

public class Strings {                             //����ʹ�á�String��Ϊ�ļ�������
	public static void main(String[] args) {
		int[] a=new int[5];
		int b=0;
		String str1=new String("Hello Java!");
		String str="Hello Java!  ";
		
		System.out.println(str1.length());
		System.out.println(str1.equals(str));
		System.out.println(str1.trim().equals(str.trim()));//�Զ�ȥ���ַ����Ŀո�֮�������Ƚ�
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(3,7));
		System.out.println(str1.charAt(5));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.compareTo(str));
		System.out.println(str1.replace('H','h'));
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
	}
}
