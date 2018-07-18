package cn.edu.lingnan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.adminDAO;
import cn.edu.lingnan.dto.adminDTO;

public class RegisterServlet extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//1.��ҳ���ȡ������Ҫ�����ݣ�4����
		String id = null;
		String name = null;
		String password = null;
		Integer superuser = 0;
		String repassword = null;
		id = req.getParameter("userid");
		name = req.getParameter("username");
		password = req.getParameter("password");
		superuser = Integer.parseInt(req.getParameter("superuser"));
		repassword = req.getParameter("repassword");
		System.out.println("1��"+id+"	"+name+"	"+password+"	"+superuser+"	"+repassword);
		//2.���ú�̨��ҵ���߼�ȥ�ж�����û����������Ƿ�����Ҷ�Ӧ
		adminDAO ad = new adminDAO();
		adminDTO adto = new adminDTO();
		adto.setAid(id);
		adto.setAname(name);
		adto.setPassword(password);
		adto.setSuperuser(superuser);
		boolean flag = ad.insertUser(id,name, password,repassword,superuser);
		System.out.println("---------:"+flag);	
		//3.���ݽ��ȥ����Ӧ��ҳ��
		if(flag)
		{
			resp.sendRedirect(req.getContextPath()+"/login.html");
		}
		else
			resp.sendRedirect(req.getContextPath()+"/ERROR.html");
	}
}
