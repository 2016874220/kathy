package cn.edu.lingnan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.adminDAO;
import cn.edu.lingnan.dao.buyinfoDAO;
import cn.edu.lingnan.dto.adminDTO;
import cn.edu.lingnan.dto.buyinfoDTO;

public class LoginServlet extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//1.��ҳ���ȡ������Ҫ������
		String id = null;
		String password = null;
		id = req.getParameter("userid");
		password = req.getParameter("password");
		System.out.println("1��"+id+"	"+password);
		//2.���ú�̨��ҵ���߼�ȥ�ж�����û����������Ƿ�����Ҷ�Ӧ
		adminDAO ad = new adminDAO();
		int superValue=ad.login(id, password);
		System.out.println("----2----:"+superValue);
		HttpSession s=req.getSession();
		s.setAttribute("superValue", superValue);
		s.setAttribute("userid", id);
		
		//��ҳ���ȡaid
		buyinfoDAO b = new buyinfoDAO();
		buyinfoDTO cart = b.getById(id);
		HttpSession s1=req.getSession();
		s1.setAttribute("id3", cart);
		
		s1.setAttribute("id1", cart);
		
		s1.setAttribute("id2", cart);
		
		s1.setAttribute("id4", cart);
		
		adminDTO user = ad.getById(id);
		HttpSession s2=req.getSession();
		s2.setAttribute("id", user);
		
		//3.���ݽ��ȥ����Ӧ��ҳ��
		if(superValue == 1)
		{
			resp.sendRedirect(req.getContextPath()+"/admin/seller.html");
		}
		if(superValue == 2)
		{
			resp.sendRedirect(req.getContextPath()+"/buyer/buyer.html");
		}
		if(superValue != 1 && superValue != 2)
			resp.sendRedirect(req.getContextPath()+"/index.html");
	}
}
