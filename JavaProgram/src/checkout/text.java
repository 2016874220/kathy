//������ά����

package checkout;

public class text 
{
	public static void main(String[] args) 
	{
//		int i,j;
		int[][] b={{1,2,3},{4,5,6},{7,8,9}};
		
//		ת����foreach���
//		for(i=0;i<b.length;i++)
//			for(j=0;j<b[i].length;j++)
//				System.out.println(b[i][j]);
		for(int[] c1:b)                   //�Ӷ�ά���飨��������飩b��ȡһά����c1
			for(int c2:c1)                //��һά����c1��ȡԪ��c2
				System.out.println(c2);
	}
}