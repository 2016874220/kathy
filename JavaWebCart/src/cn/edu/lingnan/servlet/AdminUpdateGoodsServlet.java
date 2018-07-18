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


public class AdminUpdateGoodsServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
//		System.out.println("3333333333333333");
		goodsDAO gd = new goodsDAO();
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		//���ҳ������û������г������Թ�ѡ��Ȼ������޸�
		v = gd.adminFindAllGoods();
		HttpSession s = req.getSession();
		s.setAttribute("allupdategoods", v);
		//ҳ����ת
		resp.sendRedirect("adminUpdateGoods.jsp");
	}
}