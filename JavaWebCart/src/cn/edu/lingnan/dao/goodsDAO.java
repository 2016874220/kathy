package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

import cn.edu.lingnan.dto.goodsDTO;
import cn.edu.lingnan.util.DataAccess;

public class goodsDAO
{
	//-------------------------------����Ա�����Ʒ-----------------------------
	public boolean insertGoods(String _gid,String _gname,String _price,String _gnum)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat=conn.createStatement();	//�Ȳ����ǲ�ͬ�̼�ͬ��Ʒ�������
		    rs=stat.executeQuery("select gname from goods where gname='"+_gname+"' and state=1");
		    if(rs.next())
		    {
				System.out.println("����Ʒ�Ѵ��ڣ�");
		    }
		    else
		    {
		    	prep = conn.prepareStatement
						("insert into goods(gid,gname,price,gnum) values (?,?,?,?)");
		    	prep.setString(1, _gid);
		    	prep.setString(2, _gname);
		        prep.setString(3, _price);
		        prep.setString(4, _gnum);
		        prep.executeUpdate();
		        flag = true;
		    }	
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (prep != null)
				{
					prep.close();
					prep = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	//-----------------------------����Աɾ����Ʒ(by id)------------------------
	public boolean deleteGoods(String _id)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from buyinfo where gid='"+_id+"' and state=1");
			while(rs.next())
			{
				stat.execute("update buyinfo set state=0 where gid='"+_id+"'");
			}			
			stat.execute("update goods set state=0 where gid= '"+_id+"'");
			stat.execute("update goods set gnum=0 where gid= '"+_id+"'");	//��Ʒ��ɾ��������Ʒ����Ҳ��Ϊ0
	        flag = true;
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (prep != null)
				{
					prep.close();
					prep = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return flag;
	}	
	
	//-------------------------------�޸���Ʒ�۸�(by id)--------------------------------
	public boolean updateGoods(String _id,String _price)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			prep = conn.prepareStatement
					("update goods set price=? where gid= ? and state=1");	//state=1���ѱ�ɾ������Ʒ�����޸ļ۸�
	        prep.setString(1, _price);
	        prep.setString(2, _id);
	        prep.executeUpdate();
	        flag = true;
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (prep != null)
				{
					prep.close();
					prep = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	//-------------------------------����Ա�鿴��Ʒ��Ϣ-----------------------------
	public Vector<goodsDTO> adminFindAllGoods()
	{
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		Connection conn=null;
		PreparedStatement prep=null;
		Statement stat=null;
		ResultSet rs=null;
		try 
		{
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
		    rs=stat.executeQuery("select * from goods where state=1");
		    while (rs.next())
			{
				goodsDTO g = new goodsDTO();
				g.setGid(rs.getString("gid"));
				g.setGname(rs.getString("gname"));
				g.setPrice(rs.getString("price"));
				g.setGnum(rs.getString("gnum"));
				v.add(g);
			}
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (prep != null)
				{
					prep.close();
					prep = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return v;
	}
	
	//-------------------------------�û��鿴��Ʒ��Ϣ-----------------------------
	public Vector<goodsDTO> userFindAllGoods()
	{
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		Connection conn=null;
		PreparedStatement prep=null;
		Statement stat=null;
		ResultSet rs=null;
		try 
		{
			conn=DataAccess.getConnection();
			stat=conn.createStatement();
		    rs=stat.executeQuery("select * from goods where state=1 and gnum!=0");
		    while (rs.next())
			{
				goodsDTO g = new goodsDTO();
				g.setGid(rs.getString("gid"));
				g.setGname(rs.getString("gname"));
				g.setPrice(rs.getString("price"));
				g.setGnum(rs.getString("gnum"));
				v.add(g);
			}
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (prep != null)
				{
					prep.close();
					prep = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return v;
	}
	
	//-------------------------�̼��޸���Ʒ��Ϣ--------------------------
	public boolean adminUpdateGoods(goodsDTO gdto)
	{
		String gid = gdto.getGid();
		String gname = gdto.getGname();
		String price = gdto.getPrice();
		String gnum = gdto.getGnum();
		boolean flag = false;
		Connection conn = null;
		Statement stat=null;
		ResultSet rs=null;
		try
		{
			conn = DataAccess.getConnection();
			stat=conn.createStatement();
			//ע����н�ȡλ��
		    stat.executeUpdate
	    			("update goods set gname='"+gname+"',price='"
		    +price+"',gnum='"+gnum+"' where gid='"+gid+"'");
		    flag = true;
		}
		catch (SQLException e)
		{
			System.out.println("����SQL���ʱ���ִ���");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (rs != null)
				{
					rs.close();
					rs = null;
				}
				if (conn != null)
				{
					conn.close();
					conn = null;
				}
			}
			catch (SQLException e)
			{
				System.out.println("�ر����ӡ���估�����ʱ���ִ���");
				e.printStackTrace();
			}
		}
		return flag;
	}
}
