package App;
//��ά����

public class App5_5{
	public static void main(String[] args) {
		int sum = 0;
		int[][][] a={{{1,2,5},{3,4}},{{5,6,1},{7,8}}};
		for (int[][] is : a) {
			for (int[] is2 : is) {
				for (int i : is2) {
					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) { //ע����a[i].length������ʾ��i�е�����
				for (int k = 0; k < a[i][j].length; k++) { //ע����a[i][j].length����
					sum=sum+a[i][j][k];
				}
			}
		}
		System.out.println("sum="+sum);
	}
}
