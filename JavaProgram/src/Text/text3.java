package Text;

public class text3 {
	public static void main(String[] args) {
		int num,num1,num2,num3,sum;
		System.out.println("ˮ�ɻ���Ϊ��");
		for(num=100;num<=999;num++){
			num1=num/100;                    //������Ӧ�İ�λ��
			num2=(num%100)/10;               //������Ӧ��ʮλ��
			num3=(num%100)%10;               //������Ӧ�ĸ�λ��
			sum=(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3); //����ˮ�ɻ����Ķ���
			if(sum==num){                    //�ж��Ƿ�Ϊˮ�ɻ���
				System.out.println(num);     //���ˮ�ɻ���
			}
		}
	}
}