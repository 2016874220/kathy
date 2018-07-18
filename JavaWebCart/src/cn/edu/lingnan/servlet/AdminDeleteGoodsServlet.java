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


public class AdminDeleteGoodsServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		String gid = req.getParameter("gid");
		goodsDAO gd = new goodsDAO();
		boolean flag = gd.deleteGoods(gid);
		//ҳ����ת֮ǰ�������v�����������ֵ����ԭ��δ���޸ĵ�
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		v = gd.adminFindAllGoods();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("alldeletegoods", v);
		//ҳ����ת
		resp.sendRedirect("adminDeleteGoods.jsp");
	}
}
