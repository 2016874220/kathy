package App;
//�Ӽ�����������

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/

import java.io.*;//����������

public class APP3_3 {
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������ַ�����");
		str=buf.readLine();
		System.out.println("��������ַ����ǣ�\n"+str);
	}
}