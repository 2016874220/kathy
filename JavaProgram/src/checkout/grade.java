package checkout;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
	float score;
	Scanner reader=new Scanner(System.in);
	System.out.println("������ɼ���");
	score=reader.nextFloat();
	switch((int)(score/10)){
		case 10:
		case 9:System.out.println("�����ɼ�Ϊ��A");break;
		case 8:System.out.println("�����ɼ�Ϊ��B");break;
		case 7:System.out.println("�����ɼ�Ϊ��C");break;
		case 6:System.out.println("�����ɼ�Ϊ��D");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("�����ɼ�Ϊ��E");
		}
	}
}
