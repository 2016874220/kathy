package App;
import java.util.Scanner;

//Լɪ�򻷣����Ȧ˳��
public class App5_3 {
	public static void main(String[] args) {
		int N,S,M;
		Scanner reader = new Scanner(System.in);
		System.out.println("��������������");
		N = reader.nextInt();  //N��������
		System.out.println("��涨�ӵڼ����˿�ʼ������");
		S = reader.nextInt();  //S��M���ӵ�S���˿�ʼ��1��M��������������M���˳�Ȧ
		System.out.println("��涨�������ڼ����˳�Ȧ��");
		M = reader.nextInt();
		//�������˱��
		int[] a=new int[N];
		for (int i = 1; i <= N; i++) {
			a[i-1]=i;          //�ɷ��a[1]��ʼ��
		}
		//���Ȧ���±�
		System.out.print("��Ȧ��˳��Ϊ��");
		for (int i = 0; i < N; i++) {
			int sub,k=N;
			do {      //��do...whlie������while/if��������ǰ��sub��ֵ(��ֵ������ж����֮ǰ)
				sub=S-1+M;
			}
			while (sub<=(N-1));
			do {
				sub=S-1+M-N;
			}
			while (sub>(N-1));
			System.out.print(" "+(sub+1));
			for (int j = sub; j < k-1; j++) {
				a[j]=a[j+1];
			}
				k=k-1;
		}
	}
}
