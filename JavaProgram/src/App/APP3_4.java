package App;
//�Ӽ������������֣�Ȼ����ת������ֵ�����ݡ�

import java.io.*;
public class APP3_4 {
	public static void main(String[] args) throws IOException {
		float num;
		String str;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������һ��ʵ����");
		str = buf.readLine();
		num=Float.parseFloat(str);
		System.out.println("���������Ϊ��"+num);
	}
}