package cn.edu.lingnan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.lingnan.dao.adminDAO;

public class NameCheckServlet extends HttpServlet
{
	@Override protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//�Ӵ��������������������
		String username = req.getParameter("username");
		System.out.println("-------------username:      "+username);
		adminDAO adao = new adminDAO();
		boolean flag = adao.findUserByName(username);
		//��ǰ���ҳ��һ��ֵ����register.html��ĺ���userNameCheck()��request.responseText�ܹ��������ݣ�
		if(flag)
		{
			resp.getWriter().print("true");//���ݹ�ȥ֮��ǰ�˵�ҳ����ܵõ����"true"��Ȼ���ж��û��Ѵ���
		}
	}
}
