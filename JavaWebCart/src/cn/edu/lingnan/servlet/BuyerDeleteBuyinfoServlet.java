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


public class BuyerDeleteBuyinfoServlet extends HttpServlet
{
	@Override protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException
	{
		//getParameter�õ��Ķ���String���͵ġ����������ڶ�ȡ�ύ�ı��е�ֵ��http://a.jsp?id=123�е�123��
		buyinfoDTO cart = (buyinfoDTO)req.getSession().getAttribute("id1");
		String bid = req.getParameter("bid");
		buyinfoDAO bdao = new buyinfoDAO();
		boolean flag = bdao.userDeleteBuyinfoById(bid);
		//ҳ����ת֮ǰ�������v�����������ֵ����ԭ��δ���޸ĵ�
		Vector<buyinfoDTO> v = new Vector<buyinfoDTO>();
		v = bdao.findCartById(cart.getAid());
		//�ѽ������jspҳ����ȥ
		HttpSession s=req.getSession();
		s.setAttribute("cart", v);
		//ҳ����ת
		resp.sendRedirect("buyerDeleteBuyinfo.jsp");
	}
}
