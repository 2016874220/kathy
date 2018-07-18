package cn.edu.lingnan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import cn.edu.lingnan.dto.adminDTO;
import cn.edu.lingnan.dto.buyinfoDTO;
import cn.edu.lingnan.dto.goodsDTO;
import cn.edu.lingnan.util.DataAccess;

public class buyinfoDAO
{
	// -------------------------------����Ա�鿴���й�����Ϣ-----------------------------
	public Vector<buyinfoDTO> adminFindAllBuyinfo()
	{
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from buyinfo where state=1");
			while (rs.next())
			{
				buyinfoDTO b = new buyinfoDTO();
				b.setBid(rs.getString("bid"));
				b.setAid(rs.getString("aid"));
				b.setGid(rs.getString("gid"));
				b.setSumnum(rs.getInt("sumnum"));
				v.add(b);
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
	
	// -------------------------------�û��鿴���ﳵ-----------------------------
	public Vector<buyinfoDTO> userFindAllBuyinfo(String _aid)
	{
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from buyinfo where aid='" + _aid
					+ "' and state=1");
			while (rs.next())
			{
				buyinfoDTO b = new buyinfoDTO();
				b.setBid(rs.getString("bid"));
				b.setAid(rs.getString("aid"));
				b.setGid(rs.getString("gid"));
				b.setSumnum(rs.getInt("sumnum"));
				v.add(b);
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
	
	// -----------------------------ɾ�����ﳵ��Ϣ(by id)-------------------------
	public boolean userDeleteBuyinfoById(String _id)
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
			String sql1 = "select * from buyinfo where state=1";
			rs = stat.executeQuery(sql1);
			if (rs.next() == false)
			{
				System.out.println("�����ظ�ɾ������Ϣ��");
			}
			else
			{
				prep = conn
						.prepareStatement("update buyinfo set state=0 where bid= ?");
				prep.setString(1, _id);
				prep.executeUpdate();
				prep = conn
						.prepareStatement("update buyinfo set sumnum=0 where bid= ?");
				prep.setString(1, _id);
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
	
	// -------------------------------�޸�ĳ����Ʒ��������(by id)---------------------------
	public boolean userUpdateBuyNumById(Integer _bid, Integer _sumnum,
			Integer _gid, Integer _gnum)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			if (_sumnum < 0 || _sumnum == 0)
			{
				System.out.println("����������������㣡");
				flag = false;
			}
			else
			{
				conn = DataAccess.getConnection();
				stat = conn.createStatement();
				rs = stat.executeQuery("select gid from buyinfo where bid='"
						+ _bid + "'");
				while (rs.next())
				{
					_gid = rs.getInt(1);
				}
				rs = stat.executeQuery("select gnum from goods where gid='"
						+ _gid + "'");
				while (rs.next())
				{
					_gnum = rs.getInt(1);// �ٴ�ʹ��rs��_gnum�Ḳ��ǰ�������_gid��ʹ�ý����rs����ֻ��һ�����ݣ�����getInt�����ֵΪ1
				}
				if (_sumnum > _gnum)
				{
					System.out.println("��治�㣡");
					flag = false;
				}
				else
				{
					prep = conn
							.prepareStatement("update buyinfo set sumnum=? where bid= ?");
					prep.setInt(1, _sumnum);
					prep.setInt(2, _bid);
					prep.executeUpdate();
					flag = true;
				}
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
	
	// ------------------------------���빺�ﳵ----------------------------
	public boolean userInsertBuyinfo(String _bid, String _aid, String _gid,
			String _sumnum)
	{
		boolean flag = false;
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		try
		{
			conn = DataAccess.getConnection();
			prep = conn
					.prepareStatement("insert into buyinfo(bid,aid,gid,sumnum) values (?,?,?,?)");
			prep.setString(1, _bid);
			prep.setString(2, _aid);
			prep.setString(3, _gid);
			prep.setString(4, _sumnum);
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
	
	// -------------------------------�˿��޸Ĺ��ﳵ-----------------------------
	public boolean buyerUpdateBuyinfo(buyinfoDTO bdto)
	{
		String bid = bdto.getBid();
		Integer sumnum = bdto.getSumnum();
		boolean flag = false;
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			// ע����н�ȡλ��
			stat.executeUpdate("update buyinfo set sumnum='" + sumnum
					+ "' where bid='" + bid + "'");
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
	
	// -------------------------------�û�ͨ��aid��ȡ�Լ��Ĺ�����Ϣ-----------------------------
	public buyinfoDTO getById(String id)
	{
		buyinfoDTO a = new buyinfoDTO();
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from buyinfo where aid='" + id
					+ "' and state=1");
			while (rs.next())
			{
				a.setAid(id);
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
		return a;
	}
	
	public Vector<buyinfoDTO> findCartById(String id)
	{
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		Connection conn = null;
		PreparedStatement prep = null;
		Statement stat = null;
		ResultSet rs = null;
		try
		{
			conn = DataAccess.getConnection();
			stat = conn.createStatement();
			rs = stat.executeQuery("select * from buyinfo where aid='" + id
					+ "' and state=1");
			while (rs.next())
			{
				buyinfoDTO b = new buyinfoDTO();
				b.setBid(rs.getString("bid"));
				b.setAid(rs.getString("aid"));
				b.setGid(rs.getString("gid"));
				b.setSumnum(rs.getInt("sumnum"));
				v.add(b);
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
}
