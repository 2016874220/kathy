package App;
//���������������д�ı��ļ�
//�ڳ����д���һ���ı��ļ�myfile.txt��д��Ӽ����������һ���ַ���Ȼ���ٶ�ȡ���ļ������ı��ļ�������ʾ����Ļ��
import java.io.*;
class App10_1
{
  public static void main(String[] args)
  {
    char ch;
    int data;
    try
    {
    	FileInputStream fin =new FileInputStream(FileDescriptor.in);        //�����������ļ��ֽ��������������fin��fout
    	FileOutputStream fout =new FileOutputStream("c:\\myfile.txt"); 
        System.out.println("������һ���ַ������� # ������");
        while ((ch=(char)fin.read())!='#')
        	fout.write(ch);
        fin.close();
        fout.close();
        System.out.println();
        fin=new FileInputStream("c:\\myfile.txt");
        fout=new FileOutputStream(FileDescriptor.out);
        while (fin.available()>0)           //�������еĿɶ�ȡ���ֽ���
       {
        	data=fin.read();
        	fout.write(data);
       }
        fin.close();
        fout.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("�ļ�û�ҵ���");
    }
    catch (IOException e)
    {  }
  }
}
