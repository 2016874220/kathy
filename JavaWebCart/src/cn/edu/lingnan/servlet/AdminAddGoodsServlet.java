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

public class AdminAddGoodsServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//1.��ҳ���ȡ������Ҫ�����ݣ�4����
		String gid = req.getParameter("gid");
		String gname = req.getParameter("gname");
		String price = req.getParameter("price");
		String gnum = req.getParameter("gnum");
		System.out.println("1��"+gid+"	"+gname+"	"+price+"	"+gnum);
		//2.���ú�̨��ҵ���߼�ȥ�ж�����û����������Ƿ�����Ҷ�Ӧ
		goodsDAO gd = new goodsDAO();
		goodsDTO gdto = new goodsDTO();
		gdto.setGid(gid);
		gdto.setGname(gname);
		gdto.setPrice(price);
		gdto.setGnum(gnum);
		boolean flag = gd.insertGoods(gid, gname, price, gnum);
		//ҳ����ת֮ǰ�������v�����������ֵ����ԭ��δ���޸ĵ�
		Vector<goodsDTO> v = new Vector<goodsDTO>();
		v = gd.adminFindAllGoods();
		//�ѽ������jspҳ����ȥ
		HttpSession s = req.getSession();
		//setAttribute(string name, object value)�����������Լ�������Ӧ��ֵ
		s.setAttribute("alladdgoods", v);
		//ҳ����ת
		resp.sendRedirect("adminAddGoods.jsp");
	}
}
