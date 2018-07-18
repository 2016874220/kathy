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

public class AdminBatchDeleteGoodsServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		String[] arr = req.getParameterValues("arr");
	    goodsDAO gdao = new goodsDAO();
		for(String a:arr)
		{
			//�Դ�ҳ���д����������ݽ��д���ȥ���ָ�ÿ������֮��Ķ��ţ�
			String[] b = a.split(",");
			for (String c : b)
			{
				gdao.deleteGoods(c);
			}
		}
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		v = gdao.adminFindAllGoods();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("alldeletegoods", v);
		//ҳ����ת
		resp.sendRedirect("adminDeleteGoods.jsp");
	}
}
