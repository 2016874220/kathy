package Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

class text9
{	
  public static void main(String args[]) throws IOException
  {
	  int[] num1= new int[15];   //��������洢����
	  
	  BufferedWriter out = new BufferedWriter(new FileWriter("file2.txt"));
	  
	  Random figure = new Random(9999);     // or : Random figure = new Random(); α�������
      for (int i=0;i<num1.length;i++)       //�������15����
      {
    	  num1[i]=20+figure.nextInt(9999);        //��������20~9999
    	  out.write(num1[i]+"");                  //���������д���ļ�
    	  out.newLine();
      }
      out.close();
      
      BufferedReader in=new BufferedReader(new FileReader("file2.txt"));
      
      //�������飬�������ȡ����file2������
      int[] num2= new int[15];
      for (int i=0; i<num2.length;i++)
    	  num2[i]=Integer.parseInt(in.readLine());
      in.close();
      
      //��15����������������
      Arrays.sort(num2);
      System.out.print("�����\n");
      for (int i=0; i<num2.length;i++)
    	  System.out.print(num2[i]+"   ");
  }
}