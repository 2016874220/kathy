package checkout;

public class Arrays {
	public static void main(String[] args) 
	{
		int[] a=new int [5];
		for(int i = 0;i<5;i++) 
//if"i<6",����֡� java.lang.ArrayIndexOutOfBoundsException���������±�Խ��
		{
			a[i]=i;
			System.out.println(a[i]);
		}
	}
}