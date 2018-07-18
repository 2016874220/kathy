package cn.edu.lingnan.servlet;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.goodsDAO;
import cn.edu.lingnan.dto.goodsDTO;

public class GoodsinfoServlet extends HttpServlet
{
	@Override 
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
//		System.out.println("11111111111");
		goodsDAO gd = new goodsDAO();
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		v = gd.userFindAllGoods();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("allgoodsinfoforall", v);
		//�ض���ҳ����ת
		resp.sendRedirect("goodsinfo.jsp");
	}
}
