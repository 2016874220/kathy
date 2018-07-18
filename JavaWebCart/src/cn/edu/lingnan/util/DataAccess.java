package cn.edu.lingnan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DataAccess
{
	private static String driver=null;//������Ӧ����.calss�Ӧ�������ļ����ж�ȡ��ÿ������ϵͳʱ�����޸��������ļ���������ľ����µĲ��������뱾�����޸ġ�
	private static String url=null;
	private static String user=null;
	private static String password=null;
	private static String xmlPath="database.conf.xml";
	private static String xsdPath="database.conf.xsd";
	private static Connection conn=null;
	private static HashMap<String,String>hm=new HashMap<String,String>();
    static
    {
    	if(XmlValidator.validator(xmlPath, xsdPath))
    	{
    		hm=XmlParser.parser(xmlPath);
    		driver=hm.get("driver");
    		url=hm.get("url");
    		user=hm.get("user");
    		password=hm.get("password");
    	}
    }
	
	public static Connection getConnection ()
	{
		try
		{
			//ע����������
			Class.forName(driver);
			//�������ݿ�
		    conn=DriverManager.getConnection(url,user,password);
		    
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("���ݿ�jar������ʧ��..........");
			e.printStackTrace();
		}
		    catch (SQLException e)
		{
		    	System.out.println("���ݿ����ӻ�ȡʧ��.........");
				e.printStackTrace();
		}
//		System.out.println("���ݿ����ӻ�ȡ�ɹ�.....");
		return conn;
	}
	
	public static void closeconn(Connection conn,Statement stat,PreparedStatement prep,ResultSet rs)
	{
		try
		{
			if (rs!=null)
			{
				rs.close();
				rs=null;
			}
			if (prep!= null)
			{
				prep.close();
				prep = null;
			}
			if (conn!= null)
			{
				conn.close();
				conn = null;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}


