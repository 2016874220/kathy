package cn.edu.lingnan.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.adminDAO;
import cn.edu.lingnan.dto.adminDTO;

public class AdminDeleteUserServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//�˴�aidΪString
		String aid = req.getParameter("aid");
//		System.out.println("2222222222		"+aid);
		adminDAO ad = new adminDAO();
		boolean flag = ad.deleteUser(aid);
//		if(flag)
//		{
//			
//		}
		//ҳ����ת֮ǰ�������v�����������ֵ����ԭ��δ���޸ĵ�
		Vector<adminDTO> v = new Vector<adminDTO>();
		v = ad.adminFindAllUser();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("alluser", v);
		//ҳ����ת
		resp.sendRedirect("adminDeleteUser.jsp");
	}
}
