package cn.edu.lingnan.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.buyinfoDAO;
import cn.edu.lingnan.dto.buyinfoDTO;

public class AdminFindAllBuyinfoServlet extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
//		System.out.println("11111111111");
		buyinfoDAO bd = new buyinfoDAO();
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		v = bd.adminFindAllBuyinfo();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("allbuyinfo", v);
		//�ض���ҳ����ת
		resp.sendRedirect("adminFindAllBuyinfo.jsp");
	}
}
