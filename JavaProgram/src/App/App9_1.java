package App;
//���������±�Խ���쳣�ͳ���Ϊ0�쳣

public class App9_1 {
	public static void main(String[] args) {
		int i;
		int[] a = {1,2,3,4};
//		try{
		for (i = 0; i < 5; i++) {
			System.out.println("   a["+i+"]="+a[i]);
		}
//		}
//		catch(ArrayIndexOutOfBoundsException e){
//			e.getStackTrace();
//		}
		System.out.println("5/0"+(5/0));    //��һ���쳣���ּ���ֹ���򣬲����и��У����������⴦��
	}
}