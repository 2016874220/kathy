package App;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//˳�������
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

import org.omg.CORBA_2_3.portable.OutputStream;

public class App10_2 {
	public static void main(String[] args) throws IOException
	{
//		InputStream is1 = null;
//		InputStream is2 = null;
//		FileOutputStream os = null;
//		SequenceInputStream sis = null;
		InputStream is1 = new FileInputStream("c:\\a.txt");
		InputStream is2 = new FileInputStream("c:\\b.txt");
		FileOutputStream os = new FileOutputStream("c:\\sum.txt");    //�ɲ������ļ�sum.txt
		SequenceInputStream sis = new SequenceInputStream(is1,is2);      //����һ������������������������is1��is2����˳���ȡis1��is2��
		int temp = 0;
		while ((temp = sis.read())!=-1)
			os.write(temp);
		sis.close();
		is1.close();
		is2.close();
		os.close();
	}
}
