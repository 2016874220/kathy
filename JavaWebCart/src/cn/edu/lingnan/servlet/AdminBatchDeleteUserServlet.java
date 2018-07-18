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

public class AdminBatchDeleteUserServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		String[] arr = req.getParameterValues("arr");
		adminDAO adao = new adminDAO();
		for(String a:arr)
		{
			//�Դ�ҳ���д����������ݽ��д���ȥ���ָ�ÿ������֮��Ķ��ţ�
			String[] b = a.split(",");
			for (String c : b)
			{
				adao.deleteUser(c);
			}
		}
		Vector<adminDTO> v = new Vector<adminDTO>();
		v = adao.adminFindAllUser();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("alluser", v);
		//ҳ����ת
		resp.sendRedirect("adminDeleteUser.jsp");
	}
}
